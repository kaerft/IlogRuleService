package com.sinosoft.ilogrule.ilog.xom.claimXom.RegistRule;

import java.math.BigDecimal;

public class RegistRuleXom{
	
	/************************** 入参 **************************/
	private String registName;//报案节点名称（RegistType）
	private String	aBusinessRisk;	//个/商险
	private String	riskName;	//险种名称

	/**险种代码 */
	private String riskCode;
	/**机构代码 */
	private String comCode;
	/**机构名称 */
	private String comName;
	/**报损金额**/
	private BigDecimal reprtedLoss;

	/************************** 返参 **************************/
	/** 规则校验标志 */
	private String pass;
	/** 提示信息 */
	private String message;
	public String getRegistName() {
		return registName;
	}
	public void setRegistName(String registName) {
		this.registName = registName;
	}
	public String getaBusinessRisk() {
		return aBusinessRisk;
	}
	public void setaBusinessRisk(String aBusinessRisk) {
		this.aBusinessRisk = aBusinessRisk;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
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
	public BigDecimal getReprtedLoss() {
		return reprtedLoss;
	}
	public void setReprtedLoss(BigDecimal reprtedLoss) {
		this.reprtedLoss = reprtedLoss;
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
