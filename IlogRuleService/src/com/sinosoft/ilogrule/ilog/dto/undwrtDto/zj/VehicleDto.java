package com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj;

import java.io.Serializable;

public class VehicleDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/***
	 * 	车辆品牌代码
	 */
	private String vehicleBrandCode;
	/***
	 * 车辆品牌名称
	 */
	private String vehicleBrandName;
	/***
	 * 车系名称
	 */
	private String seriesName;
	/***
	 * 车系代码
	 */
	private String seriesCode;
	
	/***
	 * 车型代码
	 */
	private String brandCode;
	/***
	 * 车型名称
	 */
	private String brandName;
	/***
	 * 外地车标志代码
	 */
	private String ecdemicMrk_Code;
	/***
	 * 外地车标志名称
	 */
	private String ecdemicMrk;
	/***
	 * 车辆性质代码
	 */
	private String usenatureCode;
	/***
	 * 车辆性质名称
	 */
	private String usenature_Name;
	/***
	 * 营业性质代码
	 */
	private String businessClassCode;
	/***
	 * 营业性质名称
	 */
	private String businessClassName;
	/***
	 * 核定载客数(座位数)
	 */
	private String seatCount;
	/***
	 * 车辆类型代码
	 */
	private String vehiclesType_Code;
	/***
	 * 车辆类型名称
	 */
	private String vehiclesType;
	/***
	 * 车辆过户标识代码
	 */
	private String transferFlag_Code;
	/***
	 * 车辆过户标识名称
	 */
	private String transferFlag;
	/***
	 * 是否上牌
	 */
	private String isOneCard;
	/***
	 * 车船税标志代码
	 */
	private String hfName_Code;
	/***
	 * 车船税标志名称
	 */
	private String hfName;
	/***
	 * 车牌号
	 */
	private String licenseNo;
	/***
	 * 纳税类型
	 */
	private String taxType;
	/***
	 * 新车发票购买日期
	 */
	private String buyDate;
	/***
	 * 发证日期
	 */
	private String certificateDate;
	/***
	 * 初登日期
	 */
	private String enrollDate;
	/***
	 * 行驶里程
	 */
	private String runMiles;
	/***
	 * 是否进口车
	 */
	private String isImportCar;
	/***
	 * 能源种类代码
	 */
	private String fuelType_Code;
	/***
	 * 能源种类名称
	 */
	private String fuelType;
	/***
	 * 是否改装代码
	 */
	private String isRefit_Code;
	/***
	 * 是否改装名称
	 */
	private String isRefit;
	/***
	 * 车型编码
	 */
	private String carCode;
	/***
	 * 新车购置价
	 */
	private String purchasePrice;
	/***
	 * 车龄
	 */
	private String carAge;
	/***
	 * 车辆发动机号
	 */
	private String engineNum;
	/***
	 * 车架号
	 */
	private String frmNo;
	/***
	 * 风险等级
	 */
	private String riskLevel;
	/***
	 * 新车标识代码
	 */
	private String isNewCar_Code;
	/***
	 * 新车标识名称
	 */
	private String isNewCar;
	/***
	 * 特殊车辆系数
	 */
	private String sspecialVehicle;
	/***
	 * 协商实际价值浮动比例
	 */
	private String actualFloatRatioValue;
	/***
	 * 协商实际价值
	 */
	private String actualValue;
	/***
	 * 是否节能减排车
	 */
	private String isConserveEnergy;
	/***
	 * 排量（单位:L）
	 */
	private String nDisplacement;
	/***
	 * 首年是否在本地投保
	 */
	private String isInsuredLocally;
	/***
	 * 是否黑名单客户
	 */
	private String isBlacklist;
	/***
	 * 是否属于高风险车型库
	 */
	private String isHighRiskCar;
	/***
	 * 是否属于易盗车型库
	 */
	private String isEasyStealCar;
	/***
	 * 是否属于微面车
	 */
	private String isMicroFacetCar;
	/***
	 * 车龄等级代码
	 */
	private String carAgeLevel_Code;
	/***
	 * 车龄等级名称
	 */
	private String carAgeLevel;
	
	/***
	 * 是否属于总公司高风险车型
	 */
	private String isZGHighRiskCar;
	
	/***
	 * 特殊车投保标志
	 */
	private String signForSpecialCar;
	
	/***
	 * 总公司代码
	 */
	private String zgComCode;
	/***
	 * 总公司车型代码
	 */
	private String zgCarTypeCode;
	/***
	 * 分公司省份代码
	 */
	private String fgComCode;
	/***
	 * 分公司车型代码
	 */
	private String fgCarTypeCode;
	
	/***
	 * 车船税的值
	 */
	private String hfTaxValue;
	
	/***
	 * 车辆种类代码
	 */
	private String vehicleSpeciesCode;
	
	/***
	 * 车辆种类名称
	 */
	private String vehicleSpeciesName;
	
	public String getVehicleBrandCode() {
		return vehicleBrandCode;
	}

	public void setVehicleBrandCode(String vehicleBrandCode) {
		this.vehicleBrandCode = vehicleBrandCode;
	}

	public String getVehicleBrandName() {
		return vehicleBrandName;
	}

	public void setVehicleBrandName(String vehicleBrandName) {
		this.vehicleBrandName = vehicleBrandName;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSeriesCode() {
		return seriesCode;
	}

	public void setSeriesCode(String seriesCode) {
		this.seriesCode = seriesCode;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getEcdemicMrk() {
		return ecdemicMrk;
	}

	public void setEcdemicMrk(String ecdemicMrk) {
		this.ecdemicMrk = ecdemicMrk;
	}

	public String getUsenatureCode() {
		return usenatureCode;
	}

	public void setUsenatureCode(String usenatureCode) {
		this.usenatureCode = usenatureCode;
	}

	public String getBusinessClassCode() {
		return businessClassCode;
	}

	public void setBusinessClassCode(String businessClassCode) {
		this.businessClassCode = businessClassCode;
	}

	public String getBusinessClassName() {
		return businessClassName;
	}

	public void setBusinessClassName(String businessClassName) {
		this.businessClassName = businessClassName;
	}

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getVehiclesType() {
		return vehiclesType;
	}

	public void setVehiclesType(String vehiclesType) {
		this.vehiclesType = vehiclesType;
	}

	public String getTransferFlag() {
		return transferFlag;
	}

	public void setTransferFlag(String transferFlag) {
		this.transferFlag = transferFlag;
	}

	public String getIsOneCard() {
		return isOneCard;
	}

	public void setIsOneCard(String isOneCard) {
		this.isOneCard = isOneCard;
	}

	public String getHfName() {
		return hfName;
	}

	public void setHfName(String hfName) {
		this.hfName = hfName;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(String buyDate) {
		this.buyDate = buyDate;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getRunMiles() {
		return runMiles;
	}

	public void setRunMiles(String runMiles) {
		this.runMiles = runMiles;
	}

	public String getIsImportCar() {
		return isImportCar;
	}

	public void setIsImportCar(String isImportCar) {
		this.isImportCar = isImportCar;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getIsRefit() {
		return isRefit;
	}

	public void setIsRefit(String isRefit) {
		this.isRefit = isRefit;
	}


	public String getCarCode() {
		return carCode;
	}

	public void setCarCode(String carCode) {
		this.carCode = carCode;
	}

	public String getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(String purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getCarAge() {
		return carAge;
	}

	public void setCarAge(String carAge) {
		this.carAge = carAge;
	}

	public String getEngineNum() {
		return engineNum;
	}

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

	public String getFrmNo() {
		return frmNo;
	}

	public void setFrmNo(String frmNo) {
		this.frmNo = frmNo;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getIsNewCar() {
		return isNewCar;
	}

	public void setIsNewCar(String isNewCar) {
		this.isNewCar = isNewCar;
	}

	public String getSspecialVehicle() {
		return sspecialVehicle;
	}

	public void setSspecialVehicle(String sspecialVehicle) {
		this.sspecialVehicle = sspecialVehicle;
	}

	public String getActualValue() {
		return actualValue;
	}

	public void setActualValue(String actualValue) {
		this.actualValue = actualValue;
	}

	public String getIsConserveEnergy() {
		return isConserveEnergy;
	}

	public void setIsConserveEnergy(String isConserveEnergy) {
		this.isConserveEnergy = isConserveEnergy;
	}

	public String getnDisplacement() {
		return nDisplacement;
	}

	public void setnDisplacement(String nDisplacement) {
		this.nDisplacement = nDisplacement;
	}

	public String getIsInsuredLocally() {
		return isInsuredLocally;
	}

	public void setIsInsuredLocally(String isInsuredLocally) {
		this.isInsuredLocally = isInsuredLocally;
	}

	public String getIsBlacklist() {
		return isBlacklist;
	}

	public void setIsBlacklist(String isBlacklist) {
		this.isBlacklist = isBlacklist;
	}

	public String getIsHighRiskCar() {
		return isHighRiskCar;
	}

	public void setIsHighRiskCar(String isHighRiskCar) {
		this.isHighRiskCar = isHighRiskCar;
	}

	public String getIsEasyStealCar() {
		return isEasyStealCar;
	}

	public void setIsEasyStealCar(String isEasyStealCar) {
		this.isEasyStealCar = isEasyStealCar;
	}

	public String getIsMicroFacetCar() {
		return isMicroFacetCar;
	}

	public void setIsMicroFacetCar(String isMicroFacetCar) {
		this.isMicroFacetCar = isMicroFacetCar;
	}

	public String getCarAgeLevel() {
		return carAgeLevel;
	}

	public void setCarAgeLevel(String carAgeLevel) {
		this.carAgeLevel = carAgeLevel;
	}

	public String getEcdemicMrk_Code() {
		return ecdemicMrk_Code;
	}

	public void setEcdemicMrk_Code(String ecdemicMrk_Code) {
		this.ecdemicMrk_Code = ecdemicMrk_Code;
	}

	public String getUsenature_Name() {
		return usenature_Name;
	}

	public void setUsenature_Name(String usenature_Name) {
		this.usenature_Name = usenature_Name;
	}

	public String getVehiclesType_Code() {
		return vehiclesType_Code;
	}

	public void setVehiclesType_Code(String vehiclesType_Code) {
		this.vehiclesType_Code = vehiclesType_Code;
	}

	public String getTransferFlag_Code() {
		return transferFlag_Code;
	}

	public void setTransferFlag_Code(String transferFlag_Code) {
		this.transferFlag_Code = transferFlag_Code;
	}

	public String getHfName_Code() {
		return hfName_Code;
	}

	public void setHfName_Code(String hfName_Code) {
		this.hfName_Code = hfName_Code;
	}

	public String getFuelType_Code() {
		return fuelType_Code;
	}

	public void setFuelType_Code(String fuelType_Code) {
		this.fuelType_Code = fuelType_Code;
	}

	public String getIsRefit_Code() {
		return isRefit_Code;
	}

	public void setIsRefit_Code(String isRefit_Code) {
		this.isRefit_Code = isRefit_Code;
	}

	public String getIsNewCar_Code() {
		return isNewCar_Code;
	}

	public void setIsNewCar_Code(String isNewCar_Code) {
		this.isNewCar_Code = isNewCar_Code;
	}

	public String getCarAgeLevel_Code() {
		return carAgeLevel_Code;
	}

	public void setCarAgeLevel_Code(String carAgeLevel_Code) {
		this.carAgeLevel_Code = carAgeLevel_Code;
	}

	public String getActualFloatRatioValue() {
		return actualFloatRatioValue;
	}

	public void setActualFloatRatioValue(String actualFloatRatioValue) {
		this.actualFloatRatioValue = actualFloatRatioValue;
	}

	public String getIsZGHighRiskCar() {
		return isZGHighRiskCar;
	}

	public void setIsZGHighRiskCar(String isZGHighRiskCar) {
		this.isZGHighRiskCar = isZGHighRiskCar;
	}

	public String getSignForSpecialCar() {
		return signForSpecialCar;
	}

	public void setSignForSpecialCar(String signForSpecialCar) {
		this.signForSpecialCar = signForSpecialCar;
	}

	public String getZgComCode() {
		return zgComCode;
	}

	public void setZgComCode(String zgComCode) {
		this.zgComCode = zgComCode;
	}

	public String getZgCarTypeCode() {
		return zgCarTypeCode;
	}

	public void setZgCarTypeCode(String zgCarTypeCode) {
		this.zgCarTypeCode = zgCarTypeCode;
	}

	public String getFgComCode() {
		return fgComCode;
	}

	public void setFgComCode(String fgComCode) {
		this.fgComCode = fgComCode;
	}

	public String getFgCarTypeCode() {
		return fgCarTypeCode;
	}

	public void setFgCarTypeCode(String fgCarTypeCode) {
		this.fgCarTypeCode = fgCarTypeCode;
	}

	public String getHfTaxValue() {
		return hfTaxValue;
	}

	public void setHfTaxValue(String hfTaxValue) {
		this.hfTaxValue = hfTaxValue;
	}

	public String getVehicleSpeciesCode() {
		return vehicleSpeciesCode;
	}

	public void setVehicleSpeciesCode(String vehicleSpeciesCode) {
		this.vehicleSpeciesCode = vehicleSpeciesCode;
	}

	public String getVehicleSpeciesName() {
		return vehicleSpeciesName;
	}

	public void setVehicleSpeciesName(String vehicleSpeciesName) {
		this.vehicleSpeciesName = vehicleSpeciesName;
	}
	
}
