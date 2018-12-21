package com.sinosoft.ilogrule.restfulService.client.undwrtClient;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.ApplicantDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.InsuredDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.MainDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.OtherDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.UndwrtZJResultDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.UndwrtZJInputDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.VehicleDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.VehicleOwnerDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj.ZJDetailDto;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

public class UndwrtZJClient {


	public UndwrtZJResultDto undwrtZJRule(UndwrtZJInputDto requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		UndwrtZJResultDto responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://192.168.8.105:8758/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtCarRule";	
			//String url = "http://7.236.166.150:8758/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtCarRule";
			String url = "http://localhost:7001/IlogRuleService/rest/UndwrtRuleRestfulService/undwrtZJRule";
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "UndwrtRuleRestfulService";
			String ORISYS = "undwrt";
			String MTDNAME = "undwrtZJRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(UndwrtZJResultDto.class);
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

	public UndwrtZJInputDto organizeObject() {
		// 基本信息
		MainDto mainXom = new MainDto();
		// 投保单号
		mainXom.setProposalNo("922122018110061000013");//非空
		//投保方式
		mainXom.setModeCode("191007");//非空 码表 191007 经纪业务
		//个/团单标识
		mainXom.setPolicyType_Code("0");//非空  码表
		mainXom.setPolicyType("个单");//非空 码表
		
		// 续保标识
		mainXom.setRenewalFlag_Code("1");//非空，码表 目前没提供
		mainXom.setRenewalFlag("续保");//非空，码表 目前没提供
		// 承保机构
		mainXom.setComCode("06");//非空
		mainXom.setComName("北京市分公司");//非空
		//代理人
		mainXom.setAgentCode("050201000733");//可为空
		mainXom.setAgentName("远安经纪");//可为空
		// 反洗钱标识
		mainXom.setFxqFlag("1");//非空
		// 交强、商业险标识
		//mainXom.setProdFlag("1");//可为空 自己判断 DDA是交强 其他都是商业
		// 险类代码
		mainXom.setClassCode("22");//非空
		// 险种代码
		mainXom.setRiskCode("DDC");//非空
		// 保险起期
		mainXom.setStartDate("2018-07-01");//"2017-12-09" 非空
		// 保险止期
		mainXom.setEndDate("2018-12-08");//"2018-12-08" 非空
		// 投保日期
		mainXom.setInsureDate("2018-07-01");//"2018-05-14" 非空
		// 签单日期
		mainXom.setSignDate("2019-01-01");//"2018-05-14" 非空
		// 录单日期
		mainXom.setOprTm("2017-12-09");//"2018-05-14" 非空
		// 保险期间(以天为单位)
		mainXom.settInsrncDay("汉字");//非空
		// 连续续保年数
		//mainXom.setRenewalYears(1);//可为空
		//折前保费
		//mainXom.setBeforePrem(20);//可为空
		// 整单折扣
		//mainXom.setEntireDiscount(0.5);//可为空
		// 实缴保费
		//mainXom.setAfterPrem(10);//可为空
		// 总保额
		mainXom.setSumAmount("20000");//非空
		//争议解决方式
		//mainXom.setArgueDel_Code("");//可为空 码表
		//mainXom.setArgueDel("");//可为空 码表
		// 告知栏内容
		//mainXom.setInformContent("告知栏内容");//非空
		// 是否即时生效
		mainXom.setIsTimelyEffective("是");//非空  0 --否 ，1-- 是

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
//		//停驶次数
//		mainXom.setStopTimes("");//可为空  
		//业务员代码
		mainXom.setHandler_Code("999");//非空
		mainXom.setHandlerName("880");//非空
		//是否是分入业务
		mainXom.setIntoBusiness("是");//非空
		
		//单号类型
		mainXom.setProposalEndorseType("T");//非空
		//批单号
		//mainXom.setEndorseNo("666");//可为空
		
		// 投保人信息
		ApplicantDto applicantXom = new ApplicantDto();
		// 客户渠道
		applicantXom.setCustomerChannel_Code("3");//非空 码表
		applicantXom.setCustomerChannel("中石油团车1");//非空 码表 加油站 中石油团车
		//投保人名称
		applicantXom.setAppliCode("21212");//非空
		applicantXom.setAppliName("大石桥市蟠龙汽车出租服务有限公司");//非空 霸州中石油昆仑燃气有限公司
		//投保人类型
		applicantXom.setInsuredNature_Code("0");//非空 码表
		applicantXom.setInsuredNature("非自然人");//非空 码表
		//投保人客户行业
		applicantXom.setAppliTrade_Code("0");//非空 码表 
		applicantXom.setAppliTrade("低");//非空 码表
		//投保人证件类型
		applicantXom.setIdentifyType_code("01");//非空 码表 
		applicantXom.setIdentifyType("居民身份证");//非空 码表
		//投保人证件号码
		applicantXom.setIdentifyNumber("212121111");//非空
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
		insuredXom.setInsuredCode("21212");//非空
		insuredXom.setInsuredName("张三货物运输");//非空
		//被保人类型
		insuredXom.setInsuredNature_Code("0");//非空 码表
		insuredXom.setInsuredNature("自然人");//非空 码表
		//被保人客户行业
		insuredXom.setInsuredTrade_Code("0");//非空 码表 
		insuredXom.setInsuredTrade("低");//非空 码表
		//被保人证件类型
		insuredXom.setIdentifyType_Code("01");//非空 码表 
		insuredXom.setIdentifyType("居民身份证");//非空 码表
		//被保人证件号码
		insuredXom.setIdentifyNumber("510234199411262719");//非空
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
		
		
		// 车辆信息
		VehicleDto vehicleXom = new VehicleDto();
		// 车辆品牌
		vehicleXom.setVehicleBrandCode("1");//非空
		vehicleXom.setVehicleBrandName("雪佛兰");//非空
		// 车型代码
		vehicleXom.setBrandCode("1000");//非空
		vehicleXom.setBrandName("qq");//非空
		// 车系
		//vehicleXom.setSeriesCode("1000");//非空
		//vehicleXom.setSeriesName("小型轿车");//非空
		// 外地车标志
		vehicleXom.setEcdemicMrk_Code("1");//非空 码表 0 否 1 是
		vehicleXom.setEcdemicMrk("是");//非空 码表
		// 车辆性质
		vehicleXom.setUsenatureCode("35113001");//非空 码表
		vehicleXom.setUsenature_Name("货车");//非空 码表
		// 营业性质
		vehicleXom.setBusinessClassCode("35112001");//非空 码表
		vehicleXom.setBusinessClassName("非营业");//非空 码表
		// 核定载客数(座位数)
		vehicleXom.setSeatCount("10");//非空
		// 车辆类型
		vehicleXom.setVehiclesType_Code("345002009");//非空 码表
		vehicleXom.setVehiclesType("十吨以上");//非空 码表
		// 车辆过户标识
		vehicleXom.setTransferFlag_Code("1");//非空 码表
		vehicleXom.setTransferFlag("否");//非空 码表
		// 是否上牌
		vehicleXom.setIsOneCard("否");//非空
		// 车船税标志
		//vehicleXom.setHfName_Code("");//可为空 码表 交强有值
		//vehicleXom.setHfName("");//可为空 码表 交强有值
		// 车牌号
		vehicleXom.setLicenseNo("川U12345");//非空 沪FQ0201 川U12345
		// 纳税类型
		vehicleXom.setTaxType("N");//非空 纳税，应该有码表，目前没有
		// 新车发票购买日期
		vehicleXom.setBuyDate("2018-07-31");//"2007-12-07" 非空
		// 发证日期
		vehicleXom.setCertificateDate("2018-05-08");//"2007-12-07" 非空
		// 初登日期
		vehicleXom.setEnrollDate("2018-05-07");//"2007-12-07" 非空
		// 行驶里程
		//vehicleXom.setRunMiles(200);//可为空
		// 是否进口车
		vehicleXom.setIsImportCar("否");//非空
		// 能源种类 
		vehicleXom.setFuelType_Code("352001");//非空 码表
		vehicleXom.setFuelType("乙醇");//非空 码表
		// 是否改装
		//vehicleXom.setIsRefit_Code("0");//非空 码表
		//vehicleXom.setIsRefit("否");//非空 码表
		// 车型编码
		vehicleXom.setCarCode("BXPTYXCL9999");//非空
		// 新车购置价
		vehicleXom.setPurchasePrice("170000");//非空
		// 车龄
		vehicleXom.setCarAge("11");//非空
		// 车辆发动机号
		//vehicleXom.setEngineNum("028022");//可为空
		// 车架号
		vehicleXom.setFrmNo("LSVNK49J472046204");//非空
		// 风险等级
		//vehicleXom.setRiskLevel("1");//可为空
		// 新车标识
		vehicleXom.setIsNewCar_Code("1");//非空 码表
		vehicleXom.setIsNewCar("是");//非空 码表
		// 特殊车辆系数
		vehicleXom.setSspecialVehicle("1.0");//非空
		//协商实际价值浮动比例
		vehicleXom.setActualFloatRatioValue("0.3");
		// 协商实际价值
		//vehicleXom.setActualValue("20000");//可为空，后续有改动
		// 是否节能减排车
		//vehicleXom.setIsConserveEnergy("是");//可为空
		// 排量（单位:L）
		//vehicleXom.setnDisplacement("10");//可为空
		// 首年是否在本地投保
		//vehicleXom.setIsInsuredLocally("否");//可为空
		// 是否黑名单客户
		vehicleXom.setIsBlacklist("否");//非空
		// 是否属于高风险车型库
		vehicleXom.setIsHighRiskCar("是");//非空
		// 是否属于易盗车型库
		vehicleXom.setIsEasyStealCar("是");//非空
		// 是否属于微面车
		vehicleXom.setIsMicroFacetCar("是");//非空
		// 车龄等级
		vehicleXom.setCarAgeLevel_Code("306003");//非空 码表
		vehicleXom.setCarAgeLevel("2-3年");//非空 码表	
		
		// 是否属于总公司高风险车
		vehicleXom.setIsZGHighRiskCar("否");//非空
		//特殊车投保标志
		vehicleXom.setSignForSpecialCar("车辆所有权转移重新投保");//非空
		
		//总公司风险类型
		vehicleXom.setZgCarTypeCode("A");
		//分公司风险类型
		vehicleXom.setFgCarTypeCode("B");
		
		//车辆种类代码
		vehicleXom.setVehicleSpeciesCode("01");
		//车辆种类名称
		vehicleXom.setVehicleSpeciesName("救护车");
		
		// 车主信息
		VehicleOwnerDto  vehicleOwnerXom = new VehicleOwnerDto();
		// 车主名称
		vehicleOwnerXom.setOwnerName("李四货物运输");//非空
		// 车主类型
		vehicleOwnerXom.setOwnerType_Code("0");//非空 码表
		vehicleOwnerXom.setOwnerType("非自然人");//非空 码表	
		// 车主证件号
		vehicleOwnerXom.setOwnerIdentifyNumber("11111222222");//非空		
		// 性别
		//vehicleOwnerXom.setOwnerSex_Code("1111");//可为空 码表
		//vehicleOwnerXom.setOwnerSex("1111");//可为空 码表				
		
		// 险别信息
		List<ItemKindDto> itemKindXomList = new ArrayList<ItemKindDto>();
		ItemKindDto itemKindXom = new ItemKindDto();
		// 险别
		itemKindXom.setItemKindCode("A");//非空 码表
		itemKindXom.setItemKindName("车损险");//非空 码表			
		// 险别保额
		itemKindXom.setAmount("1400100");//可为空
		// 上年投保是否出险
		itemKindXom.setLastAccient("是");//非空 例如：上年投保车损险
		// 是否国产玻璃
		//itemKindXom.setIsHomemadeGlass("是");//可为空
		// 每座赔偿限额
		//itemKindXom.setEveryLimitFee(10000);//可为空		
		// 标准保费
		itemKindXom.setBenchMarkPremium("1000");//非空
		//主附险标志
		itemKindXom.setFlag("1");
		
		itemKindXomList.add(itemKindXom);
		
//		ItemKindDto itemKindXom1 = new ItemKindDto();
//		// 险别
//		itemKindXom1.setItemKindCode("D3");//非空 码表
//		itemKindXom1.setItemKindName("车上司机险");//非空 码表			
//		// 险别保额
//		itemKindXom1.setAmount("19000000");//可为空
//		// 上年投保是否出险
//		itemKindXom1.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom1.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		itemKindXom1.setEveryLimitFee("9000");//可为空		
//		// 标准保费
//		itemKindXom1.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom1.setFlag("1");
//		itemKindXomList.add(itemKindXom1);
//		
//		ItemKindDto itemKindXom2 = new ItemKindDto();
//		// 险别
//		itemKindXom2.setItemKindCode("D4");//非空 码表
//		itemKindXom2.setItemKindName("车上乘客险");//非空 码表			
//		// 险别保额
//		itemKindXom2.setAmount("2000000");//可为空
//		// 上年投保是否出险
//		itemKindXom2.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom2.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		itemKindXom2.setEveryLimitFee("2000000");//可为空		
//		// 标准保费
//		itemKindXom2.setBenchMarkPremium("1000");//非空
//		//主附险标志
//		itemKindXom2.setFlag("1");
//		itemKindXomList.add(itemKindXom2);
////		
//		ItemKindDto itemKindXom3 = new ItemKindDto();
//		// 险别
//		itemKindXom3.setItemKindCode("B");//非空 码表
//		itemKindXom3.setItemKindName("三者险");//非空 码表			
//		// 险别保额
//		itemKindXom3.setAmount("4000000");//可为空
//		// 上年投保是否出险
//		itemKindXom3.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom3.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom3.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom3.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom3);
////		
//		ItemKindDto itemKindXom4 = new ItemKindDto();
//		// 险别
//		itemKindXom4.setItemKindCode("G");//非空 码表
//		itemKindXom4.setItemKindName("盗抢险");//非空 码表			
//		// 险别保额
//		itemKindXom4.setAmount("900000");//可为空
//		// 上年投保是否出险
//		itemKindXom4.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom4.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom4.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom4.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom4);		
//		
//		ItemKindDto itemKindXom5 = new ItemKindDto();
//		// 险别
//		itemKindXom5.setItemKindCode("L");//非空 码表
//		itemKindXom5.setItemKindName("划痕险");//非空 码表			
//		// 险别保额
//		itemKindXom5.setAmount("12000");//可为空
//		// 上年投保是否出险
//		itemKindXom5.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom5.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom5.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom5.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom5);
//		
//
//		ItemKindDto itemKindXom6 = new ItemKindDto();
//		// 险别
//		itemKindXom6.setItemKindCode("D2");//非空 码表
//		itemKindXom6.setItemKindName("车上货物责任险");//非空 码表			
//		// 险别保额
//		itemKindXom6.setAmount("1000000");//可为空
//		// 上年投保是否出险
//		itemKindXom6.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom6.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom6.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom6.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom6);
//		
//		ItemKindDto itemKindXom7 = new ItemKindDto();
//		// 险别
//		itemKindXom7.setItemKindCode("E");//非空 码表
//		itemKindXom7.setItemKindName("第三方损失险");//非空 码表			
//		// 险别保额
//		itemKindXom7.setAmount("900000");//可为空
//		// 上年投保是否出险
//		itemKindXom7.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom7.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom7.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom7.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom7);
//		
//		ItemKindDto itemKindXom8 = new ItemKindDto();
//		// 险别
//		itemKindXom8.setItemKindCode("X");//非空 码表
//		itemKindXom8.setItemKindName("新增加设备损失险");//非空 码表			
//		// 险别保额
//		itemKindXom8.setAmount("90000");//可为空
//		// 上年投保是否出险
//		itemKindXom8.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom8.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom8.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom8.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom8);
//		
//		ItemKindDto itemKindXom9 = new ItemKindDto();
//		// 险别
//		itemKindXom9.setItemKindCode("C1");//非空 码表
//		itemKindXom9.setItemKindName("修理期间费用补偿险");//非空 码表			
//		// 险别保额
//		itemKindXom9.setAmount("900000");//可为空
//		// 上年投保是否出险
//		itemKindXom9.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom9.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom9.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom9.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom9);
//		
//		ItemKindDto itemKindXom10 = new ItemKindDto();
//		// 险别
//		itemKindXom10.setItemKindCode("Z");//非空 码表
//		itemKindXom10.setItemKindName("自燃险");//非空 码表			
//		// 险别保额
//		itemKindXom10.setAmount("900000");//可为空
//		// 上年投保是否出险
//		itemKindXom10.setLastAccient("是");//非空 例如：上年投保车损险
//		// 是否国产玻璃
//		//itemKindXom10.setIsHomemadeGlass("是");//可为空
//		// 每座赔偿限额
//		//itemKindXom10.setEveryLimitFee(10000);//可为空		
//		// 标准保费
//		itemKindXom10.setBenchMarkPremium("1000");//非空
//		
//		itemKindXomList.add(itemKindXom10);
//		
		ItemKindDto itemKindXom11 = new ItemKindDto();
		// 险别
		itemKindXom11.setItemKindCode("X1");//非空 码表
		itemKindXom11.setItemKindName("发动机涉水险");//非空 码表			
		// 险别保额
		itemKindXom11.setAmount("900000");//可为空
		// 上年投保是否出险
		itemKindXom11.setLastAccient("是");//非空 例如：上年投保车损险
		// 是否国产玻璃
		//itemKindXom11.setIsHomemadeGlass("是");//可为空
		// 每座赔偿限额
		//itemKindXom11.setEveryLimitFee(10000);//可为空		
		// 标准保费
		itemKindXom11.setBenchMarkPremium("1000");//非空
		//主附险标志
		itemKindXom11.setFlag("2");
		
		itemKindXomList.add(itemKindXom11);
		
		// 其它信息
		OtherDto otherXom = new OtherDto();
		// 上年赔款总金额
//		otherXom.setLastClaimAmount("30");//可为空
//		// 上年是否有赔案记录
		otherXom.setLasClaimFlag("是");//可为空
//		// 出险次数
//		otherXom.setLossNumber("2");//可为空
//		// 上年车主名称
		otherXom.setLastCarOwner("qq");//可为空
//		// 上年投保险别
//		otherXom.setLastItemkind("tt");//可为空 多条中间用 | 符号分开	
		// 上年投保险止期
//		otherXom.setLastEndDate("2016-12-09");//可为空	
		//无赔优待系数（无赔优NCD系数）
		otherXom.setClaimadjustValue("1.5");//可为空
		//验车照片数量
		otherXom.setCheckCarPhotosCount("4");//非空
		//本次纳税年度
		otherXom.setThisTaxYear("2018");//非空
		//是否需要验车
		otherXom.setIsValidateCar("是");//非空
		//自主核保系数
		otherXom.setSelfProtectionCof("2");
		//自主渠道系数
		otherXom.setSelfChannelCof("0.85");
		//滞纳金
		otherXom.setDelayPayment("2");
		
//		//业务自主系数
//		otherXom.setAtuoBusiness("10");
//		//承保定价系数
//		otherXom.setCarPriceCof("11");
//		//是否使用费折联动
//		otherXom.setIsFeeDiscount("否");
		
		ZJDetailDto zjDetailDto = new ZJDetailDto();
		zjDetailDto.setUndwrtGrade("总公司1");
		
		UndwrtZJInputDto undwrtInputDto = new UndwrtZJInputDto();
		undwrtInputDto.setApplicantDto(applicantXom);
		undwrtInputDto.setInsuredDto(insuredXom);
		undwrtInputDto.setItemKindDtoList(itemKindXomList);
		undwrtInputDto.setMainDto(mainXom);
		undwrtInputDto.setOtherDto(otherXom);
		undwrtInputDto.setVehicleDto(vehicleXom);
		undwrtInputDto.setVehicleOwnerDto(vehicleOwnerXom);
		undwrtInputDto.setZjDetailDto(zjDetailDto);
		return undwrtInputDto;
	}


}
