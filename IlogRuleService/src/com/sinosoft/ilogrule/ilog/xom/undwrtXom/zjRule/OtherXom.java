package com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule;

import java.util.Date;

public class OtherXom{
	
	/***
	 * 上年赔款总金额
	 */
	private double lastClaimAmount;
	/***
	 * 上年是否有赔案记录
	 */
	private String lasClaimFlag;
	/***
	 * 出险次数
	 */
	private int lossNumber;
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
	private Date lastEndDate;
	/***
	 * 无赔优待系数（无赔优NCD系数）
	 */
	private double claimadjustValue;
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
	private double atuoBusiness;
	/***
	 * 昊升方案系数
	 */
	private double countNCDCof;
	/***
	 * 验车照片数量
	 */
	private int checkCarPhotosCount;
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
	private double selfProtectionCof;
	
	/***
	 * 自主渠道系数
	 */
	private double selfChannelCof;
	
	/***
	 * 滞纳金
	 */
	private double delayPayment;
	
	/***
	 * 承保定价系数
	 */
	private double carPriceCof;
	
	/***
	 * 是否使用费折联动
	 */
	private String isFeeDiscount;
	
	public double getLastClaimAmount() {
		return lastClaimAmount;
	}

	public void setLastClaimAmount(double lastClaimAmount) {
		this.lastClaimAmount = lastClaimAmount;
	}

	public String getLasClaimFlag() {
		return lasClaimFlag;
	}

	public void setLasClaimFlag(String lasClaimFlag) {
		this.lasClaimFlag = lasClaimFlag;
	}

	public int getLossNumber() {
		return lossNumber;
	}

	public void setLossNumber(int lossNumber) {
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

	public Date getLastEndDate() {
		return lastEndDate;
	}

	public void setLastEndDate(Date lastEndDate) {
		this.lastEndDate = lastEndDate;
	}

	public double getClaimadjustValue() {
		return claimadjustValue;
	}

	public void setClaimadjustValue(double claimadjustValue) {
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

	public double getAtuoBusiness() {
		return atuoBusiness;
	}

	public void setAtuoBusiness(double atuoBusiness) {
		this.atuoBusiness = atuoBusiness;
	}

	public double getCountNCDCof() {
		return countNCDCof;
	}

	public void setCountNCDCof(double countNCDCof) {
		this.countNCDCof = countNCDCof;
	}


	public int getCheckCarPhotosCount() {
		return checkCarPhotosCount;
	}

	public void setCheckCarPhotosCount(int checkCarPhotosCount) {
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

	public double getSelfProtectionCof() {
		return selfProtectionCof;
	}

	public void setSelfProtectionCof(double selfProtectionCof) {
		this.selfProtectionCof = selfProtectionCof;
	}

	public double getSelfChannelCof() {
		return selfChannelCof;
	}

	public void setSelfChannelCof(double selfChannelCof) {
		this.selfChannelCof = selfChannelCof;
	}

	public double getDelayPayment() {
		return delayPayment;
	}

	public void setDelayPayment(double delayPayment) {
		this.delayPayment = delayPayment;
	}

	public double getCarPriceCof() {
		return carPriceCof;
	}

	public void setCarPriceCof(double carPriceCof) {
		this.carPriceCof = carPriceCof;
	}

	public String getIsFeeDiscount() {
		return isFeeDiscount;
	}

	public void setIsFeeDiscount(String isFeeDiscount) {
		this.isFeeDiscount = isFeeDiscount;
	}
	
}
