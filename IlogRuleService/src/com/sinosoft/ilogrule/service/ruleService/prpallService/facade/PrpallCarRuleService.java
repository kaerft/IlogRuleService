package com.sinosoft.ilogrule.service.ruleService.prpallService.facade;

import com.sinosoft.ilogrule.ilog.xom.prpallXom.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.prpallXom.UndwrtInputXOM;



public interface PrpallCarRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public UnderwriteResultXOM carRules(UndwrtInputXOM requ,String requestBody);
}
