package com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead;

import java.io.Serializable;
import java.util.Date;

public class GoodsXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String goodFlag;	//		货物标识
	private String goodTypeCode;	//			货物类别代码
	private String goodTypeName;	//			货物类别名称
	private String packingCode;	//			包装方式代码
	private String packingName;	//			包装方式名称
	private String goodName;	//			货物名称
	private String Deductibles;	//			免赔
	private String packingQuantity;	//			包装数量
	private String startArea;	//			起运地
	private String routeArea;	//			途经地
	private String endArea;	//			目的地
	private String transportType;	//			运输方式
	private Date shipDate;	//			起运日期
	
	
	public String getGoodFlag() {
		return goodFlag;
	}
	public void setGoodFlag(String goodFlag) {
		this.goodFlag = goodFlag;
	}
	public String getGoodTypeCode() {
		return goodTypeCode;
	}
	public void setGoodTypeCode(String goodTypeCode) {
		this.goodTypeCode = goodTypeCode;
	}
	public String getGoodTypeName() {
		return goodTypeName;
	}
	public void setGoodTypeName(String goodTypeName) {
		this.goodTypeName = goodTypeName;
	}
	public String getPackingCode() {
		return packingCode;
	}
	public void setPackingCode(String packingCode) {
		this.packingCode = packingCode;
	}
	public String getPackingName() {
		return packingName;
	}
	public void setPackingName(String packingName) {
		this.packingName = packingName;
	}
	public String getGoodName() {
		return goodName;
	}
	public void setGoodName(String goodName) {
		this.goodName = goodName;
	}
	public String getDeductibles() {
		return Deductibles;
	}
	public void setDeductibles(String deductibles) {
		Deductibles = deductibles;
	}
	public String getPackingQuantity() {
		return packingQuantity;
	}
	public void setPackingQuantity(String packingQuantity) {
		this.packingQuantity = packingQuantity;
	}
	public String getStartArea() {
		return startArea;
	}
	public void setStartArea(String startArea) {
		this.startArea = startArea;
	}
	public String getRouteArea() {
		return routeArea;
	}
	public void setRouteArea(String routeArea) {
		this.routeArea = routeArea;
	}
	public String getEndArea() {
		return endArea;
	}
	public void setEndArea(String endArea) {
		this.endArea = endArea;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	
}
