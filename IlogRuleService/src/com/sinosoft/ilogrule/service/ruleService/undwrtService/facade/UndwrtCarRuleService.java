package com.sinosoft.ilogrule.service.ruleService.undwrtService.facade;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UndwrtInputXOM;



public interface UndwrtCarRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public UnderwriteResultXOM carRules(UndwrtInputXOM requ,String requestBody,String businessTradeNo);
}
