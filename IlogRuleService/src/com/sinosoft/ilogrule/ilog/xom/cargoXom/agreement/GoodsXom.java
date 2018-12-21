package com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement;

import java.io.Serializable;

public class GoodsXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String goodFlag;	//		货物标识
	private String goodTypeCode;	//			货物类别代码
	private String goodTypeName;	//			货物类别名称
	private String packingCode;	//			包装方式代码
	private String packingName;	//			包装方式名称
	private String goodName;	//			货物名称
	private String Deductibles;	//			免赔
	private String goodSensitiveWords;	//		货物名称敏感词
	private String transportType;	//			运输方式
	private String transportCity;	//			运输地国家限制

	
	
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
	public String getGoodSensitiveWords() {
		return goodSensitiveWords;
	}
	public void setGoodSensitiveWords(String goodSensitiveWords) {
		this.goodSensitiveWords = goodSensitiveWords;
	}
	public String getTransportType() {
		return transportType;
	}
	public void setTransportType(String transportType) {
		this.transportType = transportType;
	}
	public String getTransportCity() {
		return transportCity;
	}
	public void setTransportCity(String transportCity) {
		this.transportCity = transportCity;
	}
	
}
