package mark.workspace.mongodb_tutorial;


import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import mark.workspace.mongodb_tutorial.dal.DalReturnCode;
import mark.workspace.mongodb_tutorial.dal.MongoConnection;
import mark.workspace.mongodb_tutorial.dal.MongoDBConstant;
import mark.workspace.mongodb_tutorial.dal.MongoUtil;
import mark.workspace.mongodb_tutorial.data.Project;
import mark.workspace.mongodb_tutorial.data.UpdateSection;

public class DomainUnitTest extends TestCase {
	public void testOperationsOnProject(){
		MongoConnection connection = new MongoConnection();
		connection.setHost("127.0.0.1");
		connection.setPort("27017");
		MongoUtil util = new MongoUtil(connection);
		util.DropCollection(MongoDBConstant.ColProject);
		
		Project project = new Project();
		project.setId("project001");
		List<String> dataObjs = new ArrayList<>();
		dataObjs.add("w1");
		dataObjs.add("w2");
		dataObjs.add("w3");
		dataObjs.add("w4");
		project.setDataObjs(dataObjs);
		int ret = util.addProject(project);
		assert(ret==DalReturnCode.Success);
		project = new Project();
		project.setId("project002");
		dataObjs.clear();
		dataObjs.add("w1");
		dataObjs.add("w3");
		project.setDataObjs(dataObjs);
		ret = util.addProject(project);
		assert(ret==DalReturnCode.Success);
		List<String> ids = new ArrayList<>();
		ids.add("project001");
		ids.add("project002");
		List<Project> projects = util.queryProject(ids);
		assert(projects.size()==2);

		UpdateSection section = new UpdateSection();
		section.setName("new_name");
		ret = util.updateProject("project001",section);
		assert(ret==DalReturnCode.Success);

		List<String> queryObj = new ArrayList<>();
		queryObj.add("w1");
		queryObj.add("w2");
		projects = util.queryProjectbyDataObj(queryObj);
		assert(projects.size()==2);

		ids.clear();
		ids.add("project001");
		projects = util.queryProject(ids);
		assert(projects.size()==1);
		assert(projects.get(0).getName().equals("new_name"));

		ret = util.removeProject("project001");
		assert(ret==DalReturnCode.Success);

		projects = util.queryProject(ids);
		assert(projects.size()==0);


		util.DropCollection(MongoDBConstant.ColProject);
	}
}
