package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoInputDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoResultDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.AgreementDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.CargoDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.CargoPheadDto;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoInputXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoResultXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.AgreementXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.CargoXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.CargoPheadXom;
import com.sinosoft.ilogrule.util.PubTools;


public class CargoConvertUtil {
	
	/**
	 * 入参对象转换
	 * @param approveRuleVo
	 * @return
	 */
	public static CargoInputXom ConvertObject(CargoInputDto cargoInputDto){
		CargoInputXom cargoInputXom = new CargoInputXom();
		try {

			//组织判断接口调用非空校验
			StringBuffer sb = new StringBuffer();
			 CargoXom cargoXom = CargoObject(cargoInputDto,sb);
			
			 AgreementXom agreementXom = AgreementObject(cargoInputDto,sb);
			
			 CargoPheadXom cargoPheadXom = CargoPheadObject(cargoInputDto,sb);
			 
			 
			 cargoInputXom.setCargoXom(cargoXom);
			 cargoInputXom.setAgreementXom(agreementXom);
			 cargoInputXom.setCargoPheadXom(cargoPheadXom);
			 
			CargoResultXom cargoResultXom =new CargoResultXom();
//			cargoResultXom.setUndwrtFlag("1");
			cargoInputXom.setCargoResultXOM(cargoResultXom);
			
			
			cargoInputXom.getCargoResultXOM().setErrorMessage(sb.toString());
			
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return cargoInputXom;
	}
	
	/**
	 * 组织CargoXom信息
	 * @param cargoInputDto
	 * @param cargoXom
	 * @param sb
	 * @return
	 */
	public  static CargoXom CargoObject(CargoInputDto cargoInputDto,StringBuffer sb){
		CargoXom cargoXom = new CargoXom();
		try{
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			//组织cargoXom begin
			if(cargoInputDto.getCargoDto()!=null){
				CargoDto cargoDto = cargoInputDto.getCargoDto();
				//组织MainXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.MainXom mainXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.MainXom();
				
				if(cargoDto.getMainDto()!=null){							
					//String
					if(PubTools.isNotNull(cargoDto.getMainDto().getComCode())){
						mainXom.setComCode(cargoDto.getMainDto().getComCode());
					}else{
						sb.append("CargoDto.MainDto.ComCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getComName())){
						mainXom.setComName(cargoDto.getMainDto().getComName());
					}else{
						sb.append("CargoDto.MainDto.ComName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getClassCode())){
						mainXom.setClassCode(cargoDto.getMainDto().getClassCode());
					}else{
						sb.append("CargoDto.MainDto.ClassCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getClassName())){
						mainXom.setClassName(cargoDto.getMainDto().getClassName());
					}else{
						sb.append("CargoDto.MainDto.ClassName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getRiskCode())){
						mainXom.setRiskCode(cargoDto.getMainDto().getRiskCode());
					}else{
						sb.append("CargoDto.MainDto.RiskCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getRiskName())){
						mainXom.setRiskName(cargoDto.getMainDto().getRiskName());
					}else{
						sb.append("CargoDto.MainDto.RiskName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getArgueDel())){
						mainXom.setArgueDel(cargoDto.getMainDto().getArgueDel());
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getArgueDel_Code())){
						mainXom.setArgueDel_Code(cargoDto.getMainDto().getArgueDel_Code());
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getCurrencyAmount())){
						mainXom.setCurrencyAmount(cargoDto.getMainDto().getCurrencyAmount());
					}else{
						sb.append("CargoDto.MainDto.CurrencyAmount为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getCurrencyPremium())){
						mainXom.setCurrencyPremium(cargoDto.getMainDto().getCurrencyPremium());
					}else{
						sb.append("CargoDto.MainDto.CurrencyPremium为空|");
					}
					
	
					
					
					// Date 日期格式 yyyy-mm-dd
					if(PubTools.isNotNull(cargoDto.getMainDto().getStartDate())){
						mainXom.setStartDate(formatter.parse(cargoDto.getMainDto().getStartDate()));
					}else{
						sb.append("CargoDto.MainDto.StartDate为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getEndDate())){
						mainXom.setEndDate(formatter.parse(cargoDto.getMainDto().getEndDate()));
					}else{
						sb.append("CargoDto.MainDto.EndDate为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getInsureDate())){
						mainXom.setInsureDate(formatter.parse(cargoDto.getMainDto().getInsureDate()));
					}else{
						sb.append("CargoDto.MainDto.InsureDate为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getSignDate())){
						mainXom.setSignDate(formatter.parse(cargoDto.getMainDto().getSignDate()));
					}else{
						sb.append("CargoDto.MainDto.SignDate为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getCreateDate())){
						mainXom.setCreateDate(formatter.parse(cargoDto.getMainDto().getCreateDate()));
					}else{
						sb.append("CargoDto.MainDto.CreateDate为空|");
					}
					
					//Double 
					if(PubTools.isNotNull(cargoDto.getMainDto().getSumAmount())){
						mainXom.setSumAmount(Double.parseDouble(cargoDto.getMainDto().getSumAmount()));
					}else{
						sb.append("CargoDto.MainDto.SumAmount为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getSumPremium())){
						mainXom.setSumPremium(Double.parseDouble(cargoDto.getMainDto().getSumPremium()));
					}else{
						sb.append("CargoDto.MainDto.SumPremium为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getRate())){
						mainXom.setRate(Double.parseDouble(cargoDto.getMainDto().getRate()));
					}else{
						sb.append("CargoDto.MainDto.Rate为空|");
					}
					if(PubTools.isNotNull(cargoDto.getMainDto().getPlusRate())){
						mainXom.setPlusRate(Double.parseDouble(cargoDto.getMainDto().getPlusRate()));
					}else{
						sb.append("CargoDto.MainDto.PlusRate为空|");
					}
								
				}
				cargoXom.setMainXom(mainXom);	
				//组织MainXom end
				
				//组织ApplicantXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ApplicantXom applicantXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ApplicantXom();
				if(cargoDto.getApplicantDto()!=null){
					//String
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliCode())){
						applicantXom.setAppliCode(cargoDto.getApplicantDto().getAppliCode());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliName())){
						applicantXom.setAppliName(cargoDto.getApplicantDto().getAppliName());
					}else{
						sb.append("CargoDto.ApplicantDto.AppliName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getInsuredNature())){
						applicantXom.setInsuredNature(cargoDto.getApplicantDto().getInsuredNature());
					}else{
						sb.append("CargoDto.ApplicantDto.InsuredNature为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getInsuredNature_Code())){
						applicantXom.setInsuredNature_Code(cargoDto.getApplicantDto().getInsuredNature_Code());
					}else{
						sb.append("CargoDto.ApplicantDto.InsuredNature_Code为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getIdentifyType())){
						applicantXom.setIdentifyType(cargoDto.getApplicantDto().getIdentifyType());
					}else{
						sb.append("CargoDto.ApplicantDto.IdentifyType为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getIdentifyType_code())){
						applicantXom.setIdentifyType_code(cargoDto.getApplicantDto().getIdentifyType_code());
					}else{
						sb.append("CargoDto.ApplicantDto.IdentifyType_code为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getIdentifyNumber())){
						applicantXom.setIdentifyNumber(cargoDto.getApplicantDto().getIdentifyNumber());
					}else{
						sb.append("CargoDto.ApplicantDto.IdentifyNumber为空|");
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliAddress())){
						applicantXom.setAppliAddress(cargoDto.getApplicantDto().getAppliAddress());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getInsuredIdentity())){
						applicantXom.setInsuredIdentity(cargoDto.getApplicantDto().getInsuredIdentity());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getSex())){
						applicantXom.setSex(cargoDto.getApplicantDto().getSex());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getSex_Code())){
						applicantXom.setSex_Code(cargoDto.getApplicantDto().getSex_Code());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliPostCode())){
						applicantXom.setAppliPostCode(cargoDto.getApplicantDto().getAppliPostCode());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliPhoneNumber())){
						applicantXom.setAppliPhoneNumber(cargoDto.getApplicantDto().getAppliPhoneNumber());
					}
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAppliMobile())){
						applicantXom.setAppliMobile(cargoDto.getApplicantDto().getAppliMobile());
					}
					
					
					//Integer
					if(PubTools.isNotNull(cargoDto.getApplicantDto().getAge())){
						applicantXom.setAge(Integer.parseInt(cargoDto.getApplicantDto().getAge()));
					}				
				}
				cargoXom.setApplicantXom(applicantXom);
				//组织ApplicantXom end
				
				//组织InsuredXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.InsuredXom insuredXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.InsuredXom();
				if(cargoDto.getInsuredDto()!=null){
					//String
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredCode())){
						insuredXom.setInsuredCode(cargoDto.getInsuredDto().getInsuredCode());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredName())){
						insuredXom.setInsuredName(cargoDto.getInsuredDto().getInsuredName());
					}else{
						sb.append("CargoDto.InsuredDto.InsuredName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredNature())){
						insuredXom.setInsuredNature(cargoDto.getInsuredDto().getInsuredNature());
					}else{
						sb.append("CargoDto.InsuredDto.InsuredNature为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredNature_Code())){
						insuredXom.setInsuredNature_Code(cargoDto.getInsuredDto().getInsuredNature_Code());
					}else{
						sb.append("CargoDto.InsuredDto.InsuredNature_Code为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getIdentifyType())){
						insuredXom.setIdentifyType(cargoDto.getInsuredDto().getIdentifyType());
					}else{
						sb.append("CargoDto.InsuredDto.IdentifyType为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getIdentifyType_Code())){
						insuredXom.setIdentifyType_Code(cargoDto.getInsuredDto().getIdentifyType_Code());
					}else{
						sb.append("CargoDto.InsuredDto.IdentifyType_Code为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getIdentifyNumber())){
						insuredXom.setIdentifyNumber(cargoDto.getInsuredDto().getIdentifyNumber());
					}else{
						sb.append("CargoDto.InsuredDto.IdentifyNumber为空|");
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredAddress())){
						insuredXom.setInsuredAddress(cargoDto.getInsuredDto().getInsuredAddress());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredIdentity())){
						insuredXom.setInsuredIdentity(cargoDto.getInsuredDto().getInsuredIdentity());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getSex())){
						insuredXom.setSex(cargoDto.getInsuredDto().getSex());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getSex_Code())){
						insuredXom.setSex_Code(cargoDto.getInsuredDto().getSex_Code());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredPostCode())){
						insuredXom.setInsuredPostCode(cargoDto.getInsuredDto().getInsuredPostCode());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredPhoneNumber())){
						insuredXom.setInsuredPhoneNumber(cargoDto.getInsuredDto().getInsuredPhoneNumber());
					}
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getInsuredMobile())){
						insuredXom.setInsuredMobile(cargoDto.getInsuredDto().getInsuredMobile());
					}
					
					//Integer
					if(PubTools.isNotNull(cargoDto.getInsuredDto().getAge())){
						insuredXom.setAge(Integer.parseInt(cargoDto.getInsuredDto().getAge()));
					}	
				}
				cargoXom.setInsuredXom(insuredXom);
				//组织InsuredXom end
				
				//组织EngageXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.EngageXom engageXom = null;
				if(cargoDto.getEngageDto()!=null){	
					engageXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.EngageXom();
					//String
					if(PubTools.isNotNull(cargoDto.getEngageDto().getClauseCode())){
						engageXom.setClauseCode(cargoDto.getEngageDto().getClauseCode());
					}else{
						sb.append("CargoDto.EngageDto.ClauseCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getEngageDto().getClauses())){
						engageXom.setClauses(cargoDto.getEngageDto().getClauses());
					}else{
						sb.append("CargoDto.EngageDto.Clauses为空|");
					}
								
				}
				cargoXom.setEngageXom(engageXom);
				//组织EngageXom end
				
				//组织GoodsXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.GoodsXom goodsXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.GoodsXom();
				if(cargoDto.getGoodsDto()!=null){
					//String
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getGoodFlag())){
						goodsXom.setGoodFlag(cargoDto.getGoodsDto().getGoodFlag());
					}else{
						sb.append("CargoDto.GoodsDto.GoodFlag为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getGoodTypeCode())){
						goodsXom.setGoodTypeCode(cargoDto.getGoodsDto().getGoodTypeCode());
					}else{
						sb.append("CargoDto.GoodsDto.GoodTypeCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getGoodTypeName())){
						goodsXom.setGoodTypeName(cargoDto.getGoodsDto().getGoodTypeName());
					}else{
						sb.append("CargoDto.GoodsDto.GoodTypeName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getPackingCode())){
						goodsXom.setPackingCode(cargoDto.getGoodsDto().getPackingCode());
					}else{
						sb.append("CargoDto.GoodsDto.PackingCode为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getPackingName())){
						goodsXom.setPackingName(cargoDto.getGoodsDto().getPackingName());
					}else{
						sb.append("CargoDto.GoodsDto.PackingName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(cargoDto.getGoodsDto().getGoodName());
					}else{
						sb.append("CargoDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(cargoDto.getGoodsDto().getGoodName());
					}else{
						sb.append("CargoDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getStartArea())){
						goodsXom.setStartArea(cargoDto.getGoodsDto().getStartArea());
					}else{
						sb.append("CargoDto.GoodsDto.StartArea为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getRouteArea())){
						goodsXom.setRouteArea(cargoDto.getGoodsDto().getRouteArea());
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getEndArea())){
						goodsXom.setEndArea(cargoDto.getGoodsDto().getEndArea());
					}else{
						sb.append("CargoDto.GoodsDto.EndArea为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getTransportType())){
						goodsXom.setTransportType(cargoDto.getGoodsDto().getTransportType());
					}else{
						sb.append("CargoDto.GoodsDto.TransportType为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getDeductibles())){
						goodsXom.setDeductibles(cargoDto.getGoodsDto().getDeductibles());
					}else{
						sb.append("CargoDto.GoodsDto.Deductibles为空|");
					}
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getPackingQuantity())){
						goodsXom.setPackingQuantity(cargoDto.getGoodsDto().getPackingQuantity());
					}else{
						sb.append("CargoDto.GoodsDto.PackingQuantity为空|");
					}
					
					//Double

					
					
					//Date
					if(PubTools.isNotNull(cargoDto.getGoodsDto().getShipDate())){
						goodsXom.setShipDate(formatter.parse(cargoDto.getGoodsDto().getShipDate()));
					}else{
						sb.append("CargoDto.GoodsDto.ShipDate为空|");
					}
	
				}
				cargoXom.setGoodsXom(goodsXom);
				//组织GoodsXom end
				
				
				//组织itemKindXomList begin
				List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom> itemKindXomList = new ArrayList<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom>();
				if(cargoDto.getItemKindDtoList()!=null){
					int itemKindlength = cargoDto.getItemKindDtoList().size();				
					for(int i=0;i<itemKindlength;i++ ){
						com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto = cargoDto.getItemKindDtoList().get(i);
							
						com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom itemKindXom =new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargo.ItemKindXom();
						//String
						if(PubTools.isNotNull(itemKindDto.getItemKindCode())){
							itemKindXom.setItemKindCode(itemKindDto.getItemKindCode());
						}else{
							sb.append("CargoDto.ItemKindDtoList.ItemKindDto.ItemKindCode为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getItemKindName())){
							itemKindXom.setItemKindName(itemKindDto.getItemKindName());
						}else{
							sb.append("CargoDto.ItemKindDtoList.ItemKindDto.ItemKindName为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getCurrency())){
							itemKindXom.setCurrency(itemKindDto.getCurrency());
//						}else{
//							sb.append("CargoDto.ItemKindDtoList.ItemKindDto.Currency为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getFlag())){
							itemKindXom.setFlag(itemKindDto.getFlag());
						}
						
						//Double
						if(PubTools.isNotNull(itemKindDto.getAmount())){
							itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
//						}else{
//							sb.append("CargoDto.ItemKindDtoList.ItemKindDto.Amount为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getPremium())){
							itemKindXom.setPremium(Double.parseDouble(itemKindDto.getPremium()));
						}
						if(PubTools.isNotNull(itemKindDto.getRate())){
							itemKindXom.setRate(Double.parseDouble(itemKindDto.getRate()));
						}
						itemKindXomList.add(itemKindXom);
					}					
				}
				cargoXom.setItemKindXomList(itemKindXomList);
				//组织itemKindXomList end
			}
			//组织cargoXom end
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return cargoXom;
	}
	
	
	
	/**
	 * 组织AgreementXom信息
	 * @param cargoInputDto
	 * @param agreementXom
	 * @param sb
	 * @return
	 */
	public  static AgreementXom AgreementObject(CargoInputDto cargoInputDto,StringBuffer sb){
		AgreementXom agreementXom = new AgreementXom();
		try{
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			//组织agreementXom begin
			if(cargoInputDto.getAgreementDto()!=null){
				AgreementDto agreementDto = cargoInputDto.getAgreementDto();
				//组织MainXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.MainXom mainXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.MainXom();
				if(agreementDto.getMainDto()!=null){							
					//String
					if(PubTools.isNotNull(agreementDto.getMainDto().getComCode())){
						mainXom.setComCode(agreementDto.getMainDto().getComCode());
					}else{
						sb.append("AgreementDto.MainDto.ComCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getComName())){
						mainXom.setComName(agreementDto.getMainDto().getComName());
					}else{
						sb.append("AgreementDto.MainDto.ComName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getClassCode())){
						mainXom.setClassCode(agreementDto.getMainDto().getClassCode());
					}else{
						sb.append("AgreementDto.MainDto.ClassCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getClassName())){
						mainXom.setClassName(agreementDto.getMainDto().getClassName());
					}else{
						sb.append("AgreementDto.MainDto.ClassName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getRiskCode())){
						mainXom.setRiskCode(agreementDto.getMainDto().getRiskCode());
					}else{
						sb.append("AgreementDto.MainDto.RiskCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getRiskName())){
						mainXom.setRiskName(agreementDto.getMainDto().getRiskName());
					}else{
						sb.append("AgreementDto.MainDto.RiskName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getArgueDel())){
						mainXom.setArgueDel(agreementDto.getMainDto().getArgueDel());
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getArgueDel_Code())){
						mainXom.setArgueDel_Code(agreementDto.getMainDto().getArgueDel_Code());
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getCurrencyAmount())){
						mainXom.setCurrencyAmount(agreementDto.getMainDto().getCurrencyAmount());
					}else{
						sb.append("AgreementDto.MainDto.CurrencyAmount为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getCurrencyPremium())){
						mainXom.setCurrencyPremium(agreementDto.getMainDto().getCurrencyPremium());
					}else{
						sb.append("AgreementDto.MainDto.CurrencyPremium为空|");
					}
					
					
					
					
					// Date 日期格式 yyyy-mm-dd
					if(PubTools.isNotNull(agreementDto.getMainDto().getStartDate())){
						mainXom.setStartDate(formatter.parse(agreementDto.getMainDto().getStartDate()));
					}else{
						sb.append("AgreementDto.MainDto.StartDate为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getEndDate())){
						mainXom.setEndDate(formatter.parse(agreementDto.getMainDto().getEndDate()));
					}else{
						sb.append("AgreementDto.MainDto.EndDate为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getInsureDate())){
						mainXom.setInsureDate(formatter.parse(agreementDto.getMainDto().getInsureDate()));
					}else{
						sb.append("AgreementDto.MainDto.InsureDate为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getSignDate())){
						mainXom.setSignDate(formatter.parse(agreementDto.getMainDto().getSignDate()));
					}else{
						sb.append("AgreementDto.MainDto.SignDate为空|");
					}
					
					//Double 
					if(PubTools.isNotNull(agreementDto.getMainDto().getSumAmount())){
						mainXom.setSumAmount(Double.parseDouble(agreementDto.getMainDto().getSumAmount()));
					}else{
						sb.append("AgreementDto.MainDto.SumAmount为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getSumPremium())){
						mainXom.setSumPremium(Double.parseDouble(agreementDto.getMainDto().getSumPremium()));
					}else{
						sb.append("AgreementDto.MainDto.SumPremium为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getRate())){
						mainXom.setRate(Double.parseDouble(agreementDto.getMainDto().getRate()));
					}else{
						sb.append("AgreementDto.MainDto.Rate为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getPlusRate())){
						mainXom.setPlusRate(Double.parseDouble(agreementDto.getMainDto().getPlusRate()));
					}else{
						sb.append("AgreementDto.MainDto.PlusRate为空|");
					}
					if(PubTools.isNotNull(agreementDto.getMainDto().getBackDays())){
						mainXom.setBackDays(Double.parseDouble(agreementDto.getMainDto().getBackDays()));
					}else{
						sb.append("AgreementDto.MainDto.BackDays为空|");
					}
					
				}
				agreementXom.setMainXom(mainXom);	
				//组织MainXom end
				
				//组织ApplicantXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ApplicantXom applicantXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ApplicantXom();
				if(agreementDto.getApplicantDto()!=null){
					//String
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliCode())){
						applicantXom.setAppliCode(agreementDto.getApplicantDto().getAppliCode());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliName())){
						applicantXom.setAppliName(agreementDto.getApplicantDto().getAppliName());
					}else{
						sb.append("AgreementDto.ApplicantDto.AppliName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getInsuredNature())){
						applicantXom.setInsuredNature(agreementDto.getApplicantDto().getInsuredNature());
					}else{
						sb.append("AgreementDto.ApplicantDto.InsuredNature为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getInsuredNature_Code())){
						applicantXom.setInsuredNature_Code(agreementDto.getApplicantDto().getInsuredNature_Code());
					}else{
						sb.append("AgreementDto.ApplicantDto.InsuredNature_Code为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getIdentifyType())){
						applicantXom.setIdentifyType(agreementDto.getApplicantDto().getIdentifyType());
					}else{
						sb.append("AgreementDto.ApplicantDto.IdentifyType为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getIdentifyType_code())){
						applicantXom.setIdentifyType_code(agreementDto.getApplicantDto().getIdentifyType_code());
					}else{
						sb.append("AgreementDto.ApplicantDto.IdentifyType_code为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getIdentifyNumber())){
						applicantXom.setIdentifyNumber(agreementDto.getApplicantDto().getIdentifyNumber());
					}else{
						sb.append("AgreementDto.ApplicantDto.IdentifyNumber为空|");
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliAddress())){
						applicantXom.setAppliAddress(agreementDto.getApplicantDto().getAppliAddress());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getInsuredIdentity())){
						applicantXom.setInsuredIdentity(agreementDto.getApplicantDto().getInsuredIdentity());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getSex())){
						applicantXom.setSex(agreementDto.getApplicantDto().getSex());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getSex_Code())){
						applicantXom.setSex_Code(agreementDto.getApplicantDto().getSex_Code());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliPostCode())){
						applicantXom.setAppliPostCode(agreementDto.getApplicantDto().getAppliPostCode());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliPhoneNumber())){
						applicantXom.setAppliPhoneNumber(agreementDto.getApplicantDto().getAppliPhoneNumber());
					}
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAppliMobile())){
						applicantXom.setAppliMobile(agreementDto.getApplicantDto().getAppliMobile());
					}
					
					
					//Integer
					if(PubTools.isNotNull(agreementDto.getApplicantDto().getAge())){
						applicantXom.setAge(Integer.parseInt(agreementDto.getApplicantDto().getAge()));
					}				
				}
				agreementXom.setApplicantXom(applicantXom);
				//组织ApplicantXom end
				
				//组织InsuredXom begin
				List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom> insuredXomList = new ArrayList<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom>();
				if(agreementDto.getInsuredDtoList()!=null){
					int insuredlength = agreementDto.getInsuredDtoList().size();
					for(int i=0;i<insuredlength;i++ ){
						com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto insuredDto = agreementDto.getInsuredDtoList().get(i);
						
						com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom insuredXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.InsuredXom();
						//String
						if(PubTools.isNotNull(insuredDto.getInsuredCode())){
							insuredXom.setInsuredCode(insuredDto.getInsuredCode());
						}
						if(PubTools.isNotNull(insuredDto.getInsuredName())){
							insuredXom.setInsuredName(insuredDto.getInsuredName());
						}else{
							sb.append("AgreementDto.InsuredDto.InsuredName为空|");
						}
						if(PubTools.isNotNull(insuredDto.getInsuredNature())){
							insuredXom.setInsuredNature(insuredDto.getInsuredNature());
						}else{
							sb.append("AgreementDto.InsuredDto.InsuredNature为空|");
						}
						if(PubTools.isNotNull(insuredDto.getInsuredNature_Code())){
							insuredXom.setInsuredNature_Code(insuredDto.getInsuredNature_Code());
						}else{
							sb.append("AgreementDto.InsuredDto.InsuredNature_Code为空|");
						}
						if(PubTools.isNotNull(insuredDto.getIdentifyType())){
							insuredXom.setIdentifyType(insuredDto.getIdentifyType());
						}else{
							sb.append("AgreementDto.InsuredDto.IdentifyType为空|");
						}
						if(PubTools.isNotNull(insuredDto.getIdentifyType_Code())){
							insuredXom.setIdentifyType_Code(insuredDto.getIdentifyType_Code());
						}else{
							sb.append("AgreementDto.InsuredDto.IdentifyType_Code为空|");
						}
						if(PubTools.isNotNull(insuredDto.getIdentifyNumber())){
							insuredXom.setIdentifyNumber(insuredDto.getIdentifyNumber());
						}else{
							sb.append("AgreementDto.InsuredDto.IdentifyNumber为空|");
						}
						if(PubTools.isNotNull(insuredDto.getInsuredAddress())){
							insuredXom.setInsuredAddress(insuredDto.getInsuredAddress());
						}
						if(PubTools.isNotNull(insuredDto.getInsuredIdentity())){
							insuredXom.setInsuredIdentity(insuredDto.getInsuredIdentity());
						}
						if(PubTools.isNotNull(insuredDto.getSex())){
							insuredXom.setSex(insuredDto.getSex());
						}
						if(PubTools.isNotNull(insuredDto.getSex_Code())){
							insuredXom.setSex_Code(insuredDto.getSex_Code());
						}
						if(PubTools.isNotNull(insuredDto.getInsuredPostCode())){
							insuredXom.setInsuredPostCode(insuredDto.getInsuredPostCode());
						}
						if(PubTools.isNotNull(insuredDto.getInsuredPhoneNumber())){
							insuredXom.setInsuredPhoneNumber(insuredDto.getInsuredPhoneNumber());
						}
						if(PubTools.isNotNull(insuredDto.getInsuredMobile())){
							insuredXom.setInsuredMobile(insuredDto.getInsuredMobile());
						}
						
						//Integer
						if(PubTools.isNotNull(insuredDto.getAge())){
							insuredXom.setAge(Integer.parseInt(insuredDto.getAge()));
						}	
						
						insuredXomList.add(insuredXom);
					}
				}
				agreementXom.setInsuredXomList(insuredXomList);
				//组织InsuredXom end
				
				//组织EngageXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.EngageXom engageXom = null;
				if(agreementDto.getEngageDto()!=null){	
					engageXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.EngageXom();
					//String
					if(PubTools.isNotNull(agreementDto.getEngageDto().getClauseCode())){
						engageXom.setClauseCode(agreementDto.getEngageDto().getClauseCode());
					}else{
						sb.append("AgreementDto.EngageDto.ClauseCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getEngageDto().getClauses())){
						engageXom.setClauses(agreementDto.getEngageDto().getClauses());
					}else{
						sb.append("AgreementDto.EngageDto.Clauses为空|");
					}
					
				}
				agreementXom.setEngageXom(engageXom);
				//组织EngageXom end
				
				//组织GoodsXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.GoodsXom goodsXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.GoodsXom();
				if(agreementDto.getGoodsDto()!=null){
					//String
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodFlag())){
						goodsXom.setGoodFlag(agreementDto.getGoodsDto().getGoodFlag());
					}else{
						sb.append("AgreementDto.GoodsDto.GoodFlag为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodTypeCode())){
						goodsXom.setGoodTypeCode(agreementDto.getGoodsDto().getGoodTypeCode());
					}else{
						sb.append("AgreementDto.GoodsDto.GoodTypeCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodTypeName())){
						goodsXom.setGoodTypeName(agreementDto.getGoodsDto().getGoodTypeName());
					}else{
						sb.append("AgreementDto.GoodsDto.GoodTypeName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getPackingCode())){
						goodsXom.setPackingCode(agreementDto.getGoodsDto().getPackingCode());
					}else{
						sb.append("AgreementDto.GoodsDto.PackingCode为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getPackingName())){
						goodsXom.setPackingName(agreementDto.getGoodsDto().getPackingName());
					}else{
						sb.append("AgreementDto.GoodsDto.PackingName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(agreementDto.getGoodsDto().getGoodName());
					}else{
						sb.append("AgreementDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(agreementDto.getGoodsDto().getGoodName());
					}else{
						sb.append("AgreementDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getTransportType())){
						goodsXom.setTransportType(agreementDto.getGoodsDto().getTransportType());
					}else{
						sb.append("AgreementDto.GoodsDto.TransportType为空|");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getGoodSensitiveWords())){
						goodsXom.setGoodSensitiveWords(agreementDto.getGoodsDto().getGoodSensitiveWords());
					}else{
						goodsXom.setGoodSensitiveWords("");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getTransportCity())){
						goodsXom.setTransportCity(agreementDto.getGoodsDto().getTransportCity());
					}else{
						goodsXom.setTransportCity("");
					}
					if(PubTools.isNotNull(agreementDto.getGoodsDto().getDeductibles())){
						goodsXom.setDeductibles(agreementDto.getGoodsDto().getDeductibles());
					}else{
						sb.append("AgreementDto.GoodsDto.Deductibles为空|");
					}
					
					//Double

					
				}
				agreementXom.setGoodsXom(goodsXom);
				//组织GoodsXom end
				
				
				//组织itemKindXomList begin
				List<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom> itemKindXomList = new ArrayList<com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom>();
				if(agreementDto.getItemKindDtoList()!=null){
					int itemKindlength = agreementDto.getItemKindDtoList().size();				
					for(int i=0;i<itemKindlength;i++ ){
						com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto = agreementDto.getItemKindDtoList().get(i);
						
						com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom itemKindXom =new com.sinosoft.ilogrule.ilog.xom.cargoXom.agreement.ItemKindXom();
						//String
						if(PubTools.isNotNull(itemKindDto.getItemKindCode())){
							itemKindXom.setItemKindCode(itemKindDto.getItemKindCode());
						}else{
							sb.append("AgreementDto.ItemKindDtoList.ItemKindDto.ItemKindCode为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getItemKindName())){
							itemKindXom.setItemKindName(itemKindDto.getItemKindName());
						}else{
							sb.append("AgreementDto.ItemKindDtoList.ItemKindDto.ItemKindName为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getCurrency())){
							itemKindXom.setCurrency(itemKindDto.getCurrency());
//						}else{
//							sb.append("AgreementDto.ItemKindDtoList.ItemKindDto.Currency为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getFlag())){
							itemKindXom.setFlag(itemKindDto.getFlag());
						}
						
						//Double
						if(PubTools.isNotNull(itemKindDto.getAmount())){
							itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
//						}else{
//							sb.append("AgreementDto.ItemKindDtoList.ItemKindDto.Amount为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getPremium())){
							itemKindXom.setPremium(Double.parseDouble(itemKindDto.getPremium()));
						}
						if(PubTools.isNotNull(itemKindDto.getRate())){
							itemKindXom.setRate(Double.parseDouble(itemKindDto.getRate()));
						}
						itemKindXomList.add(itemKindXom);
					}					
				}
				agreementXom.setItemKindXomList(itemKindXomList);
				//组织itemKindXomList end
			}
			//组织agreementXom end
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return agreementXom;
	}
	
	
	
	
	/**
	 * 组织CargoPheadXom信息
	 * @param cargoInputDto
	 * @param sb
	 * @return
	 */
	public  static CargoPheadXom CargoPheadObject(CargoInputDto cargoInputDto,StringBuffer sb){
		CargoPheadXom cargoPheadXom = null;
		try{
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			//组织cargoPheadXom begin
			if(cargoInputDto.getCargoPheadDto()!=null){
				cargoPheadXom = new CargoPheadXom();
				CargoPheadDto cargoPheadDto = cargoInputDto.getCargoPheadDto();
				//组织MainXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.MainXom mainXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.MainXom();
				
				if(cargoPheadDto.getMainDto()!=null){							
					//String
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getComCode())){
						mainXom.setComCode(cargoPheadDto.getMainDto().getComCode());
					}else{
						sb.append("CargoPheadDto.MainDto.ComCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getComName())){
						mainXom.setComName(cargoPheadDto.getMainDto().getComName());
					}else{
						sb.append("CargoPheadDto.MainDto.ComName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getClassCode())){
						mainXom.setClassCode(cargoPheadDto.getMainDto().getClassCode());
					}else{
						sb.append("CargoPheadDto.MainDto.ClassCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getClassName())){
						mainXom.setClassName(cargoPheadDto.getMainDto().getClassName());
					}else{
						sb.append("CargoPheadDto.MainDto.ClassName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getRiskCode())){
						mainXom.setRiskCode(cargoPheadDto.getMainDto().getRiskCode());
					}else{
						sb.append("CargoPheadDto.MainDto.RiskCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getRiskName())){
						mainXom.setRiskName(cargoPheadDto.getMainDto().getRiskName());
					}else{
						sb.append("CargoPheadDto.MainDto.RiskName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getArgueDel())){
						mainXom.setArgueDel(cargoPheadDto.getMainDto().getArgueDel());
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getArgueDel_Code())){
						mainXom.setArgueDel_Code(cargoPheadDto.getMainDto().getArgueDel_Code());
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getCurrencyAmount())){
						mainXom.setCurrencyAmount(cargoPheadDto.getMainDto().getCurrencyAmount());
					}else{
						sb.append("CargoPheadDto.MainDto.CurrencyAmount为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getCurrencyPremium())){
						mainXom.setCurrencyPremium(cargoPheadDto.getMainDto().getCurrencyPremium());
					}else{
						sb.append("CargoPheadDto.MainDto.CurrencyPremium为空|");
					}
					
					
					
					
					// Date 日期格式 yyyy-mm-dd
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getStartDate())){
						mainXom.setStartDate(formatter.parse(cargoPheadDto.getMainDto().getStartDate()));
					}else{
						sb.append("CargoPheadDto.MainDto.StartDate为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getEndDate())){
						mainXom.setEndDate(formatter.parse(cargoPheadDto.getMainDto().getEndDate()));
					}else{
						sb.append("CargoPheadDto.MainDto.EndDate为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getInsureDate())){
						mainXom.setInsureDate(formatter.parse(cargoPheadDto.getMainDto().getInsureDate()));
					}else{
						sb.append("CargoPheadDto.MainDto.InsureDate为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getSignDate())){
						mainXom.setSignDate(formatter.parse(cargoPheadDto.getMainDto().getSignDate()));
					}else{
						sb.append("CargoPheadDto.MainDto.SignDate为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getCreateDate())){
						mainXom.setCreateDate(formatter.parse(cargoPheadDto.getMainDto().getCreateDate()));
					}else{
						sb.append("CargoPheadDto.MainDto.CreateDate为空|");
					}
					
					//Double 
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getSumAmount())){
						mainXom.setSumAmount(Double.parseDouble(cargoPheadDto.getMainDto().getSumAmount()));
					}else{
						sb.append("CargoPheadDto.MainDto.SumAmount为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getSumPremium())){
						mainXom.setSumPremium(Double.parseDouble(cargoPheadDto.getMainDto().getSumPremium()));
					}else{
						sb.append("CargoPheadDto.MainDto.SumPremium为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getRate())){
						mainXom.setRate(Double.parseDouble(cargoPheadDto.getMainDto().getRate()));
					}else{
						sb.append("CargoPheadDto.MainDto.Rate为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getMainDto().getPlusRate())){
						mainXom.setPlusRate(Double.parseDouble(cargoPheadDto.getMainDto().getPlusRate()));
					}else{
						sb.append("CargoPheadDto.MainDto.PlusRate为空|");
					}
					
				}
				cargoPheadXom.setMainXom(mainXom);	
				//组织MainXom end
				
				//组织ApplicantXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ApplicantXom applicantXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ApplicantXom();
				if(cargoPheadDto.getApplicantDto()!=null){
					//String
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliCode())){
						applicantXom.setAppliCode(cargoPheadDto.getApplicantDto().getAppliCode());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliName())){
						applicantXom.setAppliName(cargoPheadDto.getApplicantDto().getAppliName());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.AppliName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getInsuredNature())){
						applicantXom.setInsuredNature(cargoPheadDto.getApplicantDto().getInsuredNature());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.InsuredNature为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getInsuredNature_Code())){
						applicantXom.setInsuredNature_Code(cargoPheadDto.getApplicantDto().getInsuredNature_Code());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.InsuredNature_Code为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getIdentifyType())){
						applicantXom.setIdentifyType(cargoPheadDto.getApplicantDto().getIdentifyType());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.IdentifyType为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getIdentifyType_code())){
						applicantXom.setIdentifyType_code(cargoPheadDto.getApplicantDto().getIdentifyType_code());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.IdentifyType_code为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getIdentifyNumber())){
						applicantXom.setIdentifyNumber(cargoPheadDto.getApplicantDto().getIdentifyNumber());
					}else{
						sb.append("CargoPheadDto.ApplicantDto.IdentifyNumber为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliAddress())){
						applicantXom.setAppliAddress(cargoPheadDto.getApplicantDto().getAppliAddress());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getInsuredIdentity())){
						applicantXom.setInsuredIdentity(cargoPheadDto.getApplicantDto().getInsuredIdentity());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getSex())){
						applicantXom.setSex(cargoPheadDto.getApplicantDto().getSex());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getSex_Code())){
						applicantXom.setSex_Code(cargoPheadDto.getApplicantDto().getSex_Code());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliPostCode())){
						applicantXom.setAppliPostCode(cargoPheadDto.getApplicantDto().getAppliPostCode());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliPhoneNumber())){
						applicantXom.setAppliPhoneNumber(cargoPheadDto.getApplicantDto().getAppliPhoneNumber());
					}
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAppliMobile())){
						applicantXom.setAppliMobile(cargoPheadDto.getApplicantDto().getAppliMobile());
					}
					
					
					//Integer
					if(PubTools.isNotNull(cargoPheadDto.getApplicantDto().getAge())){
						applicantXom.setAge(Integer.parseInt(cargoPheadDto.getApplicantDto().getAge()));
					}				
				}
				cargoPheadXom.setApplicantXom(applicantXom);
				//组织ApplicantXom end
				
				//组织InsuredXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.InsuredXom insuredXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.InsuredXom();
				if(cargoPheadDto.getInsuredDto()!=null){
					//String
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredCode())){
						insuredXom.setInsuredCode(cargoPheadDto.getInsuredDto().getInsuredCode());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredName())){
						insuredXom.setInsuredName(cargoPheadDto.getInsuredDto().getInsuredName());
					}else{
						sb.append("CargoPheadDto.InsuredDto.InsuredName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredNature())){
						insuredXom.setInsuredNature(cargoPheadDto.getInsuredDto().getInsuredNature());
					}else{
						sb.append("CargoPheadDto.InsuredDto.InsuredNature为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredNature_Code())){
						insuredXom.setInsuredNature_Code(cargoPheadDto.getInsuredDto().getInsuredNature_Code());
					}else{
						sb.append("CargoPheadDto.InsuredDto.InsuredNature_Code为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getIdentifyType())){
						insuredXom.setIdentifyType(cargoPheadDto.getInsuredDto().getIdentifyType());
					}else{
						sb.append("CargoPheadDto.InsuredDto.IdentifyType为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getIdentifyType_Code())){
						insuredXom.setIdentifyType_Code(cargoPheadDto.getInsuredDto().getIdentifyType_Code());
					}else{
						sb.append("CargoPheadDto.InsuredDto.IdentifyType_Code为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getIdentifyNumber())){
						insuredXom.setIdentifyNumber(cargoPheadDto.getInsuredDto().getIdentifyNumber());
					}else{
						sb.append("CargoPheadDto.InsuredDto.IdentifyNumber为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredAddress())){
						insuredXom.setInsuredAddress(cargoPheadDto.getInsuredDto().getInsuredAddress());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredIdentity())){
						insuredXom.setInsuredIdentity(cargoPheadDto.getInsuredDto().getInsuredIdentity());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getSex())){
						insuredXom.setSex(cargoPheadDto.getInsuredDto().getSex());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getSex_Code())){
						insuredXom.setSex_Code(cargoPheadDto.getInsuredDto().getSex_Code());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredPostCode())){
						insuredXom.setInsuredPostCode(cargoPheadDto.getInsuredDto().getInsuredPostCode());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredPhoneNumber())){
						insuredXom.setInsuredPhoneNumber(cargoPheadDto.getInsuredDto().getInsuredPhoneNumber());
					}
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getInsuredMobile())){
						insuredXom.setInsuredMobile(cargoPheadDto.getInsuredDto().getInsuredMobile());
					}
					
					//Integer
					if(PubTools.isNotNull(cargoPheadDto.getInsuredDto().getAge())){
						insuredXom.setAge(Integer.parseInt(cargoPheadDto.getInsuredDto().getAge()));
					}	
				}
				cargoPheadXom.setInsuredXom(insuredXom);
				//组织InsuredXom end
				
				
				//组织EngageXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.EngageXom engageXom = null;
				if(cargoPheadDto.getEngageDto()!=null){	
					engageXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.EngageXom();
					//String
					if(PubTools.isNotNull(cargoPheadDto.getEngageDto().getClauseCode())){
						engageXom.setClauseCode(cargoPheadDto.getEngageDto().getClauseCode());
					}else{
						sb.append("CargoPheadDto.EngageDto.ClauseCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getEngageDto().getClauses())){
						engageXom.setClauses(cargoPheadDto.getEngageDto().getClauses());
					}else{
						sb.append("CargoPheadDto.EngageDto.Clauses为空|");
					}
					
				}
				cargoPheadXom.setEngageXom(engageXom);
				//组织EngageXom end
				
				//组织GoodsXom begin
				com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.GoodsXom goodsXom = new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.GoodsXom();
				if(cargoPheadDto.getGoodsDto()!=null){
					//String
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getGoodFlag())){
						goodsXom.setGoodFlag(cargoPheadDto.getGoodsDto().getGoodFlag());
					}else{
						sb.append("CargoPheadDto.GoodsDto.GoodFlag为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getGoodTypeCode())){
						goodsXom.setGoodTypeCode(cargoPheadDto.getGoodsDto().getGoodTypeCode());
					}else{
						sb.append("CargoPheadDto.GoodsDto.GoodTypeCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getGoodTypeName())){
						goodsXom.setGoodTypeName(cargoPheadDto.getGoodsDto().getGoodTypeName());
					}else{
						sb.append("CargoPheadDto.GoodsDto.GoodTypeName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getPackingCode())){
						goodsXom.setPackingCode(cargoPheadDto.getGoodsDto().getPackingCode());
					}else{
						sb.append("CargoPheadDto.GoodsDto.PackingCode为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getPackingName())){
						goodsXom.setPackingName(cargoPheadDto.getGoodsDto().getPackingName());
					}else{
						sb.append("CargoPheadDto.GoodsDto.PackingName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(cargoPheadDto.getGoodsDto().getGoodName());
					}else{
						sb.append("CargoPheadDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getGoodName())){
						goodsXom.setGoodName(cargoPheadDto.getGoodsDto().getGoodName());
					}else{
						sb.append("CargoPheadDto.GoodsDto.GoodName为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getStartArea())){
						goodsXom.setStartArea(cargoPheadDto.getGoodsDto().getStartArea());
					}else{
						sb.append("CargoPheadDto.GoodsDto.StartArea为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getRouteArea())){
						goodsXom.setRouteArea(cargoPheadDto.getGoodsDto().getRouteArea());
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getEndArea())){
						goodsXom.setEndArea(cargoPheadDto.getGoodsDto().getEndArea());
					}else{
						sb.append("CargoPheadDto.GoodsDto.EndArea为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getTransportType())){
						goodsXom.setTransportType(cargoPheadDto.getGoodsDto().getTransportType());
					}else{
						sb.append("CargoPheadDto.GoodsDto.TransportType为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getDeductibles())){
						goodsXom.setDeductibles(cargoPheadDto.getGoodsDto().getDeductibles());
					}else{
						sb.append("CargoPheadDto.GoodsDto.Deductibles为空|");
					}
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getPackingQuantity())){
						goodsXom.setPackingQuantity(cargoPheadDto.getGoodsDto().getPackingQuantity());
					}else{
						sb.append("CargoPheadDto.GoodsDto.PackingQuantity为空|");
					}
					
					//Double
					
					
					//Date
					if(PubTools.isNotNull(cargoPheadDto.getGoodsDto().getShipDate())){
						goodsXom.setShipDate(formatter.parse(cargoPheadDto.getGoodsDto().getShipDate()));
					}else{
						sb.append("CargoPheadDto.GoodsDto.ShipDate为空|");
					}
					
				}
				cargoPheadXom.setGoodsXom(goodsXom);
				//组织GoodsXom end
				
				
				//组织itemKindXomList begin
				List<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom> itemKindXomList = new ArrayList<com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom>();
				if(cargoPheadDto.getItemKindDtoList()!=null){
					int itemKindlength = cargoPheadDto.getItemKindDtoList().size();				
					for(int i=0;i<itemKindlength;i++ ){
						com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto itemKindDto = cargoPheadDto.getItemKindDtoList().get(i);
						
						com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom itemKindXom =new com.sinosoft.ilogrule.ilog.xom.cargoXom.cargoPhead.ItemKindXom();
						//String
						if(PubTools.isNotNull(itemKindDto.getItemKindCode())){
							itemKindXom.setItemKindCode(itemKindDto.getItemKindCode());
						}else{
							sb.append("CargoPheadDto.ItemKindDtoList.ItemKindDto.ItemKindCode为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getItemKindName())){
							itemKindXom.setItemKindName(itemKindDto.getItemKindName());
						}else{
							sb.append("CargoPheadDto.ItemKindDtoList.ItemKindDto.ItemKindName为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getCurrency())){
							itemKindXom.setCurrency(itemKindDto.getCurrency());
//						}else{
//							sb.append("CargoPheadDto.ItemKindDtoList.ItemKindDto.Currency为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getFlag())){
							itemKindXom.setFlag(itemKindDto.getFlag());
						}
						
						//Double
						if(PubTools.isNotNull(itemKindDto.getAmount())){
							itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
//						}else{
//							sb.append("CargoPheadDto.ItemKindDtoList.ItemKindDto.Amount为空|");
						}
						if(PubTools.isNotNull(itemKindDto.getPremium())){
							itemKindXom.setPremium(Double.parseDouble(itemKindDto.getPremium()));
						}
						if(PubTools.isNotNull(itemKindDto.getRate())){
							itemKindXom.setRate(Double.parseDouble(itemKindDto.getRate()));
						}
						itemKindXomList.add(itemKindXom);
					}					
				}
				cargoPheadXom.setItemKindXomList(itemKindXomList);
				//组织itemKindXomList end
			}
			//组织cargoPheadXom end
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return cargoPheadXom;
	}
	
	
	
	/**
	 * 出参对象转换
	 * @param cargoResultXom
	 * @return
	 */
	public static CargoResultDto ConvertObject(CargoResultXom cargoResultXom){
		CargoResultDto cargoResultDto = new CargoResultDto();
		try {
			if(cargoResultXom!=null){
				if(cargoResultXom.getUndwrtFlag()!=null && !"".equals(cargoResultXom.getUndwrtFlag())){
					cargoResultDto.setUndwrtFlag(""+cargoResultXom.getUndwrtFlag());
				}else{
					cargoResultDto.setUndwrtFlag("");
				}
				if(cargoResultXom.getDescription()!=null && !"".equals(cargoResultXom.getDescription())){
					cargoResultDto.setDescription(""+cargoResultXom.getDescription());
				}else{
					cargoResultDto.setDescription("");
				}
				if(cargoResultXom.getPath()!=null && !"".equals(cargoResultXom.getPath())){
					cargoResultDto.setPath(""+cargoResultXom.getPath());
				}else{
					cargoResultDto.setPath("");
				}
				if(cargoResultXom.getRuleName()!=null && !"".equals(cargoResultXom.getRuleName())){
					cargoResultDto.setRuleName(""+cargoResultXom.getRuleName());
				}else{
					cargoResultDto.setRuleName("");
				}
				if(cargoResultXom.getErrorMessage()!=null && !"".equals(cargoResultXom.getErrorMessage())){
					cargoResultDto.setErrorMessage(""+cargoResultXom.getErrorMessage());
				}else{
					cargoResultDto.setErrorMessage("");
				}
				System.out.println("====UndwrtFlag核保通过标志======"+cargoResultXom.getUndwrtFlag());
				System.out.println("====Description描述信息======"+cargoResultXom.getDescription());
			}

		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return cargoResultDto;
	}
	
	
	/**
	 * 对计算结果四舍五入并保留digit位小数
	 * @param resultValue
	 * @param digit
	 * @return
	 */
	public static double Rounding(double resultValue,int digit){
		double coefficientCount = 0d;
//		BigDecimal big = new BigDecimal(12.555);//会失真           四舍五入2为后12.55
//		BigDecimal big = new BigDecimal("12.555");//不会失真           四舍五入2为后12.56
		
		BigDecimal bd = new BigDecimal(""+resultValue);
		BigDecimal  bd2 = bd.setScale(digit,BigDecimal.ROUND_HALF_UP);
		coefficientCount = Double.parseDouble(bd2.toString());
		
		return coefficientCount;
	}
	
}
