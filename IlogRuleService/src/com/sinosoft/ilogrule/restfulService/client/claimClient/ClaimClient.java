package com.sinosoft.ilogrule.restfulService.client.claimClient;

import java.math.BigDecimal;

import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.ilogrule.ilog.dto.claimDto.ApproveRule.ApproveRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.AutoUndwrtRule.AutoUndwrtRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.BpmRule.BpmRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.ClaimRule.ClaimRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.RegistRule.RegistRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.SimpleRule.SimpleRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.UndwrtFactorRule.UndwrtFactorRuleVo;
import com.sinosoft.ilogrule.restfulService.client.baseClient.DealHeadInfo;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

public class ClaimClient {


	public RegistRuleVo registRule(RegistRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		RegistRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/registRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/registRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/registRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "registRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(RegistRuleVo.class);
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

	public RegistRuleVo organizeObjectRegistRule() {
		
		RegistRuleVo registRuleVo = new RegistRuleVo();
		//报案节点名称
		registRuleVo.setRegistName("重大案件");//非空
		//个/商险
		registRuleVo.setaBusinessRisk("个险");//非空
		//险种代码
		registRuleVo.setRiskCode("0101");//非空
		//险种名称
		registRuleVo.setRiskName("11");//非空
		//机构代码
		registRuleVo.setComCode("0001");//非空
		//机构名称
		registRuleVo.setComName("1111");//非空
		//报损金额
		registRuleVo.setReprtedLoss(new BigDecimal(0));
		
		return registRuleVo;
	}
	public ClaimRuleVo claimRule(ClaimRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		ClaimRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/claimRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/claimRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/claimRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "claimRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(ClaimRuleVo.class);
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

	public ClaimRuleVo organizeObjectClaimRule() {
		
		ClaimRuleVo claimRuleVo = new ClaimRuleVo();
		//个/商险
		claimRuleVo.setaBusinessRisk("商险");//非空
		//险类代码
		claimRuleVo.setClassCode("01");//非空
		//险类名称
		claimRuleVo.setClassName("05");//非空
		//险种代码
		claimRuleVo.setRiskCode("0101");//非空
		//险种名称
		claimRuleVo.setRiskName("0501");//非空
		//险别代码
		claimRuleVo.setKindCode("0");//非空
		//总估计赔款
		claimRuleVo.setSumClaim(new BigDecimal("0"));
		//估损次数
		claimRuleVo.setAdjustTimes(Integer.parseInt("0"));
		//估损调整绝对值
		claimRuleVo.setDifferenceMoney(new BigDecimal("0"));
		//立案距出险天数
		claimRuleVo.setClaimToDamageDate(Integer.parseInt("0"));
		//立案距报案天数
		claimRuleVo.setClaimToRegistDate(Integer.parseInt("0"));
		//强制立案的天数
		claimRuleVo.setClaimForceDays(Integer.parseInt("62"));
		//规则判断标志
		claimRuleVo.setClaimType("强制立案");//非空
		
		return claimRuleVo;
	}
	
	public SimpleRuleVo simpleRule(SimpleRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		SimpleRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/simpleRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/simpleRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/simpleRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "simpleRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(SimpleRuleVo.class);
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

	public SimpleRuleVo organizeObjectSimpleRule() {
		
		SimpleRuleVo simpleRuleVo = new SimpleRuleVo();
		//个/商险
		simpleRuleVo.setaBusinessRisk("个险");//非空
		//险类代码
		simpleRuleVo.setClassCode("02");//非空
		//险类名称
		simpleRuleVo.setClassName("02");//非空
		//险种代码
		simpleRuleVo.setRiskCode("0222");//非空
		//险种名称
		simpleRuleVo.setRiskName("0222");//非空
		//险别代码
		simpleRuleVo.setKindCode("22");//非空
		//机构编码
		simpleRuleVo.setComCode("00");//非空
		//机构名称
		simpleRuleVo.setComName("00");//非空
		//赔付金额
		simpleRuleVo.setSumClaim(new BigDecimal(0));
		
		return simpleRuleVo;
	}
	
	public UndwrtFactorRuleVo undwrtFactorRule(UndwrtFactorRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		UndwrtFactorRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/undwrtFactorRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/undwrtFactorRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/undwrtFactorRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "undwrtFactorRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(UndwrtFactorRuleVo.class);
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

	public UndwrtFactorRuleVo organizeObjectUndwrtFactorRule() {
		
		UndwrtFactorRuleVo undwrtFactorRuleVo = new UndwrtFactorRuleVo();
		//个/商险
		undwrtFactorRuleVo.setaBusinessRisk("商险");//非空
		//险类代码
		undwrtFactorRuleVo.setClassCode("05");//非空
		//险类名称
		undwrtFactorRuleVo.setClassName("01");//非空
		//险种代码
		undwrtFactorRuleVo.setRiskCode("0507");//非空
		//险种名称
		undwrtFactorRuleVo.setRiskName("0101");//非空
		//险别代码
		undwrtFactorRuleVo.setKindCode("00");//非空
		//机构代码
		undwrtFactorRuleVo.setComcode("01");//非空
		//机构名称
		undwrtFactorRuleVo.setComName("01");//非空
		//费用类型编码
		undwrtFactorRuleVo.setChargeCode("01");//非空
		//费用类型名称
		undwrtFactorRuleVo.setChargeName("奥奥");//非空
		//核赔类型
		undwrtFactorRuleVo.setUndwrtType("");
		//立案金额
		undwrtFactorRuleVo.setClaimAmt(new BigDecimal(0));
		//赔款金额
		undwrtFactorRuleVo.setPayAmt(new BigDecimal(6000000));
		//费用金额
		undwrtFactorRuleVo.setPayFee(new BigDecimal(0));
		//预赔金额
		undwrtFactorRuleVo.setPrePayAmt(new BigDecimal(0));
		//预赔费用金额
		undwrtFactorRuleVo.setPrePayFee(new BigDecimal(0));
		//应收标识
		undwrtFactorRuleVo.setReceivableFlag("");
		//重开标识
		undwrtFactorRuleVo.setReClaimFlag("");
		//共保标识
		undwrtFactorRuleVo.setCoinsuranceFlag("");
		//通融标识
		undwrtFactorRuleVo.setAccommodateFlag("是");//非空
		//临分标识
		undwrtFactorRuleVo.setFacultativeFlag("");
		//拒赔标识
		undwrtFactorRuleVo.setRejectClaimFlag("");
		//零结案标识
		undwrtFactorRuleVo.setZeroFlag("");
		//核赔级别编码
		undwrtFactorRuleVo.setUndwrtLevelCode("中一级核赔人");//非空
		//核赔级别名称
		undwrtFactorRuleVo.setUndwrtLevelName("中一级核赔人");//非空
		
		return undwrtFactorRuleVo;
	}
	
	public BpmRuleVo bpmRule(BpmRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		BpmRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/bpmRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/bpmRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/bpmRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "bpmRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(BpmRuleVo.class);
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

	public BpmRuleVo organizeObjectBpmRule() {
		
		BpmRuleVo bpmRuleVo = new BpmRuleVo();
		//机构代码
		bpmRuleVo.setComcode("01");//非空
		//机构名称
		bpmRuleVo.setComName("11");//非空
		//险种代码
		bpmRuleVo.setRiskCode("0101");//非空
		//险种名称
		bpmRuleVo.setRiskName("000");//非空
		//当前节点代码
		bpmRuleVo.setCurrentNodeCode("1");//非空
		//当前节点名称
		bpmRuleVo.setCurrentNodeName("010");//非空
		//业务动作代码
		bpmRuleVo.setOptionTypeCode("00");//非空
		//业务动作名称
		bpmRuleVo.setOptionTypeName("11");//非空
		
		return bpmRuleVo;
	}
	
	public ApproveRuleVo approveRule(ApproveRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		ApproveRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/approveRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/approveRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/approveRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "approveRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(ApproveRuleVo.class);
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

	public ApproveRuleVo organizeObjectApproveRule() {
		
		ApproveRuleVo approveRuleVo = new ApproveRuleVo();
		//个/商险
		approveRuleVo.setaBusinessRisk("个险");
		//险类代码
		approveRuleVo.setClassCode("08");
		//险类名称
		approveRuleVo.setClassName("01");
		//险种代码
		approveRuleVo.setRiskCode("0101");
		//险种名称
		approveRuleVo.setRiskName("0101");
		//险别代码
		approveRuleVo.setKindCode("");
		//机构代码
		approveRuleVo.setComCode("11");
		//机构名称
		approveRuleVo.setComName("11");
		//当前节点编码
		approveRuleVo.setNodeCode("初一级审核人");
		//当前节点名称
		approveRuleVo.setNodeName("初一级审核人");
		//立案距出险天数
		approveRuleVo.setClaimToDamageDate(0);
		//立案距报案天数
		approveRuleVo.setClaimToRegistDate(0);
		//总估计赔款/立案金额
		approveRuleVo.setSumClaim(new BigDecimal(60000));
		//估损次数
		approveRuleVo.setAdjustTimes(0);
		//估损调整的绝对值
		approveRuleVo.setDifferenceMoney(new BigDecimal(0));
		//规则判断标志名称
		approveRuleVo.setApproveTypeName("超额立案申请");
		//注销恢复的次数
		approveRuleVo.setAncelRecoverTimes(0);
		//重开次数
		approveRuleVo.setReclaimTimes(0);
		//担保金额
		approveRuleVo.setReverseAmount(new BigDecimal(0));
		//理赔金额
		approveRuleVo.setCompensateAmount(new BigDecimal(0));
		//是否临分案件是否理赔控制条件
		approveRuleVo.setIfCase("");
		//是否在名录内
		approveRuleVo.setIfDirectory("");
		//是否是分公司权限内
		approveRuleVo.setIfBranchOfficePower("");
		//追偿金额
		approveRuleVo.setSumPlanReplevy(new BigDecimal(0));
		//损余回收金额
		approveRuleVo.setSumLossFee(new BigDecimal(0));
		//收回赔款金额
		approveRuleVo.setSumReturnPay(new BigDecimal(0));
		//是否是被保险人
		approveRuleVo.setIfInsurant("");
		//是否修改账号
		approveRuleVo.setIfModify("");
		//赔付金额
		approveRuleVo.setSumCompensate(new BigDecimal(0));
		//退票金额
		approveRuleVo.setSumReturnBacket(new BigDecimal(0));
		//物损金额
		approveRuleVo.setPropLoss(new BigDecimal(0));
		//是否协议第三方
		approveRuleVo.setIsAgreement("");	
		//查勘金额
		approveRuleVo.setCheckFee(new BigDecimal(0));
		
		return approveRuleVo;
	}
	
	public AutoUndwrtRuleVo autoUndwrtRule(AutoUndwrtRuleVo requestBody) throws Exception{
		// 是否成功标识
		String Status = "";
		// 错误类型
		Object errorObj = null;
		
		MultivaluedMap<String, String> responseHeaders = null;
		AutoUndwrtRuleVo responseBody = null;
		try{
			//获取访问地址(数据库配置)
			//String url = "http://7.236.166.150:8026/IlogRuleService/rest/ClaimRuleRestfulService/autoUndwrtRule";
			String url = "http://7.236.166.150:8027/IlogRuleService/rest/ClaimRuleRestfulService/autoUndwrtRule";
			//String url = "http://localhost:7001/IlogRuleService/rest/ClaimRuleRestfulService/autoUndwrtRule";	
			System.out.println("调用规则引擎查询接口URL==="+url);
			//获取连接超时时间			
			String limitQueryName = "20000";
			//获取报文头部信息组织
			String SVCNAME = "ClaimRuleRestfulService";
			String ORISYS = "claim";
			String MTDNAME = "autoUndwrtRule";
			// 组织公共头信息和连接超时时间
			Builder builder = DealHeadInfo.orgnizeClient(requestBody, SVCNAME,ORISYS,MTDNAME, url, limitQueryName);		
			ClientResponse response = builder.post(ClientResponse.class, requestBody);
			// 获取头信息集合
			responseHeaders = response.getHeaders();
			// 获取请求体信息
			responseBody = response.getEntity(AutoUndwrtRuleVo.class);
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

	public AutoUndwrtRuleVo organizeObjectAutoUndwrtRule() {
		
		AutoUndwrtRuleVo autoUndwrtRuleVo = new AutoUndwrtRuleVo();
		//报案距出险的天数
		autoUndwrtRuleVo.setDaysRegistFromDamage(0);
		//出险原因编码
		autoUndwrtRuleVo.setDamageCode("");
		//出险原因名称
		autoUndwrtRuleVo.setDamageName("");
		//核赔金额
		autoUndwrtRuleVo.setUndwrtAmount(new BigDecimal(0));
		//立案时间距报案时间的天数
		autoUndwrtRuleVo.setDaysClaimFromRegist(0);
		
		return autoUndwrtRuleVo;
	}
}
