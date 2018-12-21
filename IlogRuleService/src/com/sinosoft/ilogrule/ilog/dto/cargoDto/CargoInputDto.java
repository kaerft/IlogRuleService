package com.sinosoft.ilogrule.ilog.dto.cargoDto;

import java.io.Serializable;

import com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.AgreementDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.CargoDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.CargoPheadDto;



public class CargoInputDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private CargoDto cargoDto;
	
	private AgreementDto agreementDto;
	
	private CargoPheadDto cargoPheadDto;

	

	public CargoDto getCargoDto() {
		return cargoDto;
	}

	public void setCargoDto(CargoDto cargoDto) {
		this.cargoDto = cargoDto;
	}

	public AgreementDto getAgreementDto() {
		return agreementDto;
	}

	public void setAgreementDto(AgreementDto agreementDto) {
		this.agreementDto = agreementDto;
	}

	public CargoPheadDto getCargoPheadDto() {
		return cargoPheadDto;
	}

	public void setCargoPheadDto(CargoPheadDto cargoPheadDto) {
		this.cargoPheadDto = cargoPheadDto;
	}

}
