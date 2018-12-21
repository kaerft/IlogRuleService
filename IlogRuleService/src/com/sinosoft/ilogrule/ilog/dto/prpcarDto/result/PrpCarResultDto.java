package com.sinosoft.ilogrule.ilog.dto.prpcarDto.result;

import java.io.Serializable;
import java.util.List;

public class PrpCarResultDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	private MainDto mainDto;
	private NCDCoefficientDto ncdCoefficientDto;  //精算定价系数
	private SelfCoefficientDto selfCoefficientDto;  //核保定价系数
	private List<RateDto> rateDtoList;  //费用列表
	
	
	public MainDto getMainDto() {
		return mainDto;
	}
	public void setMainDto(MainDto mainDto) {
		this.mainDto = mainDto;
	}

	public NCDCoefficientDto getNcdCoefficientDto() {
		return ncdCoefficientDto;
	}
	public void setNcdCoefficientDto(NCDCoefficientDto ncdCoefficientDto) {
		this.ncdCoefficientDto = ncdCoefficientDto;
	}
	public SelfCoefficientDto getSelfCoefficientDto() {
		return selfCoefficientDto;
	}
	public void setSelfCoefficientDto(SelfCoefficientDto selfCoefficientDto) {
		this.selfCoefficientDto = selfCoefficientDto;
	}
	public List<RateDto> getRateDtoList() {
		return rateDtoList;
	}
	public void setRateDtoList(List<RateDto> rateDtoList) {
		this.rateDtoList = rateDtoList;
	}


}
