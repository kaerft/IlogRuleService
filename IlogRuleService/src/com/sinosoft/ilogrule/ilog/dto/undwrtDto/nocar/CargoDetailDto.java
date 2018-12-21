package com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar;

import java.io.Serializable;

public class CargoDetailDto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
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
	private String singleLimit;
	
	/***
	 * 单笔限额的自留额
	 */
	private String retSingleLimit;

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

	public String getSingleLimit() {
		return singleLimit;
	}

	public void setSingleLimit(String singleLimit) {
		this.singleLimit = singleLimit;
	}

	public String getRetSingleLimit() {
		return retSingleLimit;
	}

	public void setRetSingleLimit(String retSingleLimit) {
		this.retSingleLimit = retSingleLimit;
	}
	
}
