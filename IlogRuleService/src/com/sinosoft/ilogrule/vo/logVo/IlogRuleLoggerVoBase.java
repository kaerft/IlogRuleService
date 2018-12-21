package com.sinosoft.ilogrule.vo.logVo;

public class IlogRuleLoggerVoBase{

	// Fields

	private String serialno;
	private String rulepath;
	private String rulename;
	private String requesttime;
	private String responsetime;
	private String status;
	private String statusdes;
	private String interReqXml;
	private String xomReqXml;
	private String extendstring1;
	private String extendstring2;
	private String extendstring3;
	private String strSbTrace;
	
	public String getXomReqXml() {
		return xomReqXml;
	}
	public void setXomReqXml(String xomReqXml) {
		this.xomReqXml = xomReqXml;
	}
	public String getSerialno() {
		return serialno;
	}
	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}
	public String getRulepath() {
		return rulepath;
	}
	public void setRulepath(String rulepath) {
		this.rulepath = rulepath;
	}
	public String getRulename() {
		return rulename;
	}
	public void setRulename(String rulename) {
		this.rulename = rulename;
	}
	
	
	public String getRequesttime() {
		return requesttime;
	}
	public void setRequesttime(String requesttime) {
		this.requesttime = requesttime;
	}
	public String getResponsetime() {
		return responsetime;
	}
	public void setResponsetime(String responsetime) {
		this.responsetime = responsetime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusdes() {
		return statusdes;
	}
	public void setStatusdes(String statusdes) {
		this.statusdes = statusdes;
	}
	public String getInterReqXml() {
		return interReqXml;
	}
	public void setInterReqXml(String interReqXml) {
		this.interReqXml = interReqXml;
	}
	public String getExtendstring1() {
		return extendstring1;
	}
	public void setExtendstring1(String extendstring1) {
		this.extendstring1 = extendstring1;
	}
	public String getExtendstring2() {
		return extendstring2;
	}
	public void setExtendstring2(String extendstring2) {
		this.extendstring2 = extendstring2;
	}
	public String getExtendstring3() {
		return extendstring3;
	}
	public void setExtendstring3(String extendstring3) {
		this.extendstring3 = extendstring3;
	}
	public String getStrSbTrace() {
		return strSbTrace;
	}
	public void setStrSbTrace(String strSbTrace) {
		this.strSbTrace = strSbTrace;
	}

}
