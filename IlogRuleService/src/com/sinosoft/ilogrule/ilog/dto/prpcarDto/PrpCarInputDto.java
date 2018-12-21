package com.sinosoft.ilogrule.ilog.dto.prpcarDto;

import java.io.Serializable;
import java.util.List;


public class PrpCarInputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MainDto mainDto;
	
	private ApplicantDto applicantDto;
	
	private InsuredDto insuredDto;
	
	private VehicleDto vehicleDto;
	
	private VehicleOwnerDto vehicleOwnerDto;
	
	private List<ItemKindDto> itemKindDtoList;
	
	private OtherDto otherDto;
	
	

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

	public VehicleDto getVehicleDto() {
		return vehicleDto;
	}

	public void setVehicleDto(VehicleDto vehicleDto) {
		this.vehicleDto = vehicleDto;
	}

	public VehicleOwnerDto getVehicleOwnerDto() {
		return vehicleOwnerDto;
	}

	public void setVehicleOwnerDto(VehicleOwnerDto vehicleOwnerDto) {
		this.vehicleOwnerDto = vehicleOwnerDto;
	}

	public List<ItemKindDto> getItemKindDtoList() {
		return itemKindDtoList;
	}

	public void setItemKindDtoList(List<ItemKindDto> itemKindDtoList) {
		this.itemKindDtoList = itemKindDtoList;
	}

	public OtherDto getOtherDto() {
		return otherDto;
	}

	public void setOtherDto(OtherDto otherDto) {
		this.otherDto = otherDto;
	}
	

}
