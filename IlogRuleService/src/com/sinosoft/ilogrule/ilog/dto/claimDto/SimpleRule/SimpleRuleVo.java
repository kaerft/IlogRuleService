package com.sinosoft.ilogrule.ilog.dto.claimDto.SimpleRule;

import java.io.Serializable;
import java.math.BigDecimal;

public class SimpleRuleVo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/************************** 入参 **************************/
	private String	aBusinessRisk;	//个/商险
	private String	className;	//险类名称
	private String	riskName;	//险种名称

	/**险类代码**/
	private String classCode;
	/**险种代码 */
	private String riskCode;
	/**机构编码*/
	private String comCode;
	/**机构名称*/
	private String comName;
	/**赔付金额*/
	private BigDecimal sumClaim;
	/**险别代码 */
	private String kindCode;
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
	public String getComCode() {
		return comCode;
	}
	public void setComCode(String comCode) {
		this.comCode = comCode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public BigDecimal getSumClaim() {
		return sumClaim;
	}
	public void setSumClaim(BigDecimal sumClaim) {
		this.sumClaim = sumClaim;
	}
	public String getKindCode() {
		return kindCode;
	}
	public void setKindCode(String kindCode) {
		this.kindCode = kindCode;
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
