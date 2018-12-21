package com.sinosoft.ilogrule.ilog.xom.claimXom.AutoUndwrtRule;

import java.math.BigDecimal;

public class AutoUndwrtRuleXom{
	
	/************************** 入参 **************************/
	/** 核赔金额 */
	private BigDecimal undwrtAmount;
	/** 出险原因编码 */
	private String damageCode;
	/** 出险原因名称 */
	private String damageName;
	/** 报案距出险的天数，不满一天向上取整 */
	private int daysRegistFromDamage;
	/** 立案时间距报案时间的天数，不满一天向上取整 */
	private int daysClaimFromRegist;

	/************************** 返参 **************************/
	/** 规则校验标志	pass，通过Y，不通过N，默认Y */
	private String pass;
	/** 提示信息 */
	private String message;
	public BigDecimal getUndwrtAmount() {
		return undwrtAmount;
	}
	public void setUndwrtAmount(BigDecimal undwrtAmount) {
		this.undwrtAmount = undwrtAmount;
	}
	public String getDamageCode() {
		return damageCode;
	}
	public void setDamageCode(String damageCode) {
		this.damageCode = damageCode;
	}
	public String getDamageName() {
		return damageName;
	}
	public void setDamageName(String damageName) {
		this.damageName = damageName;
	}
	public int getDaysRegistFromDamage() {
		return daysRegistFromDamage;
	}
	public void setDaysRegistFromDamage(int daysRegistFromDamage) {
		this.daysRegistFromDamage = daysRegistFromDamage;
	}
	public int getDaysClaimFromRegist() {
		return daysClaimFromRegist;
	}
	public void setDaysClaimFromRegist(int daysClaimFromRegist) {
		this.daysClaimFromRegist = daysClaimFromRegist;
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
