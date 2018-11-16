package mark.workspace.mongodb_tutorial.data;


import java.util.HashMap;
import java.util.Map;

public class Activity {
	private Map<String, String> bpvVariables;
	private String templateId;
	private String status;
	public Activity(){
		this.bpvVariables = new HashMap<>();
		this.templateId = "templateId";
		this.status = DomainConstant.ActivityStatusReady;
	}
	public Map<String, String> getBpvVariables() {
		return bpvVariables;
	}
	public void setBpvVariables(Map<String, String> bpvVariables) {
		this.bpvVariables = bpvVariables;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
