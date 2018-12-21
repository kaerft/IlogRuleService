package com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule;

import java.util.List;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.util.UtilXom;

public class UndwrtNoCarInputXOM{
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
	private UndwrtNoCarResultXOM undwrtNoCarResultXOM;
	/***
	 * 工具类
	 */
	private UtilXom utilXom;
	
	/***
	 * 险种
	 */
	private List<CargoDetailXom> cargoDetailXomList;
	
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

	public UndwrtNoCarResultXOM getUndwrtNoCarResultXOM() {
		return undwrtNoCarResultXOM;
	}

	public void setUndwrtNoCarResultXOM(UndwrtNoCarResultXOM undwrtNoCarResultXOM) {
		this.undwrtNoCarResultXOM = undwrtNoCarResultXOM;
	}

	public UtilXom getUtilXom() {
		return utilXom;
	}

	public void setUtilXom(UtilXom utilXom) {
		this.utilXom = utilXom;
	}

	public List<CargoDetailXom> getCargoDetailXomList() {
		return cargoDetailXomList;
	}

	public void setCargoDetailXomList(List<CargoDetailXom> cargoDetailXomList) {
		this.cargoDetailXomList = cargoDetailXomList;
	}
	
}
