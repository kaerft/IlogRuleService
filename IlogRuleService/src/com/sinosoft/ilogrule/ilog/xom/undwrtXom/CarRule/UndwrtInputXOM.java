package com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule;

import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.util.UtilXom;

public class UndwrtInputXOM{
	/***
	 * 基本信息
	 */
	private MainXom mainXom;
	/***
	 * 投保人信息
	 */
	private ApplicantXom applicantXom;
	/**
	 * 被保险人信息
	 */
	private InsuredXom insuredXom;
	/***
	 * 车辆信息
	 */
	private VehicleXom vehicleXom;
	/**
	 * 车主信息
	 */
	private VehicleOwnerXom vehicleOwnerXom;
	/***
	 * 险种
	 */
	private List<ItemKindXom> itemKindXomList;
	/***
	 * 其他信息
	 */
	private OtherXom otherXom;
	/***
	 * 核保反馈信息
	 */
	private UnderwriteResultXOM underwriteResultXOM;
	/***
	 * 工具类
	 */
	private UtilXom utilXom;
	
	public MainXom getMainXom() {
		return mainXom;
	}

	public void setMainXom(MainXom mainXom) {
		this.mainXom = mainXom;
	}

	public ApplicantXom getApplicantXom() {
		return applicantXom;
	}

	public void setApplicantXom(ApplicantXom applicantXom) {
		this.applicantXom = applicantXom;
	}

	public InsuredXom getInsuredXom() {
		return insuredXom;
	}

	public void setInsuredXom(InsuredXom insuredXom) {
		this.insuredXom = insuredXom;
	}

	public VehicleXom getVehicleXom() {
		return vehicleXom;
	}

	public void setVehicleXom(VehicleXom vehicleXom) {
		this.vehicleXom = vehicleXom;
	}

	public VehicleOwnerXom getVehicleOwnerXom() {
		return vehicleOwnerXom;
	}

	public void setVehicleOwnerXom(VehicleOwnerXom vehicleOwnerXom) {
		this.vehicleOwnerXom = vehicleOwnerXom;
	}

	public List<ItemKindXom> getItemKindXomList() {
		return itemKindXomList;
	}

	public void setItemKindXomList(List<ItemKindXom> itemKindXomList) {
		this.itemKindXomList = itemKindXomList;
	}

	public OtherXom getOtherXom() {
		return otherXom;
	}

	public void setOtherXom(OtherXom otherXom) {
		this.otherXom = otherXom;
	}

	public UnderwriteResultXOM getUnderwriteResultXOM() {
		return underwriteResultXOM;
	}

	public void setUnderwriteResultXOM(UnderwriteResultXOM underwriteResultXOM) {
		this.underwriteResultXOM = underwriteResultXOM;
	}

	public UtilXom getUtilXom() {
		return utilXom;
	}

	public void setUtilXom(UtilXom utilXom) {
		this.utilXom = utilXom;
	}
	
}
