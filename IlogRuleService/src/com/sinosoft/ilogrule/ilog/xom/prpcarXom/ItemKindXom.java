package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;

public class ItemKindXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;
	
	private String itemKindName;
	
	private Double amount;
	
	private Double premium;
	
	private String lastAccient;
	
	private String isHomemadeGlass;
	
	private Double everyLimitFee;
	
	private Double benchMarkPremium;
	
	private String flag;
	

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

	public String getLastAccient() {
		return lastAccient;
	}

	public void setLastAccient(String lastAccient) {
		this.lastAccient = lastAccient;
	}

	public String getIsHomemadeGlass() {
		return isHomemadeGlass;
	}

	public void setIsHomemadeGlass(String isHomemadeGlass) {
		this.isHomemadeGlass = isHomemadeGlass;
	}

	public Double getEveryLimitFee() {
		return everyLimitFee;
	}

	public void setEveryLimitFee(Double everyLimitFee) {
		this.everyLimitFee = everyLimitFee;
	}

	public Double getBenchMarkPremium() {
		return benchMarkPremium;
	}

	public void setBenchMarkPremium(Double benchMarkPremium) {
		this.benchMarkPremium = benchMarkPremium;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
}
