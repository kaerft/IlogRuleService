package com.sinosoft.ilogrule.service.ruleService.undwrtService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarResultXOM;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.facade.UndwrtNoCarRuleService;


public class UndwrtNoCarRuleServiceImpl implements UndwrtNoCarRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	/**
	 * 双核的方法
	 */
	public UndwrtNoCarResultXOM carRules(UndwrtNoCarInputXOM requ,String requestBody,String businessTradeNo){
		
		UndwrtNoCarResultXOM resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"UndwrtNoCarInputXOM",rulePath,requestBody,xomReqXml,businessTradeNo);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestult(result, errorMessage, rulePath);
		}
		return resp;
	}
	/**
	 * 双核的方法
	 */
	private String getRulePath(UndwrtNoCarInputXOM requ){
		String rulePath = "/UndwrtNoCarInsuranceRulesApp/UndwrtNoCarInsuranceRules";
		
		
		return rulePath;
	}
	/**
	 * 双核的方法
	 */
	public UndwrtNoCarResultXOM dealRestult(Object result, String errorMessage,String rulePath){
		UndwrtNoCarResultXOM resp = new UndwrtNoCarResultXOM();
		if (null != result && "".equals(errorMessage)) {
			resp = ((UndwrtNoCarInputXOM) result).getUndwrtNoCarResultXOM();
			resp.setPath(rulePath);
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setPath(rulePath);
			resp.setDescription("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	
}
