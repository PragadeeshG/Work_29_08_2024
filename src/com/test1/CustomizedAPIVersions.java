package com.test1;

public class CustomizedAPIVersions {
	private Integer apiIdentifier;
	private String versionCode;
	private boolean versionHeader;
	private Integer versionConfigId;
	private String totalCount;
	private String headerSummary;
	private Integer jsonAsFormat;
	private Integer xmlAsFormat;
	private String resultSummary;
	private Integer dataCount;
	private String footerAvailable;
	private String defaultSort;
	private String defaultSearch;

	public CustomizedAPIVersions() {

	}

	public CustomizedAPIVersions(Integer apiIdentifier, String versionCode, boolean versionHeader,
			Integer versionConfigId, String totalCount, String headerSummary, Integer jsonAsFormat, Integer xmlAsFormat,
			String resultSummary, Integer dataCount, String footerAvailable, String defaultSort, String defaultSearch) {
		super();
		this.apiIdentifier = apiIdentifier;
		this.versionCode = versionCode;
		this.versionHeader = versionHeader;
		this.versionConfigId = versionConfigId;
		this.totalCount = totalCount;
		this.headerSummary = headerSummary;
		this.jsonAsFormat = jsonAsFormat;
		this.xmlAsFormat = xmlAsFormat;
		this.resultSummary = resultSummary;
		this.dataCount = dataCount;
		this.footerAvailable = footerAvailable;
		this.defaultSort = defaultSort;
		this.defaultSearch = defaultSearch;
	}

	public Integer getApiIdentifier() {
		return apiIdentifier;
	}

	public void setApiIdentifier(Integer apiIdentifier) {
		this.apiIdentifier = apiIdentifier;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public boolean isVersionHeader() {
		return versionHeader;
	}

	public void setVersionHeader(boolean versionHeader) {
		this.versionHeader = versionHeader;
	}

	public Integer getVersionConfigId() {
		return versionConfigId;
	}

	public void setVersionConfigId(Integer versionConfigId) {
		this.versionConfigId = versionConfigId;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getHeaderSummary() {
		return headerSummary;
	}

	public void setHeaderSummary(String headerSummary) {
		this.headerSummary = headerSummary;
	}

	public Integer getJsonAsFormat() {
		return jsonAsFormat;
	}

	public void setJsonAsFormat(Integer jsonAsFormat) {
		this.jsonAsFormat = jsonAsFormat;
	}

	public Integer getXmlAsFormat() {
		return xmlAsFormat;
	}

	public void setXmlAsFormat(Integer xmlAsFormat) {
		this.xmlAsFormat = xmlAsFormat;
	}

	public String getResultSummary() {
		return resultSummary;
	}

	public void setResultSummary(String resultSummary) {
		this.resultSummary = resultSummary;
	}

	public Integer getDataCount() {
		return dataCount;
	}

	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}

	public String getFooterAvailable() {
		return footerAvailable;
	}

	public void setFooterAvailable(String footerAvailable) {
		this.footerAvailable = footerAvailable;
	}

	public String getDefaultSort() {
		return defaultSort;
	}

	public void setDefaultSort(String defaultSort) {
		this.defaultSort = defaultSort;
	}

	public String getDefaultSearch() {
		return defaultSearch;
	}

	public void setDefaultSearch(String defaultSearch) {
		this.defaultSearch = defaultSearch;
	}

}
