package com.sinosoft.ilogrule.ilog.xom.claimXom.UndwrtFactorRule;

import java.math.BigDecimal;

public class UndwrtFactorRuleXom{

	/************************** 入参 **************************/
	private String	aBusinessRisk;	//个/商险
	private String	className;	//险类名称
	private String	riskName;	//险种名称

	/**核赔类型*/
	private String undwrtType;
	/**业务分类 */
	private String businessKind;
	/**机构编码*/
	private String comcode;
	/**机构名称*/
	private String comName;
	/**险类*/
	private String classCode;
	/**险种*/
	private String riskCode;
	/**险别*/
	private String kindCode;
	/**费用类型编码*/
	private String chargeCode;
	/**费用类型名称*/
	private String chargeName;
	/**是否应收*/
	private String receivableFlag;
	/**是否通融*/
	private String accommodateFlag;
	/**是否临分*/
	private String facultativeFlag;
	/**是否拒赔*/
	private String rejectClaimFlag;
	/**是否重开*/
	private String reClaimFlag;
	/**共保标志*/
	private String coinsuranceFlag;
	/**零结案（按标志提交审核）：赔款金额*/
	private String ZeroFlag;
	/**预赔金额*/
	private BigDecimal prePayAmt;
	/**预赔费用金额（预留）*/
	private BigDecimal prePayFee;
	/**赔款金额*/
	private BigDecimal payAmt;
	/**费用金额*/
	private BigDecimal payFee;
	/**立案金额*/
	private BigDecimal claimAmt;
//	/**核赔等级*/
//	private String undwrtLevel;
	private String undwrtLevelName;//核赔级别名称（UndwrtBpmNode）
	private String undwrtLevelCode;//核赔级别编码（UndwrtBpmNode）
	/************************** 返参 **************************/
	/**规则校验标志	pass*/
	private String pass;
	/**提示消息*/
	private String message;
	public String getaBusinessRisk() {
		return aBusinessRisk;
	}
	public void setaBusinessRisk(String aBusinessRisk) {
		this.aBusinessRisk = aBusinessRisk;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getUndwrtType() {
		return undwrtType;
	}
	public void setUndwrtType(String undwrtType) {
		this.undwrtType = undwrtType;
	}
	public String getBusinessKind() {
		return businessKind;
	}
	public void setBusinessKind(String businessKind) {
		this.businessKind = businessKind;
	}
	public String getComcode() {
		return comcode;
	}
	public void setComcode(String comcode) {
		this.comcode = comcode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getClassCode() {
		return classCode;
	}
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getKindCode() {
		return kindCode;
	}
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
	}
	public String getChargeCode() {
		return chargeCode;
	}
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	public String getChargeName() {
		return chargeName;
	}
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}
	public String getReceivableFlag() {
		return receivableFlag;
	}
	public void setReceivableFlag(String receivableFlag) {
		this.receivableFlag = receivableFlag;
	}
	public String getAccommodateFlag() {
		return accommodateFlag;
	}
	public void setAccommodateFlag(String accommodateFlag) {
		this.accommodateFlag = accommodateFlag;
	}
	public String getFacultativeFlag() {
		return facultativeFlag;
	}
	public void setFacultativeFlag(String facultativeFlag) {
		this.facultativeFlag = facultativeFlag;
	}
	public String getRejectClaimFlag() {
		return rejectClaimFlag;
	}
	public void setRejectClaimFlag(String rejectClaimFlag) {
		this.rejectClaimFlag = rejectClaimFlag;
	}
	public String getReClaimFlag() {
		return reClaimFlag;
	}
	public void setReClaimFlag(String reClaimFlag) {
		this.reClaimFlag = reClaimFlag;
	}
	public String getCoinsuranceFlag() {
		return coinsuranceFlag;
	}
	public void setCoinsuranceFlag(String coinsuranceFlag) {
		this.coinsuranceFlag = coinsuranceFlag;
	}
	public String getZeroFlag() {
		return ZeroFlag;
	}
	public void setZeroFlag(String zeroFlag) {
		ZeroFlag = zeroFlag;
	}
	public BigDecimal getPrePayAmt() {
		return prePayAmt;
	}
	public void setPrePayAmt(BigDecimal prePayAmt) {
		this.prePayAmt = prePayAmt;
	}
	public BigDecimal getPrePayFee() {
		return prePayFee;
	}
	public void setPrePayFee(BigDecimal prePayFee) {
		this.prePayFee = prePayFee;
	}
	public BigDecimal getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}
	public BigDecimal getPayFee() {
		return payFee;
	}
	public void setPayFee(BigDecimal payFee) {
		this.payFee = payFee;
	}
	public BigDecimal getClaimAmt() {
		return claimAmt;
	}
	public void setClaimAmt(BigDecimal claimAmt) {
		this.claimAmt = claimAmt;
	}
	public String getUndwrtLevelName() {
		return undwrtLevelName;
	}
	public void setUndwrtLevelName(String undwrtLevelName) {
		this.undwrtLevelName = undwrtLevelName;
	}
	public String getUndwrtLevelCode() {
		return undwrtLevelCode;
	}
	public void setUndwrtLevelCode(String undwrtLevelCode) {
		this.undwrtLevelCode = undwrtLevelCode;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
