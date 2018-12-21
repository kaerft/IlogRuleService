package com.sinosoft.ilogrule.ilog.xom.prpallXom;


public class ApplicantXom{
	
	/***
	 * 客户渠道代码
	 */
	private String customerChannel_Code;
	/***
	 * 客户渠道名称
	 */
	
	private String customerChannel;
	/***
	 * 投保人代码
	 */
	private String appliCode;
	/***
	 * 投保人名称
	 */
	private String appliName;

	/***
	 * 投保人类型代码（自然人/法人）
	 */
	private String insuredNature_Code;

	/***
	 * 投保人类型名称（自然人/法人）
	 */
	private String insuredNature;
	/***
	 * 投保人客户行业代码
	 */
	private String appliTrade_Code;
	/***
	 * 投保人客户行业名称
	 */
	private String appliTrade;

	/***
	 * 证件类型代码
	 */
	private String identifyType_code;

	/***
	 * 证件类型名称
	 */
	private String identifyNumber;

	/***
	 * 证件号码
	 */
	private String identifyType;
	/***
	 * 年龄
	 */
	private int age;
	
	/***
	 * 客户地址
	 */
	private String appliAddress;
	
	/***
	 * 职业名称
	 */
	private String occupationName;
	
	/***
	 * 婚否(1 未婚 2 已婚)
	 */
	
	private String marriage;
	/***
	 * 资信等级
	 */
	
	private String creditLevel;
	/***
	 * 是被保险人的
	 */
	
	private String insuredIdentity;
	/***
	 * 个人学历代码
	 */
	
	private String educationCode;
	/***
	 * 性别代码
	 */
	
	private String sex_Code;
	/***
	 * 性别名称
	 */
	
	private String sex;
	/***
	 * VIP标志
	 */
	
	private String vipFlag;
	/***
	 * 联系人姓名
	 */
	
	private String linkerName;
	/***
	 * 联系人地址
	 */
	
	private String linkerAddress;
	/***
	 * 联系人邮编
	 */
	
	private String linkerPostCode;
	/***
	 * 联系人电话
	 */
	
	private String linkerPhoneNumber;
	/***
	 * 联系人手机号
	 */
	
	private String linkerMobile;
	/***
	 * 属性A（预留）
	 */
	private String attributeA;
	/***
	 * 属性B（预留）
	 */
	
	private String attributeB;
	/***
	 * 属性C（预留）
	 */
	private String attributeC;
	/***
	 * 属性D（预留）
	 */
	private String attributeD;
	/***
	 * 属性E（预留）
	 */
	private String attributeE;
	/***
	 * 属性F（预留）
	 */
	private String attributeF;
	/***
	 * 是否黑名单客户
	 */
	private String isBlacklist;
	
	
	
	public String getCustomerChannel_Code() {
		return customerChannel_Code;
	}

	public void setCustomerChannel_Code(String customerChannel_Code) {
		this.customerChannel_Code = customerChannel_Code;
	}

	public String getCustomerChannel() {
		return customerChannel;
	}

	public void setCustomerChannel(String customerChannel) {
		this.customerChannel = customerChannel;
	}

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

	public String getInsuredNature() {
		return insuredNature;
	}

	public void setInsuredNature(String insuredNature) {
		this.insuredNature = insuredNature;
	}

	public String getAppliTrade() {
		return appliTrade;
	}

	public void setAppliTrade(String appliTrade) {
		this.appliTrade = appliTrade;
	}

	public String getIdentifyNumber() {
		return identifyNumber;
	}

	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAppliAddress() {
		return appliAddress;
	}

	public void setAppliAddress(String appliAddress) {
		this.appliAddress = appliAddress;
	}

	public String getOccupationName() {
		return occupationName;
	}

	public void setOccupationName(String occupationName) {
		this.occupationName = occupationName;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public String getInsuredIdentity() {
		return insuredIdentity;
	}

	public void setInsuredIdentity(String insuredIdentity) {
		this.insuredIdentity = insuredIdentity;
	}

	public String getEducationCode() {
		return educationCode;
	}

	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getVipFlag() {
		return vipFlag;
	}

	public void setVipFlag(String vipFlag) {
		this.vipFlag = vipFlag;
	}

	public String getLinkerName() {
		return linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	public String getLinkerAddress() {
		return linkerAddress;
	}

	public void setLinkerAddress(String linkerAddress) {
		this.linkerAddress = linkerAddress;
	}

	public String getLinkerPostCode() {
		return linkerPostCode;
	}

	public void setLinkerPostCode(String linkerPostCode) {
		this.linkerPostCode = linkerPostCode;
	}

	public String getLinkerPhoneNumber() {
		return linkerPhoneNumber;
	}

	public void setLinkerPhoneNumber(String linkerPhoneNumber) {
		this.linkerPhoneNumber = linkerPhoneNumber;
	}

	public String getLinkerMobile() {
		return linkerMobile;
	}

	public void setLinkerMobile(String linkerMobile) {
		this.linkerMobile = linkerMobile;
	}

	public String getAttributeA() {
		return attributeA;
	}

	public void setAttributeA(String attributeA) {
		this.attributeA = attributeA;
	}

	public String getAttributeB() {
		return attributeB;
	}

	public void setAttributeB(String attributeB) {
		this.attributeB = attributeB;
	}

	public String getAttributeC() {
		return attributeC;
	}

	public void setAttributeC(String attributeC) {
		this.attributeC = attributeC;
	}

	public String getAttributeD() {
		return attributeD;
	}

	public void setAttributeD(String attributeD) {
		this.attributeD = attributeD;
	}

	public String getAttributeE() {
		return attributeE;
	}

	public void setAttributeE(String attributeE) {
		this.attributeE = attributeE;
	}

	public String getAttributeF() {
		return attributeF;
	}

	public void setAttributeF(String attributeF) {
		this.attributeF = attributeF;
	}

	public String getIdentifyType() {
		return identifyType;
	}

	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}

	public String getIsBlacklist() {
		return isBlacklist;
	}

	public void setIsBlacklist(String isBlacklist) {
		this.isBlacklist = isBlacklist;
	}

	public String getInsuredNature_Code() {
		return insuredNature_Code;
	}

	public void setInsuredNature_Code(String insuredNature_Code) {
		this.insuredNature_Code = insuredNature_Code;
	}

	public String getAppliTrade_Code() {
		return appliTrade_Code;
	}

	public void setAppliTrade_Code(String appliTrade_Code) {
		this.appliTrade_Code = appliTrade_Code;
	}

	public String getIdentifyType_code() {
		return identifyType_code;
	}

	public void setIdentifyType_code(String identifyType_code) {
		this.identifyType_code = identifyType_code;
	}

	public String getSex_Code() {
		return sex_Code;
	}

	public void setSex_Code(String sex_Code) {
		this.sex_Code = sex_Code;
	}
	
}
