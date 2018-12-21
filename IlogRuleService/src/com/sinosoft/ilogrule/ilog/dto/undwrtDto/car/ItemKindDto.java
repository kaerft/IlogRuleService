package com.sinosoft.ilogrule.ilog.dto.undwrtDto.car;

import java.io.Serializable;

public class ItemKindDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/***
	 * 险别代码
	 */
	private String itemKindCode;
	/***
	 * 险别名称
	 */
	private String itemKindName;
	/***
	 * 险别保额
	 */
	private String amount;
	/***
	 * 上年投保是否出险
	 */
	private String lastAccient;
	/***
	 * 是否国产玻璃
	 */
	private String isHomemadeGlass;
	/***
	 * 每座赔偿限额
	 */
	private String everyLimitFee;
	/***
	 * 标准保费
	 */
	private String benchMarkPremium;
	
	/***
	 * 主附险标志
	 */
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



	public String getBenchMarkPremium() {
		return benchMarkPremium;
	}

	public void setBenchMarkPremium(String benchMarkPremium) {
		this.benchMarkPremium = benchMarkPremium;
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}
