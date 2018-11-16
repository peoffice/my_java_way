package mark.workspace.mongodb_tutorial.data;

import java.util.List;
import java.util.Map;

public class UpdateSection {
	/*
	 * common properties
	 */
	private String name;
	private String description;
	private String updateTime;
	private String parentId;
	private List<String> dataObjs;

	/*
	 * function properties
	 */
	private String inputParams;
	private String outputResults;

	/*
	 * step properties
	 */
	private String opertor;
	private String log;
	
	/*
	 * activity properties
	 */
	private Map<String, String> bpvVariables;
	private String status;
	public UpdateSection(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<String> getDataObjs() {
		return dataObjs;
	}
	public void setDataObjs(List<String> dataObjs) {
		this.dataObjs = dataObjs;
	}
	public String getInputParams() {
		return inputParams;
	}
	public void setInputParams(String inputParams) {
		this.inputParams = inputParams;
	}
	public String getOutputResults() {
		return outputResults;
	}
	public void setOutputResults(String outputResults) {
		this.outputResults = outputResults;
	}
	public String getOpertor() {
		return opertor;
	}
	public void setOpertor(String opertor) {
		this.opertor = opertor;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public Map<String, String> getBpvVariables() {
		return bpvVariables;
	}
	public void setBpvVariables(Map<String, String> bpvVariables) {
		this.bpvVariables = bpvVariables;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
