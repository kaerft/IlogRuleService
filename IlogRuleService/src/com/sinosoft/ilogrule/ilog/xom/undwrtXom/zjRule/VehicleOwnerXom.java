package com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule;

public class VehicleOwnerXom{
	/***
	 * 车主名称
	 */
	private String ownerName;
	/***
	 * 车主类型代码
	 */
	private String ownerType_Code;
	/***
	 * 车主类型名称
	 */
	private String ownerType;
	/***
	 * 车主证件号
	 */
	private String ownerIdentifyNumber;
	/***
	 * 性别代码
	 */
	private String ownerSex_Code;
	/***
	 * 性别名称
	 */
	private String ownerSex;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
	}

	public String getOwnerIdentifyNumber() {
		return ownerIdentifyNumber;
	}

	public void setOwnerIdentifyNumber(String ownerIdentifyNumber) {
		this.ownerIdentifyNumber = ownerIdentifyNumber;
	}

	public String getOwnerSex() {
		return ownerSex;
	}

	public void setOwnerSex(String ownerSex) {
		this.ownerSex = ownerSex;
	}

	public void setOwnerType_Code(String ownerType_Code) {
		this.ownerType_Code = ownerType_Code;
	}

	public void setOwnerSex_Code(String ownerSex_Code) {
		this.ownerSex_Code = ownerSex_Code;
	}

	public String getOwnerType_Code() {
		return ownerType_Code;
	}

	public String getOwnerSex_Code() {
		return ownerSex_Code;
	}
	
}
