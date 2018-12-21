package com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement;

import java.io.Serializable;

public class ItemKindXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;	//险别代码
	private String itemKindName;	//	险别名称
	private Double amount;	//	险别保额
	private Double premium;	//	险别保费
	private String flag;	//	主附险标志
	private String currency;	//	币别
	private Double rate;	//	费率
	
	
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
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	
}
