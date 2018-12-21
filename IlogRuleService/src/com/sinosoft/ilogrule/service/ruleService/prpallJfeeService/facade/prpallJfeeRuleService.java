package com.sinosoft.ilogrule.service.ruleService.prpallJfeeService.facade;

import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeResultXom;



public interface prpallJfeeRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public PrpallJfeeResultXom carRules(PrpallJfeeInputXom requ,String requestBody);
}
