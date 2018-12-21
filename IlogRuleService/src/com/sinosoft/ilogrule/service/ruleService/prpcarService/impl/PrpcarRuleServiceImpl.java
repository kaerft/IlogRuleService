package com.sinosoft.ilogrule.service.ruleService.prpcarService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarResultXom;
import com.sinosoft.ilogrule.service.ruleService.prpcarService.facade.PrpcarRuleService;


public class PrpcarRuleServiceImpl implements PrpcarRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	
	public PrpCarResultXom carRules(PrpCarInputXom requ,String requestBody){
		
		PrpCarResultXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"PrpCarInputXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestult(result, errorMessage, rulePath);
		}
		return resp;
	}
	
	private String getRulePath(PrpCarInputXom requ){
		//规则路径
//		String rulePath = "/ZYICCarNCDRuleApp/ZYICCarNCDRule";
		String rulePath = "/ZYICCarNCDRuleApp/ZYICCarNCDRuleRuleset";
		if(requ!=null){
			if(requ.getMainXom()!=null){
				if("1".equals(requ.getMainXom().getAttributeA())){//最新规则
					rulePath  = "/ZYICCarNCDRuleApp/ZYICCarNCDRuleRuleset";
				}else if("2".equals(requ.getMainXom().getAttributeA())){//3期费改之前规则
					rulePath  = "/ZYICCarNCDRuleApp/ZYICCarNCDRuleRulesetOld";
				}		
			}
			
		}
		System.out.println("rulePath==============="+rulePath);
		return rulePath;
	}
	
	public PrpCarResultXom dealRestult(Object result, String errorMessage,String rulePath){
		PrpCarResultXom resp = new PrpCarResultXom();
		if (null != result && "".equals(errorMessage)) {
			resp = ((PrpCarInputXom) result).getPrpCarResultXOM();
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setErrorMessage("服务方-规则引擎调用规则失败");
		}				
		return resp;
	}

}
