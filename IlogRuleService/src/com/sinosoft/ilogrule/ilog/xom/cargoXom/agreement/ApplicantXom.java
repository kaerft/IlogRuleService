package com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement;

import java.io.Serializable;

public class ApplicantXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String appliCode;  //	投保人代码
	private String appliName;  //		投保人名称
	private String insuredNature_Code;  //		投保人类型代码
	private String insuredNature;  //		投保人类型名称（个人/法人）
	private String identifyType_code;  //		证件类型代码
	private String identifyType;  //		证件类型名称
	private String identifyNumber;  //		证件号码
	private Integer age;  //		年龄
	private String insuredIdentity;  //		是被保险人的
	private String sex_Code	;  //	性别代码
	private String sex;  //		性别名称
	private String appliAddress;  //		联系地址
	private String appliPostCode;  //		联系邮编
	private String appliPhoneNumber;  //		联系电话
	private String appliMobile;  //		联系手机号
	
	
	public String getAppliCode() {
		return appliCode;
	}
	public void setAppliCode(String appliCode) {
		this.appliCode = appliCode;
	}
	public String getAppliName() {
		return appliName;
	}
	public void setAppliName(String appliName) {
		this.appliName = appliName;
	}
	public String getInsuredNature_Code() {
		return insuredNature_Code;
	}
	public void setInsuredNature_Code(String insuredNature_Code) {
		this.insuredNature_Code = insuredNature_Code;
	}
	public String getInsuredNature() {
		return insuredNature;
	}
	public void setInsuredNature(String insuredNature) {
		this.insuredNature = insuredNature;
	}
	public String getIdentifyType_code() {
		return identifyType_code;
	}
	public void setIdentifyType_code(String identifyType_code) {
		this.identifyType_code = identifyType_code;
	}
	public String getIdentifyType() {
		return identifyType;
	}
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getInsuredIdentity() {
		return insuredIdentity;
	}
	public void setInsuredIdentity(String insuredIdentity) {
		this.insuredIdentity = insuredIdentity;
	}
	public String getSex_Code() {
		return sex_Code;
	}
	public void setSex_Code(String sex_Code) {
		this.sex_Code = sex_Code;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAppliAddress() {
		return appliAddress;
	}
	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}
	public String getAppliPostCode() {
		return appliPostCode;
	}
	public void setAppliPostCode(String appliPostCode) {
		this.appliPostCode = appliPostCode;
	}
	public String getAppliPhoneNumber() {
		return appliPhoneNumber;
	}
	public void setAppliPhoneNumber(String appliPhoneNumber) {
		this.appliPhoneNumber = appliPhoneNumber;
	}
	public String getAppliMobile() {
		return appliMobile;
	}
	public void setAppliMobile(String appliMobile) {
		this.appliMobile = appliMobile;
	}

}
