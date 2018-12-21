package com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement;

import java.io.Serializable;

public class ItemKindDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;	//险别代码
	private String itemKindName;	//	险别名称
	private String amount;	//	险别保额
	private String premium;	//	险别保费
	private String flag;	//	主附险标志
	private String currency;	//	币别
	private String rate;	//	费率
	
	
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
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	
}
