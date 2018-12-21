package com.sinosoft.ilogrule.service.ruleService.undwrtService.facade;

import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.UndwrtZJResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule.UndwrtZJInputXOM;



public interface UndwrtZJRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public UndwrtZJResultXOM carRules(UndwrtZJInputXOM requ,String requestBody,String businessTradeNo);
}
