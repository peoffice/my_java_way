package mark.workspace.mongodb_tutorial.dal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mark.workspace.mongodb_tutorial.data.Activity;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.json.JsonMode;
import org.bson.json.JsonWriterSettings;

import com.alibaba.fastjson.JSON;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

import mark.workspace.mongodb_tutorial.data.DomainConstant;
import mark.workspace.mongodb_tutorial.data.Project;
import mark.workspace.mongodb_tutorial.data.UpdateSection;

public class MongoUtil {
	private MongoConnection connection;
	private MongoClient client;
	private MongoDatabase mongodb;
	private JsonWriterSettings settings = JsonWriterSettings.builder().outputMode(JsonMode.RELAXED).build();
	
	public MongoUtil(MongoConnection connection) {
		this.connection = connection;
	}

	private boolean ConnectDB() {
		boolean connected = false;
		if (connection != null) {
			if (client == null) {
				int port = Integer.parseInt(connection.getPort());
				client = new MongoClient(connection.getHost(), port);
				mongodb = client.getDatabase(DomainConstant.MongoDBName);
				connected = true;
			} else {
				connected = true;
			}
		}
		return connected;
	}

	public void CloseDB() {
		if (client != null) {
			client.close();
			client = null;
		}
	}

	public int DropCollection(String colName) {
		int ret = DalReturnCode.Success;
		if (ConnectDB()) {
			MongoIterable<String> colNames = mongodb.listCollectionNames();
			boolean find = false;
			for (String col : colNames) {
				if (col.equals(colName)) {
					find = true;
					break;
				}
			}
			if (!find) {
				ret = DalReturnCode.ColNotExist;
			} else {
				MongoCollection<Document> col = mongodb.getCollection(colName);
				col.drop();
			}
		} else {
			ret = DalReturnCode.ConnectDBError;
		}
		return ret;
	}

	public int addProject(Project project) {
		int ret = DalReturnCode.Success;
		if (project == null || CommonUtil.isNullOrEmpty(project.getId())) {
			ret = DalReturnCode.DataError;
		} else {
			if (ConnectDB()) {
				MongoCollection<Document> col = mongodb.getCollection(MongoDBConstant.ColProject);
				Bson filter = Filters.eq(MongoDBConstant.FieldId, project.getId());
				FindIterable<Document> iter = col.find(filter);
				if (iter.first() != null) {
					ret = DalReturnCode.ObjectExist;
				} else {
					String json = JSON.toJSONString(project);
					Document document = Document.parse(json);
					col.insertOne(document);
				}
			} else {
				ret = DalReturnCode.ConnectDBError;
			}
		}
		return ret;
	}

	public int removeProject(String id) {
		int ret = DalReturnCode.Success;
		if(CommonUtil.isNullOrEmpty(id)){
			ret = DalReturnCode.DataError;
		}else{
			if (ConnectDB()) {
				MongoCollection<Document> col = mongodb.getCollection(MongoDBConstant.ColProject);
				Bson filter = Filters.eq(MongoDBConstant.FieldId, id);
				DeleteResult result = col.deleteOne(filter);
				if(result.getDeletedCount()==0){
					ret = DalReturnCode.ObjectNotExist;
				}
			} else {
				ret = DalReturnCode.ConnectDBError;
			}
		}
		return ret;
	}
	
	public int updateProject(String id,UpdateSection section){
		int ret = DalReturnCode.Success;
		if(section==null){
			ret = DalReturnCode.DataError;
		}else{
			if (ConnectDB()) {
				MongoCollection<Document> col = mongodb.getCollection(MongoDBConstant.ColProject);
				Bson filter = Filters.eq(MongoDBConstant.FieldId, id);
				Document document = CommonUtil.buildDocument(section);
				Document update = new Document("$set",document);
				UpdateResult result = col.updateOne(filter, update);
				if(result.getModifiedCount()==0){
					ret = DalReturnCode.ObjectNotExist;
				}
			} else {
				ret = DalReturnCode.ConnectDBError;
			}
		}
		return ret;
	}
	
	public List<Project> queryProject(List<String> ids){
		List<Project> projects = new ArrayList<>();
		if(ids.size()>0){
			if (ConnectDB()) {
				MongoCollection<Document> col = mongodb.getCollection(MongoDBConstant.ColProject);
				Bson filter = Filters.in(MongoDBConstant.FieldId, ids);
				FindIterable<Document> iter = col.find(filter);
				for(Document doc:iter){	
					Project project = JSON.parseObject(doc.toJson(settings),Project.class);
					projects.add(project);
				}
			}
		}
		return projects;
	}

	public List<Project> queryProjectbyDataObj(List<String> dataObjs){
		List<Project> projects = new ArrayList<>();
		if(dataObjs!=null&&dataObjs.size()>0){
			MongoCollection<Document> col = mongodb.getCollection(MongoDBConstant.ColProject);
			Bson in_filter = Filters.eq("$in",dataObjs);
			Bson filter = Filters.eq(MongoDBConstant.FieldDataObjs,in_filter);
			FindIterable<Document> iter = col.find(filter);
			for(Document doc:iter) {
				Project project = JSON.parseObject(doc.toJson(settings), Project.class);
				projects.add(project);
			}
		}
		return projects;
	}

	public int addActivity(Activity activity) {
		
	}

	}
}
