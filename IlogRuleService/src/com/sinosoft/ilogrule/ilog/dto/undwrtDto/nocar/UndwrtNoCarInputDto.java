package com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar;

import java.io.Serializable;
import java.util.List;

public class UndwrtNoCarInputDto implements Serializable{
	
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
	 * 险种
	 */
	private List<ItemKindDto> itemKindDtoList;
	/***
	 * 其他信息
	 */
	private OtherDto otherDto;
	
	/***
	 * 货物信息
	 */
	private List<CargoDetailDto> cargoDetailDtoList;
	
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

	public List<CargoDetailDto> getCargoDetailDtoList() {
		return cargoDetailDtoList;
	}

	public void setCargoDetailDtoList(List<CargoDetailDto> cargoDetailDtoList) {
		this.cargoDetailDtoList = cargoDetailDtoList;
	}
	
}
