package com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule;

public class CargoDetailXom {
	/***
	 * 货物种类
	 */
	private String goodsSpecie;
	
	/***
	 * 包装方式
	 */
	private String packingWay;
	
	/***
	 * 单笔限额
	 */
	private double singleLimit;
	
	/***
	 * 单笔限额的自留额
	 */
	private double retSingleLimit;

	public String getGoodsSpecie() {
		return goodsSpecie;
	}

	public void setGoodsSpecie(String goodsSpecie) {
		this.goodsSpecie = goodsSpecie;
	}

	public String getPackingWay() {
		return packingWay;
	}

	public void setPackingWay(String packingWay) {
		this.packingWay = packingWay;
	}

	public double getSingleLimit() {
		return singleLimit;
	}

	public void setSingleLimit(double singleLimit) {
		this.singleLimit = singleLimit;
	}

	public double getRetSingleLimit() {
		return retSingleLimit;
	}

	public void setRetSingleLimit(double retSingleLimit) {
		this.retSingleLimit = retSingleLimit;
	}
	
}
