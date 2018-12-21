package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PlanDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeResultDto;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.ApplicantXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.InsuredXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.ItemKindXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.MainXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PlanXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeResultXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.util.UtilXom;
import com.sinosoft.ilogrule.util.PubTools;

public class PrpallJfeeConvertUtil {
	
	/**
	 * 入参对象转换
	 * @param approveRuleVo
	 * @return
	 */
	public static PrpallJfeeInputXom ConvertObject(PrpallJfeeInputDto prpallJfeeInputDto){
		PrpallJfeeInputXom prpallJfeeInputXom = new PrpallJfeeInputXom();
		try {
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			//组织判断接口调用非空校验
			StringBuffer sb = new StringBuffer();

			UtilXom utilXom = new UtilXom();
			
			prpallJfeeInputXom.setUtilXom(utilXom);
			
			
			//组织MainXom begin
			MainXom mainXom = new MainXom();
			if(prpallJfeeInputDto.getMainDto()!=null){							
				//String
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getProEndorseType())){
					mainXom.setProEndorseType(prpallJfeeInputDto.getMainDto().getProEndorseType());
				}else{
					sb.append("MainDto.ProEndorseType为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessNo())){
					mainXom.setBusinessNo(prpallJfeeInputDto.getMainDto().getBusinessNo());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getModeCode())){
					mainXom.setModeCode(prpallJfeeInputDto.getMainDto().getModeCode());
				}else{
					sb.append("MainDto.ModeCode为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getPolicyType())){
					mainXom.setPolicyType(prpallJfeeInputDto.getMainDto().getPolicyType());
				}else{
					if(prpallJfeeInputDto.getMainDto().getClassCode()!=null &&
							"06".equals(prpallJfeeInputDto.getMainDto().getClassCode())){
						sb.append("MainDto.PolicyType为空|");
					}
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getPolicyType_Code())){
					mainXom.setPolicyType_Code(prpallJfeeInputDto.getMainDto().getPolicyType_Code());
				}else{
					if(prpallJfeeInputDto.getMainDto().getClassCode()!=null &&
							"06".equals(prpallJfeeInputDto.getMainDto().getClassCode())){
						sb.append("MainDto.PolicyType_Code为空|");
					}
				}
				
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getRenewalFlag())){
					mainXom.setRenewalFlag(prpallJfeeInputDto.getMainDto().getRenewalFlag());
				}else{
					sb.append("MainDto.RenewalFlag为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getRenewalFlag_Code())){
					mainXom.setRenewalFlag_Code(prpallJfeeInputDto.getMainDto().getRenewalFlag_Code());
				}else{
					sb.append("MainDto.RenewalFlag_Code为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getComCode())){
					mainXom.setComCode(prpallJfeeInputDto.getMainDto().getComCode());
				}else{
					sb.append("MainDto.ComCode为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getComName())){
					mainXom.setComName(prpallJfeeInputDto.getMainDto().getComName());
				}else{
					sb.append("MainDto.ComName为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAgentCode())){
					mainXom.setAgentCode(prpallJfeeInputDto.getMainDto().getAgentCode());
				}else{
					mainXom.setAgentCode("");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAgentName())){
					mainXom.setAgentName(prpallJfeeInputDto.getMainDto().getAgentName());
				}else{
					mainXom.setAgentName("");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getFxqFlag())){
					mainXom.setFxqFlag(prpallJfeeInputDto.getMainDto().getFxqFlag());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getClassCode())){
					mainXom.setClassCode(prpallJfeeInputDto.getMainDto().getClassCode());
				}else{
					sb.append("MainDto.ClassCode为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getRiskCode())){
					mainXom.setRiskCode(prpallJfeeInputDto.getMainDto().getRiskCode());
				}else{
					sb.append("MainDto.RiskCode为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getArgueDel())){
					mainXom.setArgueDel(prpallJfeeInputDto.getMainDto().getArgueDel());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getArgueDel_Code())){
					mainXom.setArgueDel_Code(prpallJfeeInputDto.getMainDto().getArgueDel_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeA())){
					mainXom.setAttributeA(prpallJfeeInputDto.getMainDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeB())){
					mainXom.setAttributeB(prpallJfeeInputDto.getMainDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeC())){
					mainXom.setAttributeC(prpallJfeeInputDto.getMainDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeD())){
					mainXom.setAttributeD(prpallJfeeInputDto.getMainDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeE())){
					mainXom.setAttributeE(prpallJfeeInputDto.getMainDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAttributeF())){
					mainXom.setAttributeF(prpallJfeeInputDto.getMainDto().getAttributeF());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessType1())){
					mainXom.setBusinessType1(prpallJfeeInputDto.getMainDto().getBusinessType1());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getPolicySort())){
					mainXom.setPolicySort(prpallJfeeInputDto.getMainDto().getPolicySort());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessNature())){
					mainXom.setBusinessNature(prpallJfeeInputDto.getMainDto().getBusinessNature());
				}else{
					sb.append("MainDto.BusinessNature为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessNature_Code())){
					mainXom.setBusinessNature_Code(prpallJfeeInputDto.getMainDto().getBusinessNature_Code());
				}else{
					sb.append("MainDto.BusinessNature_Code为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getCurrency())){
					mainXom.setCurrency(prpallJfeeInputDto.getMainDto().getCurrency());
				}else{
					sb.append("MainDto.Currency为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getCoinsFlag())){
					mainXom.setCoinsFlag(prpallJfeeInputDto.getMainDto().getCoinsFlag());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getReinsFlag())){
					mainXom.setReinsFlag(prpallJfeeInputDto.getMainDto().getReinsFlag());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getCoinsUranceFlag())){
					mainXom.setCoinsUranceFlag(prpallJfeeInputDto.getMainDto().getCoinsUranceFlag());
				}else{
					sb.append("MainDto.CoinsUranceFlag为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getCoinsLinkFlag())){
					mainXom.setCoinsLinkFlag(prpallJfeeInputDto.getMainDto().getCoinsLinkFlag());
				}else{
					sb.append("MainDto.CoinsLinkFlag为空|");
				}
				
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getHandler_Code())){
					mainXom.setHandler_Code(prpallJfeeInputDto.getMainDto().getHandler_Code());
				}else{
					sb.append("MainDto.Handler_Code为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getHandlerName())){
					mainXom.setHandlerName(prpallJfeeInputDto.getMainDto().getHandlerName());
				}else{
					sb.append("MainDto.HandlerName为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getReinsciFlag())){
					mainXom.setReinsciFlag(prpallJfeeInputDto.getMainDto().getReinsciFlag());
				}else{
					sb.append("MainDto.ReinsciFlag为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessLine())){
					mainXom.setBusinessLine(prpallJfeeInputDto.getMainDto().getBusinessLine());
				}else{
					sb.append("MainDto.BusinessLine为空|");
				}
				
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessClass())){
					mainXom.setBusinessClass(prpallJfeeInputDto.getMainDto().getBusinessClass());
				}else{
					sb.append("MainDto.BusinessClass为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessSource())){
					mainXom.setBusinessSource(prpallJfeeInputDto.getMainDto().getBusinessSource());
				}else{
					sb.append("MainDto.BusinessSource为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBusinessChannel())){
					mainXom.setBusinessChannel(prpallJfeeInputDto.getMainDto().getBusinessChannel());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getAgriFlag())){
					mainXom.setAgriFlag(prpallJfeeInputDto.getMainDto().getAgriFlag());
				}else{
					sb.append("MainDto.AgriFlag为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getEndorReson())){
					mainXom.setEndorReson(prpallJfeeInputDto.getMainDto().getEndorReson());
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.EndorReson为空|");
					}
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getEndorType())){
					mainXom.setEndorType(prpallJfeeInputDto.getMainDto().getEndorType());
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.EndorType为空|");
					}
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getIcCarFlag())){
					mainXom.setIcCarFlag(prpallJfeeInputDto.getMainDto().getIcCarFlag());
				}else{
					sb.append("MainDto.IcCarFlag为空|");
				}
				
				
				
				// Date 日期格式 yyyy-mm-dd
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getStartDate())){
					mainXom.setStartDate(formatter.parse(prpallJfeeInputDto.getMainDto().getStartDate()));
				}else{
					sb.append("MainDto.StartDate为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getEndDate())){
					mainXom.setEndDate(formatter.parse(prpallJfeeInputDto.getMainDto().getEndDate()));
				}else{
					sb.append("MainDto.EndDate为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getInsureDate())){
					mainXom.setInsureDate(formatter.parse(prpallJfeeInputDto.getMainDto().getInsureDate()));
				}else{
					sb.append("MainDto.InsureDate为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getSignDate())){
					mainXom.setSignDate(formatter.parse(prpallJfeeInputDto.getMainDto().getSignDate()));
				}else{
					sb.append("MainDto.SignDate为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getOprTm())){
					mainXom.setOprTm(formatter.parse(prpallJfeeInputDto.getMainDto().getOprTm()));
				}else{
					sb.append("MainDto.OprTm为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getValidDate())){
					mainXom.setValidDate(formatter.parse(prpallJfeeInputDto.getMainDto().getValidDate()));
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.ValidDate为空|");
					}
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getEndorDate())){
					mainXom.setEndorDate(formatter.parse(prpallJfeeInputDto.getMainDto().getEndorDate()));
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.EndorDate为空|");
					}
				}
				
				
				
				
				//Double 
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getSumPremium())){
					mainXom.setSumPremium(Double.parseDouble(prpallJfeeInputDto.getMainDto().getSumPremium()));
				}else{
					sb.append("MainDto.SumPremium为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getSumAmount())){
					mainXom.setSumAmount(Double.parseDouble(prpallJfeeInputDto.getMainDto().getSumAmount()));
				}else{
					sb.append("MainDto.SumAmount为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getSumQuantity())){
					mainXom.setSumQuantity(Double.parseDouble(prpallJfeeInputDto.getMainDto().getSumQuantity()));
				}
				
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getChgAmount())){
					mainXom.setChgAmount(Double.parseDouble(prpallJfeeInputDto.getMainDto().getChgAmount()));
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.ChgAmount为空|");
					}
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getChgPermium())){
					mainXom.setChgPermium(Double.parseDouble(prpallJfeeInputDto.getMainDto().getChgPermium()));
				}else{
					if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
							"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
						sb.append("MainDto.ChgPermium为空|");
					}
				}
				
				
				
				//Integer
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().gettInsrncMonth())){
					mainXom.settInsrncMonth(Integer.parseInt(prpallJfeeInputDto.getMainDto().gettInsrncMonth()));
				}else{
					sb.append("MainDto.tInsrncMonth为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getBackDays())){
					mainXom.setBackDays(Integer.parseInt(prpallJfeeInputDto.getMainDto().getBackDays()));
				}else{
					sb.append("MainDto.BackDays为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getMainDto().getPayTimes())){
					mainXom.setPayTimes(Integer.parseInt(prpallJfeeInputDto.getMainDto().getPayTimes()));
				}else{
					sb.append("MainDto.PayTimes为空|");
				}			
			}
			prpallJfeeInputXom.setMainXom(mainXom);	
			//组织MainXom end
			
			//组织ApplicantXom begin
			ApplicantXom applicantXom = new ApplicantXom();
			if(prpallJfeeInputDto.getApplicantDto()!=null){
				//String
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getCustomerChannel())){
					applicantXom.setCustomerChannel(prpallJfeeInputDto.getApplicantDto().getCustomerChannel());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getCustomerChannel_Code())){
					applicantXom.setCustomerChannel_Code(prpallJfeeInputDto.getApplicantDto().getCustomerChannel_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAppliCode())){
					applicantXom.setAppliCode(prpallJfeeInputDto.getApplicantDto().getAppliCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAppliName())){
					applicantXom.setAppliName(prpallJfeeInputDto.getApplicantDto().getAppliName());
				}else{
					sb.append("ApplicantDto.AppliName为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getInsuredNature())){
					applicantXom.setInsuredNature(prpallJfeeInputDto.getApplicantDto().getInsuredNature());
				}else{
					sb.append("ApplicantDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getInsuredNature_Code())){
					applicantXom.setInsuredNature_Code(prpallJfeeInputDto.getApplicantDto().getInsuredNature_Code());
				}else{
					sb.append("ApplicantDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAppliTrade())){
					applicantXom.setAppliTrade(prpallJfeeInputDto.getApplicantDto().getAppliTrade());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAppliTrade_Code())){
					applicantXom.setAppliTrade_Code(prpallJfeeInputDto.getApplicantDto().getAppliTrade_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getIdentifyType())){
					applicantXom.setIdentifyType(prpallJfeeInputDto.getApplicantDto().getIdentifyType());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getIdentifyType_code())){
					applicantXom.setIdentifyType_code(prpallJfeeInputDto.getApplicantDto().getIdentifyType_code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getIdentifyNumber())){
					applicantXom.setIdentifyNumber(prpallJfeeInputDto.getApplicantDto().getIdentifyNumber());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAppliAddress())){
					applicantXom.setAppliAddress(prpallJfeeInputDto.getApplicantDto().getAppliAddress());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getOccupationName())){
					applicantXom.setOccupationName(prpallJfeeInputDto.getApplicantDto().getOccupationName());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getMarriage())){
					applicantXom.setMarriage(prpallJfeeInputDto.getApplicantDto().getMarriage());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getCreditLevel())){
					applicantXom.setCreditLevel(prpallJfeeInputDto.getApplicantDto().getCreditLevel());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getInsuredIdentity())){
					applicantXom.setInsuredIdentity(prpallJfeeInputDto.getApplicantDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getEducationCode())){
					applicantXom.setEducationCode(prpallJfeeInputDto.getApplicantDto().getEducationCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getSex())){
					applicantXom.setSex(prpallJfeeInputDto.getApplicantDto().getSex());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getSex_Code())){
					applicantXom.setSex_Code(prpallJfeeInputDto.getApplicantDto().getSex_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getVipFlag())){
					applicantXom.setVipFlag(prpallJfeeInputDto.getApplicantDto().getVipFlag());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getLinkerName())){
					applicantXom.setLinkerName(prpallJfeeInputDto.getApplicantDto().getLinkerName());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getLinkerAddress())){
					applicantXom.setLinkerAddress(prpallJfeeInputDto.getApplicantDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getLinkerPostCode())){
					applicantXom.setLinkerPostCode(prpallJfeeInputDto.getApplicantDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getLinkerPhoneNumber())){
					applicantXom.setLinkerPhoneNumber(prpallJfeeInputDto.getApplicantDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getLinkerMobile())){
					applicantXom.setLinkerMobile(prpallJfeeInputDto.getApplicantDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeA())){
					applicantXom.setAttributeA(prpallJfeeInputDto.getApplicantDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeB())){
					applicantXom.setAttributeB(prpallJfeeInputDto.getApplicantDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeC())){
					applicantXom.setAttributeC(prpallJfeeInputDto.getApplicantDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeD())){
					applicantXom.setAttributeD(prpallJfeeInputDto.getApplicantDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeE())){
					applicantXom.setAttributeE(prpallJfeeInputDto.getApplicantDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAttributeF())){
					applicantXom.setAttributeF(prpallJfeeInputDto.getApplicantDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(prpallJfeeInputDto.getApplicantDto().getAge())){
					applicantXom.setAge(Integer.parseInt(prpallJfeeInputDto.getApplicantDto().getAge()));
				}				
			}
			prpallJfeeInputXom.setApplicantXom(applicantXom);
			//组织ApplicantXom end
			
			//组织InsuredXom begin
			InsuredXom insuredXom = new InsuredXom();
			if(prpallJfeeInputDto.getInsuredDto()!=null){
				//String
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredCode())){
					insuredXom.setInsuredCode(prpallJfeeInputDto.getInsuredDto().getInsuredCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredName())){
					insuredXom.setInsuredName(prpallJfeeInputDto.getInsuredDto().getInsuredName());
				}else{
					sb.append("InsuredDto.InsuredName为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredNature())){
					insuredXom.setInsuredNature(prpallJfeeInputDto.getInsuredDto().getInsuredNature());
				}else{
					sb.append("InsuredDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredNature_Code())){
					insuredXom.setInsuredNature_Code(prpallJfeeInputDto.getInsuredDto().getInsuredNature_Code());
				}else{
					sb.append("InsuredDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredTrade())){
					insuredXom.setInsuredTrade(prpallJfeeInputDto.getInsuredDto().getInsuredTrade());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredTrade_Code())){
					insuredXom.setInsuredTrade_Code(prpallJfeeInputDto.getInsuredDto().getInsuredTrade_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getIdentifyType())){
					insuredXom.setIdentifyType(prpallJfeeInputDto.getInsuredDto().getIdentifyType());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getIdentifyType_Code())){
					insuredXom.setIdentifyType_Code(prpallJfeeInputDto.getInsuredDto().getIdentifyType_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getIdentifyNumber())){
					insuredXom.setIdentifyNumber(prpallJfeeInputDto.getInsuredDto().getIdentifyNumber());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredAddress())){
					insuredXom.setInsuredAddress(prpallJfeeInputDto.getInsuredDto().getInsuredAddress());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getOccupationName())){
					insuredXom.setOccupationName(prpallJfeeInputDto.getInsuredDto().getOccupationName());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getMarriage())){
					insuredXom.setMarriage(prpallJfeeInputDto.getInsuredDto().getMarriage());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getCreditLevel())){
					insuredXom.setCreditLevel(prpallJfeeInputDto.getInsuredDto().getCreditLevel());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getInsuredIdentity())){
					insuredXom.setInsuredIdentity(prpallJfeeInputDto.getInsuredDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getEducationCode())){
					insuredXom.setEducationCode(prpallJfeeInputDto.getInsuredDto().getEducationCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getSex())){
					insuredXom.setSex(prpallJfeeInputDto.getInsuredDto().getSex());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getSex_Code())){
					insuredXom.setSex_Code(prpallJfeeInputDto.getInsuredDto().getSex_Code());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getVipFlag())){
					insuredXom.setVipFlag(prpallJfeeInputDto.getInsuredDto().getVipFlag());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getLinkerName())){
					insuredXom.setLinkerName(prpallJfeeInputDto.getInsuredDto().getLinkerName());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getLinkerAddress())){
					insuredXom.setLinkerAddress(prpallJfeeInputDto.getInsuredDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getLinkerPostCode())){
					insuredXom.setLinkerPostCode(prpallJfeeInputDto.getInsuredDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getLinkerPhoneNumber())){
					insuredXom.setLinkerPhoneNumber(prpallJfeeInputDto.getInsuredDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getLinkerMobile())){
					insuredXom.setLinkerMobile(prpallJfeeInputDto.getInsuredDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeA())){
					insuredXom.setAttributeA(prpallJfeeInputDto.getInsuredDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeB())){
					insuredXom.setAttributeB(prpallJfeeInputDto.getInsuredDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeC())){
					insuredXom.setAttributeC(prpallJfeeInputDto.getInsuredDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeD())){
					insuredXom.setAttributeD(prpallJfeeInputDto.getInsuredDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeE())){
					insuredXom.setAttributeE(prpallJfeeInputDto.getInsuredDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAttributeF())){
					insuredXom.setAttributeF(prpallJfeeInputDto.getInsuredDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(prpallJfeeInputDto.getInsuredDto().getAge())){
					insuredXom.setAge(Integer.parseInt(prpallJfeeInputDto.getInsuredDto().getAge()));
				}		
			}
			prpallJfeeInputXom.setInsuredXom(insuredXom);
			//组织InsuredXom end
			
			//组织itemKindXomList begin
			List<ItemKindXom> itemKindXomList = new ArrayList<ItemKindXom>();
			if(prpallJfeeInputDto.getItemKindDtoList()!=null){
				int itemKindlength = prpallJfeeInputDto.getItemKindDtoList().size();				
				for(int i=0;i<itemKindlength;i++ ){
					ItemKindDto itemKindDto = prpallJfeeInputDto.getItemKindDtoList().get(i);
						
					ItemKindXom itemKindXom =new ItemKindXom();
					//String
					if(PubTools.isNotNull(itemKindDto.getItemKindCode())){
						itemKindXom.setItemKindCode(itemKindDto.getItemKindCode());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.ItemKindCode为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getItemKindName())){
						itemKindXom.setItemKindName(itemKindDto.getItemKindName());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.ItemKindName为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getShortRateFlag())){
						itemKindXom.setShortRateFlag(itemKindDto.getShortRateFlag());
					}
					if(PubTools.isNotNull(itemKindDto.getCurrency())){
						itemKindXom.setCurrency(itemKindDto.getCurrency());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Currency为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getFlag())){
						itemKindXom.setFlag(itemKindDto.getFlag());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Flag为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getItemKindFlag())){
						itemKindXom.setItemKindFlag(itemKindDto.getItemKindFlag());
					}
					
					
					//Double
					if(PubTools.isNotNull(itemKindDto.getAmount())){
						itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Amount为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getPremium())){
						itemKindXom.setPremium(Double.parseDouble(itemKindDto.getPremium()));
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Premium为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getShortRate())){
						itemKindXom.setShortRate(Double.parseDouble(itemKindDto.getShortRate()));
					}
					if(PubTools.isNotNull(itemKindDto.getRate())){
						itemKindXom.setRate(Double.parseDouble(itemKindDto.getRate()));
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Rate为空|");
					}
					
					if(PubTools.isNotNull(itemKindDto.getChgAmount())){
						itemKindXom.setChgAmount(Double.parseDouble(itemKindDto.getChgAmount()));
					}else{
						if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
								"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
							sb.append("ItemKindDtoList.ItemKindDto.ChgAmount为空|");
						}
					}
					if(PubTools.isNotNull(itemKindDto.getChgPermium())){
						itemKindXom.setChgPermium(Double.parseDouble(itemKindDto.getChgPermium()));
					}else{
						if(prpallJfeeInputDto.getMainDto().getProEndorseType()!=null &&
								"批单".equals(prpallJfeeInputDto.getMainDto().getProEndorseType())){
							sb.append("ItemKindDtoList.ItemKindDto.ChgPermium为空|");
						}
					}
					
					itemKindXomList.add(itemKindXom);
				}					
			}
			prpallJfeeInputXom.setItemKindXomList(itemKindXomList);
			//组织itemKindXomList end
			
			//组织PlanXom begin
			List<PlanXom> planXomList = new ArrayList<PlanXom>();
			if(prpallJfeeInputDto.getPlanDtoList()!=null){
				int planlength = prpallJfeeInputDto.getPlanDtoList().size();				
				for(int i=0;i<planlength;i++ ){
					PlanDto planDto = prpallJfeeInputDto.getPlanDtoList().get(i);
						
					PlanXom planXom = new PlanXom();
					//String
					if(PubTools.isNotNull(planDto.getCurrency())){
						planXom.setCurrency(planDto.getCurrency());
					}else{
						sb.append("PlanDto.Currency为空|");
					}
					if(PubTools.isNotNull(planDto.getPayReason())){
						planXom.setPayReason(planDto.getPayReason());
					}else{
						sb.append("PlanDto.PayReason为空|");
					}
					
					
	
					//Double
					if(PubTools.isNotNull(planDto.getPayableAmounts())){
						planXom.setPayableAmounts(Double.parseDouble(planDto.getPayableAmounts()));
					}else{
						sb.append("PlanDto.PayableAmounts为空|");
					}
					if(PubTools.isNotNull(planDto.getPaidupAmounts())){
						planXom.setPaidupAmounts(Double.parseDouble(planDto.getPaidupAmounts()));
					}else{
						sb.append("PlanDto.PaidupAmounts为空|");
					}
					if(PubTools.isNotNull(planDto.getPaymentRate())){
						planXom.setPaymentRate(Double.parseDouble(planDto.getPaymentRate()));
					}else{
						sb.append("PlanDto.PaymentRate为空|");
					}
					
					//Integer
					if(PubTools.isNotNull(planDto.getPayNo())){
						planXom.setPayNo(Integer.parseInt(planDto.getPayNo()));
					}else{
						sb.append("PlanDto.PayNo为空|");
					}
					if(PubTools.isNotNull(planDto.getPayforTimes())){
						planXom.setPayforTimes(Integer.parseInt(planDto.getPayforTimes()));
					}else{
						sb.append("PlanDto.PayforTimes为空|");
					}	
					
					// Date 日期格式 yyyy-mm-dd
					if(PubTools.isNotNull(planDto.getPayStartTimes())){
						planXom.setPayStartTimes(formatter.parse(planDto.getPayStartTimes()));
					}else{
						sb.append("PlanDto.PayStartTimes为空|");
					}
					if(PubTools.isNotNull(planDto.getPayEndTimes())){
						planXom.setPayEndTimes(formatter.parse(planDto.getPayEndTimes()));
					}else{
						sb.append("PlanDto.PayEndTimes为空|");
					}
					
					planXomList.add(planXom);
				}
			}
			prpallJfeeInputXom.setPlanXomList(planXomList);
			//组织PlanXom end

			PrpallJfeeResultXom prpallJfeeResultXom =new PrpallJfeeResultXom();
			prpallJfeeResultXom.setStatus("否");
			
			prpallJfeeInputXom.setPrpallJfeeResultXom(prpallJfeeResultXom);
			prpallJfeeInputXom.getPrpallJfeeResultXom().setDescription(sb.toString());
			
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return prpallJfeeInputXom;
	}
	/**
	 * 出参对象转换
	 * @param 
	 * @return
	 */
	public static PrpallJfeeResultDto ConvertObject(PrpallJfeeResultXom prpallJfeeResultXom){
		PrpallJfeeResultDto prpallJfeeResultDto = new PrpallJfeeResultDto();
		try {
			
			if(prpallJfeeResultXom!=null){
				if(prpallJfeeResultXom.getJfeeFlag()!=null && !"".equals(prpallJfeeResultXom.getJfeeFlag())){
					prpallJfeeResultDto.setJfeeFlag(""+prpallJfeeResultXom.getJfeeFlag());
				}else{
					prpallJfeeResultDto.setJfeeFlag("");
				}
				if(prpallJfeeResultXom.getDescription()!=null && !"".equals(prpallJfeeResultXom.getDescription())){
					prpallJfeeResultDto.setDescription(""+prpallJfeeResultXom.getDescription());
				}else{
					prpallJfeeResultDto.setDescription("");
				}
				if(prpallJfeeResultXom.getPath()!=null && !"".equals(prpallJfeeResultXom.getPath())){
					prpallJfeeResultDto.setPath(""+prpallJfeeResultXom.getPath());
				}else{
					prpallJfeeResultDto.setPath("");
				}
				if(prpallJfeeResultXom.getRuleName()!=null && !"".equals(prpallJfeeResultXom.getRuleName())){
					prpallJfeeResultDto.setRuleName(""+prpallJfeeResultXom.getRuleName());
				}else{
					prpallJfeeResultDto.setRuleName("");
				}
				if(prpallJfeeResultXom.getStatus()!=null && !"".equals(prpallJfeeResultXom.getStatus())){
					prpallJfeeResultDto.setStatus(""+prpallJfeeResultXom.getStatus());
				}else{
					prpallJfeeResultDto.setStatus("");
				}
				System.out.println("====JfeeFlag见费出单标志======"+prpallJfeeResultXom.getJfeeFlag());
				System.out.println("====Description描述信息======"+prpallJfeeResultXom.getDescription());
			}
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return prpallJfeeResultDto;
	}
	
	
	/**
	 * 对计算结果四舍五入并保留digit位小数
	 * @param resultValue
	 * @param digit
	 * @return
	 */
	public static double Rounding(double resultValue,int digit){
		double coefficientCount = 0d;
//		BigDecimal big = new BigDecimal(12.555);//会失真           四舍五入2为后12.55
//		BigDecimal big = new BigDecimal("12.555");//不会失真           四舍五入2为后12.56
		
		BigDecimal bd = new BigDecimal(""+resultValue);
		BigDecimal  bd2 = bd.setScale(digit,BigDecimal.ROUND_HALF_UP);
		coefficientCount = Double.parseDouble(bd2.toString());
		
		return coefficientCount;
	}
	
}
