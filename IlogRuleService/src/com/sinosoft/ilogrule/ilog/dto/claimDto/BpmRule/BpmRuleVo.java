package com.sinosoft.ilogrule.ilog.dto.claimDto.BpmRule;

import java.io.Serializable;

public class BpmRuleVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/************************** 入参 **************************/
	/**机构编码*/
	private String comcode;
	/**机构名称*/
	private String comName;
	/**险种*/
	private String riskCode;
	private String riskName;	//险种名称
	private String currentNodeCode;	//当前节点编码（BpmNode）
	private String currentNodeName;	//当前节点名称（BpmNode）
	private String optionTypeCode;	//业务动作编码（BusinessActionType）
	private String optionTypeName;	//业务动作名称（BusinessActionType）

	/************************** 返参 **************************/
	/**下一节点列表串*/
	private String nextNodeString;
	private String nextNodeName;//下一节点列表名称
	public String getComcode() {
		return comcode;
	}
	public void setComcode(String comcode) {
		this.comcode = comcode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getCurrentNodeCode() {
		return currentNodeCode;
	}
	public void setCurrentNodeCode(String currentNodeCode) {
		this.currentNodeCode = currentNodeCode;
	}
	public String getCurrentNodeName() {
		return currentNodeName;
	}
	public void setCurrentNodeName(String currentNodeName) {
		this.currentNodeName = currentNodeName;
	}
	public String getOptionTypeCode() {
		return optionTypeCode;
	}
	public void setOptionTypeCode(String optionTypeCode) {
		this.optionTypeCode = optionTypeCode;
	}
	public String getOptionTypeName() {
		return optionTypeName;
	}
	public void setOptionTypeName(String optionTypeName) {
		this.optionTypeName = optionTypeName;
	}
	public String getNextNodeString() {
		return nextNodeString;
	}
	public void setNextNodeString(String nextNodeString) {
		this.nextNodeString = nextNodeString;
	}
	public String getNextNodeName() {
		return nextNodeName;
	}
	public void setNextNodeName(String nextNodeName) {
		this.nextNodeName = nextNodeName;
	}

}
