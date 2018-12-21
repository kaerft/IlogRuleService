package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom;

import java.io.Serializable;

public class ItemKindXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;
	
	private String itemKindName;
	
	private Double amount;

	private Double premium;
	
	private Double shortRate;
	
	private String shortRateFlag;
	
	private Double rate;
	
	private String currency;
	
	private String flag;
	
	private Double chgAmount;	 //保额变化量
	
	private Double chgPermium;	 //	保费变化量
	
	private String itemKindFlag;	 //	险别批改标识


	public String getItemKindCode() {
		return itemKindCode;
	}

	public void setItemKindCode(String itemKindCode) {
		this.itemKindCode = itemKindCode;
	}

	public String getItemKindName() {
		return itemKindName;
	}

	public void setItemKindName(String itemKindName) {
		this.itemKindName = itemKindName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public Double getShortRate() {
		return shortRate;
	}

	public void setShortRate(Double shortRate) {
		this.shortRate = shortRate;
	}

	public String getShortRateFlag() {
		return shortRateFlag;
	}

	public void setShortRateFlag(String shortRateFlag) {
		this.shortRateFlag = shortRateFlag;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public String getItemKindFlag() {
		return itemKindFlag;
	}

	public void setItemKindFlag(String itemKindFlag) {
		this.itemKindFlag = itemKindFlag;
	}

}
