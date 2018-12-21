package com.sinosoft.ilogrule.ilog.dto.prpcarDto;

import java.io.Serializable;

public class ItemKindDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String itemKindCode;
	
	private String itemKindName;
	
	private String amount;
	
	private String premium;
	
	private String lastAccient;
	
	private String isHomemadeGlass;
	
	private String everyLimitFee;
	
	private String benchMarkPremium;
	
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

	public String getEveryLimitFee() {
		return everyLimitFee;
	}

	public void setEveryLimitFee(String everyLimitFee) {
		this.everyLimitFee = everyLimitFee;
	}

	public String getBenchMarkPremium() {
		return benchMarkPremium;
	}

	public void setBenchMarkPremium(String benchMarkPremium) {
		this.benchMarkPremium = benchMarkPremium;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	
	
}
