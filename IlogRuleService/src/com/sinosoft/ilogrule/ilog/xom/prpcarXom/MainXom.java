package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;
import java.util.Date;

public class MainXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String proposalNo;
	
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
	
	private String prodFlag;
	
	private String classCode;
	
	private String riskCode;
	
	private Date startDate;
	
	private Date endDate;
	
	private Date insureDate;
	
	private Date signDate;
	
	private Date oprTm;
	
	private Integer tInsrncDay;
	
	private Integer renewalYears;
	
	private Double beforePrem;
	
	private Double entireDiscount;
	
	private Double afterPrem;
	
	private Double sumAmount;
	
	private String argueDel;
	
	private String argueDel_Code;
	
	private String informContent;
	
	private String isTimelyEffective;
	
	
	private String engageContext;
	
	private String qCellCore;
	
	private String businessType1;
	
	private String policySort;
	
	private String businessNature;
	
	private String businessNature_Code;
	
	private String currency;
	
	private String payTimes;
	
	private String coinsFlag;
	
	private String reinsFlag;
	
	private String coinsUranceFlag;
	
	private String coinsLinkFlag;
	
	private String stopTimes;
	
	private Double sumQuantity;
	
	private String attributeA;
	
	private String attributeB;
	
	private String attributeC;
	
	private String attributeD;
	
	private String attributeE;
	
	private String attributeF;
	
	private String isCorrelation;	//是否关联单
	private String handler_Code;	//业务员代码
	private String handlerName;	//业务员名称
	private String agreementNo;	//团车协议号

	
	
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

	public Integer gettInsrncDay() {
		return tInsrncDay;
	}

	public void settInsrncDay(Integer tInsrncDay) {
		this.tInsrncDay = tInsrncDay;
	}

	public Integer getRenewalYears() {
		return renewalYears;
	}

	public void setRenewalYears(Integer renewalYears) {
		this.renewalYears = renewalYears;
	}

	public Double getBeforePrem() {
		return beforePrem;
	}

	public void setBeforePrem(Double beforePrem) {
		this.beforePrem = beforePrem;
	}

	public Double getEntireDiscount() {
		return entireDiscount;
	}

	public void setEntireDiscount(Double entireDiscount) {
		this.entireDiscount = entireDiscount;
	}

	public Double getAfterPrem() {
		return afterPrem;
	}

	public void setAfterPrem(Double afterPrem) {
		this.afterPrem = afterPrem;
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

	public String getqCellCore() {
		return qCellCore;
	}

	public void setqCellCore(String qCellCore) {
		this.qCellCore = qCellCore;
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

	
	public Double getSumQuantity() {
		return sumQuantity;
	}

	public void setSumQuantity(Double sumQuantity) {
		this.sumQuantity = sumQuantity;
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

	public String getIsCorrelation() {
		return isCorrelation;
	}

	public void setIsCorrelation(String isCorrelation) {
		this.isCorrelation = isCorrelation;
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

	public String getAgreementNo() {
		return agreementNo;
	}

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	
}
