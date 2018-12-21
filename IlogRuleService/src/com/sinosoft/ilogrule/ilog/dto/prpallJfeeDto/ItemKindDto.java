package com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto;

import java.io.Serializable;

public class ItemKindDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;
	
	private String itemKindName;
	
	private String amount;

	private String premium;
	
	private String shortRate;
	
	private String shortRateFlag;
	
	private String rate;
	
	private String currency;
	
	private String flag;
	
	private String chgAmount;	 //保额变化量
	
	private String chgPermium;	 //	保费变化量
	
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getShortRate() {
		return shortRate;
	}

	public void setShortRate(String shortRate) {
		this.shortRate = shortRate;
	}

	public String getShortRateFlag() {
		return shortRateFlag;
	}

	public void setShortRateFlag(String shortRateFlag) {
		this.shortRateFlag = shortRateFlag;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
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

	public String getChgAmount() {
		return chgAmount;
	}

	public void setChgAmount(String chgAmount) {
		this.chgAmount = chgAmount;
	}

	public String getChgPermium() {
		return chgPermium;
	}

	public void setChgPermium(String chgPermium) {
		this.chgPermium = chgPermium;
	}

	public String getItemKindFlag() {
		return itemKindFlag;
	}

	public void setItemKindFlag(String itemKindFlag) {
		this.itemKindFlag = itemKindFlag;
	}

}
