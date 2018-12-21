package com.sinosoft.ilogrule.service.ruleService.prpcarService.facade;

import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarResultXom;



public interface PrpcarRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public PrpCarResultXom carRules(PrpCarInputXom requ,String requestBody);
}
