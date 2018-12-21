package com.sinosoft.ilogrule.service.ruleService.undwrtService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.UndwrtZJResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.UndwrtZJInputXOM;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.facade.UndwrtZJRuleService;


public class UndwrtZJRuleServiceImpl implements UndwrtZJRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	/**
	 * 双核的方法
	 */
	public UndwrtZJResultXOM carRules(UndwrtZJInputXOM requ,String requestBody,String businessTradeNo){
		
		UndwrtZJResultXOM resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"UndwrtZJInputXOM",rulePath,requestBody,xomReqXml,businessTradeNo);
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
	private String getRulePath(UndwrtZJInputXOM requ){
		
		String rulePath = "/UndwrtZJRuleInsuranceRulesApp/UndwrtZJRuleInsuranceRules";
		
		return rulePath;
	}
	/**
	 * 双核的方法
	 */
	public UndwrtZJResultXOM dealRestult(Object result, String errorMessage,String rulePath){
		UndwrtZJResultXOM resp = new UndwrtZJResultXOM();
		if (null != result && "".equals(errorMessage)) {
			resp = ((UndwrtZJInputXOM) result).getUndwrtZJResultXOM();
			resp.setPath(rulePath);
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setPath(rulePath);
			resp.setDescription("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}
	
}
