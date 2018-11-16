package mark.workspace.mongodb_tutorial.data;

public class Function extends ManagedObject {
	private String functionIndentification;
	private String inputParams;
	private String outputResults;
	public String getFunctionIndentification() {
		return functionIndentification;
	}
	public void setFunctionIndentification(String functionIndentification) {
		this.functionIndentification = functionIndentification;
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
	public Function(){
		super();
		this.functionIndentification = "functionIndentification";
		this.inputParams = "inputParams";
		this.outputResults = "outputResults";
	}
}
