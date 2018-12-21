package com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class AgreementDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainDto mainDto;
	
	private ApplicantDto applicantDto;
	
	private List<InsuredDto> insuredDtoList;
	
	private List<ItemKindDto> itemKindDtoList;
	
	private GoodsDto goodsDto;

	private EngageDto engageDto;
	

	public MainDto getMainDto() {
		return mainDto;
	}

	public void setMainDto(MainDto mainDto) {
		this.mainDto = mainDto;
	}

	public ApplicantDto getApplicantDto() {
		return applicantDto;
	}

	public void setApplicantDto(ApplicantDto applicantDto) {
		this.applicantDto = applicantDto;
	}

	public List<InsuredDto> getInsuredDtoList() {
		return insuredDtoList;
	}

	public void setInsuredDtoList(List<InsuredDto> insuredDtoList) {
		this.insuredDtoList = insuredDtoList;
	}

	public List<ItemKindDto> getItemKindDtoList() {
		return itemKindDtoList;
	}

	public void setItemKindDtoList(List<ItemKindDto> itemKindDtoList) {
		this.itemKindDtoList = itemKindDtoList;
	}

	public GoodsDto getGoodsDto() {
		return goodsDto;
	}

	public void setGoodsDto(GoodsDto goodsDto) {
		this.goodsDto = goodsDto;
	}

	public EngageDto getEngageDto() {
		return engageDto;
	}

	public void setEngageDto(EngageDto engageDto) {
		this.engageDto = engageDto;
	}

}
