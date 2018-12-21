package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrpCarResultXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String insureHabits; //投保习惯
	private String carGroups; //车系分组
	private String addRiskSituation; //附加险投保情况
	private String actuarialPricSwitch; //精算定价开关
	private Double countNCDCof;   //NCD后赔付率模型计算值
	private Double actuaryCof;  //精算报价系数
	private Double targetCof;   //目标赔付率
	private Double countCof;  //计算报价总优惠系数
	private String trafficNCD1; //交强1 年NCD(系统转换使用)
	private Double priceCof; 	//规则引擎系统规则匹配使用定价系数
	private String useNature;//股东关系业务使用性质
	private Double protectionCof;	//核保报价系数
	private String programmeType;	//方案类型
	private String undwrtLockFlag; //核保锁定标志
	private String description;  //提示描述(规则信息描述；例如：验车规则提示信息)
	private String carInspectionFlag;  //验车标志
	private String operation; //操作描述
	private String autoBusiness;	//业务自主系数
	private String isFeeDiscount;	//是否使用费折联动
	private String distributionRatio;	//分配比例
	private Double carPriceCof;	//返回车险承保定价系数
	private Double selfChannelCof;  //自主渠道系数
	private Double selfProtectionCof;  //自主核保系数
	private String errorMessage;  //异常信息(系统异常返回)
	
	
	//昊升方案参数
	private Double carGroupCof;  //车系分组系数
	private Double ageSexCof;  //年龄性别系数
	private Double trafficNCD1Cof;  //交强1年NCD系数
	private Double trafficNCD2Cof;  //交强2年NCD系数
	private Double businessNCD1Cof;  //商车1年NCD系数
	private Double businessNCD2Cof;  //商车2年NCD系数
	private Double upBusinessNCDCof;  //上张单商车NCD系数
	private Double carAgeLevelCof;  //车龄等级系数
	private Double insSituationCof;  //附加险投保情况系数
	private Double isInsureExceptCof;  //是否投保不计免系数
	private Double qCellCoreCof;  //	地级市系数
	private Double vehiclesDisCof;  //车辆类型+排量系数
	private Double regionalBenchmarksCof;  //	地区基准NCD后赔付率

	
	
	//自主核保参数
	private Double selfProtectionUp;	  //自主核保上限
	private Double selfProtectionDown;	//自主核保下限
	private Double selfChannelUp;	//自主渠道上限
	private Double selfChannelDown;	//自主渠道下限
	private Double loyaltyCof;	//忠诚度系数
	private Double threeLimitCof;	//高三者限额
	private Double fullRiskInsuranceCof;	//全主险保障
	private Double lossNumberCof;	//多次出险
	private Double sspecialVehicleCof;	//特殊车辆系数
	private Double newInsuredCarCof;	//新客户优质车辆
	private Double carAgeCof;	//车龄
	private Double customerChannelCof;	//股东关系业务
	private Double sumQuantityCof;	//团车（承保数量）系数
	private Double insuredAgeCof;	//被保险人年龄系数
	private Double insuredSexCof;	//被保险人性别系数
	
	//费用政策
	private Double trafficDisRate;	//交强险手续费/经纪费比例
	private Double businessDisRate;	//商业险手续费/经纪费比例
	private String feeTypeCode;//	费用类型代码
	private String feeTypeName;//	费用类型名称
	private Double feeRate;//费用比例
	private Double upBusinessDisRate;	//商业险手续费/经纪费比例上限
	
	
	private List<RateXom> rateList = new ArrayList<RateXom>(); //费用列表
	
	public Double getAgeSexCof() {
		return ageSexCof;
	}
	
	public void setAgeSexCof(Double ageSexCof) {
		this.ageSexCof = ageSexCof;
	}
	
	public Double getBusinessNCD1Cof() {
		return businessNCD1Cof;
	}
	
	public void setBusinessNCD1Cof(Double businessNCD1Cof) {
		this.businessNCD1Cof = businessNCD1Cof;
	}

	public String getInsureHabits() {
		return insureHabits;
	}

	public void setInsureHabits(String insureHabits) {
		this.insureHabits = insureHabits;
	}

	public String getCarGroups() {
		return carGroups;
	}

	public void setCarGroups(String carGroups) {
		this.carGroups = carGroups;
	}

	public String getAddRiskSituation() {
		return addRiskSituation;
	}

	public void setAddRiskSituation(String addRiskSituation) {
		this.addRiskSituation = addRiskSituation;
	}

	public String getActuarialPricSwitch() {
		return actuarialPricSwitch;
	}

	public void setActuarialPricSwitch(String actuarialPricSwitch) {
		this.actuarialPricSwitch = actuarialPricSwitch;
	}

	public Double getCountNCDCof() {
		return countNCDCof;
	}

	public void setCountNCDCof(Double countNCDCof) {
		this.countNCDCof = countNCDCof;
	}

	public Double getActuaryCof() {
		return actuaryCof;
	}

	public void setActuaryCof(Double actuaryCof) {
		this.actuaryCof = actuaryCof;
	}

	public Double getTargetCof() {
		return targetCof;
	}

	public void setTargetCof(Double targetCof) {
		this.targetCof = targetCof;
	}

	public Double getCountCof() {
		return countCof;
	}

	public void setCountCof(Double countCof) {
		this.countCof = countCof;
	}

	public String getTrafficNCD1() {
		return trafficNCD1;
	}

	public void setTrafficNCD1(String trafficNCD1) {
		this.trafficNCD1 = trafficNCD1;
	}

	public Double getPriceCof() {
		return priceCof;
	}

	public void setPriceCof(Double priceCof) {
		this.priceCof = priceCof;
	}

	public String getUseNature() {
		return useNature;
	}

	public void setUseNature(String useNature) {
		this.useNature = useNature;
	}

	public Double getProtectionCof() {
		return protectionCof;
	}

	public void setProtectionCof(Double protectionCof) {
		this.protectionCof = protectionCof;
	}

	
	public String getProgrammeType() {
		return programmeType;
	}

	public void setProgrammeType(String programmeType) {
		this.programmeType = programmeType;
	}

	public String getUndwrtLockFlag() {
		return undwrtLockFlag;
	}

	public void setUndwrtLockFlag(String undwrtLockFlag) {
		this.undwrtLockFlag = undwrtLockFlag;
	}

	public Double getCarGroupCof() {
		return carGroupCof;
	}

	public void setCarGroupCof(Double carGroupCof) {
		this.carGroupCof = carGroupCof;
	}

	public Double getTrafficNCD1Cof() {
		return trafficNCD1Cof;
	}

	public void setTrafficNCD1Cof(Double trafficNCD1Cof) {
		this.trafficNCD1Cof = trafficNCD1Cof;
	}

	public Double getTrafficNCD2Cof() {
		return trafficNCD2Cof;
	}

	public void setTrafficNCD2Cof(Double trafficNCD2Cof) {
		this.trafficNCD2Cof = trafficNCD2Cof;
	}

	public Double getBusinessNCD2Cof() {
		return businessNCD2Cof;
	}

	public void setBusinessNCD2Cof(Double businessNCD2Cof) {
		this.businessNCD2Cof = businessNCD2Cof;
	}

	public Double getUpBusinessNCDCof() {
		return upBusinessNCDCof;
	}

	public void setUpBusinessNCDCof(Double upBusinessNCDCof) {
		this.upBusinessNCDCof = upBusinessNCDCof;
	}

	public Double getCarAgeLevelCof() {
		return carAgeLevelCof;
	}

	public void setCarAgeLevelCof(Double carAgeLevelCof) {
		this.carAgeLevelCof = carAgeLevelCof;
	}

	public Double getInsSituationCof() {
		return insSituationCof;
	}

	public void setInsSituationCof(Double insSituationCof) {
		this.insSituationCof = insSituationCof;
	}

	public Double getIsInsureExceptCof() {
		return isInsureExceptCof;
	}

	public void setIsInsureExceptCof(Double isInsureExceptCof) {
		this.isInsureExceptCof = isInsureExceptCof;
	}

	public Double getqCellCoreCof() {
		return qCellCoreCof;
	}

	public void setqCellCoreCof(Double qCellCoreCof) {
		this.qCellCoreCof = qCellCoreCof;
	}

	public Double getVehiclesDisCof() {
		return vehiclesDisCof;
	}

	public void setVehiclesDisCof(Double vehiclesDisCof) {
		this.vehiclesDisCof = vehiclesDisCof;
	}

	public Double getRegionalBenchmarksCof() {
		return regionalBenchmarksCof;
	}

	public void setRegionalBenchmarksCof(Double regionalBenchmarksCof) {
		this.regionalBenchmarksCof = regionalBenchmarksCof;
	}
	
	public Double getSelfProtectionUp() {
		return selfProtectionUp;
	}

	public void setSelfProtectionUp(Double selfProtectionUp) {
		this.selfProtectionUp = selfProtectionUp;
	}

	public Double getSelfProtectionDown() {
		return selfProtectionDown;
	}

	public void setSelfProtectionDown(Double selfProtectionDown) {
		this.selfProtectionDown = selfProtectionDown;
	}

	public Double getSelfChannelUp() {
		return selfChannelUp;
	}

	public void setSelfChannelUp(Double selfChannelUp) {
		this.selfChannelUp = selfChannelUp;
	}

	public Double getSelfChannelDown() {
		return selfChannelDown;
	}

	public void setSelfChannelDown(Double selfChannelDown) {
		this.selfChannelDown = selfChannelDown;
	}

	public Double getSelfChannelCof() {
		return selfChannelCof;
	}

	public void setSelfChannelCof(Double selfChannelCof) {
		this.selfChannelCof = selfChannelCof;
	}

	public Double getSelfProtectionCof() {
		return selfProtectionCof;
	}

	public void setSelfProtectionCof(Double selfProtectionCof) {
		this.selfProtectionCof = selfProtectionCof;
	}
	
	
	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Double getLoyaltyCof() {
		return loyaltyCof;
	}

	public void setLoyaltyCof(Double loyaltyCof) {
		this.loyaltyCof = loyaltyCof;
	}

	public Double getThreeLimitCof() {
		return threeLimitCof;
	}

	public void setThreeLimitCof(Double threeLimitCof) {
		this.threeLimitCof = threeLimitCof;
	}

	public Double getFullRiskInsuranceCof() {
		return fullRiskInsuranceCof;
	}

	public void setFullRiskInsuranceCof(Double fullRiskInsuranceCof) {
		this.fullRiskInsuranceCof = fullRiskInsuranceCof;
	}

	public Double getLossNumberCof() {
		return lossNumberCof;
	}

	public void setLossNumberCof(Double lossNumberCof) {
		this.lossNumberCof = lossNumberCof;
	}

	public Double getSspecialVehicleCof() {
		return sspecialVehicleCof;
	}

	public void setSspecialVehicleCof(Double sspecialVehicleCof) {
		this.sspecialVehicleCof = sspecialVehicleCof;
	}

	public Double getNewInsuredCarCof() {
		return newInsuredCarCof;
	}

	public void setNewInsuredCarCof(Double newInsuredCarCof) {
		this.newInsuredCarCof = newInsuredCarCof;
	}

	public Double getCarAgeCof() {
		return carAgeCof;
	}

	public void setCarAgeCof(Double carAgeCof) {
		this.carAgeCof = carAgeCof;
	}

	public Double getCustomerChannelCof() {
		return customerChannelCof;
	}

	public void setCustomerChannelCof(Double customerChannelCof) {
		this.customerChannelCof = customerChannelCof;
	}

	public Double getSumQuantityCof() {
		return sumQuantityCof;
	}

	public void setSumQuantityCof(Double sumQuantityCof) {
		this.sumQuantityCof = sumQuantityCof;
	}

	public Double getInsuredAgeCof() {
		return insuredAgeCof;
	}

	public void setInsuredAgeCof(Double insuredAgeCof) {
		this.insuredAgeCof = insuredAgeCof;
	}

	public Double getInsuredSexCof() {
		return insuredSexCof;
	}

	public void setInsuredSexCof(Double insuredSexCof) {
		this.insuredSexCof = insuredSexCof;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getCarInspectionFlag() {
		return carInspectionFlag;
	}

	public void setCarInspectionFlag(String carInspectionFlag) {
		this.carInspectionFlag = carInspectionFlag;
	}
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getAutoBusiness() {
		return autoBusiness;
	}

	public void setAutoBusiness(String autoBusiness) {
		this.autoBusiness = autoBusiness;
	}

	public String getIsFeeDiscount() {
		return isFeeDiscount;
	}

	public void setIsFeeDiscount(String isFeeDiscount) {
		this.isFeeDiscount = isFeeDiscount;
	}

	public String getDistributionRatio() {
		return distributionRatio;
	}

	public void setDistributionRatio(String distributionRatio) {
		this.distributionRatio = distributionRatio;
	}
	
	public Double getTrafficDisRate() {
		return trafficDisRate;
	}

	public void setTrafficDisRate(Double trafficDisRate) {
		if(this.trafficDisRate==null){
			this.trafficDisRate = trafficDisRate;
		}else{
			if(this.trafficDisRate<trafficDisRate){
				this.trafficDisRate = trafficDisRate;
			}
		}
	}

	public Double getBusinessDisRate() {
		return businessDisRate;
	}

	public void setBusinessDisRate(Double businessDisRate) {
		if(this.businessDisRate==null){
			this.businessDisRate = businessDisRate;
		}else{
			if(this.businessDisRate<businessDisRate){
				this.businessDisRate = businessDisRate;
			}
		}
	}

	public Double getCarPriceCof() {
		return carPriceCof;
	}

	public void setCarPriceCof(Double carPriceCof) {
		if(this.carPriceCof==null){
			this.carPriceCof = carPriceCof;
		}else{
			if(this.carPriceCof<carPriceCof){
				this.carPriceCof = carPriceCof;
			}
		}
	}

	public String getFeeTypeCode() {
		return feeTypeCode;
	}

	public void setFeeTypeCode(String feeTypeCode) {
		this.feeTypeCode = feeTypeCode;
	}

	public String getFeeTypeName() {
		return feeTypeName;
	}

	public void setFeeTypeName(String feeTypeName) {
		this.feeTypeName = feeTypeName;
	}

	public Double getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(Double feeRate) {
		if(this.feeRate==null){
			this.feeRate = feeRate;
		}else{
			if(this.feeRate<feeRate){
				this.feeRate = feeRate;
			}
//			if(feeRate==0){
//				this.feeRate = feeRate;
//			}
		}
	}

	public List<RateXom> getRateList() {
		return rateList;
	}

	public void setRateList(List<RateXom> rateList) {
		this.rateList = rateList;
	}

	public Double getUpBusinessDisRate() {
		return upBusinessDisRate;
	}

	public void setUpBusinessDisRate(Double upBusinessDisRate) {
		this.upBusinessDisRate = upBusinessDisRate;
	}

	/**
	 * NCD后赔付率模型计算值
	 * 家用车主全_NCD后赔付率模型计算值 = 地区基准NCD后赔付率*车系分组*年龄性别*交强1年NCD*商车2年NCD*上张单商车NCD*车龄等级*附加险投保情况*是否投保不计免*地级市 
	 * @return
	 */
	public double computeCoefficientZQ(){
		double coefficientCount = 0d;
		
		
		double regionalBenchmarksCof_ZQ = 1.0;
		double carGroupCof_ZQ = 1.0;
		double ageSexCof_ZQ = 1.0;
		double trafficNCD1Cof_ZQ = 1.0;
		double businessNCD2Cof_ZQ = 1.0;
		double upBusinessNCDCof_ZQ = 1.0;
		double insSituationCof_ZQ = 1.0;
		double carAgeLevelCof_ZQ = 1.0;
		double isInsureExceptCof_ZQ = 1.0;
		double qCellCoreCof_ZQ = 1.0;
		
		if(this.regionalBenchmarksCof!=null && !"".equals(this.regionalBenchmarksCof)){
			regionalBenchmarksCof_ZQ = this.regionalBenchmarksCof;
		}
		if(this.carGroupCof!=null && !"".equals(this.carGroupCof)){
			carGroupCof_ZQ = this.carGroupCof;
		}
		if(this.ageSexCof!=null && !"".equals(this.ageSexCof)){
			ageSexCof_ZQ = this.ageSexCof;
		}
		if(this.trafficNCD1Cof!=null && !"".equals(this.trafficNCD1Cof)){
			trafficNCD1Cof_ZQ = this.trafficNCD1Cof;
		}
		if(this.businessNCD2Cof!=null && !"".equals(this.businessNCD2Cof)){
			businessNCD2Cof_ZQ = this.businessNCD2Cof;
		}
		if(this.upBusinessNCDCof!=null && !"".equals(this.upBusinessNCDCof)){
			upBusinessNCDCof_ZQ = this.upBusinessNCDCof;
		}
		if(this.carAgeLevelCof!=null && !"".equals(this.carAgeLevelCof)){
			carAgeLevelCof_ZQ = this.carAgeLevelCof;
		}
		if(this.insSituationCof!=null && !"".equals(this.insSituationCof)){
			insSituationCof_ZQ = this.insSituationCof;
		}
		if(this.isInsureExceptCof!=null && !"".equals(this.isInsureExceptCof)){
			isInsureExceptCof_ZQ = this.isInsureExceptCof;
		}
		if(this.qCellCoreCof!=null && !"".equals(this.qCellCoreCof)){
			qCellCoreCof_ZQ = this.qCellCoreCof;
		}
		
		coefficientCount = regionalBenchmarksCof_ZQ * carGroupCof_ZQ * ageSexCof_ZQ * trafficNCD1Cof_ZQ * businessNCD2Cof_ZQ *
				upBusinessNCDCof_ZQ * carAgeLevelCof_ZQ * insSituationCof_ZQ * isInsureExceptCof_ZQ * qCellCoreCof_ZQ;

		return coefficientCount;
	}
	
	/**
	 * NCD后赔付率模型计算值
	 * 家用车交三_NCD后赔付率模型计算值 = 地区基准NCD后赔付率*年龄性别*交强2年NCD*车辆类型+排量 *车龄等级*地级市
	 * @return
	 */
	public double computeCoefficientJS(){
		double coefficientCount = 0d;
		
		double regionalBenchmarksCof_JS = 1.0;
		double ageSexCof_JS = 1.0;
		double trafficNCD2Cof_JS = 1.0;
		double vehiclesDisCof_JS = 1.0;
		double carAgeLevelCof_JS = 1.0;
		double qCellCoreCof_JS = 1.0;
		
		if(this.regionalBenchmarksCof!=null && !"".equals(this.regionalBenchmarksCof)){
			regionalBenchmarksCof_JS = this.regionalBenchmarksCof;
		}
		if(this.ageSexCof!=null && !"".equals(this.ageSexCof)){
			ageSexCof_JS = this.ageSexCof;
		}
		if(this.trafficNCD2Cof!=null && !"".equals(this.trafficNCD2Cof)){
			trafficNCD2Cof_JS = this.trafficNCD2Cof;
		}
		if(this.vehiclesDisCof!=null && !"".equals(this.vehiclesDisCof)){
			vehiclesDisCof_JS = this.vehiclesDisCof;
		}
		if(this.carAgeLevelCof!=null && !"".equals(this.carAgeLevelCof)){
			carAgeLevelCof_JS = this.carAgeLevelCof;
		}
		if(this.qCellCoreCof!=null && !"".equals(this.qCellCoreCof)){
			qCellCoreCof_JS = this.qCellCoreCof;
		}
		
		coefficientCount = regionalBenchmarksCof_JS * ageSexCof_JS * trafficNCD2Cof_JS * vehiclesDisCof_JS * carAgeLevelCof_JS * qCellCoreCof_JS;
		
		return coefficientCount;
	}
	/**
	 * NCD后赔付率模型计算值
	 * 家用车单交_NCD后赔付率模型计算值 = 地区基准NCD后赔付率*年龄性别*交强1年NCD*车辆类型+排量*地级市
	 * @return
	 */
	public double computeCoefficientDJ(){
		double coefficientCount = 0d;
		
		double regionalBenchmarksCof_DJ = 1.0;
		double ageSexCof_DJ = 1.0;
		double trafficNCD1Cof_DJ = 1.0;
		double vehiclesDisCof_DJ = 1.0;
		double qCellCoreCof_DJ = 1.0;
		
		if(this.regionalBenchmarksCof!=null && !"".equals(this.regionalBenchmarksCof)){
			regionalBenchmarksCof_DJ = this.regionalBenchmarksCof;
		}
		if(this.ageSexCof!=null && !"".equals(this.ageSexCof)){
			ageSexCof_DJ = this.ageSexCof;
		}
		if(this.trafficNCD1Cof!=null && !"".equals(this.trafficNCD1Cof)){
			trafficNCD1Cof_DJ = this.trafficNCD1Cof;
		}
		if(this.vehiclesDisCof!=null && !"".equals(this.vehiclesDisCof)){
			vehiclesDisCof_DJ = this.vehiclesDisCof;
		}
		if(this.qCellCoreCof!=null && !"".equals(this.qCellCoreCof)){
			qCellCoreCof_DJ = this.qCellCoreCof;
		}
		
		coefficientCount = regionalBenchmarksCof_DJ * ageSexCof_DJ * trafficNCD1Cof_DJ * vehiclesDisCof_DJ * qCellCoreCof_DJ;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 北京_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 特殊车辆系数 * 新客户优质车辆 * 车龄 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_BJ(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_BJ = 1.0;
		double threeLimitCof_BJ = 1.0;
		double fullRiskInsuranceCof_BJ = 1.0;
		double lossNumberCof_BJ = 1.0;
		double sspecialVehicleCof_BJ = 1.0;
		double newInsuredCarCof_BJ = 1.0;
		double carAgeCof_BJ = 1.0;
		double customerChannelCof_BJ = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_BJ = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_BJ = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_BJ = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_BJ = this.lossNumberCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_BJ = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_BJ = this.newInsuredCarCof;
		}
		if(this.carAgeCof!=null && !"".equals(this.carAgeCof)){
			carAgeCof_BJ = this.carAgeCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_BJ = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_BJ * threeLimitCof_BJ * fullRiskInsuranceCof_BJ * lossNumberCof_BJ * 
				sspecialVehicleCof_BJ * newInsuredCarCof_BJ * carAgeCof_BJ * customerChannelCof_BJ;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 黑龙江_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_HLJ(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_HLJ = 1.0;
		double threeLimitCof_HLJ = 1.0;
		double fullRiskInsuranceCof_HLJ = 1.0;
		double lossNumberCof_HLJ = 1.0;
		double sumQuantityCof_HLJ = 1.0;
		double sspecialVehicleCof_HLJ = 1.0;
		double customerChannelCof_HLJ = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_HLJ = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_HLJ = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_HLJ = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_HLJ = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_HLJ = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_HLJ = this.sspecialVehicleCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_HLJ = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_HLJ * threeLimitCof_HLJ * fullRiskInsuranceCof_HLJ * lossNumberCof_HLJ * 
				sumQuantityCof_HLJ * sspecialVehicleCof_HLJ * customerChannelCof_HLJ;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 上海_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 新客户优质车辆 * 被保险人年龄系数 * 被保险人性别系数 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_SH(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_SH = 1.0;
		double threeLimitCof_SH = 1.0;
		double fullRiskInsuranceCof_SH = 1.0;
		double lossNumberCof_SH = 1.0;
		double sumQuantityCof_SH = 1.0;
		double sspecialVehicleCof_SH = 1.0;
		double newInsuredCarCof_SH = 1.0;
		double insuredAgeCof_SH = 1.0;
		double insuredSexCof_SH = 1.0;
		double customerChannelCof_SH = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_SH = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_SH = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_SH = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_SH = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_SH = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_SH = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_SH = this.newInsuredCarCof;
		}
		if(this.insuredAgeCof!=null && !"".equals(this.insuredAgeCof)){
			insuredAgeCof_SH = this.insuredAgeCof;
		}
		if(this.insuredSexCof!=null && !"".equals(this.insuredSexCof)){
			insuredSexCof_SH = this.insuredSexCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_SH = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_SH * threeLimitCof_SH * fullRiskInsuranceCof_SH * lossNumberCof_SH * 
				sumQuantityCof_SH * sspecialVehicleCof_SH * newInsuredCarCof_SH * insuredAgeCof_SH * 
				insuredSexCof_SH * customerChannelCof_SH;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 广东_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 新客户优质车辆 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_GD(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_GD = 1.0;
		double threeLimitCof_GD = 1.0;
		double fullRiskInsuranceCof_GD = 1.0;
		double lossNumberCof_GD = 1.0;
		double sumQuantityCof_GD = 1.0;
		double sspecialVehicleCof_GD = 1.0;
		double newInsuredCarCof_GD = 1.0;
		double customerChannelCof_GD = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_GD = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_GD = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_GD = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_GD = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_GD = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_GD = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_GD = this.newInsuredCarCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_GD = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_GD * threeLimitCof_GD * fullRiskInsuranceCof_GD * lossNumberCof_GD * 
				sumQuantityCof_GD * sspecialVehicleCof_GD * newInsuredCarCof_GD * customerChannelCof_GD;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 四川_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 新客户优质车辆 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_SC(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_SC = 1.0;
		double threeLimitCof_SC = 1.0;
		double fullRiskInsuranceCof_SC = 1.0;
		double lossNumberCof_SC = 1.0;
		double sumQuantityCof_SC = 1.0;
		double sspecialVehicleCof_SC = 1.0;
		double newInsuredCarCof_SC = 1.0;
		double customerChannelCof_SC = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_SC = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_SC = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_SC = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_SC = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_SC = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_SC = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_SC = this.newInsuredCarCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_SC = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_SC * threeLimitCof_SC * fullRiskInsuranceCof_SC * lossNumberCof_SC * 
				sumQuantityCof_SC * sspecialVehicleCof_SC * newInsuredCarCof_SC * customerChannelCof_SC;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 辽宁_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 新客户优质车辆 * 被保险人年龄系数 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_LN(){
		double coefficientCount = 0d;
		
		double loyaltyCof_LN = 1.0;
		double threeLimitCof_LN = 1.0;
		double fullRiskInsuranceCof_LN = 1.0;
		double lossNumberCof_LN = 1.0;
		double sumQuantityCof_LN = 1.0;
		double sspecialVehicleCof_LN = 1.0;
		double newInsuredCarCof_LN = 1.0;
		double insuredAgeCof_LN = 1.0;
		double customerChannelCof_LN = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_LN = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_LN = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_LN = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_LN = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_LN = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_LN = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_LN = this.newInsuredCarCof;
		}
		if(this.insuredAgeCof!=null && !"".equals(this.insuredAgeCof)){
			insuredAgeCof_LN = this.insuredAgeCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_LN = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_LN * threeLimitCof_LN * fullRiskInsuranceCof_LN * lossNumberCof_LN * 
				sumQuantityCof_LN * sspecialVehicleCof_LN * newInsuredCarCof_LN * insuredAgeCof_LN * 
				customerChannelCof_LN;
		
		return coefficientCount;
	}
	
	/**
	 * 自主核保系数计算
	 * 陕西_自主核保系数计算 = 忠诚度系数 * 高三者限额 * 全主险保障 * 多次出险 * 团车（承保数量）系数 * 特殊车辆系数 * 新客户优质车辆 * 股东关系业务
	 * @return
	 */
	public double computeCoefficientZHHB_SX(){
		double coefficientCount = 0d;
		
		
		double loyaltyCof_SX = 1.0;
		double threeLimitCof_SX = 1.0;
		double fullRiskInsuranceCof_SX = 1.0;
		double lossNumberCof_SX = 1.0;
		double sumQuantityCof_SX = 1.0;
		double sspecialVehicleCof_SX = 1.0;
		double newInsuredCarCof_SX = 1.0;
		double customerChannelCof_SX = 1.0;
		
		if(this.loyaltyCof!=null && !"".equals(this.loyaltyCof)){
			loyaltyCof_SX = this.loyaltyCof;
		}
		if(this.threeLimitCof!=null && !"".equals(this.threeLimitCof)){
			threeLimitCof_SX = this.threeLimitCof;
		}
		if(this.fullRiskInsuranceCof!=null && !"".equals(this.fullRiskInsuranceCof)){
			fullRiskInsuranceCof_SX = this.fullRiskInsuranceCof;
		}
		if(this.lossNumberCof!=null && !"".equals(this.lossNumberCof)){
			lossNumberCof_SX = this.lossNumberCof;
		}
		if(this.sumQuantityCof!=null && !"".equals(this.sumQuantityCof)){
			sumQuantityCof_SX = this.sumQuantityCof;
		}
		if(this.sspecialVehicleCof!=null && !"".equals(this.sspecialVehicleCof)){
			sspecialVehicleCof_SX = this.sspecialVehicleCof;
		}
		if(this.newInsuredCarCof!=null && !"".equals(this.newInsuredCarCof)){
			newInsuredCarCof_SX = this.newInsuredCarCof;
		}
		if(this.customerChannelCof!=null && !"".equals(this.customerChannelCof)){
			customerChannelCof_SX = this.customerChannelCof;
		}
		
		coefficientCount = loyaltyCof_SX * threeLimitCof_SX * fullRiskInsuranceCof_SX * lossNumberCof_SX * 
				sumQuantityCof_SX * sspecialVehicleCof_SX * newInsuredCarCof_SX * customerChannelCof_SX;
		
		return coefficientCount;
	}
	
	
	/**
	 * 对计算结果四舍五入并保留digit位小数
	 * @param resultValue
	 * @param digit
	 * @return
	 */
	public double Rounding(double resultValue,int digit){
		double coefficientCount = 0d;
//		BigDecimal big = new BigDecimal(12.555);//会失真           四舍五入2为后12.55
//		BigDecimal big = new BigDecimal("12.555");//不会失真           四舍五入2为后12.56
		
		BigDecimal bd = new BigDecimal(""+resultValue);
		BigDecimal  bd2 = bd.setScale(digit,BigDecimal.ROUND_HALF_UP);
		coefficientCount = Double.parseDouble(bd2.toString());
		
		
		return coefficientCount;
	}
	
	/**
	 * String 类型转换为  Double
	 * 对计算结果四舍五入并保留digit位小数
	 * @param resultValue
	 * @param digit
	 * @return
	 */
	public double StringToDoubleRounding(String resultValue,int digit){
		double coefficientCount = 0d;
		
		BigDecimal bd = new BigDecimal(resultValue);
		BigDecimal  bd2 = bd.setScale(digit,BigDecimal.ROUND_HALF_UP);
		coefficientCount = Double.parseDouble(bd2.toString());
		
		
		return coefficientCount;
	}
	
	
	/**
	 * 组装费用列表
	 * @param riskCode
	 * @param classCode
	 * @param feeTypeCode
	 * @param feeRate
	 * @return
	 */
	public List<RateXom> feeRateList(List<RateXom> list,String riskCode,String classCode,String feeTypeCode,String feeTypeName,Double feeRate){
		if(list==null){
			list = new ArrayList<RateXom>();
		}else{
			boolean flag = true;
			for(int i=0;i<list.size();i++){
				if(riskCode.equals(list.get(i).getRiskCode()) 
					&& feeTypeCode.equals(list.get(i).getFeeTypeCode())
						&&feeRate==list.get(i).getFeeRate()){
					flag = false;
				}
			}
			if(flag){
				RateXom rateXom = new RateXom();
				rateXom.setRiskCode(riskCode);
				rateXom.setClassCode(classCode);
				rateXom.setFeeTypeCode(feeTypeCode);
				rateXom.setFeeTypeName(feeTypeName);
				rateXom.setFeeRate(feeRate);
				list.add(rateXom);
			}
		}
		return list;
	}
	
	/**
	 * 联动后手续费不能超过自律手续费
	 * @return
	 */
	public Double difDisRate(){
		Double disRate = null;
		if("是".equals(this.isFeeDiscount) && this.businessDisRate>this.upBusinessDisRate){
			disRate = this.upBusinessDisRate;
		}else{
			disRate = this.businessDisRate;
		}
		return disRate;
	}
	
	
	
}
