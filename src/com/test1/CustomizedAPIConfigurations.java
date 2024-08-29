package com.test1;

public class CustomizedAPIConfigurations {
	private Integer versionCode;
	private Integer versionId;
	private String tableViewName;
	private String dbName;
	private String jsonName;
	private String dataType;
	private boolean mandatory;
	private String size;
	private String defaultValue;
	private String hiddenColumn;
	private String serializer;
	private String deSerializer;
	private String syntheticData;
	private String rawData;
	private String entityState;
	private String remarks;

	public CustomizedAPIConfigurations() {

	}

	public CustomizedAPIConfigurations(Integer versionCode, Integer versionId, String tableViewName, String dbName,
			String jsonName, String dataType, boolean mandatory, String size, String defaultValue, String hiddenColumn,
			String serializer, String deSerializer, String syntheticData, String rawData, String entityState,
			String remarks) {
		super();
		this.versionCode = versionCode;
		this.versionId = versionId;
		this.tableViewName = tableViewName;
		this.dbName = dbName;
		this.jsonName = jsonName;
		this.dataType = dataType;
		this.mandatory = mandatory;
		this.size = size;
		this.defaultValue = defaultValue;
		this.hiddenColumn = hiddenColumn;
		this.serializer = serializer;
		this.deSerializer = deSerializer;
		this.syntheticData = syntheticData;
		this.rawData = rawData;
		this.entityState = entityState;
		this.remarks = remarks;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public Integer getVersionId() {
		return versionId;
	}

	public void setVersionId(Integer versionId) {
		this.versionId = versionId;
	}

	public String getTableViewName() {
		return tableViewName;
	}

	public void setTableViewName(String tableViewName) {
		this.tableViewName = tableViewName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getJsonName() {
		return jsonName;
	}

	public void setJsonName(String jsonName) {
		this.jsonName = jsonName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getHiddenColumn() {
		return hiddenColumn;
	}

	public void setHiddenColumn(String hiddenColumn) {
		this.hiddenColumn = hiddenColumn;
	}

	public String getSerializer() {
		return serializer;
	}

	public void setSerializer(String serializer) {
		this.serializer = serializer;
	}

	public String getDeSerializer() {
		return deSerializer;
	}

	public void setDeSerializer(String deSerializer) {
		this.deSerializer = deSerializer;
	}

	public String getSyntheticData() {
		return syntheticData;
	}

	public void setSyntheticData(String syntheticData) {
		this.syntheticData = syntheticData;
	}

	public String getRawData() {
		return rawData;
	}

	public void setRawData(String rawData) {
		this.rawData = rawData;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
