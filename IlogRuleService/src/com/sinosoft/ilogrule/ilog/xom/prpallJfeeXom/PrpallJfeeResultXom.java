package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom;

import java.io.Serializable;
import java.math.BigDecimal;

public class PrpallJfeeResultXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String jfeeFlag; //	见费出单标志
	
	private String description; //	描述信息	
	
	private String path; //	规则库名称	
	
	private String ruleName; //	规则名称	
	
	private String promptFlag;  //见费提示标志
	
	private String status;  //是否校验

	
	public String getJfeeFlag() {
		return jfeeFlag;
	}

	public void setJfeeFlag(String jfeeFlag) {
		this.jfeeFlag = jfeeFlag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getPromptFlag() {
		return promptFlag;
	}

	public void setPromptFlag(String promptFlag) {
		this.promptFlag = promptFlag;
	}

	
	
	
	
	
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * 对计算结果四舍五入并保留digit位小数
	 * @param resultValue
	 * @param digit
	 * @return
	 */
	public double Rounding(double resultValue,int digit){
		double coefficientCount = 0d;
		
		BigDecimal bd = new BigDecimal(resultValue);
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
	
}
