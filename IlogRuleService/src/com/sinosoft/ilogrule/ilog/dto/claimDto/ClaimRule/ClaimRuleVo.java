package com.sinosoft.ilogrule.ilog.dto.claimDto.ClaimRule;

import java.io.Serializable;
import java.math.BigDecimal;

public class ClaimRuleVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/************************** 入参 **************************/
	private String 	aBusinessRisk;	//个/商险
	private String 	className;	//险类名称
	private String 	riskName;	//险种名称

	/** 立案距出险天数 */
	private int claimToDamageDate;
	/** 立案距报案天数 */
	private int claimToRegistDate;
	/**总估计赔款,用于判断超额立案*/
	private BigDecimal sumClaim;
	/**估损次数*/
	private int adjustTimes;
	/**估损调整的绝对值（本次调整和上次调整的对比）*/
	private BigDecimal differenceMoney;
	/**险类**/
	private String classCode;
	/**险种代码 */
	private String riskCode;
	/**险别代码 */
	private String kindCode;
	/**强制立案的天数**/
	private int claimForceDays;
	/**规则判断标志：0：估损调整；1：超额立案；2：强制立案（RegistType）*/
	private String claimType;
	/************************** 返参 **************************/
	/** 规则校验标志 */
	private String pass;
	/** 提示信息 */
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
	public int getClaimToDamageDate() {
		return claimToDamageDate;
	}
	public void setClaimToDamageDate(int claimToDamageDate) {
		this.claimToDamageDate = claimToDamageDate;
	}
	public int getClaimToRegistDate() {
		return claimToRegistDate;
	}
	public void setClaimToRegistDate(int claimToRegistDate) {
		this.claimToRegistDate = claimToRegistDate;
	}
	public BigDecimal getSumClaim() {
		return sumClaim;
	}
	public void setSumClaim(BigDecimal sumClaim) {
		this.sumClaim = sumClaim;
	}
	public int getAdjustTimes() {
		return adjustTimes;
	}
	public void setAdjustTimes(int adjustTimes) {
		this.adjustTimes = adjustTimes;
	}
	public BigDecimal getDifferenceMoney() {
		return differenceMoney;
	}
	public void setDifferenceMoney(BigDecimal differenceMoney) {
		this.differenceMoney = differenceMoney;
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
	public int getClaimForceDays() {
		return claimForceDays;
	}
	public void setClaimForceDays(int claimForceDays) {
		this.claimForceDays = claimForceDays;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
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
