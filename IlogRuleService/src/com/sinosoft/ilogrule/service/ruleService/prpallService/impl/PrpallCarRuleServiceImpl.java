package com.sinosoft.ilogrule.service.ruleService.prpallService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.prpallXom.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.prpallXom.UndwrtInputXOM;
import com.sinosoft.ilogrule.service.ruleService.prpallService.facade.PrpallCarRuleService;


public class PrpallCarRuleServiceImpl implements PrpallCarRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	
	public UnderwriteResultXOM carRules(UndwrtInputXOM requ,String requestBody){
		
		UnderwriteResultXOM resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"UndwrtInputXOM",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestult(result, errorMessage, rulePath);
		}
		return resp;
	}
	
	private String getRulePath(UndwrtInputXOM requ){
		//根据商业险和交强险来区分规则路径
		String rulePath = "/SYInspectionRulesApp/SYInspectionRules";//默认走商业险规则
		if(requ!=null){
			if(requ.getMainXom()!=null){
				if("DDA".equals(requ.getMainXom().getRiskCode())){
					//rulePath  = "/JQInsuranceRulesApp/JQInsuranceRules"; //交强
				}else{
					rulePath  = "/SYInspectionRulesApp/SYInspectionRules"; //商业
				} 		
			}
			
		}
		
		return rulePath;
	}
	
	public UnderwriteResultXOM dealRestult(Object result, String errorMessage,String rulePath){
		UnderwriteResultXOM resp = new UnderwriteResultXOM();
		if (null != result && "".equals(errorMessage)) {
			resp = ((UndwrtInputXOM) result).getUnderwriteResultXOM();
			resp.setPath(rulePath);
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setPath(rulePath);
			resp.setDescription("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}

}
