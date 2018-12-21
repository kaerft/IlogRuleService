package com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead;

import java.io.Serializable;
import java.util.List;


public class CargoPheadXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainXom mainXom;
	
	private ApplicantXom applicantXom;
	
	private InsuredXom insuredXom;
	
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
