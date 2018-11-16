package mark.workspace.mongodb_tutorial.data;

public class Step extends ManagedObject{
	private String nodeId;
	private String operator;
	private String log;
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public Step(){
		super();
		this.nodeId = "nodeId";
		this.operator = "operator";
		this.log = "log";
	}
}
