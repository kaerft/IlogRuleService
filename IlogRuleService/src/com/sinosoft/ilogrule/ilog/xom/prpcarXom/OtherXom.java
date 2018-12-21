package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;
import java.util.Date;

public class OtherXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String isInsureExcept;
	private Double claimAdjustValue;
	private Double illegalTrafficValue;
	private Double trafficNCDPremium;
	private Double businessNCDPremium;
	private Double trafficNCD1Value;
	private String trafficNCD2;
	private String upBusinessNCD;
	private String businessNCD2;
	private Double lastLossNumber;
	private String uploadTransferFlag;
	private String nonfloatingCauseNCD ;
	private String autoBusiness;
	
	private String lastCarOwner;	//上年车主名称
	private String lastItemkind;	//上年投保险别
	private Date lastEndDate;	//上年保险止期
	private String trafficFloatingCause;	//交强险浮动原因
	private String attributeA;
	private String attributeB;
	private String attributeC;
	private String attributeD;
	private String attributeE;
	private String attributeF;
	
	
	public String getIsInsureExcept() {
		return isInsureExcept;
	}
	
	public void setIsInsureExcept(String isInsureExcept) {
		this.isInsureExcept = isInsureExcept;
	}
	
	public Double getClaimAdjustValue() {
		return claimAdjustValue;
	}
	
	public void setClaimAdjustValue(Double claimAdjustValue) {
		this.claimAdjustValue = claimAdjustValue;
	}

	public Double getIllegalTrafficValue() {
		return illegalTrafficValue;
	}

	public void setIllegalTrafficValue(Double illegalTrafficValue) {
		this.illegalTrafficValue = illegalTrafficValue;
	}

	public Double getTrafficNCDPremium() {
		return trafficNCDPremium;
	}

	public void setTrafficNCDPremium(Double trafficNCDPremium) {
		this.trafficNCDPremium = trafficNCDPremium;
	}

	public Double getBusinessNCDPremium() {
		return businessNCDPremium;
	}

	public void setBusinessNCDPremium(Double businessNCDPremium) {
		this.businessNCDPremium = businessNCDPremium;
	}

	public Double getTrafficNCD1Value() {
		return trafficNCD1Value;
	}

	public void setTrafficNCD1Value(Double trafficNCD1Value) {
		this.trafficNCD1Value = trafficNCD1Value;
	}

	public String getTrafficNCD2() {
		return trafficNCD2;
	}

	public void setTrafficNCD2(String trafficNCD2) {
		this.trafficNCD2 = trafficNCD2;
	}

	public String getUpBusinessNCD() {
		return upBusinessNCD;
	}

	public void setUpBusinessNCD(String upBusinessNCD) {
		this.upBusinessNCD = upBusinessNCD;
	}

	public String getBusinessNCD2() {
		return businessNCD2;
	}

	public void setBusinessNCD2(String businessNCD2) {
		this.businessNCD2 = businessNCD2;
	}

	public Double getLastLossNumber() {
		return lastLossNumber;
	}

	public void setLastLossNumber(Double lastLossNumber) {
		this.lastLossNumber = lastLossNumber;
	}

	public String getUploadTransferFlag() {
		return uploadTransferFlag;
	}

	public void setUploadTransferFlag(String uploadTransferFlag) {
		this.uploadTransferFlag = uploadTransferFlag;
	}

	public String getNonfloatingCauseNCD() {
		return nonfloatingCauseNCD;
	}

	public void setNonfloatingCauseNCD(String nonfloatingCauseNCD) {
		this.nonfloatingCauseNCD = nonfloatingCauseNCD;
	}

	
	public String getAutoBusiness() {
		return autoBusiness;
	}

	public void setAutoBusiness(String autoBusiness) {
		this.autoBusiness = autoBusiness;
	}

	public String getLastCarOwner() {
		return lastCarOwner;
	}

	public void setLastCarOwner(String lastCarOwner) {
		this.lastCarOwner = lastCarOwner;
	}

	public String getLastItemkind() {
		return lastItemkind;
	}

	public void setLastItemkind(String lastItemkind) {
		this.lastItemkind = lastItemkind;
	}

	public Date getLastEndDate() {
		return lastEndDate;
	}

	public void setLastEndDate(Date lastEndDate) {
		this.lastEndDate = lastEndDate;
	}
	public String getTrafficFloatingCause() {
		return trafficFloatingCause;
	}

	public void setTrafficFloatingCause(String trafficFloatingCause) {
		this.trafficFloatingCause = trafficFloatingCause;
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
