package com.sinosoft.ilogrule.ilog.dto.undwrtDto.car;

import java.io.Serializable;

public class OtherDto implements Serializable{

	private static final long serialVersionUID = 1L;
	/***
	 * 上年赔款总金额
	 */
	private String lastClaimAmount;
	/***
	 * 上年是否有赔案记录
	 */
	private String lasClaimFlag;
	/***
	 * 出险次数
	 */
	private String lossNumber;
	/***
	 * 上年车主名称
	 */
	private String lastCarOwner;
	/***
	 * 上年投保险别
	 */
	private String lastItemkind;
	/***
	 * 上年投保险止期
	 */
	private String lastEndDate;
	/***
	 * 无赔优待系数（无赔优NCD系数）
	 */
	private String claimadjustValue;
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
	 * 自主核保上限
	 */
	private String selfProtectionUp;
	/***
	 * 业务自主系数
	 */
	private String atuoBusiness;
	/***
	 * 昊升方案系数
	 */
	private String countNCDCof;
	/***
	 * 验车照片数量
	 */
	private String checkCarPhotosCount;
	/***
	 * 本次纳税年度
	 */
	private String thisTaxYear;
	/***
	 * 是否需要验车
	 */
	private String isValidateCar;
	
	/***
	 * 自主核保系数
	 */
	private String selfProtectionCof;
	
	/***
	 * 自主渠道系数
	 */
	private String selfChannelCof;
	
	/***
	 * 滞纳金
	 */
	private String delayPayment;
	
	/***
	 * 承保定价系数
	 */
	private String carPriceCof;
	
	/***
	 * 是否使用费折联动
	 */
	private String isFeeDiscount;
	
	/***
	 * 工作证照片数量
	 */
	private String idCardPhotosCount;

	public String getLastClaimAmount() {
		return lastClaimAmount;
	}

	public void setLastClaimAmount(String lastClaimAmount) {
		this.lastClaimAmount = lastClaimAmount;
	}

	public String getLasClaimFlag() {
		return lasClaimFlag;
	}

	public void setLasClaimFlag(String lasClaimFlag) {
		this.lasClaimFlag = lasClaimFlag;
	}

	public String getLossNumber() {
		return lossNumber;
	}

	public void setLossNumber(String lossNumber) {
		this.lossNumber = lossNumber;
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

	public String getLastEndDate() {
		return lastEndDate;
	}

	public void setLastEndDate(String lastEndDate) {
		this.lastEndDate = lastEndDate;
	}

	public String getClaimadjustValue() {
		return claimadjustValue;
	}

	public void setClaimadjustValue(String claimadjustValue) {
		this.claimadjustValue = claimadjustValue;
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

	public String getSelfProtectionUp() {
		return selfProtectionUp;
	}

	public void setSelfProtectionUp(String selfProtectionUp) {
		this.selfProtectionUp = selfProtectionUp;
	}

	public String getAtuoBusiness() {
		return atuoBusiness;
	}

	public void setAtuoBusiness(String atuoBusiness) {
		this.atuoBusiness = atuoBusiness;
	}

	public String getCountNCDCof() {
		return countNCDCof;
	}

	public void setCountNCDCof(String countNCDCof) {
		this.countNCDCof = countNCDCof;
	}

	public String getCheckCarPhotosCount() {
		return checkCarPhotosCount;
	}

	public void setCheckCarPhotosCount(String checkCarPhotosCount) {
		this.checkCarPhotosCount = checkCarPhotosCount;
	}

	public String getThisTaxYear() {
		return thisTaxYear;
	}

	public void setThisTaxYear(String thisTaxYear) {
		this.thisTaxYear = thisTaxYear;
	}

	public String getIsValidateCar() {
		return isValidateCar;
	}

	public void setIsValidateCar(String isValidateCar) {
		this.isValidateCar = isValidateCar;
	}

	public String getSelfProtectionCof() {
		return selfProtectionCof;
	}

	public void setSelfProtectionCof(String selfProtectionCof) {
		this.selfProtectionCof = selfProtectionCof;
	}

	public String getSelfChannelCof() {
		return selfChannelCof;
	}

	public void setSelfChannelCof(String selfChannelCof) {
		this.selfChannelCof = selfChannelCof;
	}

	public String getDelayPayment() {
		return delayPayment;
	}

	public void setDelayPayment(String delayPayment) {
		this.delayPayment = delayPayment;
	}

	public String getCarPriceCof() {
		return carPriceCof;
	}

	public void setCarPriceCof(String carPriceCof) {
		this.carPriceCof = carPriceCof;
	}

	public String getIsFeeDiscount() {
		return isFeeDiscount;
	}

	public void setIsFeeDiscount(String isFeeDiscount) {
		this.isFeeDiscount = isFeeDiscount;
	}

	public String getIdCardPhotosCount() {
		return idCardPhotosCount;
	}

	public void setIdCardPhotosCount(String idCardPhotosCount) {
		this.idCardPhotosCount = idCardPhotosCount;
	}
	
}
