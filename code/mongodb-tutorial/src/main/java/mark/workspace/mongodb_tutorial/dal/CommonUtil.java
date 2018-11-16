package mark.workspace.mongodb_tutorial.dal;

import org.bson.Document;

import com.alibaba.fastjson.JSON;

import mark.workspace.mongodb_tutorial.data.UpdateSection;

public class CommonUtil {
	public static boolean isNullOrEmpty(String obj){
		boolean ret = true;
		if(obj!=null && !obj.isEmpty())
			ret = false;
		return ret;
	}
	public static Document buildDocument(UpdateSection section){
		Document document = null;
		String json = JSON.toJSONString(section);
		document = Document.parse(json);
		return document;
	}
	
}
