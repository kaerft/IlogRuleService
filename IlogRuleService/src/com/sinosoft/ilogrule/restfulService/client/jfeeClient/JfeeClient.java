package com.sinosoft.ilogrule.restfulService.client.jfeeClient;


import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.ApplicantDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.InsuredDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.MainDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PlanDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeResultDto;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;


public class JfeeClient {
	
	public PrpallJfeeResultDto prpallJfeeRule(PrpallJfeeInputDto requestBody) throws Exception {
		
		MultivaluedMap<String, String> responseHeaders = null;
		PrpallJfeeResultDto responseBody = null;
		try {

			// 获取URL
			String url = "http://192.168.8.105:8758/IlogRuleService/rest/PrpallJfeeRuleRestfulService/prpallJfeeRule";
//			String url = "http://192.168.1.100:7015/IlogRuleService/rest/PrpallJfeeRuleRestfulService/prpallJfeeRule";
			System.out.println("调用接口URL==="+url);
			//获取连接超时时间		
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "PrpallJfeeRuleRestfulService";
			String ORISYS = "prpall";
			String MTDNAME = "prpallJfeeRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(PrpallJfeeResultDto.class);
			// 处理返回头信息
			DealHeadInfo.dealResponseHeader(responseHeaders, responseBody);
			
		} catch (RuntimeException e) {
			throw e;
		}finally {
			// 存储日志
			
		}
		return responseBody;
	}

public PrpallJfeeInputDto organizeObject() {
		
		MainDto MainDto = new MainDto();//基本信息
		ApplicantDto ApplicantDto = new ApplicantDto();//投保人
		InsuredDto insuredDto = new InsuredDto();//被保险人
		
		
MainDto.setProEndorseType("批单");
//MainDto.setProposalNo("");
MainDto.setModeCode("经纪业务");
//MainDto.setPolicyType_Code("1");
//MainDto.setPolicyType("个单");
MainDto.setRenewalFlag_Code("0");
MainDto.setRenewalFlag("续保");
MainDto.setComCode("01010001");
MainDto.setComName("保险公司哈尔滨分公司");
//MainDto.setAgentCode("二十一世纪保险经纪有限公司陕西分公司");
MainDto.setBusinessNature_Code("19001");
MainDto.setBusinessNature("经纪业务");
//MainDto.setAgentName(null);
//MainDto.setFxqFlag("1");
//MainDto.setProdFlag("1");
MainDto.setClassCode("01");
MainDto.setRiskCode("0101");
MainDto.setStartDate("2018-06-06");
MainDto.setEndDate("2019-06-05");
MainDto.setInsureDate("2018-06-05");
MainDto.setSignDate("2018-06-05");
MainDto.setOprTm("2018-06-05");
MainDto.settInsrncMonth("12");
//MainDto.setBeforePrem("3414.00");
//MainDto.setEntireDiscount("0");
MainDto.setSumPremium("0");
MainDto.setSumAmount("371900.0");
//MainDto.setArgueDel_Code("1");
////MainDto.setArgueDel(null);
//MainDto.setInformContent("");
//MainDto.setIsTimelyEffective("");
//MainDto.setEngageContext("");
//MainDto.setBusinessType1("00");
//MainDto.setPolicySort("0");
MainDto.setCurrency("CNY");
MainDto.setPayTimes("4");
//MainDto.setCoinsFlag("");
//MainDto.setReinsFlag("");
//MainDto.setCoinsUranceFlag("");
//MainDto.setCoinsLinkFlag("");
//MainDto.setStopTimes("0");
MainDto.setSumQuantity("1");
MainDto.setHandler_Code("88000157");
MainDto.setHandlerName("张三");
MainDto.setReinsciFlag("否");
MainDto.setBusinessLine("商险业务");
MainDto.setBusinessClass("中石油业务");
MainDto.setBusinessSource("石油海外资产");
MainDto.setAgriFlag("非农");
MainDto.setIcCarFlag("否");
MainDto.setBackDays("0");
//MainDto.setAttributeA("");
//MainDto.setAttributeB("");
//MainDto.setAttributeC("");
//MainDto.setAttributeD("");
//MainDto.setAttributeE("");
//MainDto.setAttributeF("");

MainDto.setEndorReson("批改被保险的人信息");
MainDto.setEndorType("01");
MainDto.setValidDate("2018-08-27");
MainDto.setEndorDate("2018-08-27");
MainDto.setChgAmount("0");
MainDto.setChgPermium("0");






ApplicantDto.setAppliCode("100000000159");
ApplicantDto.setAppliName("张三武");
ApplicantDto.setInsuredNature_Code("1");
ApplicantDto.setInsuredNature("个人");
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
//ApplicantDto.setCustomerChannel_Code("2");
//ApplicantDto.setCustomerChannel("中石油员工");
//ApplicantDto.setAttributeA("");
//ApplicantDto.setAttributeB("");
//ApplicantDto.setAttributeC("");
//ApplicantDto.setAttributeD("");
//ApplicantDto.setAttributeE("");
//ApplicantDto.setAttributeF("");


insuredDto.setInsuredCode("100000000159");
insuredDto.setInsuredName("张三武");
insuredDto.setInsuredNature_Code("1");
insuredDto.setInsuredNature("个人");
//insuredDto.setInsuredTrade_Code("0");
//insuredDto.setInsuredTrade("低");
//insuredDto.setIdentifyType_Code("01");
//insuredDto.setIdentifyType("居民身份证");
//insuredDto.setIdentifyNumber("230621198805120450");
//insuredDto.setAge("55");
//insuredDto.setInsuredAddress("黑龙江省大庆市");
//insuredDto.setOccupationName("");
//insuredDto.setMarriage("");
//insuredDto.setCreditLevel("");
//insuredDto.setInsuredIdentity("");
//insuredDto.setEducationCode("");
//insuredDto.setSex_Code("1");
//insuredDto.setSex("男");
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

		
//缴费计划信息	
List<PlanDto> planDtoList = new ArrayList<PlanDto>();
PlanDto planDto = new PlanDto();
PlanDto planDto1 = new PlanDto();
PlanDto planDto2 = new PlanDto();
PlanDto planDto3 = new PlanDto();

planDto.setPayNo("1");		
planDto.setPayforTimes("4");	
planDto.setPayStartTimes("2018-08-25");
planDto.setPayEndTimes("2018-09-10");
planDto.setCurrency("CNY");
planDto.setPayReason("分期缴费");
planDto.setPaymentRate("100");
planDto.setPayableAmounts("5000");
planDto.setPaidupAmounts("0");		
planDtoList.add(planDto);		
		
		
planDto1.setPayNo("2");		
planDto1.setPayforTimes("4");	
planDto1.setPayStartTimes("2018-08-25");
planDto1.setPayEndTimes("2018-09-10");
planDto1.setCurrency("CNY");
planDto1.setPayReason("分期缴费");
planDto1.setPaymentRate("100");
planDto1.setPayableAmounts("5000");
planDto1.setPaidupAmounts("0");		
planDtoList.add(planDto1);			
		
		
planDto2.setPayNo("3");		
planDto2.setPayforTimes("4");	
planDto2.setPayStartTimes("2018-08-25");
planDto2.setPayEndTimes("2018-09-10");
planDto2.setCurrency("CNY");
planDto2.setPayReason("分期缴费");
planDto2.setPaymentRate("100");
planDto2.setPayableAmounts("5000");
planDto2.setPaidupAmounts("0");		
planDtoList.add(planDto2);			
		


planDto3.setPayNo("4");		
planDto3.setPayforTimes("4");	
planDto3.setPayStartTimes("2018-08-25");
planDto3.setPayEndTimes("2018-09-10");
planDto3.setCurrency("CNY");
planDto3.setPayReason("分期缴费");
planDto3.setPaymentRate("100");
planDto3.setPayableAmounts("5000");
planDto3.setPaidupAmounts("0");		
planDtoList.add(planDto3);	



// 险别信息
List<ItemKindDto> itemKindDtoList = new ArrayList<ItemKindDto>();
ItemKindDto itemKindDto = new ItemKindDto();
//ItemKindDto itemKindDto1 = new ItemKindDto();
//ItemKindDto itemKindDto2 = new ItemKindDto();
//ItemKindDto itemKindDto3 = new ItemKindDto();
//ItemKindDto itemKindDto4 = new ItemKindDto();
//ItemKindDto itemKindDto5 = new ItemKindDto();
//ItemKindDto itemKindDto6 = new ItemKindDto();
//ItemKindDto itemKindDto7 = new ItemKindDto();
ItemKindDto itemKindDto8 = new ItemKindDto();


itemKindDto8.setItemKindCode("15783");
itemKindDto8.setItemKindName("机动车辆交通事故强制责任保险");
itemKindDto8.setFlag("1");
itemKindDto8.setAmount("10000.0");
itemKindDto8.setPremium("5000");
itemKindDto8.setCurrency("CNY");
itemKindDto8.setRate("0.5");
//itemKindDto8.setItemKindFlag("");
itemKindDto8.setChgAmount("0");
itemKindDto8.setChgPermium("0");
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


//itemKindDto1.setItemKindCode("G");
//itemKindDto1.setItemKindName("全车盗抢险");
//itemKindDto1.setAmount("300000.0");
//itemKindDtoList.add(itemKindDto1);
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



		
		
	
		
		
		PrpallJfeeInputDto  prpallJfeeInputDto = new PrpallJfeeInputDto();
		prpallJfeeInputDto.setApplicantDto(ApplicantDto);
		prpallJfeeInputDto.setInsuredDto(insuredDto);
		prpallJfeeInputDto.setItemKindDtoList(itemKindDtoList);
		prpallJfeeInputDto.setMainDto(MainDto);
		prpallJfeeInputDto.setPlanDtoList(planDtoList);
		
		return prpallJfeeInputDto;
	}
	
}
