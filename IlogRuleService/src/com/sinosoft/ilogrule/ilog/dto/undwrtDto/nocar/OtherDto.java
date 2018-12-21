package com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar;

import java.io.Serializable;

public class OtherDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/***
	 * 是否协议录入
	 */
	private String isAgreementPolicy;
	
	/***
	 * 协议录单保单类型代码
	 */
	private String agreePolicyType_Code;
	
	/***
	 * 协议录单保单类型名称
	 */
	private String agreePolicyType;
	
	/***
	 * 核保级别
	 */
	private String undwrtGrade;
	
	/***
	 * 业务操作
	 */
	private String businessOperation;
	
	/***
	 * 核保人代码
	 */
	private String undwrtPeopleCode;
	
	/***
	 * 核保人名称
	 */
	private String undwrtPeopleName;
	
	/***
	 * 核保人操作机构
	 */
	private String undwrtUseComCode;

	public String getIsAgreementPolicy() {
		return isAgreementPolicy;
	}

	public void setIsAgreementPolicy(String isAgreementPolicy) {
		this.isAgreementPolicy = isAgreementPolicy;
	}

	public String getAgreePolicyType_Code() {
		return agreePolicyType_Code;
	}

	public void setAgreePolicyType_Code(String agreePolicyType_Code) {
		this.agreePolicyType_Code = agreePolicyType_Code;
	}

	public String getAgreePolicyType() {
		return agreePolicyType;
	}

	public void setAgreePolicyType(String agreePolicyType) {
		this.agreePolicyType = agreePolicyType;
	}

	public String getUndwrtGrade() {
		return undwrtGrade;
	}

	public void setUndwrtGrade(String undwrtGrade) {
		this.undwrtGrade = undwrtGrade;
	}

	public String getBusinessOperation() {
		return businessOperation;
	}

	public void setBusinessOperation(String businessOperation) {
		this.businessOperation = businessOperation;
	}

	public String getUndwrtPeopleCode() {
		return undwrtPeopleCode;
	}

	public void setUndwrtPeopleCode(String undwrtPeopleCode) {
		this.undwrtPeopleCode = undwrtPeopleCode;
	}

	public String getUndwrtPeopleName() {
		return undwrtPeopleName;
	}

	public void setUndwrtPeopleName(String undwrtPeopleName) {
		this.undwrtPeopleName = undwrtPeopleName;
	}

	public String getUndwrtUseComCode() {
		return undwrtUseComCode;
	}

	public void setUndwrtUseComCode(String undwrtUseComCode) {
		this.undwrtUseComCode = undwrtUseComCode;
	}
	
}
