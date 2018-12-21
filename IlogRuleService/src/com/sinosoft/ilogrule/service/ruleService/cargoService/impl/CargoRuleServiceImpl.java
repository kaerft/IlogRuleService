package com.sinosoft.ilogrule.service.ruleService.cargoService.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.ilog.rule.WodmRuleEngineForLog;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoInputXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoResultXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeInputXom;
import com.sinosoft.ilogrule.service.ruleService.cargoService.facade.CargoRuleService;


public class CargoRuleServiceImpl implements CargoRuleService{
	
	private WodmRuleEngineForLog engine = new WodmRuleEngineForLog();
	
	@Override
	public CargoResultXom cargoRules(CargoInputXom requ,String requestBody){
		
		CargoResultXom resp = null;		
		Object result = null;
		String errorMessage = "";
		String rulePath = "";
		String xomReqXml = "";
		
		try{
			rulePath = getRulePath(requ);
			//xom转化json串
			ObjectMapper objectMapper = new ObjectMapper();
			xomReqXml = objectMapper.writeValueAsString(requ);
			result = engine.rules(requ,"CargoInputXom",rulePath,requestBody,xomReqXml);
		}catch(Exception e){
			errorMessage += e.getMessage();	
			e.printStackTrace();
		}finally{
			//对审核结果部分字段进行转换
			resp = this.dealRestult(result, errorMessage, rulePath);
		}
		return resp;
	}
	
	private String getRulePath(CargoInputXom requ){
		//规则路径   
		String rulePath = "/CargoRuleApp/ZYICCargoRule";
		return rulePath;
	}
	
	public CargoResultXom dealRestult(Object result, String errorMessage,String rulePath){
		CargoResultXom resp = new CargoResultXom();
		if (null != result && "".equals(errorMessage)) {
			resp = ((CargoInputXom) result).getCargoResultXOM();
			resp.setPath(rulePath);
			resp.setRuleName("ZYICCargoRule");
		} else {
			//规则引擎调用规则失败，提示待定
			resp.setErrorMessage("服务方-规则引擎调用规则失败");
		}	
		return resp;
	}

}
