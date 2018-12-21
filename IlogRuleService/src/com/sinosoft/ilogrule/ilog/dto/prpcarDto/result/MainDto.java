package com.sinosoft.ilogrule.ilog.dto.prpcarDto.result;

import java.io.Serializable;

public class MainDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String countNCDCof;  //NCD后赔付率模型计算值
	private String actuaryCof;  //精算报价系数
	private String targetCof;  //目标赔付率
	private String countCof;  //总优惠系数
	private String selfChannelCof;  //自主渠道系数
	private String selfProtectionCof;  //自主核保系数
	private String protectionCof;	//核保报价系数
	private String programmeType;	//方案类型
	private String description;  //提示描述(规则信息描述；例如：验车规则提示信息)
	private String errorMessage;  //异常信息(系统异常返回)
	
	private String carInspectionFlag;	//验车标志
	private String operation;	//操作描述
	private String autoBusiness;  //业务自主系数
	private String isFeeDiscount;	//是否使用费折联动
	private String distributionRatio;	//分配比例
	
	private String trafficDisRate;	//交强险手续费/经纪费比例
	private String businessDisRate;	//商业险手续费/经纪费比例
	private String carPriceCof;	//返回车险承保定价系数
	
	public String getCountNCDCof() {
		return countNCDCof;
	}
	public void setCountNCDCof(String countNCDCof) {
		this.countNCDCof = countNCDCof;
	}
	public String getActuaryCof() {
		return actuaryCof;
	}
	public void setActuaryCof(String actuaryCof) {
		this.actuaryCof = actuaryCof;
	}
	public String getTargetCof() {
		return targetCof;
	}
	public void setTargetCof(String targetCof) {
		this.targetCof = targetCof;
	}
	public String getCountCof() {
		return countCof;
	}
	public void setCountCof(String countCof) {
		this.countCof = countCof;
	}
	public String getSelfChannelCof() {
		return selfChannelCof;
	}
	public void setSelfChannelCof(String selfChannelCof) {
		this.selfChannelCof = selfChannelCof;
	}
	public String getSelfProtectionCof() {
		return selfProtectionCof;
	}
	public void setSelfProtectionCof(String selfProtectionCof) {
		this.selfProtectionCof = selfProtectionCof;
	}
	public String getProtectionCof() {
		return protectionCof;
	}
	public void setProtectionCof(String protectionCof) {
		this.protectionCof = protectionCof;
	}
	public String getProgrammeType() {
		return programmeType;
	}
	public void setProgrammeType(String programmeType) {
		this.programmeType = programmeType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getCarInspectionFlag() {
		return carInspectionFlag;
	}
	public void setCarInspectionFlag(String carInspectionFlag) {
		this.carInspectionFlag = carInspectionFlag;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public String getAutoBusiness() {
		return autoBusiness;
	}
	public void setAutoBusiness(String autoBusiness) {
		this.autoBusiness = autoBusiness;
	}
	public String getIsFeeDiscount() {
		return isFeeDiscount;
	}
	public void setIsFeeDiscount(String isFeeDiscount) {
		this.isFeeDiscount = isFeeDiscount;
	}
	public String getDistributionRatio() {
		return distributionRatio;
	}
	public void setDistributionRatio(String distributionRatio) {
		this.distributionRatio = distributionRatio;
	}
	public String getTrafficDisRate() {
		return trafficDisRate;
	}
	public void setTrafficDisRate(String trafficDisRate) {
		this.trafficDisRate = trafficDisRate;
	}
	public String getBusinessDisRate() {
		return businessDisRate;
	}
	public void setBusinessDisRate(String businessDisRate) {
		this.businessDisRate = businessDisRate;
	}
	public String getCarPriceCof() {
		return carPriceCof;
	}
	public void setCarPriceCof(String carPriceCof) {
		this.carPriceCof = carPriceCof;
	}
	
	
}
