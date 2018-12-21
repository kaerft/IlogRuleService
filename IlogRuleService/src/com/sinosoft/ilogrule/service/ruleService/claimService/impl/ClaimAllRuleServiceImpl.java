package com.sinosoft.ilogrule.service.ruleService.claimService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.claimXom.ApproveRule.ApproveRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.AutoUndwrtRule.AutoUndwrtRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.BpmRule.BpmRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.ClaimRule.ClaimRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.RegistRule.RegistRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.SimpleRule.SimpleRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.UndwrtFactorRule.UndwrtFactorRuleXom;
import com.sinosoft.ilogrule.service.ruleService.claimService.facade.ClaimAllRuleService;
//import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngine;


public class ClaimAllRuleServiceImpl implements ClaimAllRuleService{
	
	private WodmRuleEngineForLog wodmRuleEngineForLog = new WodmRuleEngineForLog();
	
	/**
	 * 立案
	 */
	public ClaimRuleXom claimRule(ClaimRuleXom requ,String requestBody){
		
		ClaimRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/ClaimRuleApp/ClaimRule";
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"ClaimRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestultClaimRule(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 理赔立案的方法
	 */
	public ClaimRuleXom dealRestultClaimRule(Object result, String errorMessage,String rulePath){
		ClaimRuleXom resp = new ClaimRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = (ClaimRuleXom) result;
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	
	/**
	 * 简易赔案
	 */
	public SimpleRuleXom simpleRule(SimpleRuleXom requ,String requestBody){
		
		SimpleRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/SimpleRuleApp/SimpleRule";
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"SimpleRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestultSimpleRule(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 简易赔案的方法
	 */
	public SimpleRuleXom dealRestultSimpleRule(Object result, String errorMessage,String rulePath){
		SimpleRuleXom resp = new SimpleRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = (SimpleRuleXom) result; 
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	
	/**
	 * 工作流
	 */
	public BpmRuleXom bpmRule(BpmRuleXom requ,String requestBody){
		
		BpmRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/BpmRuleApp/BpmRule";
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"BpmRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestultBpmRule(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 工作流的方法
	 */
	public BpmRuleXom dealRestultBpmRule(Object result, String errorMessage,String rulePath){
		BpmRuleXom resp = new BpmRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = (BpmRuleXom) result; 
		} else {
			//规则引擎调用规则失败
			resp.setNextNodeString("");
			resp.setNextNodeName("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	/**
	 * 自动核赔
	 */
	public AutoUndwrtRuleXom autoUndwrtRule(AutoUndwrtRuleXom requ,String requestBody){
		
		AutoUndwrtRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/AutoUndwrtRuleApp/AutoUndwrtRule";
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"AutoUndwrtRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestultAutoUndwrtRule(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 自动核赔的方法
	 */
	public AutoUndwrtRuleXom dealRestultAutoUndwrtRule(Object result, String errorMessage,String rulePath){
		AutoUndwrtRuleXom resp = new AutoUndwrtRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = (AutoUndwrtRuleXom) result; 
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	
	
	/**
	 * 高级审核
	 */
	public ApproveRuleXom approveRule(ApproveRuleXom requ,String requestBody){
		
		ApproveRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/ApproveRuleApp/ApproveRule";
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"ApproveRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestultApproveRule(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 高级审核的方法
	 */
	public ApproveRuleXom dealRestultApproveRule(Object result, String errorMessage,String rulePath){
		ApproveRuleXom resp = new ApproveRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = (ApproveRuleXom) result; 
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	/**
	 * 报案
	 */
	public RegistRuleXom registRule(RegistRuleXom requ,String requestBody){
		
		RegistRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/RegistRuleApp/RegistRule";
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"RegistRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			resp = this.dealRestultRegist(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 报案的方法
	 */
	public RegistRuleXom dealRestultRegist(Object result, String errorMessage,String rulePath){
		RegistRuleXom resp = new RegistRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = ((RegistRuleXom) result); 
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	/**
	 * 核赔
	 */
	public UndwrtFactorRuleXom undwrtFactorRule(UndwrtFactorRuleXom requ,String requestBody){
		
		UndwrtFactorRuleXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = "/UndwrtFactorRuleApp/UndwrtFactorRule";
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = wodmRuleEngineForLog.rules(requ,"UndwrtFactorRuleXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			resp = this.dealRestultUndwrtFactor(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 核赔的方法
	 */
	public UndwrtFactorRuleXom dealRestultUndwrtFactor(Object result, String errorMessage,String rulePath){
		UndwrtFactorRuleXom resp = new UndwrtFactorRuleXom();
		if (null != result && "".equals(errorMessage)) {
			resp = ((UndwrtFactorRuleXom) result); 
		} else {
			//规则引擎调用规则失败
			resp.setPass("");
			resp.setMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
}
