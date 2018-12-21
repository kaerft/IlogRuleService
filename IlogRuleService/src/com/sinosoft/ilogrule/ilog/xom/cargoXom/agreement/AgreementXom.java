package com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement;

import java.io.Serializable;
import java.util.List;



public class AgreementXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainXom mainXom;
	
	private ApplicantXom applicantXom;
	
	private List<InsuredXom> insuredXomList;
	
	private List<ItemKindXom> itemKindXomList;
	
	private GoodsXom goodsXom;

	private EngageXom engageXom;
	

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

	public List<InsuredXom> getInsuredXomList() {
		return insuredXomList;
	}

	public void setInsuredXomList(List<InsuredXom> insuredXomList) {
		this.insuredXomList = insuredXomList;
	}

	public List<ItemKindXom> getItemKindXomList() {
		return itemKindXomList;
	}

	public void setItemKindXomList(List<ItemKindXom> itemKindXomList) {
		this.itemKindXomList = itemKindXomList;
	}

	public GoodsXom getGoodsXom() {
		return goodsXom;
	}

	public void setGoodsXom(GoodsXom goodsXom) {
		this.goodsXom = goodsXom;
	}

	public EngageXom getEngageXom() {
		return engageXom;
	}

	public void setEngageXom(EngageXom engageXom) {
		this.engageXom = engageXom;
	}

}
