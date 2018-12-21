package com.sinosoft.ilogrule.service.logService.facade;

import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sinosoft.ilogrule.vo.logVo.IlogRuleLoggerVo;


public interface LogService {
	public void insertInteract(IlogInteractLoggerVo ilogInteractLoggerVo) throws Exception;
	
	public void insertRule(IlogRuleLoggerVo ilogRuleLoggerVo) throws Exception;
	
	public void deleteAndInsertInteract(IlogInteractLoggerVo ilogInteractLoggerVo,String saveLogId) throws Exception;
}
