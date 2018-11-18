package mark.workspace.mongodb_tutorial;


import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import mark.workspace.mongodb_tutorial.dal.DalReturnCode;
import mark.workspace.mongodb_tutorial.dal.MongoConnection;
import mark.workspace.mongodb_tutorial.dal.MongoDBConstant;
import mark.workspace.mongodb_tutorial.dal.MongoUtil;
import mark.workspace.mongodb_tutorial.data.*;

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


		//util.DropCollection(MongoDBConstant.ColProject);
	}

	public void testOperationsOnActivity(){
		MongoConnection connection = new MongoConnection();
		connection.setHost("127.0.0.1");
		connection.setPort("27017");
		MongoUtil util = new MongoUtil(connection);
		util.DropCollection(MongoDBConstant.ColActivity);

		Activity activity = new Activity();
		activity.setId("activity001");
		List<String> dataObjs = new ArrayList<>();
		dataObjs.add("w1");
		dataObjs.add("w2");
		dataObjs.add("w3");
		dataObjs.add("w4");
		activity.setDataObjs(dataObjs);
		int ret = util.addActivity(activity);
		assert(ret==DalReturnCode.Success);
		activity = new Activity();
		activity.setId("activity002");
		dataObjs.clear();
		dataObjs.add("w1");
		dataObjs.add("w3");
		activity.setDataObjs(dataObjs);
		ret = util.addActivity(activity);
		assert(ret==DalReturnCode.Success);
		List<String> ids = new ArrayList<>();
		ids.add("activity001");
		ids.add("activity002");
		List<Activity> activities = util.queryActivity(ids);
		assert(activities.size()==2);

		UpdateSection section = new UpdateSection();
		section.setName("new_name");
		ret = util.updateActivity("activity001",section);
		assert(ret==DalReturnCode.Success);

		List<String> queryObj = new ArrayList<>();
		queryObj.add("w1");
		queryObj.add("w2");
		activities = util.queryActivitybyDataObj(queryObj);
		assert(activities.size()==2);

		ids.clear();
		ids.add("activity001");
		activities = util.queryActivity(ids);
		assert(activities.size()==1);
		assert(activities.get(0).getName().equals("new_name"));

		ret = util.removeActivity("activity001");
		assert(ret==DalReturnCode.Success);

		activities = util.queryActivity(ids);
		assert(activities.size()==0);


		//util.DropCollection(MongoDBConstant.ColActivity);
	}

	public void testOperationsOnStep(){
		MongoConnection connection = new MongoConnection();
		connection.setHost("127.0.0.1");
		connection.setPort("27017");
		MongoUtil util = new MongoUtil(connection);
		util.DropCollection(MongoDBConstant.ColStep);

		Step step = new Step();
		step.setId("step001");
		List<String> dataObjs = new ArrayList<>();
		dataObjs.add("w1");
		dataObjs.add("w2");
		dataObjs.add("w3");
		dataObjs.add("w4");
		step.setDataObjs(dataObjs);
		int ret = util.addStep(step);
		assert(ret==DalReturnCode.Success);
		step = new Step();
		step.setId("step002");
		dataObjs.clear();
		dataObjs.add("w1");
		dataObjs.add("w3");
		step.setDataObjs(dataObjs);
		ret = util.addStep(step);
		assert(ret==DalReturnCode.Success);
		List<String> ids = new ArrayList<>();
		ids.add("step001");
		ids.add("step002");
		List<Step> steps = util.queryStep(ids);
		assert(steps.size()==2);

		UpdateSection section = new UpdateSection();
		section.setName("new_name");
		ret = util.updateStep("step001",section);
		assert(ret==DalReturnCode.Success);

		List<String> queryObj = new ArrayList<>();
		queryObj.add("w1");
		queryObj.add("w2");
		steps = util.queryStepbyDataObj(queryObj);
		assert(steps.size()==2);

		ids.clear();
		ids.add("step001");
		steps = util.queryStep(ids);
		assert(steps.size()==1);
		assert(steps.get(0).getName().equals("new_name"));

		ret = util.removeStep("step001");
		assert(ret==DalReturnCode.Success);

		steps = util.queryStep(ids);
		assert(steps.size()==0);


		//util.DropCollection(MongoDBConstant.ColStep);
	}

	public void testOperationsOnFunction(){
		MongoConnection connection = new MongoConnection();
		connection.setHost("127.0.0.1");
		connection.setPort("27017");
		MongoUtil util = new MongoUtil(connection);
		util.DropCollection(MongoDBConstant.ColFunction);

		Function function = new Function();
		function.setId("function001");
		List<String> dataObjs = new ArrayList<>();
		dataObjs.add("w1");
		dataObjs.add("w2");
		dataObjs.add("w3");
		dataObjs.add("w4");
		function.setDataObjs(dataObjs);
		int ret = util.addFunction(function);
		assert(ret==DalReturnCode.Success);
		function = new Function();
		function.setId("function002");
		dataObjs.clear();
		dataObjs.add("w1");
		dataObjs.add("w3");
		function.setDataObjs(dataObjs);
		ret = util.addFunction(function);
		assert(ret==DalReturnCode.Success);
		List<String> ids = new ArrayList<>();
		ids.add("function001");
		ids.add("function002");
		List<Function> functions = util.queryFunction(ids);
		assert(functions.size()==2);

		UpdateSection section = new UpdateSection();
		section.setName("new_name");
		ret = util.updateFunction("function001",section);
		assert(ret==DalReturnCode.Success);

		List<String> queryObj = new ArrayList<>();
		queryObj.add("w1");
		queryObj.add("w2");
		functions = util.queryFunctionbyDataObj(queryObj);
		assert(functions.size()==2);

		ids.clear();
		ids.add("function001");
		functions = util.queryFunction(ids);
		assert(functions.size()==1);
		assert(functions.get(0).getName().equals("new_name"));

		ret = util.removeFunction("function001");
		assert(ret==DalReturnCode.Success);

		functions = util.queryFunction(ids);
		assert(functions.size()==0);


		//util.DropCollection(MongoDBConstant.ColStep);
	}

}
