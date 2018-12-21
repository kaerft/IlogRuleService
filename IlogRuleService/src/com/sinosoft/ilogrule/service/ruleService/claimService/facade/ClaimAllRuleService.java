package com.sinosoft.ilogrule.service.ruleService.claimService.facade;

import com.sinosoft.ilogrule.ilog.xom.claimXom.ApproveRule.ApproveRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.AutoUndwrtRule.AutoUndwrtRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.BpmRule.BpmRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.ClaimRule.ClaimRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.RegistRule.RegistRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.SimpleRule.SimpleRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.UndwrtFactorRule.UndwrtFactorRuleXom;



public interface ClaimAllRuleService {
	/**
	 * 执行规则引擎
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	public ClaimRuleXom claimRule(ClaimRuleXom requ,String requestBody);
	
	public SimpleRuleXom simpleRule(SimpleRuleXom requ,String requestBody);
	
	public BpmRuleXom bpmRule(BpmRuleXom requ,String requestBody);
	
	public AutoUndwrtRuleXom autoUndwrtRule(AutoUndwrtRuleXom requ,String requestBody);
	
	public ApproveRuleXom approveRule(ApproveRuleXom requ,String requestBody);
	
	
	public RegistRuleXom registRule(RegistRuleXom requ,String requestBody);
	
	public UndwrtFactorRuleXom undwrtFactorRule(UndwrtFactorRuleXom requ,String requestBody);
}
