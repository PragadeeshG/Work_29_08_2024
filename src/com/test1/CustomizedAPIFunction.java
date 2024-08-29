package com.test1;

public class CustomizedAPIFunction {
	private String functionCode;
	private String functionName;
	private String parameters;
	private String serverless;
	private String lambdaName;
	private String environmentVariables;
	private String systemVariables;
	private Integer testData;
	private String variablePrediction;
	private String validDataSample;
	private String entityState;

	public CustomizedAPIFunction() {

	}

	public CustomizedAPIFunction(String functionCode, String functionName, String parameters, String serverless,
			String lambdaName, String environmentVariables, String systemVariables, Integer testData,
			String variablePrediction, String validDataSample, String entityState) {
		super();
		this.functionCode = functionCode;
		this.functionName = functionName;
		this.parameters = parameters;
		this.serverless = serverless;
		this.lambdaName = lambdaName;
		this.environmentVariables = environmentVariables;
		this.systemVariables = systemVariables;
		this.testData = testData;
		this.variablePrediction = variablePrediction;
		this.validDataSample = validDataSample;
		this.entityState = entityState;
	}

	public String getFunctionCode() {
		return functionCode;
	}

	public void setFunctionCode(String functionCode) {
		this.functionCode = functionCode;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getServerless() {
		return serverless;
	}

	public void setServerless(String serverless) {
		this.serverless = serverless;
	}

	public String getLambdaName() {
		return lambdaName;
	}

	public void setLambdaName(String lambdaName) {
		this.lambdaName = lambdaName;
	}

	public String getEnvironmentVariables() {
		return environmentVariables;
	}

	public void setEnvironmentVariables(String environmentVariables) {
		this.environmentVariables = environmentVariables;
	}

	public String getSystemVariables() {
		return systemVariables;
	}

	public void setSystemVariables(String systemVariables) {
		this.systemVariables = systemVariables;
	}

	public Integer getTestData() {
		return testData;
	}

	public void setTestData(Integer testData) {
		this.testData = testData;
	}

	public String getVariablePrediction() {
		return variablePrediction;
	}

	public void setVariablePrediction(String variablePrediction) {
		this.variablePrediction = variablePrediction;
	}

	public String getValidDataSample() {
		return validDataSample;
	}

	public void setValidDataSample(String validDataSample) {
		this.validDataSample = validDataSample;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
