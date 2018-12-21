package com.sinosoft.ilogrule.restfulService.client.cargoClient;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoInputDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoResultDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.AgreementDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.CargoDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.CargoPheadDto;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;


public class CargoClient {
	
	public CargoResultDto cargoRule(CargoInputDto requestBody) throws Exception {
		
		MultivaluedMap<String, String> responseHeaders = null;
		CargoResultDto responseBody = null;
		try {

			// 获取URL  
//			String url = "http://10.2.72.24:7011/IlogRuleService/rest/CargoRuleRestfulService/cargoRule";
			String url = "http://192.168.1.100:7015/IlogRuleService/rest/CargoRuleRestfulService/cargoRule";
			System.out.println("调用接口URL==="+url);
			//获取连接超时时间		
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "CargoRuleRestfulService";
			String ORISYS = "prpall";
			String MTDNAME = "ZYICCargoRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(CargoResultDto.class);
			// 处理返回头信息
			DealHeadInfo.dealResponseHeader(responseHeaders, responseBody);
			
		} catch (RuntimeException e) {
			throw e;
		}finally {
			// 存储日志
			
		}
		return responseBody;
	}

	
	public CargoInputDto organizeObject() {
		
		
		CargoDto cargoDto = CargoObject();
		AgreementDto agreementDto = AgreementObject();
		CargoPheadDto cargoPheadDto = CargoPheadObject();
		
		
		CargoInputDto cargoInputDto = new CargoInputDto();
		cargoInputDto.setCargoDto(cargoDto);
		cargoInputDto.setAgreementDto(agreementDto);
		cargoInputDto.setCargoPheadDto(cargoPheadDto);
	
		return cargoInputDto;
	}


public CargoDto CargoObject(){
	
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.MainDto MainDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.MainDto();//基本信息
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ApplicantDto ApplicantDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ApplicantDto();//投保人
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.InsuredDto insuredDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.InsuredDto();//被保险人
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.GoodsDto goodsDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.GoodsDto();//货物信息
	
		

MainDto.setComCode("01010001");
MainDto.setComName("保险公司哈尔滨分公司");
MainDto.setClassCode("02");
MainDto.setClassName("货运险");
MainDto.setRiskCode("0201");
MainDto.setRiskName("国际货物进口运输险");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
MainDto.setInsureDate("2018-06-05");
MainDto.setSignDate("2018-06-05");
MainDto.setSumPremium("10000000.00");
MainDto.setSumAmount("20000.0");
MainDto.setArgueDel_Code("1");
MainDto.setArgueDel(null);
MainDto.setCurrencyAmount("CNY");
MainDto.setCurrencyPremium("CNY");
MainDto.setRate("10");
MainDto.setPlusRate("20");
MainDto.setCreateDate("2018-06-05");






ApplicantDto.setAppliCode("100000000159");
ApplicantDto.setAppliName("张三");
ApplicantDto.setInsuredNature_Code("1");
ApplicantDto.setInsuredNature("个人");
ApplicantDto.setIdentifyType_code("01");
ApplicantDto.setIdentifyType("居民身份证");
ApplicantDto.setIdentifyNumber("230621198805120450");
ApplicantDto.setAge("29");
ApplicantDto.setInsuredIdentity("");
ApplicantDto.setSex_Code("1");
ApplicantDto.setSex("男");
ApplicantDto.setAppliAddress("黑龙江省大庆市");
ApplicantDto.setAppliPostCode("");
ApplicantDto.setAppliPhoneNumber("");
ApplicantDto.setAppliMobile("13936971987");


insuredDto.setInsuredCode("100000000158");
insuredDto.setInsuredName("张三武8");
insuredDto.setInsuredNature_Code("18");
insuredDto.setInsuredNature("个人8");
insuredDto.setIdentifyType_Code("08");
insuredDto.setIdentifyType("居民身份证8");
insuredDto.setIdentifyNumber("230621198805120458");
insuredDto.setAge("58");
insuredDto.setInsuredIdentity("");
insuredDto.setSex_Code("8");
insuredDto.setSex("男8");
insuredDto.setInsuredAddress("黑龙江省大庆市8");
insuredDto.setInsuredPostCode("");
insuredDto.setInsuredPhoneNumber("");
insuredDto.setInsuredMobile("13936971988");


//com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.EngageDto engageDto = null;
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.EngageDto engageDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.EngageDto();//特约信息
engageDto.setClauseCode("T01001");
engageDto.setClauses("中意财产保险股份有限公司");



goodsDto.setGoodFlag("21");
goodsDto.setGoodTypeCode("A1");
goodsDto.setGoodTypeName("植物产品");
goodsDto.setPackingCode("01");
goodsDto.setPackingName("包");
goodsDto.setGoodName("石油");
goodsDto.setDeductibles("0.3");
goodsDto.setPackingQuantity("20");
goodsDto.setStartArea("北京");
goodsDto.setRouteArea("辽宁");
goodsDto.setEndArea("吉林");
goodsDto.setTransportType("水运");
goodsDto.setShipDate("2018-06-05");



// 险别信息
List<com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto> itemKindDtoList = new ArrayList<com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto>();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto1 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto2 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto3 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto();

com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto itemKindDto8 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargo.ItemKindDto();


itemKindDto8.setItemKindCode("0010");
itemKindDto8.setItemKindName("货运险主险");
itemKindDto8.setAmount("10000.0");
itemKindDto8.setPremium("5000");
itemKindDto8.setFlag("1");
itemKindDto8.setCurrency("CNY");
itemKindDto8.setRate("0.5");
itemKindDtoList.add(itemKindDto8);


itemKindDto.setItemKindCode("0021");
itemKindDto.setItemKindName("货运险附加险1");
itemKindDto.setAmount("71900.0");
itemKindDto.setPremium(".0000");
itemKindDto.setFlag("2");
itemKindDto.setCurrency("CNY");
itemKindDto.setRate("0.5");
itemKindDtoList.add(itemKindDto);

itemKindDto1.setItemKindCode("0022");
itemKindDto1.setItemKindName("货运险附加险2");
itemKindDto1.setAmount("71900.0");
itemKindDto1.setPremium(".0000");
itemKindDto1.setFlag("2");
itemKindDto1.setCurrency("CNY");
itemKindDto1.setRate("0.5");
itemKindDtoList.add(itemKindDto1);



//itemKindDto2.setItemKindCode("0023");
//itemKindDto2.setItemKindName("货运险附加险3");
//itemKindDto2.setAmount("71900.0");
//itemKindDto2.setPremium(".0000");
//itemKindDto2.setFlag("2");
//itemKindDto2.setCurrency("CNY");
//itemKindDto2.setRate("0.5");
//itemKindDtoList.add(itemKindDto2);
//
//
//itemKindDto3.setItemKindCode("0024");
//itemKindDto3.setItemKindName("货运险附加险3");
//itemKindDto3.setAmount("71900.0");
//itemKindDto3.setPremium(".0000");
//itemKindDto3.setFlag("2");
//itemKindDto3.setCurrency("CNY");
//itemKindDto3.setRate("0.5");
//itemKindDtoList.add(itemKindDto3);





CargoDto cargoDto = new CargoDto();
cargoDto.setMainDto(MainDto);
cargoDto.setApplicantDto(ApplicantDto);
cargoDto.setInsuredDto(insuredDto);
cargoDto.setEngageDto(engageDto);
cargoDto.setGoodsDto(goodsDto);
cargoDto.setItemKindDtoList(itemKindDtoList);

	return cargoDto;
}
	
	
	
	
	
public AgreementDto AgreementObject(){
	
	com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.MainDto MainDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.MainDto();//基本信息
	com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ApplicantDto ApplicantDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ApplicantDto();//投保人
	
	com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.GoodsDto goodsDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.GoodsDto();//货物信息
	
	

MainDto.setComCode("01010001");
MainDto.setComName("保险公司哈尔滨分公司");
MainDto.setClassCode("02");
MainDto.setClassName("货运险");
MainDto.setRiskCode("0201");
MainDto.setRiskName("国际货物进口运输险");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
MainDto.setInsureDate("2018-06-05");
MainDto.setSignDate("2018-06-05");
MainDto.setSumPremium("10000000.00");
MainDto.setSumAmount("20000.0");
MainDto.setArgueDel_Code("1");
MainDto.setArgueDel(null);
MainDto.setCurrencyAmount("CNY");
MainDto.setCurrencyPremium("CNY");
MainDto.setRate("10");
MainDto.setPlusRate("50");






ApplicantDto.setAppliCode("100000000159");
ApplicantDto.setAppliName("张三武");
ApplicantDto.setInsuredNature_Code("1");
ApplicantDto.setInsuredNature("个人");
ApplicantDto.setIdentifyType_code("01");
ApplicantDto.setIdentifyType("居民身份证");
ApplicantDto.setIdentifyNumber("230621198805120450");
ApplicantDto.setAge("29");
ApplicantDto.setInsuredIdentity("");
ApplicantDto.setSex_Code("1");
ApplicantDto.setSex("男");
ApplicantDto.setAppliAddress("黑龙江省大庆市");
ApplicantDto.setAppliPostCode("");
ApplicantDto.setAppliPhoneNumber("");
ApplicantDto.setAppliMobile("13936971987");


List<com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto> insuredDtoList = new ArrayList<com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto>();
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto insuredDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto();//被保险人
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto insuredDto8 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.InsuredDto();//被保险人

insuredDto.setInsuredCode("100000000158");
insuredDto.setInsuredName("张三武8");
insuredDto.setInsuredNature_Code("18");
insuredDto.setInsuredNature("个人8");
insuredDto.setIdentifyType_Code("08");
insuredDto.setIdentifyType("居民身份证8");
insuredDto.setIdentifyNumber("230621198805120458");
insuredDto.setAge("58");
insuredDto.setInsuredIdentity("");
insuredDto.setSex_Code("8");
insuredDto.setSex("男8");
insuredDto.setInsuredAddress("黑龙江省大庆市8");
insuredDto.setInsuredPostCode("");
insuredDto.setInsuredPhoneNumber("");
insuredDto.setInsuredMobile("13936971988");
insuredDtoList.add(insuredDto);


insuredDto8.setInsuredCode("100000000159");
insuredDto8.setInsuredName("张三武9");
insuredDto8.setInsuredNature_Code("19");
insuredDto8.setInsuredNature("个人9");
insuredDto8.setIdentifyType_Code("09");
insuredDto8.setIdentifyType("居民身份证9");
insuredDto8.setIdentifyNumber("230621198805120459");
insuredDto8.setAge("59");
insuredDto8.setInsuredIdentity("");
insuredDto8.setSex_Code("9");
insuredDto8.setSex("男9");
insuredDto8.setInsuredAddress("黑龙江省大庆市9");
insuredDto8.setInsuredPostCode("");
insuredDto8.setInsuredPhoneNumber("");
insuredDto8.setInsuredMobile("13936971989");
insuredDtoList.add(insuredDto8);

//com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.EngageDto engageDto = null;
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.EngageDto engageDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.EngageDto();//特约信息
engageDto.setClauseCode("T01001");
engageDto.setClauses("中意财产保险股份有限公司");



goodsDto.setGoodFlag("21");
goodsDto.setGoodTypeCode("A1");
goodsDto.setGoodTypeName("植物产品");
goodsDto.setPackingCode("01");
goodsDto.setPackingName("包");
goodsDto.setGoodName("石油");
goodsDto.setDeductibles("0.3");
goodsDto.setGoodSensitiveWords("");
goodsDto.setTransportType("水运");
goodsDto.setTransportCity("四川");



//险别信息
List<com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto> itemKindDtoList = new ArrayList<com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto>();
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto1 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto();
//com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto2 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto();
//com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto3 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto itemKindDto8 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.agreement.ItemKindDto();


itemKindDto8.setItemKindCode("00101");
itemKindDto8.setItemKindName("货运险主险");
itemKindDto8.setAmount("10000.0");
itemKindDto8.setPremium("5000");
itemKindDto8.setFlag("1");
itemKindDto8.setCurrency("CNY");
itemKindDto8.setRate("0.5");
itemKindDtoList.add(itemKindDto8);


itemKindDto.setItemKindCode("0021");
itemKindDto.setItemKindName("货运险附加险1");
itemKindDto.setAmount("71900.0");
itemKindDto.setPremium(".0000");
itemKindDto.setFlag("2");
itemKindDto.setCurrency("CNY");
itemKindDto.setRate("0.5");
itemKindDtoList.add(itemKindDto);

itemKindDto1.setItemKindCode("0022");
itemKindDto1.setItemKindName("货运险附加险2");
itemKindDto1.setAmount("71900.0");
itemKindDto1.setPremium(".0000");
itemKindDto1.setFlag("2");
itemKindDto1.setCurrency("CNY");
itemKindDto1.setRate("0.5");
itemKindDtoList.add(itemKindDto1);



	
AgreementDto agreementDto = new AgreementDto();
agreementDto.setMainDto(MainDto);
agreementDto.setApplicantDto(ApplicantDto);
agreementDto.setInsuredDtoList(insuredDtoList);
agreementDto.setEngageDto(engageDto);
agreementDto.setGoodsDto(goodsDto);
agreementDto.setItemKindDtoList(itemKindDtoList);


	return agreementDto;
}






public CargoPheadDto CargoPheadObject(){
	
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.MainDto MainDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.MainDto();//基本信息
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ApplicantDto ApplicantDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ApplicantDto();//投保人
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.InsuredDto insuredDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.InsuredDto();//被保险人
	
	com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.GoodsDto goodsDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.GoodsDto();//货物信息
	
	

MainDto.setComCode("01010001");
MainDto.setComName("保险公司哈尔滨分公司");
MainDto.setClassCode("02");
MainDto.setClassName("货运险");
MainDto.setRiskCode("0201");
MainDto.setRiskName("国际货物进口运输险");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
MainDto.setInsureDate("2018-06-05");
MainDto.setSignDate("2018-06-05");
MainDto.setSumPremium("10000000.00");
MainDto.setSumAmount("20000.0");
MainDto.setArgueDel_Code("1");
MainDto.setArgueDel(null);
MainDto.setCurrencyAmount("CNY");
MainDto.setCurrencyPremium("CNY");
MainDto.setRate("10");
MainDto.setPlusRate("20");
MainDto.setCreateDate("2018-06-05");



ApplicantDto.setAppliCode("100000000159");
ApplicantDto.setAppliName("张三武");
ApplicantDto.setInsuredNature_Code("1");
ApplicantDto.setInsuredNature("个人");
ApplicantDto.setIdentifyType_code("01");
ApplicantDto.setIdentifyType("居民身份证");
ApplicantDto.setIdentifyNumber("230621198805120450");
ApplicantDto.setAge("29");
ApplicantDto.setInsuredIdentity("");
ApplicantDto.setSex_Code("1");
ApplicantDto.setSex("男");
ApplicantDto.setAppliAddress("黑龙江省大庆市");
ApplicantDto.setAppliPostCode("");
ApplicantDto.setAppliPhoneNumber("");
ApplicantDto.setAppliMobile("13936971987");


insuredDto.setInsuredCode("100000000158");
insuredDto.setInsuredName("张三武8");
insuredDto.setInsuredNature_Code("18");
insuredDto.setInsuredNature("个人8");
insuredDto.setIdentifyType_Code("08");
insuredDto.setIdentifyType("居民身份证8");
insuredDto.setIdentifyNumber("230621198805120458");
insuredDto.setAge("58");
insuredDto.setInsuredIdentity("");
insuredDto.setSex_Code("8");
insuredDto.setSex("男8");
insuredDto.setInsuredAddress("黑龙江省大庆市8");
insuredDto.setInsuredPostCode("");
insuredDto.setInsuredPhoneNumber("");
insuredDto.setInsuredMobile("13936971988");


com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.EngageDto engageDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.EngageDto();//特约信息
engageDto.setClauseCode("T01001");
engageDto.setClauses("中意财产保险股份有限公司");



goodsDto.setGoodFlag("21");
goodsDto.setGoodTypeCode("A1");
goodsDto.setGoodTypeName("植物产品");
goodsDto.setPackingCode("01");
goodsDto.setPackingName("包");
goodsDto.setGoodName("石油");
goodsDto.setDeductibles("0.3");
goodsDto.setPackingQuantity("20");
goodsDto.setStartArea("北京");
goodsDto.setRouteArea("辽宁");
goodsDto.setEndArea("吉林");
goodsDto.setTransportType("水运");
goodsDto.setShipDate("2018-06-05");



//险别信息
List<com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto> itemKindDtoList = new ArrayList<com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto>();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto itemKindDto = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto();
com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto itemKindDto1 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto();

com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto itemKindDto8 = new com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead.ItemKindDto();


itemKindDto8.setItemKindCode("00101");
itemKindDto8.setItemKindName("货运险主险");
itemKindDto8.setAmount("10000.0");
itemKindDto8.setPremium("5000");
itemKindDto8.setFlag("1");
itemKindDto8.setCurrency("CNY");
itemKindDto8.setRate("0.5");
itemKindDtoList.add(itemKindDto8);


itemKindDto.setItemKindCode("0021");
itemKindDto.setItemKindName("货运险附加险1");
itemKindDto.setAmount("71900.0");
itemKindDto.setPremium(".0000");
itemKindDto.setFlag("2");
itemKindDto.setCurrency("CNY");
itemKindDto.setRate("0.5");
itemKindDtoList.add(itemKindDto);

itemKindDto1.setItemKindCode("0022");
itemKindDto1.setItemKindName("货运险附加险2");
itemKindDto1.setAmount("71900.0");
itemKindDto1.setPremium(".0000");
itemKindDto1.setFlag("2");
itemKindDto1.setCurrency("CNY");
itemKindDto1.setRate("0.5");
itemKindDtoList.add(itemKindDto1);



CargoPheadDto cargoPheadDto = new CargoPheadDto();

cargoPheadDto.setMainDto(MainDto);
cargoPheadDto.setApplicantDto(ApplicantDto);
cargoPheadDto.setInsuredDto(insuredDto);
cargoPheadDto.setEngageDto(engageDto);
cargoPheadDto.setGoodsDto(goodsDto);
cargoPheadDto.setItemKindDtoList(itemKindDtoList);
//CargoPheadDto cargoPheadDto =null;

	return cargoPheadDto;
}
	
}
