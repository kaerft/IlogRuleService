package com.sinosoft.ilogrule.service.ruleService.undwrtService.facade;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarResultXOM;



public interface UndwrtNoCarRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public UndwrtNoCarResultXOM carRules(UndwrtNoCarInputXOM requ,String requestBody,String businessTradeNo);
}
