package com.sinosoft.ilogrule.service.ruleService.prpallJfeeService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeResultXom;
import com.sinosoft.ilogrule.service.ruleService.prpallJfeeService.facade.prpallJfeeRuleService;


public class prpallJfeeRuleServiceImpl implements prpallJfeeRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	
	public PrpallJfeeResultXom carRules(PrpallJfeeInputXom requ,String requestBody){
		
		PrpallJfeeResultXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"PrpallJfeeInputXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestult(result, errorMessage, rulePath);
		}
		return resp;
	}
	
	private String getRulePath(PrpallJfeeInputXom requ){
		//规则路径
		String rulePath = "/ZYICPrpallJfeeRuleApp/ZYICPrpallJfeeRuleset";
		return rulePath;
	}
	
	public PrpallJfeeResultXom dealRestult(Object result, String errorMessage,String rulePath){
		PrpallJfeeResultXom resp = new PrpallJfeeResultXom();
		if (null != result && "".equals(errorMessage)) {
			resp = ((PrpallJfeeInputXom) result).getPrpallJfeeResultXom();
			resp.setPath(rulePath);
			resp.setRuleName("ZYICPrpallJfeeRule");
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setDescription("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}

}
