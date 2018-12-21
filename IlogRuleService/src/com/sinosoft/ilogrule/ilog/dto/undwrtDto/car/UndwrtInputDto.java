package com.sinosoft.ilogrule.ilog.dto.undwrtDto.car;

import java.io.Serializable;
import java.util.List;

public class UndwrtInputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/***
	 * 基本信息
	 */
	private MainDto mainDto;
	/***
	 * 投保人
	 */
	private ApplicantDto applicantDto;
	/***
	 * 被保险人
	 */
	private InsuredDto insuredDto;
	/***
	 * 车辆信息
	 */
	private VehicleDto vehicleDto;
	/***
	 * 车主信息
	 */
	private VehicleOwnerDto vehicleOwnerDto;
	/***
	 * 险种
	 */
	private List<ItemKindDto> itemKindDtoList;
	/***
	 * 其他信息
	 */
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
