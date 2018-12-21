package com.sinosoft.ilogrule.ilog.dto.prpcarDto.result;

import java.io.Serializable;

public class RateDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String riskCode;
	
	private String classCode;
	
	private String feeTypeCode;//	费用类型代码
	
	private String feeTypeName;//	费用类型名称
	
	private String feeRate;//费用比例
	


	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
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

	public String getFeeRate() {
		return feeRate;
	}

	public void setFeeRate(String feeRate) {
		this.feeRate = feeRate;
	}
	
	
	
}
