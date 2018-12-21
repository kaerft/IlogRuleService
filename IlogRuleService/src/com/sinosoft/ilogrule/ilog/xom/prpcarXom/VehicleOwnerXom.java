package com.sinosoft.ilogrule.ilog.xom.prpcarXom;

import java.io.Serializable;

public class VehicleOwnerXom implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String ownerName;
	
	private String ownerType;
	
	private String ownerIdentifyNumber;
	
	private String ownerSex;
	
	private String ownerType_Code;
	
	private String ownerSex_Code;

	

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

	public String getOwnerType_Code() {
		return ownerType_Code;
	}

	public void setOwnerType_Code(String ownerType_Code) {
		this.ownerType_Code = ownerType_Code;
	}

	public String getOwnerSex_Code() {
		return ownerSex_Code;
	}

	public void setOwnerSex_Code(String ownerSex_Code) {
		this.ownerSex_Code = ownerSex_Code;
	}
	
}
