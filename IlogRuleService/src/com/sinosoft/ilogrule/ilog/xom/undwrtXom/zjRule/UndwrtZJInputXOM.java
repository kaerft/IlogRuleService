package com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule;

import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.util.UtilXom;

public class UndwrtZJInputXOM{
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
	 * 质检信息
	 */
	private ZJDetailXom zjDetailXom;
	
	/***
	 * 核保反馈信息
	 */
	private UndwrtZJResultXOM undwrtZJResultXOM;
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
	public UndwrtZJResultXOM getUndwrtZJResultXOM() {
		return undwrtZJResultXOM;
	}
	public void setUndwrtZJResultXOM(UndwrtZJResultXOM undwrtZJResultXOM) {
		this.undwrtZJResultXOM = undwrtZJResultXOM;
	}
	public UtilXom getUtilXom() {
		return utilXom;
	}
	public void setUtilXom(UtilXom utilXom) {
		this.utilXom = utilXom;
	}
	public ZJDetailXom getZjDetailXom() {
		return zjDetailXom;
	}
	public void setZjDetailXom(ZJDetailXom zjDetailXom) {
		this.zjDetailXom = zjDetailXom;
	}
	
}
