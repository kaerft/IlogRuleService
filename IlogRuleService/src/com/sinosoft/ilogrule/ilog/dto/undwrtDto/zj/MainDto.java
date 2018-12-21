package com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj;

import java.io.Serializable;

public class MainDto implements Serializable{

	private static final long serialVersionUID = 1L;
	

	/***
	 * 投保单号
	 */
	private String proposalNo;
	/***
	 * 投保方式
	 */
	private String modeCode;
	/***
	 * 个/团单标识代码
	 */
	private String policyType_Code;

	/***
	 * 个/团单标识名称
	 */
	private String policyType;
	
	/***
	 * 续保标识代码
	 */
	private String renewalFlag_Code;

	/***
	 * 续保标识名称
	 */
	private String renewalFlag;
	/***
	 * 承保机构代码
	 */
	private String comCode;
	/***
	 * 承保机构名称
	 */
	private String comName;
	/***
	 * 代理代码
	 */
	private String agentCode;

	/***
	 * 代理名称
	 */
	private String agentName;
	/***
	 * 反洗钱标识
	 */
	private String fxqFlag;
	/***
	 * 交强、商业险标识
	 */
	private String prodFlag;
	/***
	 * 险类代码
	 */
	private String classCode;
	/***
	 * 险种代码
	 */
	private String riskCode;
	/***
	 * 保险起期
	 */
	private String startDate;
	/***
	 * 保险止期
	 */
	private String endDate;
	/***
	 * 投保日期
	 */
	private String insureDate;
	/***
	 * 签单日期
	 */
	private String signDate;
	/***
	 * 录单日期
	 */
	private String oprTm;
	/***
	 * 保险期间(以天为单位)
	 */
	private String tInsrncDay;
	/***
	 * 连续续保年数
	 */
	private String renewalYears;
	/***
	 * 折前保费
	 */
	private String beforePrem;
	/***
	 * 整单折扣
	 */
	private String entireDiscount;
	/***
	 * 实交保费
	 */
	private String afterPrem;
	/***
	 * 总保额
	 */
	private String sumAmount;
	/***
	 * 争议解决方式代码
	 */
	private String argueDel_Code;
	/***
	 * 争议解决方式名称
	 */
	private String argueDel;
	/***
	 * 告知栏内容
	 */
	private String informContent;
	/***
	 * 是否即时生效
	 */
	private String isTimelyEffective;
	/***
	 * 特约内容
	 */
	private String engageContext;
	/***
	 * 属性A（预留）
	 */
	private String attributeA;
	/***
	 * 属性B（预留）
	 */
	private String attributeB;
	/***
	 * 属性C（预留）
	 */
	private String attributeC;
	/***
	 * 属性D（预留）
	 */
	private String attributeD;
	/***
	 * 属性E（预留）
	 */
	private String attributeE;
	/***
	 * 属性F（预留）
	 */
	private String attributeF;
	/***
	 * 政策类型
	 */
	private String businessType1;
	/***
	 * 保单种类 
	 */
	private String policySort;
	/***
	 * 业务来源代码
	 */
	private String businessNature_Code;
	/***
	 * 业务来源名称
	 */
	private String businessNature;
	/***
	 * 币别代码
	 */
	private String currency;
	/***
	 * 约定分期交费次数
	 */
	private String payTimes;
	/***
	 * 联共保标志 
	 */
	private String coinsFlag;
	/***
	 * 商业分保标志
	 */
	private String reinsFlag;
	/***
	 * 共保标志
	 */
	private String coinsUranceFlag;
	/***
	 * 联保标志
	 */
	private String coinsLinkFlag;
	/***
	 * 停驶次数
	 */
	private String stopTimes;
	/***
	 * 业务员代码
	 */
	private String handler_Code;
	/***
	 * 业务员名称
	 */
	private String handlerName;
	
	/***
	 * 分入业务
	 */
	private String intoBusiness;
	
	/***
	 * 单号类型
	 */
	private String proposalEndorseType;
	
	/***
	 * 批单号
	 */
	private String endorseNo;

	public String getProposalNo() {
		return proposalNo;
	}

	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}

	public String getModeCode() {
		return modeCode;
	}

	public void setModeCode(String modeCode) {
		this.modeCode = modeCode;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getRenewalFlag() {
		return renewalFlag;
	}

	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}

	public String getComCode() {
		return comCode;
	}

	public void setComCode(String comCode) {
		this.comCode = comCode;
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getFxqFlag() {
		return fxqFlag;
	}

	public void setFxqFlag(String fxqFlag) {
		this.fxqFlag = fxqFlag;
	}

	public String getProdFlag() {
		return prodFlag;
	}

	public void setProdFlag(String prodFlag) {
		this.prodFlag = prodFlag;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInsureDate() {
		return insureDate;
	}

	public void setInsureDate(String insureDate) {
		this.insureDate = insureDate;
	}

	public String getSignDate() {
		return signDate;
	}

	public void setSignDate(String signDate) {
		this.signDate = signDate;
	}

	public String getOprTm() {
		return oprTm;
	}

	public void setOprTm(String oprTm) {
		this.oprTm = oprTm;
	}

	public String gettInsrncDay() {
		return tInsrncDay;
	}

	public void settInsrncDay(String tInsrncDay) {
		this.tInsrncDay = tInsrncDay;
	}

	public String getRenewalYears() {
		return renewalYears;
	}

	public void setRenewalYears(String renewalYears) {
		this.renewalYears = renewalYears;
	}

	public String getBeforePrem() {
		return beforePrem;
	}

	public void setBeforePrem(String beforePrem) {
		this.beforePrem = beforePrem;
	}

	public String getEntireDiscount() {
		return entireDiscount;
	}

	public void setEntireDiscount(String entireDiscount) {
		this.entireDiscount = entireDiscount;
	}

	public String getAfterPrem() {
		return afterPrem;
	}

	public void setAfterPrem(String afterPrem) {
		this.afterPrem = afterPrem;
	}

	public String getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(String sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getArgueDel() {
		return argueDel;
	}

	public void setArgueDel(String argueDel) {
		this.argueDel = argueDel;
	}

	public String getInformContent() {
		return informContent;
	}

	public void setInformContent(String informContent) {
		this.informContent = informContent;
	}

	public String getIsTimelyEffective() {
		return isTimelyEffective;
	}

	public void setIsTimelyEffective(String isTimelyEffective) {
		this.isTimelyEffective = isTimelyEffective;
	}


	public String getEngageContext() {
		return engageContext;
	}

	public void setEngageContext(String engageContext) {
		this.engageContext = engageContext;
	}

	public String getAttributeA() {
		return attributeA;
	}

	public void setAttributeA(String attributeA) {
		this.attributeA = attributeA;
	}

	public String getAttributeB() {
		return attributeB;
	}

	public void setAttributeB(String attributeB) {
		this.attributeB = attributeB;
	}

	public String getAttributeC() {
		return attributeC;
	}

	public void setAttributeC(String attributeC) {
		this.attributeC = attributeC;
	}

	public String getAttributeD() {
		return attributeD;
	}

	public void setAttributeD(String attributeD) {
		this.attributeD = attributeD;
	}

	public String getAttributeE() {
		return attributeE;
	}

	public void setAttributeE(String attributeE) {
		this.attributeE = attributeE;
	}

	public String getAttributeF() {
		return attributeF;
	}

	public void setAttributeF(String attributeF) {
		this.attributeF = attributeF;
	}



	public String getBusinessType1() {
		return businessType1;
	}

	public void setBusinessType1(String businessType1) {
		this.businessType1 = businessType1;
	}

	public String getPolicySort() {
		return policySort;
	}

	public void setPolicySort(String policySort) {
		this.policySort = policySort;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayTimes() {
		return payTimes;
	}

	public void setPayTimes(String payTimes) {
		this.payTimes = payTimes;
	}

	public String getCoinsFlag() {
		return coinsFlag;
	}

	public void setCoinsFlag(String coinsFlag) {
		this.coinsFlag = coinsFlag;
	}

	public String getReinsFlag() {
		return reinsFlag;
	}

	public void setReinsFlag(String reinsFlag) {
		this.reinsFlag = reinsFlag;
	}

	public String getCoinsUranceFlag() {
		return coinsUranceFlag;
	}

	public void setCoinsUranceFlag(String coinsUranceFlag) {
		this.coinsUranceFlag = coinsUranceFlag;
	}

	public String getCoinsLinkFlag() {
		return coinsLinkFlag;
	}

	public void setCoinsLinkFlag(String coinsLinkFlag) {
		this.coinsLinkFlag = coinsLinkFlag;
	}

	public String getStopTimes() {
		return stopTimes;
	}

	public void setStopTimes(String stopTimes) {
		this.stopTimes = stopTimes;
	}

	public String getPolicyType_Code() {
		return policyType_Code;
	}

	public void setPolicyType_Code(String policyType_Code) {
		this.policyType_Code = policyType_Code;
	}

	public String getRenewalFlag_Code() {
		return renewalFlag_Code;
	}

	public void setRenewalFlag_Code(String renewalFlag_Code) {
		this.renewalFlag_Code = renewalFlag_Code;
	}

	public String getArgueDel_Code() {
		return argueDel_Code;
	}

	public void setArgueDel_Code(String argueDel_Code) {
		this.argueDel_Code = argueDel_Code;
	}

	public String getBusinessNature_Code() {
		return businessNature_Code;
	}

	public void setBusinessNature_Code(String businessNature_Code) {
		this.businessNature_Code = businessNature_Code;
	}

	public String getHandler_Code() {
		return handler_Code;
	}

	public void setHandler_Code(String handler_Code) {
		this.handler_Code = handler_Code;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getIntoBusiness() {
		return intoBusiness;
	}

	public void setIntoBusiness(String intoBusiness) {
		this.intoBusiness = intoBusiness;
	}

	public String getProposalEndorseType() {
		return proposalEndorseType;
	}

	public void setProposalEndorseType(String proposalEndorseType) {
		this.proposalEndorseType = proposalEndorseType;
	}

	public String getEndorseNo() {
		return endorseNo;
	}

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	
}
