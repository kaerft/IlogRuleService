package com.sinosoft.ilogrule.service.ruleService.cargoService.facade;

import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoInputXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoResultXom;


public interface CargoRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public CargoResultXom cargoRules(CargoInputXom requ,String requestBody);
}
