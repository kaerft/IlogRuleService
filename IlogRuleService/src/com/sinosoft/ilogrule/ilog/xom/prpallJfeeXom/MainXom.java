package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom;

import java.io.Serializable;
import java.util.Date;

public class MainXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String proEndorseType	; //单号类型
	
	private String businessNo; //业务单号

	private String modeCode;
	
	private String policyType;
	
	private String policyType_Code;
	
	private String renewalFlag;
	
	private String renewalFlag_Code;
	
	private String comCode;
	
	private String comName;
	
	private String agentCode;
	
	private String agentName;
	
	private String fxqFlag;
	
	private String classCode;
	
	private String riskCode;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date insureDate;
	
	private Date signDate;
	
	private Date oprTm;
	
	private Integer tInsrncMonth;
	
	private Double sumPremium;
	
	private Double sumAmount;
	
	private String argueDel;
	
	private String argueDel_Code;
	
	
	private String businessType1;
	
	private String policySort;
	
	private String businessNature;
	
	private String businessNature_Code;
	
	private String currency;
	
	private Integer payTimes;
	
	private String coinsFlag;
	
	private String reinsFlag;
	
	private String coinsUranceFlag;
	
	private String coinsLinkFlag;
	
	private String reinsciFlag;  //是否分入业务
	
	private String businessLine;  //	业务条线
	
	private String businessClass;  //	业务分类
	
	private String businessSource;  //	业务性质
	
	private String businessChannel;  //	业务渠道
	
	private String agriFlag;  //	涉农标志
	
	private String handler_Code;	//业务员代码
	
	private String handlerName;	//业务员名称
	
	private Integer backDays;	//倒签单天数
	
	private Double sumQuantity;  //承保数量
	
	private Date validDate;  //	生效日期
	
    private Date endorDate;  //	批改日期
    
	private String endorReson;  //	批改原因
	
	private String endorType;  //	批改类型
	
	private Double chgAmount;  //保额变化量
	
	private Double chgPermium;  //	保费变化量

	private String icCarFlag; //	是否电子商务保险卡

	
	private String attributeA;
	
	private String attributeB;
	
	private String attributeC;
	
	private String attributeD;
	
	private String attributeE;
	
	private String attributeF;
	
	

	public String getProEndorseType() {
		return proEndorseType;
	}

	public void setProEndorseType(String proEndorseType) {
		this.proEndorseType = proEndorseType;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
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

	public String getPolicyType_Code() {
		return policyType_Code;
	}

	public void setPolicyType_Code(String policyType_Code) {
		this.policyType_Code = policyType_Code;
	}

	public String getRenewalFlag() {
		return renewalFlag;
	}

	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}

	public String getRenewalFlag_Code() {
		return renewalFlag_Code;
	}

	public void setRenewalFlag_Code(String renewalFlag_Code) {
		this.renewalFlag_Code = renewalFlag_Code;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getInsureDate() {
		return insureDate;
	}

	public void setInsureDate(Date insureDate) {
		this.insureDate = insureDate;
	}

	public Date getSignDate() {
		return signDate;
	}

	public void setSignDate(Date signDate) {
		this.signDate = signDate;
	}

	public Date getOprTm() {
		return oprTm;
	}

	public void setOprTm(Date oprTm) {
		this.oprTm = oprTm;
	}

	public Integer gettInsrncMonth() {
		return tInsrncMonth;
	}

	public void settInsrncMonth(Integer tInsrncMonth) {
		this.tInsrncMonth = tInsrncMonth;
	}

	public Double getSumPremium() {
		return sumPremium;
	}

	public void setSumPremium(Double sumPremium) {
		this.sumPremium = sumPremium;
	}

	public Double getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(Double sumAmount) {
		this.sumAmount = sumAmount;
	}

	public String getArgueDel() {
		return argueDel;
	}

	public void setArgueDel(String argueDel) {
		this.argueDel = argueDel;
	}

	public String getArgueDel_Code() {
		return argueDel_Code;
	}

	public void setArgueDel_Code(String argueDel_Code) {
		this.argueDel_Code = argueDel_Code;
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

	public String getBusinessNature() {
		return businessNature;
	}

	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}

	public String getBusinessNature_Code() {
		return businessNature_Code;
	}

	public void setBusinessNature_Code(String businessNature_Code) {
		this.businessNature_Code = businessNature_Code;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getPayTimes() {
		return payTimes;
	}

	public void setPayTimes(Integer payTimes) {
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

	public String getReinsciFlag() {
		return reinsciFlag;
	}

	public void setReinsciFlag(String reinsciFlag) {
		this.reinsciFlag = reinsciFlag;
	}

	public String getBusinessLine() {
		return businessLine;
	}

	public void setBusinessLine(String businessLine) {
		this.businessLine = businessLine;
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public String getBusinessSource() {
		return businessSource;
	}

	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}

	public String getBusinessChannel() {
		return businessChannel;
	}

	public void setBusinessChannel(String businessChannel) {
		this.businessChannel = businessChannel;
	}

	public String getAgriFlag() {
		return agriFlag;
	}

	public void setAgriFlag(String agriFlag) {
		this.agriFlag = agriFlag;
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

	public Integer getBackDays() {
		return backDays;
	}

	public void setBackDays(Integer backDays) {
		this.backDays = backDays;
	}

	public Double getSumQuantity() {
		return sumQuantity;
	}

	public void setSumQuantity(Double sumQuantity) {
		this.sumQuantity = sumQuantity;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Date getEndorDate() {
		return endorDate;
	}

	public void setEndorDate(Date endorDate) {
		this.endorDate = endorDate;
	}

	public String getEndorReson() {
		return endorReson;
	}

	public void setEndorReson(String endorReson) {
		this.endorReson = endorReson;
	}

	public String getEndorType() {
		return endorType;
	}

	public void setEndorType(String endorType) {
		this.endorType = endorType;
	}

	public Double getChgAmount() {
		return chgAmount;
	}

	public void setChgAmount(Double chgAmount) {
		this.chgAmount = chgAmount;
	}

	public Double getChgPermium() {
		return chgPermium;
	}

	public void setChgPermium(Double chgPermium) {
		this.chgPermium = chgPermium;
	}

	public String getIcCarFlag() {
		return icCarFlag;
	}

	public void setIcCarFlag(String icCarFlag) {
		this.icCarFlag = icCarFlag;
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
	
}
