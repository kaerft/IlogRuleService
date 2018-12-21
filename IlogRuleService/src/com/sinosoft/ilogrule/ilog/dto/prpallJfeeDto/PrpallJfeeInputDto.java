package com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto;

import java.io.Serializable;
import java.util.List;



public class PrpallJfeeInputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainDto mainDto;
	
	private ApplicantDto applicantDto;
	
	private InsuredDto insuredDto;
	
	private List<PlanDto> planDtoList;
	
	private List<ItemKindDto> itemKindDtoList;

	
	
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

	public InsuredDto getInsuredDto() {
		return insuredDto;
	}

	public void setInsuredDto(InsuredDto insuredDto) {
		this.insuredDto = insuredDto;
	}

	public List<PlanDto> getPlanDtoList() {
		return planDtoList;
	}

	public void setPlanDtoList(List<PlanDto> planDtoList) {
		this.planDtoList = planDtoList;
	}

	public List<ItemKindDto> getItemKindDtoList() {
		return itemKindDtoList;
	}

	public void setItemKindDtoList(List<ItemKindDto> itemKindDtoList) {
		this.itemKindDtoList = itemKindDtoList;
	}

}
