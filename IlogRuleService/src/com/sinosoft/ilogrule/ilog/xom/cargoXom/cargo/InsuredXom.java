package com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo;

import java.io.Serializable;

public class InsuredXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String insuredCode;	 //	被保险人代码
	private String insuredName;	 //	被保险人名称
	private String insuredNature_Code;	 //	被保险人类型代码
	private String insuredNature;	 //	被保险人类型名称（个人/法人）
	private String identifyType_Code;	 //	证件类型代码
	private String identifyType;	 //	证件类型名称
	private String identifyNumber;	 //	证件号码
	private Integer age;	 //	年龄
	private String insuredIdentity;	 //	被保险人与投保人关系
	private String sex_Code;	 //	性别代码
	private String sex;	 //	性别名称
	private String insuredAddress;	 //	联系地址
	private String insuredPostCode;	 //	联系邮编
	private String insuredPhoneNumber;	 //	联系电话
	private String insuredMobile;	 //联系手机号
	
	
	
	public String getInsuredCode() {
		return insuredCode;
	}
	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
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
	public String getIdentifyType_Code() {
		return identifyType_Code;
	}
	public void setIdentifyType_Code(String identifyType_Code) {
		this.identifyType_Code = identifyType_Code;
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
	public String getInsuredAddress() {
		return insuredAddress;
	}
	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}
	public String getInsuredPostCode() {
		return insuredPostCode;
	}
	public void setInsuredPostCode(String insuredPostCode) {
		this.insuredPostCode = insuredPostCode;
	}
	public String getInsuredPhoneNumber() {
		return insuredPhoneNumber;
	}
	public void setInsuredPhoneNumber(String insuredPhoneNumber) {
		this.insuredPhoneNumber = insuredPhoneNumber;
	}
	public String getInsuredMobile() {
		return insuredMobile;
	}
	public void setInsuredMobile(String insuredMobile) {
		this.insuredMobile = insuredMobile;
	}

	
	
}
