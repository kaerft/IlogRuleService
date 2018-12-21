package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.math.BigDecimal;

import com.sinosoft.ilogrule.ilog.dto.claimDto.ApproveRule.ApproveRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.AutoUndwrtRule.AutoUndwrtRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.BpmRule.BpmRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.ClaimRule.ClaimRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.RegistRule.RegistRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.SimpleRule.SimpleRuleVo;
import com.sinosoft.ilogrule.ilog.dto.claimDto.UndwrtFactorRule.UndwrtFactorRuleVo;
import com.sinosoft.ilogrule.ilog.xom.claimXom.ApproveRule.ApproveRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.AutoUndwrtRule.AutoUndwrtRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.BpmRule.BpmRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.ClaimRule.ClaimRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.RegistRule.RegistRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.SimpleRule.SimpleRuleXom;
import com.sinosoft.ilogrule.ilog.xom.claimXom.UndwrtFactorRule.UndwrtFactorRuleXom;
import com.sinosoft.ilogrule.util.MyBeanUtil;
import com.sinosoft.ilogrule.util.PubTools;

public class ClaimConvertUtil {

	/**
	 * 立案   入参对象转换
	 * @param claimRuleVo
	 * @return
	 */
	public static ClaimRuleXom ConvertObjectClaimRule(ClaimRuleVo claimRuleVo){
		ClaimRuleXom claimRuleXom = new ClaimRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(claimRuleVo!=null){
				//String
				if(PubTools.isNotNull(claimRuleVo.getaBusinessRisk())){
					claimRuleXom.setaBusinessRisk(claimRuleVo.getaBusinessRisk());
				}else{
					sb.append("ClaimRuleVo.aBusinessRisk为空|");
				}
				
				if(PubTools.isNotNull(claimRuleVo.getClassCode())){
					claimRuleXom.setClassCode(claimRuleVo.getClassCode());
				}else{
					sb.append("ClaimRuleVo.ClassCode为空|");
				}
				
				if(PubTools.isNotNull(claimRuleVo.getClassName())){
					claimRuleXom.setClassName(claimRuleVo.getClassName());
				}else{
					sb.append("ClaimRuleVo.ClassName为空|");
				}
				
				if(PubTools.isNotNull(claimRuleVo.getRiskCode())){
					claimRuleXom.setRiskCode(claimRuleVo.getRiskCode());
				}else{
					sb.append("ClaimRuleVo.RiskCode为空|");
				}
				
				if(PubTools.isNotNull(claimRuleVo.getRiskName())){
					claimRuleXom.setRiskName(claimRuleVo.getRiskName());
				}else{
					sb.append("ClaimRuleVo.RiskName为空|");
				}
				
				if(PubTools.isNotNull(claimRuleVo.getKindCode())){
					claimRuleXom.setKindCode(claimRuleVo.getKindCode());
				}
				
				if(PubTools.isNotNull(claimRuleVo.getClaimType())){
					claimRuleXom.setClaimType(claimRuleVo.getClaimType());
				}else{
					sb.append("ClaimRuleVo.ClaimType为空|");
				}
				
				//BigDecimal
				if(claimRuleVo.getSumClaim()!=null){
					claimRuleXom.setSumClaim(claimRuleVo.getSumClaim());
				}else{
					claimRuleXom.setSumClaim(new BigDecimal(0));
				}
				
				if(claimRuleVo.getDifferenceMoney()!=null){
					claimRuleXom.setDifferenceMoney(claimRuleVo.getDifferenceMoney());
				}else{
					claimRuleXom.setDifferenceMoney(new BigDecimal(0));
				}
				
				//int
				if(claimRuleVo.getAdjustTimes()!= 0){
					claimRuleXom.setAdjustTimes(claimRuleVo.getAdjustTimes());
				}else{
					claimRuleXom.setAdjustTimes(0);
				}
				
				if(claimRuleVo.getClaimToDamageDate()!=0){
					claimRuleXom.setClaimToDamageDate(claimRuleVo.getClaimToDamageDate());
				}else{
					claimRuleXom.setClaimToDamageDate(0);
				}
				
				if(claimRuleVo.getClaimToRegistDate()!=0){
					claimRuleXom.setClaimToRegistDate(claimRuleVo.getClaimToRegistDate());
				}else{
					claimRuleXom.setClaimToRegistDate(0);
				}
				
				if(claimRuleVo.getClaimForceDays()!=0){
					claimRuleXom.setClaimForceDays(claimRuleVo.getClaimForceDays());
				}else{
					claimRuleXom.setClaimForceDays(0);
				}
				
				//设置初始默认返回值			
				claimRuleXom.setPass("");		
				String strCheckRequ = sb.toString();
				claimRuleXom.setMessage(strCheckRequ);
				
			}else{
				sb.append("ClaimRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return claimRuleXom;
	}
	
	/**
	 * 立案  出参对象转换
	 * @param claimRuleResponseXom
	 * @return
	 */
	public static ClaimRuleVo ConvertObjectClaimRuleResponse(ClaimRuleXom claimRuleXom){
		ClaimRuleVo claimRuleVo = new ClaimRuleVo();
		try {
			MyBeanUtil.copyProperties(claimRuleXom,claimRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return claimRuleVo;
	}
	
	/**
	 * 简易赔案 入参对象转换
	 * @param simpleRuleVo
	 * @return
	 */
	public static SimpleRuleXom ConvertObjectSimpleRule(SimpleRuleVo simpleRuleVo){
		SimpleRuleXom simpleRuleXom = new SimpleRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(simpleRuleVo!=null){
				//String
				if(PubTools.isNotNull(simpleRuleVo.getaBusinessRisk())){
					simpleRuleXom.setaBusinessRisk(simpleRuleVo.getaBusinessRisk());
				}else{
					sb.append("SimpleRuleVo.aBusinessRisk为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getClassCode())){
					simpleRuleXom.setClassCode(simpleRuleVo.getClassCode());
				}else{
					sb.append("SimpleRuleVo.ClassCode为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getClassName())){
					simpleRuleXom.setClassName(simpleRuleVo.getClassName());
				}else{
					sb.append("SimpleRuleVo.ClassName为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getRiskCode())){
					simpleRuleXom.setRiskCode(simpleRuleVo.getRiskCode());
				}else{
					sb.append("SimpleRuleVo.RiskCode为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getRiskName())){
					simpleRuleXom.setRiskName(simpleRuleVo.getRiskName());
				}else{
					sb.append("SimpleRuleVo.RiskName为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getKindCode())){
					simpleRuleXom.setKindCode(simpleRuleVo.getKindCode());
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getComCode())){
					simpleRuleXom.setComCode(simpleRuleVo.getClassCode());
				}else{
					sb.append("SimpleRuleVo.ComCode为空|");
				}
						
				if(PubTools.isNotNull(simpleRuleVo.getComName())){
					simpleRuleXom.setComName(simpleRuleVo.getClassName());
				}else{
					sb.append("SimpleRuleVo.ComName为空|");
				}
						
				//BigDecimal
				if(simpleRuleVo.getSumClaim()!=null){
					simpleRuleXom.setSumClaim(simpleRuleVo.getSumClaim());
				}else{
					simpleRuleXom.setSumClaim(new BigDecimal(0));
				}
						
				//设置初始默认返回值			
				simpleRuleXom.setPass("");
				String strCheckRequ = sb.toString();
				simpleRuleXom.setMessage(strCheckRequ);
						
			}else{
				sb.append("SimpleRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleRuleXom;
	}
	/**
	 * 简易赔案  出参对象转换
	 * @param simpleRuleResponseXom
	 * @return
	 */
	public static SimpleRuleVo ConvertObjectSimpleRule(SimpleRuleXom simpleRuleXom){
		SimpleRuleVo simpleRuleVo = new SimpleRuleVo();
		try {
			MyBeanUtil.copyProperties(simpleRuleXom,simpleRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return simpleRuleVo;
	}
	/**
	 * 工作流 入参对象转换
	 * @param bpmRuleVo
	 * @return
	 */
	public static BpmRuleXom ConvertObjectBpmRule(BpmRuleVo bpmRuleVo){
		BpmRuleXom bpmRuleXom = new BpmRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(bpmRuleVo!=null){
				//String
				if(PubTools.isNotNull(bpmRuleVo.getComcode())){
					bpmRuleXom.setComcode(bpmRuleVo.getComcode());
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getComName())){
					bpmRuleXom.setComName(bpmRuleVo.getComName());
				}
										
				if(PubTools.isNotNull(bpmRuleVo.getRiskCode())){
					bpmRuleXom.setRiskCode(bpmRuleVo.getRiskCode());
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getRiskName())){
					bpmRuleXom.setRiskName(bpmRuleVo.getRiskName());
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getCurrentNodeCode())){
					bpmRuleXom.setCurrentNodeCode(bpmRuleVo.getCurrentNodeCode());
				}else{
					sb.append("BpmRuleVo.CurrentNodeCode为空|");
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getCurrentNodeName())){
					bpmRuleXom.setCurrentNodeName(bpmRuleVo.getCurrentNodeName());
				}else{
					sb.append("BpmRuleVo.CurrentNodeName为空|");
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getOptionTypeCode())){
					bpmRuleXom.setOptionTypeCode(bpmRuleVo.getOptionTypeCode());
				}else{
					sb.append("BpmRuleVo.OptionTypeCode为空|");
				}
								
				if(PubTools.isNotNull(bpmRuleVo.getOptionTypeName())){
					bpmRuleXom.setOptionTypeName(bpmRuleVo.getOptionTypeName());
				}else{
					sb.append("BpmRuleVo.OptionTypeName为空|");
				}								
								
				//设置初始默认返回值			
				bpmRuleXom.setNextNodeString("");
				String strCheckRequ = sb.toString();
				bpmRuleXom.setNextNodeName(strCheckRequ);
								
			}else{
				sb.append("BpmRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bpmRuleXom;
	}
	/**
	 * 工作流  出参对象转换
	 * @param bpmRuleResponseXom
	 * @return
	 */
	public static BpmRuleVo ConvertObjectBpmRule(BpmRuleXom bpmRuleXom){
		BpmRuleVo bpmRuleVo = new BpmRuleVo();
		try {
			MyBeanUtil.copyProperties(bpmRuleXom,bpmRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bpmRuleVo;
	}
	/**
	 * 自动核赔 入参对象转换
	 * @param autoUndwrtRuleVo
	 * @return
	 */
	public static AutoUndwrtRuleXom ConvertObjectAutoUndwrt(AutoUndwrtRuleVo autoUndwrtRuleVo){
		AutoUndwrtRuleXom autoUndwrtRuleXom = new AutoUndwrtRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(autoUndwrtRuleVo!=null){
				//String
				if(PubTools.isNotNull(autoUndwrtRuleVo.getDamageCode())){
					autoUndwrtRuleXom.setDamageCode(autoUndwrtRuleVo.getDamageCode());
				}else{
					sb.append("ClaimRuleVo.DamageCode为空|");
				}
						
				if(PubTools.isNotNull(autoUndwrtRuleVo.getDamageName())){
					autoUndwrtRuleXom.setDamageName(autoUndwrtRuleVo.getDamageName());
				}else{
					sb.append("ClaimRuleVo.DamageName为空|");
				}
				
				//BigDecimal
				if(autoUndwrtRuleVo.getUndwrtAmount()!=null){
					autoUndwrtRuleXom.setUndwrtAmount(autoUndwrtRuleVo.getUndwrtAmount());
				}else{
					autoUndwrtRuleXom.setUndwrtAmount(new BigDecimal(0));
				}
						
				//int
				if(autoUndwrtRuleVo.getDaysRegistFromDamage()!= 0){
					autoUndwrtRuleXom.setDaysRegistFromDamage(autoUndwrtRuleVo.getDaysRegistFromDamage());
				}else{
					autoUndwrtRuleXom.setDaysRegistFromDamage(0);
				}
						
				if(autoUndwrtRuleVo.getDaysClaimFromRegist()!=0){
					autoUndwrtRuleXom.setDaysClaimFromRegist(autoUndwrtRuleVo.getDaysClaimFromRegist());
				}else{
					autoUndwrtRuleXom.setDaysClaimFromRegist(0);
				}
						
				//设置初始默认返回值			
				autoUndwrtRuleXom.setPass("");
				String strCheckRequ = sb.toString();
				autoUndwrtRuleXom.setMessage(strCheckRequ);
						
			}else{
				sb.append("AutoUndwrtRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return autoUndwrtRuleXom;
	}
	/**
	 * 自动核赔  出参对象转换
	 * @param autoUndwrtRuleResponseXom
	 * @return
	 */
	public static AutoUndwrtRuleVo ConvertObjectAutoUndwrtRule(AutoUndwrtRuleXom autoUndwrtRuleXom){
		AutoUndwrtRuleVo autoUndwrtRuleVo = new AutoUndwrtRuleVo();
		try {
			MyBeanUtil.copyProperties(autoUndwrtRuleXom,autoUndwrtRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return autoUndwrtRuleVo;
	}
	
	/**
	 * 高级审核 入参对象转换
	 * @param autoUndwrtRuleVo
	 * @return
	 */
	public static ApproveRuleXom ConvertObjectApprove(ApproveRuleVo approveRuleVo){
		ApproveRuleXom approveRuleXom = new ApproveRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(approveRuleVo!=null){
				//String
				if(PubTools.isNotNull(approveRuleVo.getaBusinessRisk())){
					approveRuleXom.setaBusinessRisk(approveRuleVo.getaBusinessRisk());
				}else{
					sb.append("ApproveRuleVo.aBusinessRisk为空|");
				}
						
				if(PubTools.isNotNull(approveRuleVo.getClassCode())){
					approveRuleXom.setClassCode(approveRuleVo.getClassCode());
				}else{
					sb.append("ApproveRuleVo.ClassCode为空|");
				}
						
				if(PubTools.isNotNull(approveRuleVo.getClassName())){
					approveRuleXom.setClassName(approveRuleVo.getClassName());
				}else{
					sb.append("ApproveRuleVo.ClassName为空|");
				}
						
				if(PubTools.isNotNull(approveRuleVo.getRiskCode())){
					approveRuleXom.setRiskCode(approveRuleVo.getRiskCode());
				}else{
					sb.append("ApproveRuleVo.RiskCode为空|");
				}
						
				if(PubTools.isNotNull(approveRuleVo.getRiskName())){
					approveRuleXom.setRiskName(approveRuleVo.getRiskName());
				}else{
					sb.append("ApproveRuleVo.RiskName为空|");
				}
						
				if(PubTools.isNotNull(approveRuleVo.getKindCode())){
					approveRuleXom.setKindCode(approveRuleVo.getKindCode());
				}
					
				if(PubTools.isNotNull(approveRuleVo.getComCode())){
					approveRuleXom.setComCode(approveRuleVo.getComCode());
				}else{
					sb.append("ApproveRuleVo.ComCode为空|");
				}
				
				if(PubTools.isNotNull(approveRuleVo.getComName())){
					approveRuleXom.setComName(approveRuleVo.getComName());
				}else{
					sb.append("ApproveRuleVo.ComName为空|");
				}
				if(PubTools.isNotNull(approveRuleVo.getNodeCode())){
					approveRuleXom.setNodeCode(approveRuleVo.getNodeCode());
				}else{
					sb.append("ApproveRuleVo.NodeCode为空|");
				}
				if(PubTools.isNotNull(approveRuleVo.getNodeName())){
					approveRuleXom.setNodeName(approveRuleVo.getNodeName());
				}else{
					sb.append("ApproveRuleVo.NodeName为空|");
				}
				
				if(PubTools.isNotNull(approveRuleVo.getApproveTypeName())){
					approveRuleXom.setApproveTypeName(approveRuleVo.getApproveTypeName());
				}else{
					sb.append("ApproveRuleVo.ApproveTypeName为空|");
				}
				
				if(PubTools.isNotNull(approveRuleVo.getIfCase())){
					approveRuleXom.setIfCase(approveRuleVo.getIfCase());
				}
					
				if(PubTools.isNotNull(approveRuleVo.getIfDirectory())){
					approveRuleXom.setIfDirectory(approveRuleVo.getIfDirectory());
				}
				
				if(PubTools.isNotNull(approveRuleVo.getIfBranchOfficePower())){
					approveRuleXom.setIfBranchOfficePower(approveRuleVo.getIfBranchOfficePower());
				}
				
				if(PubTools.isNotNull(approveRuleVo.getIfInsurant())){
					approveRuleXom.setIfInsurant(approveRuleVo.getIfInsurant());
				}
				
				if(PubTools.isNotNull(approveRuleVo.getIfModify())){
					approveRuleXom.setIfModify(approveRuleVo.getIfModify());
				}
				
				if(PubTools.isNotNull(approveRuleVo.getIsAgreement())){
					approveRuleXom.setIsAgreement(approveRuleVo.getIsAgreement());
				}
				
				//BigDecimal
				if(approveRuleVo.getSumClaim()!=null){
					approveRuleXom.setSumClaim(approveRuleVo.getSumClaim());
				}else{
					approveRuleXom.setSumClaim(new BigDecimal(0));
				}
						
				if(approveRuleVo.getDifferenceMoney()!=null){
					approveRuleXom.setDifferenceMoney(approveRuleVo.getDifferenceMoney());
				}else{
					approveRuleXom.setDifferenceMoney(new BigDecimal(0));
				}
						
				if(approveRuleVo.getReverseAmount()!=null){
					approveRuleXom.setReverseAmount(approveRuleVo.getReverseAmount());
				}else{
					approveRuleXom.setReverseAmount(new BigDecimal(0));
				}
				
				if(approveRuleVo.getCompensateAmount()!=null){
					approveRuleXom.setCompensateAmount(approveRuleVo.getCompensateAmount());
				}else{
					approveRuleXom.setCompensateAmount(new BigDecimal(0));
				}
				
				if(approveRuleVo.getSumPlanReplevy()!=null){
					approveRuleXom.setSumPlanReplevy(approveRuleVo.getSumPlanReplevy());
				}else{
					approveRuleXom.setSumPlanReplevy(new BigDecimal(0));
				}
				
				if(approveRuleVo.getSumLossFee()!=null){
					approveRuleXom.setSumLossFee(approveRuleVo.getSumLossFee());
				}else{
					approveRuleXom.setSumLossFee(new BigDecimal(0));
				}
				
				if(approveRuleVo.getSumReturnPay()!=null){
					approveRuleXom.setSumReturnPay(approveRuleVo.getSumReturnPay());
				}else{
					approveRuleXom.setSumReturnPay(new BigDecimal(0));
				}
				
				if(approveRuleVo.getSumCompensate()!=null){
					approveRuleXom.setSumCompensate(approveRuleVo.getSumCompensate());
				}else{
					approveRuleXom.setSumCompensate(new BigDecimal(0));
				}
				
				if(approveRuleVo.getSumReturnBacket()!=null){
					approveRuleXom.setSumReturnBacket(approveRuleVo.getSumReturnBacket());
				}else{
					approveRuleXom.setSumReturnBacket(new BigDecimal(0));
				}
				
				if(approveRuleVo.getPropLoss()!=null){
					approveRuleXom.setPropLoss(approveRuleVo.getPropLoss());
				}else{
					approveRuleXom.setPropLoss(new BigDecimal(0));
				}
				
				if(approveRuleVo.getCheckFee()!=null){
					approveRuleXom.setCheckFee(approveRuleVo.getCheckFee());
				}else{
					approveRuleXom.setCheckFee(new BigDecimal(0));
				}
				
				//int
				if(approveRuleVo.getClaimToDamageDate()!= 0){
					approveRuleXom.setClaimToDamageDate(approveRuleVo.getClaimToDamageDate());
				}else{
					approveRuleXom.setClaimToDamageDate(0);
				}
						
				if(approveRuleVo.getClaimToRegistDate()!=0){
					approveRuleXom.setClaimToRegistDate(approveRuleVo.getClaimToRegistDate());
				}else{
					approveRuleXom.setClaimToRegistDate(0);
				}
						
				if(approveRuleVo.getAdjustTimes()!=0){
					approveRuleXom.setAdjustTimes(approveRuleVo.getAdjustTimes());
				}else{
					approveRuleXom.setAdjustTimes(0);
				}
						
				if(approveRuleVo.getAncelRecoverTimes()!=0){
					approveRuleXom.setAncelRecoverTimes(approveRuleVo.getAncelRecoverTimes());
				}else{
					approveRuleXom.setAncelRecoverTimes(0);
				}
				
				if(approveRuleVo.getReclaimTimes()!=0){
					approveRuleXom.setReclaimTimes(approveRuleVo.getReclaimTimes());
				}else{
					approveRuleXom.setReclaimTimes(0);
				}
				
				//设置初始默认返回值			
				approveRuleXom.setPass("");
				String strCheckRequ = sb.toString();
				approveRuleXom.setMessage(strCheckRequ);
						
			}else{
				sb.append("ApproveRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return approveRuleXom;
	}
	/**
	 * 高级审核  出参对象转换
	 * @param approveRuleResponseXom
	 * @return
	 */
	public static ApproveRuleVo ConvertObjectApprove(ApproveRuleXom approveRuleXom){
		ApproveRuleVo approveRuleVo = new ApproveRuleVo();
		try {
			MyBeanUtil.copyProperties(approveRuleXom,approveRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return approveRuleVo;
	}
	
	
	/**
	 * 报案 入参对象转换
	 * @param registRuleVo
	 * @return
	 */
	public static RegistRuleXom ConvertObjectRegist(RegistRuleVo registRuleVo){
		RegistRuleXom registRuleXom = new RegistRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(registRuleVo!=null){
				//String
				if(PubTools.isNotNull(registRuleVo.getRegistName())){
					registRuleXom.setRegistName(registRuleVo.getRegistName());
				}else{
					sb.append("RegistRuleVo.RegistName为空|");
				}
				
				if(PubTools.isNotNull(registRuleVo.getaBusinessRisk())){
					registRuleXom.setaBusinessRisk(registRuleVo.getaBusinessRisk());
				}else{
					sb.append("RegistRuleVo.aBusinessRisk为空|");
				}	
						
				if(PubTools.isNotNull(registRuleVo.getRiskCode())){
					registRuleXom.setRiskCode(registRuleVo.getRiskCode());
				}else{
					sb.append("RegistRuleVo.RiskCode为空|");
				}
						
				if(PubTools.isNotNull(registRuleVo.getRiskName())){
					registRuleXom.setRiskName(registRuleVo.getRiskName());
				}else{
					sb.append("RegistRuleVo.RiskName为空|");
				}
						
				if(PubTools.isNotNull(registRuleVo.getComCode())){
					registRuleXom.setComCode(registRuleVo.getComCode());
				}else{
					sb.append("RegistRuleVo.ComCode为空|");
				}
						
				if(PubTools.isNotNull(registRuleVo.getComName())){
					registRuleXom.setComName(registRuleVo.getComName());
				}else{
					sb.append("RegistRuleVo.ComName为空|");
				}
						
				//BigDecimal
				if(registRuleVo.getReprtedLoss()!=null){
					registRuleXom.setReprtedLoss(registRuleVo.getReprtedLoss());
				}else{
					registRuleXom.setReprtedLoss(new BigDecimal(0));
				}
								
				//设置初始默认返回值			
				registRuleXom.setPass("");
				String strCheckRequ = sb.toString();
				registRuleXom.setMessage(strCheckRequ);
						
			}else{
				sb.append("RegistRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registRuleXom;
	}
	/**
	 * 报案  出参对象转换
	 * @param registRuleXom
	 * @return
	 */
	public static RegistRuleVo ConvertObjectRegist(RegistRuleXom registRuleXom){
		RegistRuleVo registRuleVo = new RegistRuleVo();
		try {
			MyBeanUtil.copyProperties(registRuleXom,registRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registRuleVo;
	}
	/**
	 * 核赔入参对象转换
	 * @param registRuleVo
	 * @return
	 */
	public static UndwrtFactorRuleXom ConvertObjectUndwrtFactor(UndwrtFactorRuleVo undwrtFactorRuleVo){
		UndwrtFactorRuleXom undwrtFactorRuleXom = new UndwrtFactorRuleXom();
		//组织判断接口调用非空校验
		StringBuffer sb = new StringBuffer();
		try {
			if(undwrtFactorRuleVo!=null){
				//String
				if(PubTools.isNotNull(undwrtFactorRuleVo.getaBusinessRisk())){
					undwrtFactorRuleXom.setaBusinessRisk(undwrtFactorRuleVo.getaBusinessRisk());
				}else{
					sb.append("UndwrtFactorRuleVo.aBusinessRisk为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getClassCode())){
					undwrtFactorRuleXom.setClassCode(undwrtFactorRuleVo.getClassCode());
				}else{
					sb.append("UndwrtFactorRuleVo.ClassCode为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getClassName())){
					undwrtFactorRuleXom.setClassName(undwrtFactorRuleVo.getClassName());
				}else{
					sb.append("UndwrtFactorRuleVo.ClassName为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getRiskCode())){
					undwrtFactorRuleXom.setRiskCode(undwrtFactorRuleVo.getRiskCode());
				}else{
					sb.append("UndwrtFactorRuleVo.RiskCode为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getRiskName())){
					undwrtFactorRuleXom.setRiskName(undwrtFactorRuleVo.getRiskName());
				}else{
					sb.append("UndwrtFactorRuleVo.RiskName为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getKindCode())){
					undwrtFactorRuleXom.setKindCode(undwrtFactorRuleVo.getKindCode());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getComcode())){
					undwrtFactorRuleXom.setComcode(undwrtFactorRuleVo.getComcode());
				}else{
					sb.append("UndwrtFactorRuleVo.Comcode为空|");
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getComName())){
					undwrtFactorRuleXom.setComName(undwrtFactorRuleVo.getComName());
				}else{
					sb.append("UndwrtFactorRuleVo.ComName为空|");
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getChargeCode())){
					undwrtFactorRuleXom.setChargeCode(undwrtFactorRuleVo.getChargeCode());
				}else{
					sb.append("UndwrtFactorRuleVo.ChargeCode为空|");
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getChargeName())){
					undwrtFactorRuleXom.setChargeName(undwrtFactorRuleVo.getChargeName());
				}else{
					sb.append("UndwrtFactorRuleVo.ChargeName为空|");
				}
						
				if(PubTools.isNotNull(undwrtFactorRuleVo.getUndwrtType())){
					undwrtFactorRuleXom.setUndwrtType(undwrtFactorRuleVo.getUndwrtType());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getReceivableFlag())){
					undwrtFactorRuleXom.setReceivableFlag(undwrtFactorRuleVo.getReceivableFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getReClaimFlag())){
					undwrtFactorRuleXom.setReClaimFlag(undwrtFactorRuleVo.getReClaimFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getCoinsuranceFlag())){
					undwrtFactorRuleXom.setCoinsuranceFlag(undwrtFactorRuleVo.getCoinsuranceFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getAccommodateFlag())){
					undwrtFactorRuleXom.setAccommodateFlag(undwrtFactorRuleVo.getAccommodateFlag());
				}else{
					sb.append("UndwrtFactorRuleVo.AccommodateFlag为空|");
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getFacultativeFlag())){
					undwrtFactorRuleXom.setFacultativeFlag(undwrtFactorRuleVo.getFacultativeFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getRejectClaimFlag())){
					undwrtFactorRuleXom.setRejectClaimFlag(undwrtFactorRuleVo.getRejectClaimFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getZeroFlag())){
					undwrtFactorRuleXom.setZeroFlag(undwrtFactorRuleVo.getZeroFlag());
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getUndwrtLevelCode())){
					undwrtFactorRuleXom.setUndwrtLevelCode(undwrtFactorRuleVo.getUndwrtLevelCode());
				}else{
					sb.append("UndwrtFactorRuleVo.UndwrtLevelCode为空|");
				}
				
				if(PubTools.isNotNull(undwrtFactorRuleVo.getUndwrtLevelName())){
					undwrtFactorRuleXom.setUndwrtLevelName(undwrtFactorRuleVo.getUndwrtLevelName());
				}else{
					sb.append("UndwrtFactorRuleVo.UndwrtLevelName为空|");
				}
				
				//BigDecimal
				if(undwrtFactorRuleVo.getClaimAmt()!=null){
					undwrtFactorRuleXom.setClaimAmt(undwrtFactorRuleVo.getClaimAmt());
				}else{
					undwrtFactorRuleXom.setClaimAmt(new BigDecimal(0));
				}
						
				if(undwrtFactorRuleVo.getPayAmt()!=null){
					undwrtFactorRuleXom.setPayAmt(undwrtFactorRuleVo.getPayAmt());
				}else{
					undwrtFactorRuleXom.setPayAmt(new BigDecimal(0));
				}
				
				if(undwrtFactorRuleVo.getPayFee()!=null){
					undwrtFactorRuleXom.setPayFee(undwrtFactorRuleVo.getPayFee());
				}else{
					undwrtFactorRuleXom.setPayFee(new BigDecimal(0));
				}
				
				if(undwrtFactorRuleVo.getPrePayAmt()!=null){
					undwrtFactorRuleXom.setPrePayAmt(undwrtFactorRuleVo.getPrePayAmt());
				}else{
					undwrtFactorRuleXom.setPrePayAmt(new BigDecimal(0));
				}
				
				if(undwrtFactorRuleVo.getPrePayFee()!=null){
					undwrtFactorRuleXom.setPrePayFee(undwrtFactorRuleVo.getPrePayFee());
				}else{
					undwrtFactorRuleXom.setPrePayFee(new BigDecimal(0));
				}
								
				//设置初始默认返回值			
				undwrtFactorRuleXom.setPass("");
				String strCheckRequ = sb.toString();
				undwrtFactorRuleXom.setMessage(strCheckRequ);
						
			}else{
				sb.append("UndwrtFactorRuleVo为空|");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return undwrtFactorRuleXom;
	}
	/**
	 * 报案  出参对象转换
	 * @param registRuleXom
	 * @return
	 */
	public static UndwrtFactorRuleVo ConvertObjectUndwrtFactor(UndwrtFactorRuleXom undwrtFactorRuleXom){
		UndwrtFactorRuleVo rndwrtFactorRuleVo = new UndwrtFactorRuleVo();
		try {
			MyBeanUtil.copyProperties(undwrtFactorRuleXom,rndwrtFactorRuleVo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rndwrtFactorRuleVo;
	}
}
