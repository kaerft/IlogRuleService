package com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule;

public class ItemKindXom{
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
	private double amount;
	
	/***
	 * 标准保费
	 */
	private double benchMarkPremium;
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
	private double itemPerAcciLimit;
	/***
	 * 险别每人限额
	 */
	private double itemPerLimit;
	/***
	 * 险别累计限额
	 */
	private double itemSumLimit;
	/***
	 * 险别累计限额的自留额
	 */
	private double itemRetSumLimit;
	/***
	 * 险别保额的自留额
	 */
	private double retAmount;
	/***
	 * 险别每人限额的自留额
	 */
	private double itemRetPerLimit;
	/***
	 * 险别每次事故限额的自留额
	 */
	private double itemRetPerAcciLimit;
	
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBenchMarkPremium() {
		return benchMarkPremium;
	}

	public void setBenchMarkPremium(double benchMarkPremium) {
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

	public double getItemPerAcciLimit() {
		return itemPerAcciLimit;
	}

	public void setItemPerAcciLimit(double itemPerAcciLimit) {
		this.itemPerAcciLimit = itemPerAcciLimit;
	}

	public double getItemPerLimit() {
		return itemPerLimit;
	}

	public void setItemPerLimit(double itemPerLimit) {
		this.itemPerLimit = itemPerLimit;
	}

	public double getItemSumLimit() {
		return itemSumLimit;
	}

	public void setItemSumLimit(double itemSumLimit) {
		this.itemSumLimit = itemSumLimit;
	}

	public double getItemRetSumLimit() {
		return itemRetSumLimit;
	}

	public void setItemRetSumLimit(double itemRetSumLimit) {
		this.itemRetSumLimit = itemRetSumLimit;
	}

	public double getRetAmount() {
		return retAmount;
	}

	public void setRetAmount(double retAmount) {
		this.retAmount = retAmount;
	}

	public double getItemRetPerLimit() {
		return itemRetPerLimit;
	}

	public void setItemRetPerLimit(double itemRetPerLimit) {
		this.itemRetPerLimit = itemRetPerLimit;
	}

	public double getItemRetPerAcciLimit() {
		return itemRetPerAcciLimit;
	}

	public void setItemRetPerAcciLimit(double itemRetPerAcciLimit) {
		this.itemRetPerAcciLimit = itemRetPerAcciLimit;
	}
	
}
