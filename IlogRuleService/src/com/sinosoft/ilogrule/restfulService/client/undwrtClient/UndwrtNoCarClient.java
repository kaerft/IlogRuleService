package com.sinosoft.ilogrule.restfulService.client.undwrtClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.ApplicantDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.CargoDetailDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.InsuredDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.MainDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.OtherDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarResultDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarInputDto;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

public class UndwrtNoCarClient {


	public UndwrtNoCarResultDto undwrtCarRule(UndwrtNoCarInputDto requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		UndwrtNoCarResultDto responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.10.146.3:8758/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtNoCarRule";
			//String url = "http://7.236.166.150:8758/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtNoCarRule";	
			String url = "http://localhost:7001/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtNoCarRule";	

			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "UndwrtRuleRestfulService";
			String ORISYS = "undwrt";
			String MTDNAME = "undwrtNoCarRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(UndwrtNoCarResultDto.class);
			// 处理返回头信息
			DealHeadInfo.dealResponseHeader(responseHeaders, responseBody);
		}catch (Exception e) {
			Status = "2";
			errorObj = e;
			throw e;
		}finally {
			// 存储日志
			
		}
			
		return responseBody;
	}

	public UndwrtNoCarInputDto organizeObject() {
		// 基本信息
		MainDto mainXom = new MainDto();
		// 投保单号
		mainXom.setProposalNo("901012018110061000013");//非空
//		//投保方式
		mainXom.setModeCode("191007");//非空 码表 191007 经纪业务
//		//个/团单标识
//		mainXom.setPolicyType_Code("0");//非空  码表
//		mainXom.setPolicyType("个单");//非空 码表
//		
//		// 续保标识
//		mainXom.setRenewalFlag_Code("1");//非空，码表 目前没提供
//		mainXom.setRenewalFlag("续保");//非空，码表 目前没提供
//		// 承保机构
		mainXom.setComCode("08");//非空
		mainXom.setComName("北京市分公司");//非空
//		//代理人
//		mainXom.setAgentCode("050201000733");//可为空
//		mainXom.setAgentName("远安经纪");//可为空
//		// 反洗钱标识
//		mainXom.setFxqFlag("1");//非空
//
//		// 险类代码
		mainXom.setClassCode("04");//非空
		// 险种代码
		mainXom.setRiskCode("0450");//非空
//		// 保险起期
//		mainXom.setStartDate("2017-12-09");//"2017-12-09" 非空
//		// 保险止期
//		mainXom.setEndDate("2018-12-08");//"2018-12-08" 非空
//		// 投保日期
//		mainXom.setInsureDate("2017-12-09");//"2018-05-14" 非空
//		// 签单日期
//		mainXom.setSignDate("2017-12-09");//"2018-05-14" 非空
//		// 录单日期
//		mainXom.setOprTm("2017-12-09");//"2018-05-14" 非空
		// 保险期间(以天为单位)
//		mainXom.settInsrncDay("365");//非空
//		// 连续续保年数
//		//mainXom.setRenewalYears(1);//可为空
//		//折前保费
//		//mainXom.setBeforePrem(20);//可为空
//		// 整单折扣
//		//mainXom.setEntireDiscount(0.5);//可为空
//		// 实缴保费
//		//mainXom.setAfterPrem(10);//可为空		
//		//争议解决方式
//		//mainXom.setArgueDel_Code("");//可为空 码表
//		//mainXom.setArgueDel("");//可为空 码表
//		// 告知栏内容
//		mainXom.setInformContent("告知栏内容");//非空
//		// 是否即时生效
//		mainXom.setIsTimelyEffective("是");//非空  0 --否 ，1-- 是

		// 特约内容
		//mainXom.setEngageContext("被保人为：");//可为空 多条中间用 | 符号分开
//		//政策类型
//		mainXom.setBusinessType1("");//可为空
//		//保单种类 
//		mainXom.setPolicySort("");//可为空 (1普通/2定额/3暂保单/4台帐补录)
//		//业务来源
//		mainXom.setBusinessNature_Code("");//可为空 码表
//		mainXom.setBusinessNature("");//可为空 码表
//		//币别代码
//		mainXom.setCurrency("");//可为空
//		//约定分期交费次数
//		mainXom.setPayTimes("");//可为空
//		//联共保标志 
//		mainXom.setCoinsFlag("");//可为空 (0独家承保/1主共/2从共/3主联/4从联/)
//		//商业分保标志
//		mainXom.setReinsFlag("");//可为空  (0无需分保/1需分保/2已分保)
//		//共保标志
//		mainXom.setCoinsUranceFlag("");//可为空  (0独家承保 1主共保 2从共保)
//		//联保标志
//		mainXom.setCoinsLinkFlag("");//可为空  (0无联保 1 主联保  2从联保)

		//业务员代码
//		mainXom.setHandler_Code("999");//非空
//		mainXom.setHandlerName("880");//非空
//		//是否是分入业务
//		mainXom.setIntoBusiness("是");//可为空
		
		//单号类型
		mainXom.setProposalEndorseType("T");//非空
		//批单号
		//mainXom.setEndorseNo("666");//可为空
		
		//风险等级
		mainXom.setRiskGrade("一级");
		//使用合约业务/仅净自留业务 
		mainXom.setBusinSpecieCode("");
		mainXom.setBusinSpecieName("使用合约业务");//仅净自留业务
		// 总保额
		mainXom.setSumAmount("5000000000");//非空
		//保额的自留额
		mainXom.setPolRetSumAmount("130000000");
		
		//倒签单天数
		mainXom.setBackDays("0");
		//批改类型
		mainXom.setEndorType("21");
		
		// 投保人信息
		ApplicantDto applicantXom = new ApplicantDto();
		// 客户渠道
//		applicantXom.setCustomerChannel_Code("3");//非空 码表
//		applicantXom.setCustomerChannel("中石油团车");//非空 码表 加油站 中石油团车
//		//投保人名称
//		applicantXom.setAppliCode("21212");//非空
//		applicantXom.setAppliName("大石桥市蟠龙汽车出租服务有限公司");//非空 霸州中石油昆仑燃气有限公司
//		//投保人类型
//		applicantXom.setInsuredNature_Code("0");//非空 码表
//		applicantXom.setInsuredNature("非自然人");//非空 码表
//		//投保人客户行业
//		applicantXom.setAppliTrade_Code("0");//非空 码表 
//		applicantXom.setAppliTrade("低");//非空 码表
//		//投保人证件类型
//		applicantXom.setIdentifyType_code("01");//非空 码表 
//		applicantXom.setIdentifyType("居民身份证");//非空 码表
//		//投保人证件号码
//		applicantXom.setIdentifyNumber("212121111");//非空
 		//年龄
//		applicantXom.setAge(3);//可为空
//		//客户地址
//		applicantXom.setAppliAddress("");//可为空
//		//职业名称
//		applicantXom.setOccupationName("");//可为空
//		//婚否(1 未婚 2 已婚)
//		applicantXom.setMarriage("");//可为空
//		//资信等级
//		applicantXom.setCreditLevel("");//可为空
//		//是被保险人的
//		applicantXom.setInsuredIdentity("");//可为空
//		//个人学历代码
//		applicantXom.setEducationCode("");//可为空
//		//性别
//		applicantXom.setSex_Code("");//可为空 码表	
//		applicantXom.setSex("");//可为空 码表
//		//VIP标志
//		applicantXom.setVipFlag("");//可为空
//		//联系人姓名
//		applicantXom.setLinkerName("");//可为空
//		//联系人地址
//		applicantXom.setLinkerAddress("");//可为空
//		//联系人邮编
//		applicantXom.setLinkerPostCode("");//可为空
//		//联系人电话
//		applicantXom.setLinkerPhoneNumber("");//可为空
//		//联系人手机号
//		applicantXom.setLinkerMobile("");//可为空
		//是否黑名单客户
		applicantXom.setIsBlacklist("否");//非空
		
		
		// 被保人信息
		InsuredDto insuredXom = new InsuredDto();
		//被保人名称
//		insuredXom.setInsuredCode("21212");//非空
//		insuredXom.setInsuredName("张三货物运输");//非空
//		//被保人类型
//		insuredXom.setInsuredNature_Code("0");//非空 码表
//		insuredXom.setInsuredNature("自然人");//非空 码表
//		//被保人客户行业
//		insuredXom.setInsuredTrade_Code("0");//非空 码表 
//		insuredXom.setInsuredTrade("低");//非空 码表
//		//被保人证件类型
//		insuredXom.setIdentifyType_Code("01");//非空 码表 
//		insuredXom.setIdentifyType("居民身份证");//非空 码表
//		//被保人证件号码
//		insuredXom.setIdentifyNumber("510234199411262719");//非空
//		//年龄
//		insuredXom.setAge(3);//可为空
//		//客户地址
//		insuredXom.setInsuredAddress("");//可为空
//		//职业名称
//		insuredXom.setOccupationName("");//可为空
//		//婚否(1 未婚 2 已婚)
//		insuredXom.setMarriage("");//可为空
//		//资信等级
//		insuredXom.setCreditLevel("");//可为空
//		//被保险人与投保人关系
//		insuredXom.setInsuredIdentity("");//可为空
//		//个人学历代码
//		insuredXom.setEducationCode("");//可为空
//		//性别
//		insuredXom.setSex_Code("");//可为空 码表	
//		insuredXom.setSex("");//可为空 码表
//		//VIP标志
//		insuredXom.setVipFlag("");//可为空
//		//联系人姓名
//		insuredXom.setLinkerName("");//可为空
//		//联系人地址
//		insuredXom.setLinkerAddress("");//可为空
//		//联系人邮编
//		insuredXom.setLinkerPostCode("");//可为空
//		//联系人电话
//		insuredXom.setLinkerPhoneNumber("");//可为空
//		//联系人手机号
//		insuredXom.setLinkerMobile("");//可为空
		//是否黑名单客户
		insuredXom.setIsBlacklist("是");//非空
		
		
		
		// 险别信息
		List<ItemKindDto> itemKindXomList = new ArrayList<ItemKindDto>();
		ItemKindDto itemKindXom = new ItemKindDto();
		// 险别
		itemKindXom.setItemKindCode("090001");//非空 码表
		itemKindXom.setItemKindName("建筑一切险");//非空 码表			
		//责任代码
		itemKindXom.setKindCode("09ws");
		//责任名称
		itemKindXom.setKindName("物质损失部分");
	
		// 标准保费
		itemKindXom.setBenchMarkPremium("1000");//非空
		
		//主附险标志
		itemKindXom.setFlag("1");//非空
		
		//险别每次事故限额
		//itemKindXom.setPerAcciLimit("200");
		//险别每人限额
		//itemKindXom.setPerLimit("200");
		
		// 险别保额
		itemKindXom.setAmount("55500000");//可为空
		//险别保额的自留额
		itemKindXom.setRetAmount("10000002");//可为空
	
		
		itemKindXomList.add(itemKindXom);
		
//		ItemKindDto itemKindXom1 = new ItemKindDto();
//		// 险别
//		itemKindXom1.setItemKindCode("090001");//非空 码表
//		itemKindXom1.setItemKindName("建筑一切险");//非空 码表			
//		// 险别保额
//		itemKindXom1.setAmount("50000000009");//可为空
//				
//		// 标准保费
//		itemKindXom1.setBenchMarkPremium("1000");//非空
//		
//		//主附险标志
//		itemKindXom1.setFlag("1");//非空
//		
//		//每次事故限额
//		//itemKindXom1.setPerAcciLimit("200");
//		//每人限额
//		//itemKindXom1.setPerLimit("200");
//		
//		//责任代码
//		itemKindXom1.setKindCode("090148");
//		//责任名称
//		itemKindXom1.setKindName("第三者责任");
//		
//		itemKindXomList.add(itemKindXom1);
//		
//		ItemKindDto itemKindXom2 = new ItemKindDto();
//		// 险别
//		itemKindXom2.setItemKindCode("D4");//非空 码表
//		itemKindXom2.setItemKindName("车上乘客险");//非空 码表			
//		// 险别保额
//		itemKindXom2.setAmount("2000000");//可为空
	
//		// 标准保费
//		itemKindXom2.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom2.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom2);
////		
//		ItemKindDto itemKindXom3 = new ItemKindDto();
//		// 险别
//		itemKindXom3.setItemKindCode("B");//非空 码表
//		itemKindXom3.setItemKindName("三者险");//非空 码表			
//		// 险别保额
//		itemKindXom3.setAmount("4000000");//可为空
		
//		// 标准保费
//		itemKindXom3.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom3.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom3);
////		
//		ItemKindDto itemKindXom4 = new ItemKindDto();
//		// 险别
//		itemKindXom4.setItemKindCode("G");//非空 码表
//		itemKindXom4.setItemKindName("盗抢险");//非空 码表			
//		// 险别保额
//		itemKindXom4.setAmount("900000");//可为空
	
//		// 标准保费
//		itemKindXom4.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom4.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom4);		
//		
//		ItemKindDto itemKindXom5 = new ItemKindDto();
//		// 险别
//		itemKindXom5.setItemKindCode("L");//非空 码表
//		itemKindXom5.setItemKindName("划痕险");//非空 码表			
//		// 险别保额
//		itemKindXom5.setAmount("12000");//可为空
		
//		// 标准保费
//		itemKindXom5.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom5.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom5);
//		
//
//		ItemKindDto itemKindXom6 = new ItemKindDto();
//		// 险别
//		itemKindXom6.setItemKindCode("D2");//非空 码表
//		itemKindXom6.setItemKindName("车上货物责任险");//非空 码表			
//		// 险别保额
//		itemKindXom6.setAmount("1000000");//可为空
		
//		// 标准保费
//		itemKindXom6.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom6.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom6);
//		
//		ItemKindDto itemKindXom7 = new ItemKindDto();
//		// 险别
//		itemKindXom7.setItemKindCode("E");//非空 码表
//		itemKindXom7.setItemKindName("第三方损失险");//非空 码表			
//		// 险别保额
//		itemKindXom7.setAmount("900000");//可为空
	
//		// 标准保费
//		itemKindXom7.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom7.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom7);
//		
//		ItemKindDto itemKindXom8 = new ItemKindDto();
//		// 险别
//		itemKindXom8.setItemKindCode("X");//非空 码表
//		itemKindXom8.setItemKindName("新增加设备损失险");//非空 码表			
//		// 险别保额
//		itemKindXom8.setAmount("90000");//可为空
	
//		// 标准保费
//		itemKindXom8.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom8.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom8);
//		
//		ItemKindDto itemKindXom9 = new ItemKindDto();
//		// 险别
//		itemKindXom9.setItemKindCode("C1");//非空 码表
//		itemKindXom9.setItemKindName("修理期间费用补偿险");//非空 码表			
//		// 险别保额
//		itemKindXom9.setAmount("900000");//可为空
	
//		// 标准保费
//		itemKindXom9.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom9.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom9);
//		
//		ItemKindDto itemKindXom10 = new ItemKindDto();
//		// 险别
//		itemKindXom10.setItemKindCode("Z");//非空 码表
//		itemKindXom10.setItemKindName("自燃险");//非空 码表			
//		// 险别保额
//		itemKindXom10.setAmount("900000");//可为空
	
//		// 标准保费
//		itemKindXom10.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom10.setFlag("1");//非空
//		itemKindXomList.add(itemKindXom10);
//		
//		ItemKindDto itemKindXom11 = new ItemKindDto();
//		// 险别
//		itemKindXom11.setItemKindCode("X1");//非空 码表
//		itemKindXom11.setItemKindName("发动机涉水险");//非空 码表			
//		// 险别保额
//		itemKindXom11.setAmount("900000");//可为空
	
//		// 标准保费
//		itemKindXom11.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom11.setFlag("2");//非空
//		itemKindXomList.add(itemKindXom11);
		
		// 其它信息
		OtherDto otherXom = new OtherDto();
		
		//核保级别
		otherXom.setUndwrtGrade("初3级");
		//是否协议录入
		otherXom.setIsAgreementPolicy("否");
		//协议保单类型
		otherXom.setAgreePolicyType_Code("08");
		otherXom.setAgreePolicyType("合并录入");
		
		//业务操作
		otherXom.setBusinessOperation("2");
		
		//核保人
		otherXom.setUndwrtPeopleCode("00000056");
		otherXom.setUndwrtPeopleName("张建华");
		
		//核保人操作机构
		otherXom.setUndwrtUseComCode("00");
		
		//货物信息
		List<CargoDetailDto> cargoDetailDtoList = new ArrayList<CargoDetailDto>();
		
		CargoDetailDto cargoDetailDto1 = new CargoDetailDto();
		cargoDetailDto1.setGoodsSpecie("一类");
		cargoDetailDto1.setPackingWay("3");
		cargoDetailDto1.setSingleLimit("64000000");		
		cargoDetailDtoList.add(cargoDetailDto1);
		
		CargoDetailDto cargoDetailDto2 = new CargoDetailDto();
		cargoDetailDto2.setGoodsSpecie("二类");
		cargoDetailDto2.setPackingWay("3");
		cargoDetailDto2.setSingleLimit("60000000");	
		cargoDetailDtoList.add(cargoDetailDto2);
		
		
		UndwrtNoCarInputDto undwrtInputDto = new UndwrtNoCarInputDto();
		undwrtInputDto.setApplicantDto(applicantXom);
		undwrtInputDto.setInsuredDto(insuredXom);
		undwrtInputDto.setItemKindDtoList(itemKindXomList);
		undwrtInputDto.setMainDto(mainXom);
		undwrtInputDto.setOtherDto(otherXom);
		undwrtInputDto.setCargoDetailDtoList(cargoDetailDtoList);
		return undwrtInputDto;
	}


}
