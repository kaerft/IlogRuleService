package com.sinosoft.ilogrule.ilog.dto.prpcarDto.result;

import java.io.Serializable;

public class NCDCoefficientDto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//昊升方案参数
	private String carGroupCof;  //车系分组系数
	private String ageSexCof;  //年龄性别系数
	private String trafficNCD1Cof;  //交强1年NCD系数
	private String trafficNCD2Cof;  //交强2年NCD系数
	private String businessNCD1Cof;  //商车1年NCD系数
	private String businessNCD2Cof;  //商车2年NCD系数
	private String upBusinessNCDCof;  //上张单商车NCD系数
	private String carAgeLevelCof;  //车龄等级系数
	private String insSituationCof;  //附加险投保情况系数
	private String isInsureExceptCof;  //是否投保不计免系数
	private String qCellCoreCof;  //地级市系数
	private String vehiclesDisCof;  //车辆类型+排量系数
	private String regionalBenchmarksCof;  //地区基准NCD后赔付率
	
	
	public String getCarGroupCof() {
		return carGroupCof;
	}
	public void setCarGroupCof(String carGroupCof) {
		this.carGroupCof = carGroupCof;
	}
	public String getAgeSexCof() {
		return ageSexCof;
	}
	public void setAgeSexCof(String ageSexCof) {
		this.ageSexCof = ageSexCof;
	}
	public String getTrafficNCD1Cof() {
		return trafficNCD1Cof;
	}
	public void setTrafficNCD1Cof(String trafficNCD1Cof) {
		this.trafficNCD1Cof = trafficNCD1Cof;
	}
	public String getTrafficNCD2Cof() {
		return trafficNCD2Cof;
	}
	public void setTrafficNCD2Cof(String trafficNCD2Cof) {
		this.trafficNCD2Cof = trafficNCD2Cof;
	}
	public String getBusinessNCD1Cof() {
		return businessNCD1Cof;
	}
	public void setBusinessNCD1Cof(String businessNCD1Cof) {
		this.businessNCD1Cof = businessNCD1Cof;
	}
	public String getBusinessNCD2Cof() {
		return businessNCD2Cof;
	}
	public void setBusinessNCD2Cof(String businessNCD2Cof) {
		this.businessNCD2Cof = businessNCD2Cof;
	}
	public String getUpBusinessNCDCof() {
		return upBusinessNCDCof;
	}
	public void setUpBusinessNCDCof(String upBusinessNCDCof) {
		this.upBusinessNCDCof = upBusinessNCDCof;
	}
	public String getCarAgeLevelCof() {
		return carAgeLevelCof;
	}
	public void setCarAgeLevelCof(String carAgeLevelCof) {
		this.carAgeLevelCof = carAgeLevelCof;
	}
	public String getInsSituationCof() {
		return insSituationCof;
	}
	public void setInsSituationCof(String insSituationCof) {
		this.insSituationCof = insSituationCof;
	}
	public String getIsInsureExceptCof() {
		return isInsureExceptCof;
	}
	public void setIsInsureExceptCof(String isInsureExceptCof) {
		this.isInsureExceptCof = isInsureExceptCof;
	}
	public String getqCellCoreCof() {
		return qCellCoreCof;
	}
	public void setqCellCoreCof(String qCellCoreCof) {
		this.qCellCoreCof = qCellCoreCof;
	}
	public String getVehiclesDisCof() {
		return vehiclesDisCof;
	}
	public void setVehiclesDisCof(String vehiclesDisCof) {
		this.vehiclesDisCof = vehiclesDisCof;
	}
	public String getRegionalBenchmarksCof() {
		return regionalBenchmarksCof;
	}
	public void setRegionalBenchmarksCof(String regionalBenchmarksCof) {
		this.regionalBenchmarksCof = regionalBenchmarksCof;
	}
	
	
	
}
