package com.sinosoft.ilogrule.ilog.dto.prpcarDto.result;

import java.io.Serializable;

public class SelfCoefficientDto  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	//自主核保参数
	private String selfProtectionUp;  //自主核保上限
	private String selfProtectionDown;  //自主核保下限
	private String selfChannelUp;  //自主渠道上限
	private String selfChannelDown;  //自主渠道下限

	private String loyaltyCof;	//忠诚度系数
	private String threeLimitCof;	//高三者限额
	private String fullRiskInsuranceCof;	//全主险保障
	private String lossNumberCof;	//多次出险
	private String sspecialVehicleCof;	//特殊车辆系数
	private String newInsuredCarCof;	//新客户优质车辆
	private String carAgeCof;	//车龄
	private String customerChannelCof;	//股东关系业务
	private String sumQuantityCof;	//团车（承保数量）系数
	private String insuredAgeCof;	//被保险人年龄系数
	private String insuredSexCof;	//被保险人性别系数
	
	
	public String getSelfProtectionUp() {
		return selfProtectionUp;
	}
	public void setSelfProtectionUp(String selfProtectionUp) {
		this.selfProtectionUp = selfProtectionUp;
	}
	public String getSelfProtectionDown() {
		return selfProtectionDown;
	}
	public void setSelfProtectionDown(String selfProtectionDown) {
		this.selfProtectionDown = selfProtectionDown;
	}
	public String getSelfChannelUp() {
		return selfChannelUp;
	}
	public void setSelfChannelUp(String selfChannelUp) {
		this.selfChannelUp = selfChannelUp;
	}
	public String getSelfChannelDown() {
		return selfChannelDown;
	}
	public void setSelfChannelDown(String selfChannelDown) {
		this.selfChannelDown = selfChannelDown;
	}
	public String getLoyaltyCof() {
		return loyaltyCof;
	}
	public void setLoyaltyCof(String loyaltyCof) {
		this.loyaltyCof = loyaltyCof;
	}
	public String getThreeLimitCof() {
		return threeLimitCof;
	}
	public void setThreeLimitCof(String threeLimitCof) {
		this.threeLimitCof = threeLimitCof;
	}
	public String getFullRiskInsuranceCof() {
		return fullRiskInsuranceCof;
	}
	public void setFullRiskInsuranceCof(String fullRiskInsuranceCof) {
		this.fullRiskInsuranceCof = fullRiskInsuranceCof;
	}
	public String getLossNumberCof() {
		return lossNumberCof;
	}
	public void setLossNumberCof(String lossNumberCof) {
		this.lossNumberCof = lossNumberCof;
	}
	public String getSspecialVehicleCof() {
		return sspecialVehicleCof;
	}
	public void setSspecialVehicleCof(String sspecialVehicleCof) {
		this.sspecialVehicleCof = sspecialVehicleCof;
	}
	public String getNewInsuredCarCof() {
		return newInsuredCarCof;
	}
	public void setNewInsuredCarCof(String newInsuredCarCof) {
		this.newInsuredCarCof = newInsuredCarCof;
	}
	public String getCarAgeCof() {
		return carAgeCof;
	}
	public void setCarAgeCof(String carAgeCof) {
		this.carAgeCof = carAgeCof;
	}
	public String getCustomerChannelCof() {
		return customerChannelCof;
	}
	public void setCustomerChannelCof(String customerChannelCof) {
		this.customerChannelCof = customerChannelCof;
	}
	public String getSumQuantityCof() {
		return sumQuantityCof;
	}
	public void setSumQuantityCof(String sumQuantityCof) {
		this.sumQuantityCof = sumQuantityCof;
	}
	public String getInsuredAgeCof() {
		return insuredAgeCof;
	}
	public void setInsuredAgeCof(String insuredAgeCof) {
		this.insuredAgeCof = insuredAgeCof;
	}
	public String getInsuredSexCof() {
		return insuredSexCof;
	}
	public void setInsuredSexCof(String insuredSexCof) {
		this.insuredSexCof = insuredSexCof;
	}
	
	
	
	
}
