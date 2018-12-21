package com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement;

import java.io.Serializable;
import java.util.Date;

public class MainXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String comCode;	//承保机构代码
	private String comName;	//	承保机构名称
	private String classCode;	//	险类代码
	private String className;	//	险类名称
	private String riskCode;	//	险种代码
	private String riskName;	//	险种名称
	private Date startDate;	//	保险起期
	private Date endDate;	//	保险止期
	private Date insureDate;	//	投保日期
	private Date signDate;	//	签单日期
	private Double sumPremium;	//	总保费
	private Double sumAmount;	//	总保额
	private String argueDel_Code;	//	争议解决方式代码
	private String argueDel;	//	 争议解决方式名称
	private String currencyAmount;	//	保额币别
	private String currencyPremium;	//	保费币别
	private Double rate;	//	费率‰
	private Double plusRate;	//	加成比例%
	private Double backDays;	//	倒签单天数
	
	
	
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
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
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
	public String getArgueDel_Code() {
		return argueDel_Code;
	}
	public void setArgueDel_Code(String argueDel_Code) {
		this.argueDel_Code = argueDel_Code;
	}
	public String getArgueDel() {
		return argueDel;
	}
	public void setArgueDel(String argueDel) {
		this.argueDel = argueDel;
	}
	public String getCurrencyAmount() {
		return currencyAmount;
	}
	public void setCurrencyAmount(String currencyAmount) {
		this.currencyAmount = currencyAmount;
	}
	public String getCurrencyPremium() {
		return currencyPremium;
	}
	public void setCurrencyPremium(String currencyPremium) {
		this.currencyPremium = currencyPremium;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public Double getPlusRate() {
		return plusRate;
	}
	public void setPlusRate(Double plusRate) {
		this.plusRate = plusRate;
	}
	public Double getBackDays() {
		return backDays;
	}
	public void setBackDays(Double backDays) {
		this.backDays = backDays;
	}
	
}
