package com.sinosoft.ilogrule.restfulService.client;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.prpcarDto.ApplicantDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.InsuredDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.MainDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.OtherDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.PrpCarInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.VehicleDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.VehicleOwnerDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.PrpCarResultDto;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;


public class PrpCarRuleQuery {
	
	public PrpCarResultDto prpcarRuleQuery(PrpCarInputDto requestBody) throws Exception {
		
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		
		MultivaluedMap<String, String> responseHeaders = null;
		PrpCarResultDto responseBody = null;
		try {

			// 获取URL
			//String url = "http://7.10.146.3:8758/IlogRuleService/rest/PrpcarRuleRestfulService/prpcarRule";
			String url = "http://192.168.1.100:7015/IlogRuleService/rest/PrpcarRuleRestfulService/prpcarRule";
			System.out.println("调用接口URL==="+url);
			//获取连接超时时间		
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "PrpcarRuleRestfulService";
			String ORISYS = "prpcar";
			String MTDNAME = "prpcarRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(PrpCarResultDto.class);
			// 处理返回头信息
			DealHeadInfo.dealResponseHeader(responseHeaders, responseBody);
			
			
			
			
//			PrpCarInputDto prpcarInputDto = new PrpCarInputDto(); 

//			prpcarInputDto = organizeObjectNew();
//			Builder builder = DealHeadInfo.orgnizeClient(prpcarInputDto, headRequest,url, limitQueryName);
//			ClientResponse clientResponse = builder.post(ClientResponse.class,prpcarInputDto);
//			responseBody = clientResponse.getEntity(PrpCarResultDto.class);
//			System.out.println("*******" + responseBody.toString());

		} catch (RuntimeException e) {
			Status = "2";
			errorObj = e;
			throw e;
		}finally {
			// 存储日志
			
		}
		return responseBody;
	}

public PrpCarInputDto organizeObject() {
		
		MainDto MainDto = new MainDto();//基本信息
		ApplicantDto ApplicantDto = new ApplicantDto();//投保人
		InsuredDto insuredDto = new InsuredDto();//被保险人
		VehicleDto vehicleDto = new VehicleDto();//车辆信息
		VehicleOwnerDto vehicleOwnerDto = new VehicleOwnerDto();//车主信息
		OtherDto otherDto = new OtherDto();//其他信息
		
		
		

//MainDto.setProposalNo("");
MainDto.setModeCode("经纪业务");
MainDto.setPolicyType_Code("1");
MainDto.setPolicyType("个单");
MainDto.setRenewalFlag_Code("0");
MainDto.setRenewalFlag("续保");
MainDto.setComCode("06010001");
MainDto.setComName("保险公司哈尔滨分公司");
MainDto.setAgentCode("二十一世纪保险经纪有限公司陕西分公司");
MainDto.setBusinessNature_Code("19001");
MainDto.setBusinessNature("经纪业务");
//MainDto.setAgentName(null);
//MainDto.setFxqFlag("1");
//MainDto.setProdFlag("1");
MainDto.setClassCode("D");
MainDto.setRiskCode("DDB");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
//MainDto.setInsureDate("2018-06-05");
//MainDto.setSignDate("2018-06-05");
//MainDto.setOprTm("2018-06-05");
//MainDto.settInsrncDay("364");
MainDto.setRenewalYears("1");
//MainDto.setBeforePrem("3414.00");
//MainDto.setEntireDiscount("0");
//MainDto.setAfterPrem("0");
//MainDto.setSumAmount("371900.0");
//MainDto.setArgueDel_Code("1");
////MainDto.setArgueDel(null);
//MainDto.setInformContent("");
//MainDto.setIsTimelyEffective("");
//MainDto.setEngageContext("");
//MainDto.setBusinessType1("00");
//MainDto.setPolicySort("0");
//MainDto.setCurrency("");
//MainDto.setPayTimes("0");
//MainDto.setCoinsFlag("");
//MainDto.setReinsFlag("");
//MainDto.setCoinsUranceFlag("");
//MainDto.setCoinsLinkFlag("");
//MainDto.setStopTimes("0");
MainDto.setqCellCore("230200");
MainDto.setSumQuantity("1");
MainDto.setIsCorrelation("否"); //是否关联单
MainDto.setHandler_Code("88000157");
MainDto.setHandlerName("张三");
//MainDto.setAttributeA("");
//MainDto.setAttributeB("");
//MainDto.setAttributeC("");
//MainDto.setAttributeD("");
//MainDto.setAttributeE("");
//MainDto.setAttributeF("");


ApplicantDto.setAppliCode("100000000159");
ApplicantDto.setAppliName("张三武");
//ApplicantDto.setInsuredNature_Code("1");
//ApplicantDto.setInsuredNature("自然人");
//ApplicantDto.setAppliTrade_Code("0");
//ApplicantDto.setAppliTrade("低");
//ApplicantDto.setIdentifyType_code("01");
//ApplicantDto.setIdentifyType("居民身份证");
//ApplicantDto.setIdentifyNumber("230621198805120450");
//ApplicantDto.setAge("29");
//ApplicantDto.setAppliAddress("黑龙江省大庆市");
//ApplicantDto.setOccupationName("");
//ApplicantDto.setMarriage("");
//ApplicantDto.setCreditLevel("");
//ApplicantDto.setInsuredIdentity("");
//ApplicantDto.setEducationCode("");
//ApplicantDto.setSex_Code("1");
//ApplicantDto.setSex("男");
//ApplicantDto.setVipFlag("0");
//ApplicantDto.setLinkerName("张三武");
//ApplicantDto.setLinkerAddress("成都");
//ApplicantDto.setLinkerPostCode("");
//ApplicantDto.setLinkerPhoneNumber("");
//ApplicantDto.setLinkerMobile("13936971987");
//ApplicantDto.setIsBlacklist("");
ApplicantDto.setCustomerChannel_Code("2");
ApplicantDto.setCustomerChannel("中石油员工");
//ApplicantDto.setAttributeA("");
//ApplicantDto.setAttributeB("");
//ApplicantDto.setAttributeC("");
//ApplicantDto.setAttributeD("");
//ApplicantDto.setAttributeE("");
//ApplicantDto.setAttributeF("");


insuredDto.setInsuredCode("100000000159");
insuredDto.setInsuredName("张三武");
//insuredDto.setInsuredNature_Code("1");
//insuredDto.setInsuredNature("自然人");
//insuredDto.setInsuredTrade_Code("0");
//insuredDto.setInsuredTrade("低");
//insuredDto.setIdentifyType_Code("01");
//insuredDto.setIdentifyType("居民身份证");
//insuredDto.setIdentifyNumber("230621198805120450");
insuredDto.setAge("55");
//insuredDto.setInsuredAddress("黑龙江省大庆市");
//insuredDto.setOccupationName("");
//insuredDto.setMarriage("");
//insuredDto.setCreditLevel("");
//insuredDto.setInsuredIdentity("");
//insuredDto.setEducationCode("");
insuredDto.setSex_Code("1");
insuredDto.setSex("男");
//insuredDto.setVipFlag("0");
//insuredDto.setLinkerName("张三武");
//insuredDto.setLinkerAddress("成都");
//insuredDto.setLinkerPostCode("");
//insuredDto.setLinkerPhoneNumber("");
//insuredDto.setLinkerMobile("13936971987");
//insuredDto.setIsBlacklist("");
//insuredDto.setAttributeA("");
//insuredDto.setAttributeB("");
//insuredDto.setAttributeC("");
//insuredDto.setAttributeD("");
//insuredDto.setAttributeE("");
//insuredDto.setAttributeF("");


vehicleDto.setVehicleBrandCode("ADA0");
vehicleDto.setVehicleBrandName("上汽大众");
vehicleDto.setSeriesCode("ADA0AB32");
vehicleDto.setSeriesName("波罗");
vehicleDto.setBrandCode("DZAAKD0102");
vehicleDto.setBrandName("大众汽车SVW71411AR轿车");
//vehicleDto.setEcdemicMrk_Code("0");
//vehicleDto.setEcdemicMrk("否");


vehicleDto.setUsenatureCode("35113001");
vehicleDto.setUsenatureName("企业非营业客车");
//vehicleDto.setBusinessClassCode("35112002");
//vehicleDto.setBusinessClassName("非营业");
//vehicleDto.setSeatCount("5");
vehicleDto.setVehiclesType_Code("345002001");
vehicleDto.setVehiclesType("六座以下客车");
vehicleDto.setTransferFlag_Code("0");
vehicleDto.setTransferFlag("否");
vehicleDto.setIsOneCard("否");
//vehicleDto.setHfName_Code(null);
//vehicleDto.setHfName(null);
//vehicleDto.setLicenseNo("J346DFHG");
//
//
//vehicleDto.setTaxType(null);
//vehicleDto.setBuyDate("");
//vehicleDto.setCertificateDate("2018-06-01");
vehicleDto.setEnrollDate("2018-06-01");
//vehicleDto.setRunMiles("0");
vehicleDto.setIsImportCar("进口");
//vehicleDto.setFuelType_Code("352001");
//vehicleDto.setFuelType("汽油");
//vehicleDto.setIsRefit_Code("0");
//
//
//vehicleDto.setIsRefit("否");
//vehicleDto.setCarCode("BSHCBMUB0007");
//vehicleDto.setPurchasePrice("71900.00");
vehicleDto.setCarAge("5");
//vehicleDto.setEngineNum("TGDFH4645");
//vehicleDto.setFrmNo("SDTGDFHGFJ346DFHG");
//vehicleDto.setRiskLevel(null);
vehicleDto.setIsNewCar_Code("0");
vehicleDto.setIsNewCar("否");
vehicleDto.setSpecialType_Code("1");
vehicleDto.setSpecialType("稀有车型");
vehicleDto.setSpecialValue("1.15");
//vehicleDto.setActualValue("71900.0");
//vehicleDto.setActualFloatRatioValue("100.00");
//vehicleDto.setIsConserveEnergy("");
vehicleDto.setnDisplacement("1.40");
//vehicleDto.setIsInsuredLocally("");
//vehicleDto.setIsBlacklist("");
//vehicleDto.setIsHighRiskCar("");
//vehicleDto.setIsEasyStealCar("");
//vehicleDto.setIsMicroFacetCar("");
vehicleDto.setCarAgeLevel_Code("0");
vehicleDto.setCarAgeLevel("10.9");
vehicleDto.setLoanFlag("否");
vehicleDto.setCarKindCode("A0");
vehicleDto.setCarKindName("客车");
vehicleDto.setVehiclesClass("轿车类");
vehicleDto.setVehiclesClass_Code("1");


vehicleOwnerDto.setOwnerName("张三武");
//vehicleOwnerDto.setOwnerType_Code("1");
//vehicleOwnerDto.setOwnerType("自然人");
//vehicleOwnerDto.setOwnerIdentifyNumber("230621198805120450");
//vehicleOwnerDto.setOwnerSex_Code("1");
//vehicleOwnerDto.setOwnerSex("男");



// 险别信息
List<ItemKindDto> itemKindDtoList = new ArrayList<ItemKindDto>();
ItemKindDto itemKindDto = new ItemKindDto();
ItemKindDto itemKindDto1 = new ItemKindDto();
ItemKindDto itemKindDto2 = new ItemKindDto();
ItemKindDto itemKindDto3 = new ItemKindDto();
ItemKindDto itemKindDto4 = new ItemKindDto();
ItemKindDto itemKindDto5 = new ItemKindDto();
ItemKindDto itemKindDto6 = new ItemKindDto();
ItemKindDto itemKindDto7 = new ItemKindDto();
ItemKindDto itemKindDto8 = new ItemKindDto();


itemKindDto8.setItemKindCode("BZ");
itemKindDto8.setItemKindName("机动车辆交通事故强制责任保险");
itemKindDto8.setAmount("10000.0");
itemKindDtoList.add(itemKindDto8);


//itemKindDto.setItemKindCode("A");
//itemKindDto.setItemKindName("机动车损失保险");
//itemKindDto.setAmount("71900.0");
//itemKindDto.setPremium(".0000");
//itemKindDto.setLastAccient("");
//itemKindDto.setFlag("1");
//itemKindDto.setIsHomemadeGlass("");
//itemKindDto.setEveryLimitFee("");
//itemKindDto.setBenchMarkPremium("1784.00");
//itemKindDtoList.add(itemKindDto);



//itemKindDto1.setItemKindCode("B");
//itemKindDto1.setItemKindName("机动车第三者责任保险");
//itemKindDto1.setAmount("300000.0");
//itemKindDto1.setPremium(".0000");
//itemKindDto1.setLastAccient("");
//itemKindDto1.setFlag("1");
//itemKindDto1.setIsHomemadeGlass("");
//itemKindDto1.setEveryLimitFee("");
//itemKindDto1.setBenchMarkPremium("1630.00");


itemKindDto1.setItemKindCode("G");
itemKindDto1.setItemKindName("全车盗抢险");
itemKindDto1.setAmount("300000.0");
itemKindDtoList.add(itemKindDto1);
//
//
//itemKindDto2.setItemKindCode("F");
//itemKindDto2.setItemKindName("玻璃单独破碎险");
//itemKindDto2.setAmount("3000.0");
//itemKindDtoList.add(itemKindDto2);
//
//
//itemKindDto3.setItemKindCode("D3");
//itemKindDto3.setItemKindName("车上人员责任险-司机座位");
//itemKindDto3.setAmount("20000.0");
//itemKindDtoList.add(itemKindDto3);
////
//itemKindDto4.setItemKindCode("D4");
//itemKindDto4.setItemKindName("车上人员责任险-乘客座位");
//itemKindDto4.setAmount("10000.0");
//itemKindDtoList.add(itemKindDto4);
//
//
//itemKindDto5.setItemKindCode("MA");
//itemKindDto5.setItemKindName("不计免赔率特约险（车损）");
//itemKindDto5.setAmount("0");
//itemKindDtoList.add(itemKindDto5);
//
//
//itemKindDto6.setItemKindCode("B");
//itemKindDto6.setItemKindName("第三者责任保险");
//itemKindDto6.setAmount("300000");
//itemKindDtoList.add(itemKindDto6);


//itemKindDto7.setItemKindCode("L");
//itemKindDto7.setItemKindName("车身划痕损失险");
//itemKindDto7.setAmount("2000");
//itemKindDtoList.add(itemKindDto7);


otherDto.setIsInsureExcept("否");
otherDto.setClaimAdjustValue("0.6");
otherDto.setIllegalTrafficValue("1.0");
otherDto.setTrafficNCDPremium("0");
otherDto.setBusinessNCDPremium("2555.05");
otherDto.setTrafficNCD1Value("1.0");
otherDto.setTrafficNCD2("A_B");
otherDto.setUpBusinessNCD("E1");
otherDto.setBusinessNCD2("C_X");
otherDto.setLastLossNumber("5");
//otherDto.setUploadTransferFlag("");
otherDto.setNonfloatingCauseNCD("03");
otherDto.setAutoBusiness("1.2505");
//otherDto.setAttributeA("");
//otherDto.setAttributeB("");
//otherDto.setAttributeC("");
//otherDto.setAttributeD("");
//otherDto.setAttributeE("");
//otherDto.setAttributeF("");
//otherDto.setLastEndDate("2018-05-31");
//otherDto.setLastItemkind("123123");
		
		
	
		
		
		PrpCarInputDto  prpCarInputDto = new PrpCarInputDto();
		prpCarInputDto.setApplicantDto(ApplicantDto);
		prpCarInputDto.setInsuredDto(insuredDto);
		prpCarInputDto.setItemKindDtoList(itemKindDtoList);
		prpCarInputDto.setMainDto(MainDto);
		prpCarInputDto.setOtherDto(otherDto);
		prpCarInputDto.setVehicleDto(vehicleDto);
		prpCarInputDto.setVehicleOwnerDto(vehicleOwnerDto);
		
		return prpCarInputDto;
	}
	
//精算定价测试使用
public PrpCarInputDto organizeObject1() {
	
	MainDto MainDto = new MainDto();//基本信息
	ApplicantDto ApplicantDto = new ApplicantDto();//投保人
	InsuredDto insuredDto = new InsuredDto();//被保险人
	VehicleDto vehicleDto = new VehicleDto();//车辆信息
	VehicleOwnerDto vehicleOwnerDto = new VehicleOwnerDto();//车主信息
	OtherDto otherDto = new OtherDto();//其他信息
	
	
	

//MainDto.setProposalNo("");
//MainDto.setModeCode("191001");
//MainDto.setPolicyType_Code("1");
//MainDto.setPolicyType("个单");
MainDto.setRenewalFlag_Code("0");
MainDto.setRenewalFlag("新保");
MainDto.setComCode("0101");
MainDto.setComName("保险公司哈尔滨分公司");
//MainDto.setAgentCode("");
//MainDto.setAgentName(null);
//MainDto.setFxqFlag("1");
//MainDto.setProdFlag("1");
MainDto.setClassCode("D");
MainDto.setRiskCode("DDA");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
//MainDto.setInsureDate("2018-06-05");
//MainDto.setSignDate("2018-06-05");
//MainDto.setOprTm("2018-06-05");
//MainDto.settInsrncDay("364");
MainDto.setRenewalYears("0");
//MainDto.setBeforePrem("3414.00");
//MainDto.setEntireDiscount("0");
//MainDto.setAfterPrem("0");
//MainDto.setSumAmount("371900.0");
//MainDto.setArgueDel_Code("1");
////MainDto.setArgueDel(null);
//MainDto.setInformContent("");
//MainDto.setIsTimelyEffective("");
//MainDto.setEngageContext("");
//MainDto.setBusinessType1("00");
//MainDto.setPolicySort("0");
MainDto.setBusinessNature_Code("19001");
MainDto.setBusinessNature("直销业务");
//MainDto.setCurrency("");
//MainDto.setPayTimes("0");
//MainDto.setCoinsFlag("");
//MainDto.setReinsFlag("");
//MainDto.setCoinsUranceFlag("");
//MainDto.setCoinsLinkFlag("");
//MainDto.setStopTimes("0");
MainDto.setqCellCore("230200");
MainDto.setSumQuantity("0");
MainDto.setIsCorrelation("是"); //是否关联单
MainDto.setHandler_Code("11598654");
MainDto.setHandlerName("张三");
//MainDto.setAttributeA("");
//MainDto.setAttributeB("");
//MainDto.setAttributeC("");
//MainDto.setAttributeD("");
//MainDto.setAttributeE("");
//MainDto.setAttributeF("");


//ApplicantDto.setAppliCode("100000000159");
//ApplicantDto.setAppliName("张三武");
//ApplicantDto.setInsuredNature_Code("1");
//ApplicantDto.setInsuredNature("自然人");
//ApplicantDto.setAppliTrade_Code("0");
//ApplicantDto.setAppliTrade("低");
//ApplicantDto.setIdentifyType_code("01");
//ApplicantDto.setIdentifyType("居民身份证");
//ApplicantDto.setIdentifyNumber("230621198805120450");
//ApplicantDto.setAge("29");
//ApplicantDto.setAppliAddress("黑龙江省大庆市");
//ApplicantDto.setOccupationName("");
//ApplicantDto.setMarriage("");
//ApplicantDto.setCreditLevel("");
//ApplicantDto.setInsuredIdentity("");
//ApplicantDto.setEducationCode("");
//ApplicantDto.setSex_Code("1");
//ApplicantDto.setSex("男");
//ApplicantDto.setVipFlag("0");
//ApplicantDto.setLinkerName("张三武");
//ApplicantDto.setLinkerAddress("成都");
//ApplicantDto.setLinkerPostCode("");
//ApplicantDto.setLinkerPhoneNumber("");
//ApplicantDto.setLinkerMobile("13936971987");
//ApplicantDto.setIsBlacklist("");
ApplicantDto.setCustomerChannel_Code("2");
ApplicantDto.setCustomerChannel("中石油员工");
//ApplicantDto.setAttributeA("");
//ApplicantDto.setAttributeB("");
//ApplicantDto.setAttributeC("");
//ApplicantDto.setAttributeD("");
//ApplicantDto.setAttributeE("");
//ApplicantDto.setAttributeF("");


//insuredDto.setInsuredCode("100000000159");
//insuredDto.setInsuredName("张三武");
//insuredDto.setInsuredNature_Code("1");
//insuredDto.setInsuredNature("自然人");
//insuredDto.setInsuredTrade_Code("0");
//insuredDto.setInsuredTrade("低");
//insuredDto.setIdentifyType_Code("01");
//insuredDto.setIdentifyType("居民身份证");
//insuredDto.setIdentifyNumber("230621198805120450");
insuredDto.setAge("29");
//insuredDto.setInsuredAddress("黑龙江省大庆市");
//insuredDto.setOccupationName("");
//insuredDto.setMarriage("");
//insuredDto.setCreditLevel("");
//insuredDto.setInsuredIdentity("");
//insuredDto.setEducationCode("");
insuredDto.setSex_Code("1");
insuredDto.setSex("男");
//insuredDto.setVipFlag("0");
//insuredDto.setLinkerName("张三武");
//insuredDto.setLinkerAddress("成都");
//insuredDto.setLinkerPostCode("");
//insuredDto.setLinkerPhoneNumber("");
//insuredDto.setLinkerMobile("13936971987");
//insuredDto.setIsBlacklist("");
//insuredDto.setAttributeA("");
//insuredDto.setAttributeB("");
//insuredDto.setAttributeC("");
//insuredDto.setAttributeD("");
//insuredDto.setAttributeE("");
//insuredDto.setAttributeF("");


vehicleDto.setVehicleBrandCode("ADA0");
vehicleDto.setVehicleBrandName("上汽大众");
vehicleDto.setSeriesCode("ADA0AB32");
vehicleDto.setSeriesName("波罗");
vehicleDto.setBrandCode("DZAAKD0102");
vehicleDto.setBrandName("大众汽车SVW71411AR轿车");
//vehicleDto.setEcdemicMrk_Code("0");
//vehicleDto.setEcdemicMrk("否");


vehicleDto.setUsenatureCode("35113001");
vehicleDto.setUsenatureName("家庭自用车");
//vehicleDto.setBusinessClassCode("35112002");
//vehicleDto.setBusinessClassName("非营业");
//vehicleDto.setSeatCount("5");
vehicleDto.setVehiclesType_Code("345002001");
vehicleDto.setVehiclesType("六座以下客车");
vehicleDto.setTransferFlag_Code("0");
vehicleDto.setTransferFlag("否");
vehicleDto.setIsOneCard("否");
//vehicleDto.setHfName_Code(null);
//vehicleDto.setHfName(null);
//vehicleDto.setLicenseNo("J346DFHG");
//
//
//vehicleDto.setTaxType(null);
//vehicleDto.setBuyDate("");
//vehicleDto.setCertificateDate("2018-06-01");
vehicleDto.setEnrollDate("2018-06-01");
//vehicleDto.setRunMiles("0");
vehicleDto.setIsImportCar("进口");
//vehicleDto.setFuelType_Code("352001");
//vehicleDto.setFuelType("汽油");
//vehicleDto.setIsRefit_Code("0");
//
//
//vehicleDto.setIsRefit("否");
//vehicleDto.setCarCode("BSHCBMUB0007");
//vehicleDto.setPurchasePrice("71900.00");
vehicleDto.setCarAge("0.8");
//vehicleDto.setEngineNum("TGDFH4645");
//vehicleDto.setFrmNo("SDTGDFHGFJ346DFHG");
//vehicleDto.setRiskLevel(null);
vehicleDto.setIsNewCar_Code("0");
vehicleDto.setIsNewCar("否");
vehicleDto.setSpecialType_Code("1");
vehicleDto.setSpecialType("稀有车型");
vehicleDto.setSpecialValue("1.15");
//vehicleDto.setActualValue("71900.0");
//vehicleDto.setActualFloatRatioValue("100.00");
//vehicleDto.setIsConserveEnergy("");
vehicleDto.setnDisplacement("1.40");
//vehicleDto.setIsInsuredLocally("");
//vehicleDto.setIsBlacklist("");
//vehicleDto.setIsHighRiskCar("");
//vehicleDto.setIsEasyStealCar("");
//vehicleDto.setIsMicroFacetCar("");
vehicleDto.setCarAgeLevel_Code("0");
vehicleDto.setCarAgeLevel("10.9");
vehicleDto.setLoanFlag("否");
vehicleDto.setCarKindCode("A0");
vehicleDto.setCarKindName("客车");
vehicleDto.setVehiclesClass("轿车类");
vehicleDto.setVehiclesClass_Code("1");


//vehicleOwnerDto.setOwnerName("张三武");
//vehicleOwnerDto.setOwnerType_Code("1");
//vehicleOwnerDto.setOwnerType("自然人");
//vehicleOwnerDto.setOwnerIdentifyNumber("230621198805120450");
//vehicleOwnerDto.setOwnerSex_Code("1");
//vehicleOwnerDto.setOwnerSex("男");



//险别信息
List<ItemKindDto> itemKindDtoList = new ArrayList<ItemKindDto>();
ItemKindDto itemKindDto = new ItemKindDto();
ItemKindDto itemKindDto1 = new ItemKindDto();
ItemKindDto itemKindDto2 = new ItemKindDto();
ItemKindDto itemKindDto3 = new ItemKindDto();
ItemKindDto itemKindDto4 = new ItemKindDto();
ItemKindDto itemKindDto5 = new ItemKindDto();
ItemKindDto itemKindDto6 = new ItemKindDto();
ItemKindDto itemKindDto7 = new ItemKindDto();

//itemKindDto.setItemKindCode("A");
//itemKindDto.setItemKindName("机动车损失保险");
//itemKindDto.setAmount("71900.0");
//itemKindDto.setPremium(".0000");
//itemKindDto.setLastAccient("");
//itemKindDto.setFlag("1");
//itemKindDto.setIsHomemadeGlass("");
//itemKindDto.setEveryLimitFee("");
//itemKindDto.setBenchMarkPremium("1784.00");
//itemKindDtoList.add(itemKindDto);
//itemKindDto1.setItemKindCode("B");
//itemKindDto1.setItemKindName("机动车第三者责任保险");
//itemKindDto1.setAmount("300000.0");
//itemKindDto1.setPremium(".0000");
//itemKindDto1.setLastAccient("");
//itemKindDto1.setFlag("1");
//itemKindDto1.setIsHomemadeGlass("");
//itemKindDto1.setEveryLimitFee("");
//itemKindDto1.setBenchMarkPremium("1630.00");


itemKindDto1.setItemKindCode("G");
itemKindDto1.setItemKindName("全车盗抢险");
itemKindDto1.setAmount("300000.0");
itemKindDtoList.add(itemKindDto1);
//
//
//itemKindDto2.setItemKindCode("F");
//itemKindDto2.setItemKindName("玻璃单独破碎险");
//itemKindDto2.setAmount("3000.0");
//itemKindDtoList.add(itemKindDto2);
//
//
//itemKindDto3.setItemKindCode("D3");
//itemKindDto3.setItemKindName("车上人员责任险-司机座位");
//itemKindDto3.setAmount("20000.0");
//itemKindDtoList.add(itemKindDto3);
//
itemKindDto4.setItemKindCode("D4");
itemKindDto4.setItemKindName("车上人员责任险-乘客座位");
itemKindDto4.setAmount("10000.0");
itemKindDtoList.add(itemKindDto4);


//itemKindDto5.setItemKindCode("MA");
//itemKindDto5.setItemKindName("不计免赔率特约险（车损）");
//itemKindDto5.setAmount("0");
//itemKindDtoList.add(itemKindDto5);


//itemKindDto6.setItemKindCode("B");
//itemKindDto6.setItemKindName("第三者责任保险");
//itemKindDto6.setAmount("300000");
//itemKindDtoList.add(itemKindDto6);


//itemKindDto7.setItemKindCode("L");
//itemKindDto7.setItemKindName("车身划痕损失险");
//itemKindDto7.setAmount("2000");
//itemKindDtoList.add(itemKindDto7);


otherDto.setIsInsureExcept("否");
otherDto.setClaimAdjustValue("1.25");
otherDto.setIllegalTrafficValue("1.0");
otherDto.setTrafficNCDPremium("0");
otherDto.setBusinessNCDPremium("2555.05");
otherDto.setTrafficNCD1Value("1.0");
otherDto.setTrafficNCD2("A_B");
otherDto.setUpBusinessNCD("E1");
otherDto.setBusinessNCD2("C_X");
otherDto.setLastLossNumber("0");
//otherDto.setUploadTransferFlag("");
otherDto.setNonfloatingCauseNCD("03");
//otherDto.setAutoBusiness("1.0000");
//otherDto.setAttributeA("");
//otherDto.setAttributeB("");
//otherDto.setAttributeC("");
//otherDto.setAttributeD("");
//otherDto.setAttributeE("");
//otherDto.setAttributeF("");
//otherDto.setLastEndDate("2018-05-31");
//otherDto.setLastItemkind("123123");
	
	

	
	
	PrpCarInputDto  prpCarInputDto = new PrpCarInputDto();
	prpCarInputDto.setApplicantDto(ApplicantDto);
	prpCarInputDto.setInsuredDto(insuredDto);
	prpCarInputDto.setItemKindDtoList(itemKindDtoList);
	prpCarInputDto.setMainDto(MainDto);
	prpCarInputDto.setOtherDto(otherDto);
	prpCarInputDto.setVehicleDto(vehicleDto);
	prpCarInputDto.setVehicleOwnerDto(vehicleOwnerDto);
	
	return prpCarInputDto;
}
}
