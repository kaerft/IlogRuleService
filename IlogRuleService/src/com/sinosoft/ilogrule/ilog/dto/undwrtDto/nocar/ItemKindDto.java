package com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar;

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
	 * 标准保费
	 */
	private String benchMarkPremium;
	
	/***
	 * 主附险标志
	 */
	private String flag;

	
	/***
	 * 责任代码
	 */
	private String kindCode;
	
	/***
	 * 责任名称
	 */
	private String kindName;
	/***
	 * 险别每次事故限额
	 */
	private String itemPerAcciLimit;
	/***
	 * 险别每人限额
	 */
	private String itemPerLimit;
	/***
	 * 险别累计限额
	 */
	private String itemSumLimit;
	/***
	 * 险别累计限额的自留额
	 */
	private String itemRetSumLimit;
	/***
	 * 险别保额的自留额
	 */
	private String retAmount;
	/***
	 * 险别每人限额的自留额
	 */
	private String itemRetPerLimit;
	/***
	 * 险别每次事故限额的自留额
	 */
	private String itemRetPerAcciLimit;
	
	
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

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getKindCode() {
		return kindCode;
	}

	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}

	public String getKindName() {
		return kindName;
	}

	public void setKindName(String kindName) {
		this.kindName = kindName;
	}

	public String getItemPerAcciLimit() {
		return itemPerAcciLimit;
	}

	public void setItemPerAcciLimit(String itemPerAcciLimit) {
		this.itemPerAcciLimit = itemPerAcciLimit;
	}

	public String getItemPerLimit() {
		return itemPerLimit;
	}

	public void setItemPerLimit(String itemPerLimit) {
		this.itemPerLimit = itemPerLimit;
	}

	public String getItemSumLimit() {
		return itemSumLimit;
	}

	public void setItemSumLimit(String itemSumLimit) {
		this.itemSumLimit = itemSumLimit;
	}

	public String getItemRetSumLimit() {
		return itemRetSumLimit;
	}

	public void setItemRetSumLimit(String itemRetSumLimit) {
		this.itemRetSumLimit = itemRetSumLimit;
	}

	public String getRetAmount() {
		return retAmount;
	}

	public void setRetAmount(String retAmount) {
		this.retAmount = retAmount;
	}

	public String getItemRetPerLimit() {
		return itemRetPerLimit;
	}

	public void setItemRetPerLimit(String itemRetPerLimit) {
		this.itemRetPerLimit = itemRetPerLimit;
	}

	public String getItemRetPerAcciLimit() {
		return itemRetPerAcciLimit;
	}

	public void setItemRetPerAcciLimit(String itemRetPerAcciLimit) {
		this.itemRetPerAcciLimit = itemRetPerAcciLimit;
	}
	
}
