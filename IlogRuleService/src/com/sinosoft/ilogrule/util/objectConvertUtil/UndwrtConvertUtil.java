package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UnderwriteResultDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UndwrtInputDto;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.ApplicantXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.InsuredXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.ItemKindXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.MainXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.OtherXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UndwrtInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.VehicleOwnerXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.VehicleXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.util.UtilXom;
import com.sinosoft.ilogrule.service.undwrtGradeService.facade.UndwrtGradeService;
import com.sinosoft.ilogrule.service.undwrtGradeService.impl.UndwrtGradeServiceImpl;
import com.sinosoft.ilogrule.util.MyBeanUtil;
import com.sinosoft.ilogrule.util.PubTools;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeVo;

public class UndwrtConvertUtil {
		
	/**
	 * 入参对象转换
	 * @param approveRuleVo
	 * @return
	 */
	public static UndwrtInputXOM ConvertObject(UndwrtInputDto undwrtInputDto){
		UndwrtInputXOM undwrtInputXOM = new UndwrtInputXOM();
		undwrtInputXOM.setUnderwriteResultXOM(new UnderwriteResultXOM());
		try {
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 

			//组织判断接口调用非空校验
			StringBuffer sb = new StringBuffer();
			
			//自定义属性初始值设置 begin
			UtilXom utilXom = new UtilXom();
			utilXom.setIsNullOfRenewalYears("true");
			utilXom.setIsNullOfBeforePrem("true");
			utilXom.setIsNullOfEntireDiscount("true");
			utilXom.setIsNullOfAfterPrem("true");
			utilXom.setIsNullOfAgeAppli("true");
			utilXom.setIsNullOfAgeInsured("true");
			utilXom.setIsNullOfRunMiles("true");
			utilXom.setIsNullOfActualValue("true");
			utilXom.setIsNullOfNDisplacement("true");
			utilXom.setIsNullOfLastClaimAmount("true");
			utilXom.setIsNullOfLossNumber("true");
			utilXom.setIsNullOfClaimadjustValue("true");
			utilXom.setIsNullOfAtuoBusiness("true");
			utilXom.setIsNullOfCountNCDCof("true");
			
			utilXom.setIsNullSelfProtectionCof("true");
			utilXom.setIsNullSelfChannelCof("true");
			utilXom.setIsNullCarPriceCof("true");//承保定价系数
			
			utilXom.setIsNullOfhfTaxValue("true");//车船税
			
			utilXom.setApplicantRes("不属于");
			utilXom.setInSuredRes("不属于");
			utilXom.setVehicleOwnerRes("不属于");
			//自定义属性初始值设置 end
			
			//获取入参险种
			String reqRiskCode = ""; 
			
			//组织MainXom begin
			MainXom mainXom = new MainXom();
			if(undwrtInputDto.getMainDto()!=null){							
				//String
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getProposalNo())){
					mainXom.setProposalNo(undwrtInputDto.getMainDto().getProposalNo());
				}else{
				    sb.append("MainDto.ProposalNo为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getModeCode())){
					mainXom.setModeCode(undwrtInputDto.getMainDto().getModeCode());
				}else{
					sb.append("MainDto.ModeCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolicyType())){
					mainXom.setPolicyType(undwrtInputDto.getMainDto().getPolicyType());
				}else{
					sb.append("MainDto.PolicyType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolicyType_Code())){
					mainXom.setPolicyType_Code(undwrtInputDto.getMainDto().getPolicyType_Code());
				}else{
					sb.append("MainDto.PolicyType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalFlag())){
					mainXom.setRenewalFlag(undwrtInputDto.getMainDto().getRenewalFlag());
				}else{
					sb.append("MainDto.RenewalFlag为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalFlag_Code())){
					mainXom.setRenewalFlag_Code(undwrtInputDto.getMainDto().getRenewalFlag_Code());
				}else{
					sb.append("MainDto.RenewalFlag_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getComCode())){
					mainXom.setComCode(undwrtInputDto.getMainDto().getComCode());
				}else{
					sb.append("MainDto.ComCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getComName())){
					mainXom.setComName(undwrtInputDto.getMainDto().getComName());
				}else{
					sb.append("MainDto.ComName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAgentCode())){
					mainXom.setAgentCode(undwrtInputDto.getMainDto().getAgentCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAgentName())){
					mainXom.setAgentName(undwrtInputDto.getMainDto().getAgentName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getFxqFlag())){
					mainXom.setFxqFlag(undwrtInputDto.getMainDto().getFxqFlag());
				}else{
					sb.append("MainDto.FxqFlag为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getProdFlag())){
					mainXom.setProdFlag(undwrtInputDto.getMainDto().getProdFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getClassCode())){
					mainXom.setClassCode(undwrtInputDto.getMainDto().getClassCode());
				}else{
					sb.append("MainDto.ClassCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRiskCode())){
					mainXom.setRiskCode(undwrtInputDto.getMainDto().getRiskCode());
					reqRiskCode = undwrtInputDto.getMainDto().getRiskCode();
				}else{
					sb.append("MainDto.RiskCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getArgueDel())){
					mainXom.setArgueDel(undwrtInputDto.getMainDto().getArgueDel());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getArgueDel_Code())){
					mainXom.setArgueDel_Code(undwrtInputDto.getMainDto().getArgueDel_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getInformContent())){
					mainXom.setInformContent(undwrtInputDto.getMainDto().getInformContent());
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getIsTimelyEffective())){
					mainXom.setIsTimelyEffective(undwrtInputDto.getMainDto().getIsTimelyEffective());
				}else{
					sb.append("MainDto.IsTimelyEffective为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEngageContext())){
					mainXom.setEngageContext(undwrtInputDto.getMainDto().getEngageContext());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAttributeA())){
					mainXom.setAttributeA(undwrtInputDto.getMainDto().getAttributeA());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAttributeB())){
					mainXom.setAttributeB(undwrtInputDto.getMainDto().getAttributeB());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAttributeC())){
					mainXom.setAttributeC(undwrtInputDto.getMainDto().getAttributeC());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEngageContext())){
					mainXom.setAttributeD(undwrtInputDto.getMainDto().getAttributeD());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAttributeE())){
					mainXom.setAttributeE(undwrtInputDto.getMainDto().getAttributeE());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAttributeF())){
					mainXom.setAttributeF(undwrtInputDto.getMainDto().getAttributeF());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBusinessType1())){
					mainXom.setBusinessType1(undwrtInputDto.getMainDto().getBusinessType1());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolicySort())){
					mainXom.setPolicySort(undwrtInputDto.getMainDto().getPolicySort());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBusinessNature())){
					mainXom.setBusinessNature(undwrtInputDto.getMainDto().getBusinessNature());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBusinessNature_Code())){
					mainXom.setBusinessNature_Code(undwrtInputDto.getMainDto().getBusinessNature_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getCurrency())){
					mainXom.setCurrency(undwrtInputDto.getMainDto().getCurrency());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPayTimes())){
					mainXom.setPayTimes(undwrtInputDto.getMainDto().getPayTimes());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getCoinsFlag())){
					mainXom.setCoinsFlag(undwrtInputDto.getMainDto().getCoinsFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getReinsFlag())){
					mainXom.setReinsFlag(undwrtInputDto.getMainDto().getReinsFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getCoinsUranceFlag())){
					mainXom.setCoinsUranceFlag(undwrtInputDto.getMainDto().getCoinsUranceFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getCoinsLinkFlag())){
					mainXom.setCoinsLinkFlag(undwrtInputDto.getMainDto().getCoinsLinkFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getStopTimes())){
					mainXom.setStopTimes(undwrtInputDto.getMainDto().getStopTimes());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getHandlerName())){
					mainXom.setHandlerName(undwrtInputDto.getMainDto().getHandlerName());
				}else{
					sb.append("MainDto.HandlerName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getHandler_Code())){
					mainXom.setHandler_Code(undwrtInputDto.getMainDto().getHandler_Code());
				}else{
					sb.append("MainDto.Handler_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getIntoBusiness())){
					mainXom.setIntoBusiness(undwrtInputDto.getMainDto().getIntoBusiness());
				}else{
					sb.append("MainDto.IntoBusiness为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getProposalEndorseType())){
					mainXom.setProposalEndorseType(undwrtInputDto.getMainDto().getProposalEndorseType());
				}else{
					sb.append("MainDto.ProposalEndorseType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEndorseNo())){
					mainXom.setEndorseNo(undwrtInputDto.getMainDto().getEndorseNo());
				}
				
				// Date 日期格式 yyyy-mm-dd
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getStartDate())){
					mainXom.setStartDate(formatter.parse(undwrtInputDto.getMainDto().getStartDate()));
				}else{
					sb.append("MainDto.StartDate为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEndDate())){
					mainXom.setEndDate(formatter.parse(undwrtInputDto.getMainDto().getEndDate()));
				}else{
					sb.append("MainDto.EndDate为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getInsureDate())){
					mainXom.setInsureDate(formatter.parse(undwrtInputDto.getMainDto().getInsureDate()));
				}else{
					sb.append("MainDto.InsureDate为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getSignDate())){
					mainXom.setSignDate(formatter.parse(undwrtInputDto.getMainDto().getSignDate()));
				}else{
					sb.append("MainDto.SignDate为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getOprTm())){
					mainXom.setOprTm(formatter.parse(undwrtInputDto.getMainDto().getOprTm()));
				}else{
					sb.append("MainDto.OprTm为空|");
				}
				
				//Double 
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBeforePrem())){
					mainXom.setBeforePrem(Double.parseDouble(undwrtInputDto.getMainDto().getBeforePrem()));
				}else{
					utilXom.setIsNullOfBeforePrem("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEntireDiscount())){
					mainXom.setEntireDiscount(Double.parseDouble(undwrtInputDto.getMainDto().getEntireDiscount()));
				}else{
					utilXom.setIsNullOfEntireDiscount("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAfterPrem())){
					mainXom.setAfterPrem(Double.parseDouble(undwrtInputDto.getMainDto().getAfterPrem()));
				}else{
					utilXom.setIsNullOfAfterPrem("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getSumAmount())){
					mainXom.setSumAmount(Double.parseDouble(undwrtInputDto.getMainDto().getSumAmount()));
				}else{
					sb.append("MainDto.SumAmount为空|");
				}
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().gettInsrncDay())){
					mainXom.settInsrncDay(Integer.parseInt(undwrtInputDto.getMainDto().gettInsrncDay()));
				}else{
					sb.append("MainDto.tInsrncDay为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalYears())){
					mainXom.setRenewalYears(Integer.parseInt(undwrtInputDto.getMainDto().getRenewalYears()));
				}else{
					utilXom.setIsNullOfRenewalYears("false");
				}							
			}else{
				sb.append("MainDto为空|");
			}
			undwrtInputXOM.setMainXom(mainXom);	
			//组织MainXom end
			
			//组织ApplicantXom begin
			ApplicantXom applicantXom = new ApplicantXom();
			if(undwrtInputDto.getApplicantDto()!=null){
				//String
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getCustomerChannel())){
					applicantXom.setCustomerChannel(undwrtInputDto.getApplicantDto().getCustomerChannel());
				}else{
					sb.append("ApplicantDto.CustomerChannel为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getCustomerChannel_Code())){
					applicantXom.setCustomerChannel_Code(undwrtInputDto.getApplicantDto().getCustomerChannel_Code());
				}else{
					sb.append("ApplicantDto.CustomerChannel_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliCode())){
					applicantXom.setAppliCode(undwrtInputDto.getApplicantDto().getAppliCode());
				}else{
					sb.append("ApplicantDto.AppliCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliName())){
					applicantXom.setAppliName(undwrtInputDto.getApplicantDto().getAppliName());
				}else{
					sb.append("ApplicantDto.AppliName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getInsuredNature())){
					applicantXom.setInsuredNature(undwrtInputDto.getApplicantDto().getInsuredNature());
				}else{
					sb.append("ApplicantDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getInsuredNature_Code())){
					applicantXom.setInsuredNature_Code(undwrtInputDto.getApplicantDto().getInsuredNature_Code());
				}else{
					sb.append("ApplicantDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliTrade())){
					applicantXom.setAppliTrade(undwrtInputDto.getApplicantDto().getAppliTrade());
				}else{
					sb.append("ApplicantDto.AppliTrade为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliTrade_Code())){
					applicantXom.setAppliTrade_Code(undwrtInputDto.getApplicantDto().getAppliTrade_Code());
				}else{
					sb.append("ApplicantDto.AppliTrade_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyType())){
					applicantXom.setIdentifyType(undwrtInputDto.getApplicantDto().getIdentifyType());
				}else{
					sb.append("ApplicantDto.IdentifyType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyType_code())){
					applicantXom.setIdentifyType_code(undwrtInputDto.getApplicantDto().getIdentifyType_code());
				}else{
					sb.append("ApplicantDto.IdentifyType_code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyNumber())){
					applicantXom.setIdentifyNumber(undwrtInputDto.getApplicantDto().getIdentifyNumber());
				}else{
					sb.append("ApplicantDto.IdentifyNumber为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliAddress())){
					applicantXom.setAppliAddress(undwrtInputDto.getApplicantDto().getAppliAddress());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getOccupationName())){
					applicantXom.setOccupationName(undwrtInputDto.getApplicantDto().getOccupationName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getMarriage())){
					applicantXom.setMarriage(undwrtInputDto.getApplicantDto().getMarriage());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getCreditLevel())){
					applicantXom.setCreditLevel(undwrtInputDto.getApplicantDto().getCreditLevel());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getInsuredIdentity())){
					applicantXom.setInsuredIdentity(undwrtInputDto.getApplicantDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getEducationCode())){
					applicantXom.setEducationCode(undwrtInputDto.getApplicantDto().getEducationCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getSex())){
					applicantXom.setSex(undwrtInputDto.getApplicantDto().getSex());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getSex_Code())){
					applicantXom.setSex_Code(undwrtInputDto.getApplicantDto().getSex_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getVipFlag())){
					applicantXom.setVipFlag(undwrtInputDto.getApplicantDto().getVipFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getLinkerName())){
					applicantXom.setLinkerName(undwrtInputDto.getApplicantDto().getLinkerName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getLinkerAddress())){
					applicantXom.setLinkerAddress(undwrtInputDto.getApplicantDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getLinkerPostCode())){
					applicantXom.setLinkerPostCode(undwrtInputDto.getApplicantDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getLinkerPhoneNumber())){
					applicantXom.setLinkerPhoneNumber(undwrtInputDto.getApplicantDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getLinkerMobile())){
					applicantXom.setLinkerMobile(undwrtInputDto.getApplicantDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIsBlacklist())){
					applicantXom.setIsBlacklist(undwrtInputDto.getApplicantDto().getIsBlacklist());
				}else{
					sb.append("ApplicantDto.IsBlacklist为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeA())){
					applicantXom.setAttributeA(undwrtInputDto.getApplicantDto().getAttributeA());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeB())){
					applicantXom.setAttributeB(undwrtInputDto.getApplicantDto().getAttributeB());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeC())){
					applicantXom.setAttributeC(undwrtInputDto.getApplicantDto().getAttributeC());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeD())){
					applicantXom.setAttributeD(undwrtInputDto.getApplicantDto().getAttributeD());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeE())){
					applicantXom.setAttributeE(undwrtInputDto.getApplicantDto().getAttributeE());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAttributeF())){
					applicantXom.setAttributeF(undwrtInputDto.getApplicantDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAge())){
					applicantXom.setAge(Integer.parseInt(undwrtInputDto.getApplicantDto().getAge()));
				}else{
					utilXom.setIsNullOfAgeAppli("false");
				}				
			}else{
				sb.append("ApplicantDto为空|");
			}
			undwrtInputXOM.setApplicantXom(applicantXom);
			//组织ApplicantXom end
			
			//组织InsuredXom begin
			InsuredXom insuredXom = new InsuredXom();
			if(undwrtInputDto.getInsuredDto()!=null){
				//String
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredCode())){
					insuredXom.setInsuredCode(undwrtInputDto.getInsuredDto().getInsuredCode());
				}else{
					sb.append("InsuredDto.InsuredCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredName())){
					insuredXom.setInsuredName(undwrtInputDto.getInsuredDto().getInsuredName());
				}else{
					sb.append("InsuredDto.InsuredName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredNature())){
					insuredXom.setInsuredNature(undwrtInputDto.getInsuredDto().getInsuredNature());
				}else{
					sb.append("InsuredDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredNature_Code())){
					insuredXom.setInsuredNature_Code(undwrtInputDto.getInsuredDto().getInsuredNature_Code());
				}else{
					sb.append("InsuredDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredTrade())){
					insuredXom.setInsuredTrade(undwrtInputDto.getInsuredDto().getInsuredTrade());
				}else{
					sb.append("InsuredDto.InsuredTrade为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredTrade_Code())){
					insuredXom.setInsuredTrade_Code(undwrtInputDto.getInsuredDto().getInsuredTrade_Code());
				}else{
					sb.append("InsuredDto.InsuredTrade_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyType())){
					insuredXom.setIdentifyType(undwrtInputDto.getInsuredDto().getIdentifyType());
				}else{
					sb.append("InsuredDto.IdentifyType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyType_Code())){
					insuredXom.setIdentifyType_Code(undwrtInputDto.getInsuredDto().getIdentifyType_Code());
				}else{
					sb.append("InsuredDto.IdentifyType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyNumber())){
					insuredXom.setIdentifyNumber(undwrtInputDto.getInsuredDto().getIdentifyNumber());
				}else{
					sb.append("InsuredDto.IdentifyNumber为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredAddress())){
					insuredXom.setInsuredAddress(undwrtInputDto.getInsuredDto().getInsuredAddress());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getOccupationName())){
					insuredXom.setOccupationName(undwrtInputDto.getInsuredDto().getOccupationName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getMarriage())){
					insuredXom.setMarriage(undwrtInputDto.getInsuredDto().getMarriage());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getCreditLevel())){
					insuredXom.setCreditLevel(undwrtInputDto.getInsuredDto().getCreditLevel());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredIdentity())){
					insuredXom.setInsuredIdentity(undwrtInputDto.getInsuredDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getEducationCode())){
					insuredXom.setEducationCode(undwrtInputDto.getInsuredDto().getEducationCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getSex())){
					insuredXom.setSex(undwrtInputDto.getInsuredDto().getSex());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getSex_Code())){
					insuredXom.setSex_Code(undwrtInputDto.getInsuredDto().getSex_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getVipFlag())){
					insuredXom.setVipFlag(undwrtInputDto.getInsuredDto().getVipFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getLinkerName())){
					insuredXom.setLinkerName(undwrtInputDto.getInsuredDto().getLinkerName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getLinkerAddress())){
					insuredXom.setLinkerAddress(undwrtInputDto.getInsuredDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getLinkerPostCode())){
					insuredXom.setLinkerPostCode(undwrtInputDto.getInsuredDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getLinkerPhoneNumber())){
					insuredXom.setLinkerPhoneNumber(undwrtInputDto.getInsuredDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getLinkerMobile())){
					insuredXom.setLinkerMobile(undwrtInputDto.getInsuredDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIsBlacklist())){
					insuredXom.setIsBlacklist(undwrtInputDto.getInsuredDto().getIsBlacklist());
				}else{
					sb.append("InsuredDto.IsBlacklist为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeA())){
					insuredXom.setAttributeA(undwrtInputDto.getInsuredDto().getAttributeA());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeB())){
					insuredXom.setAttributeB(undwrtInputDto.getInsuredDto().getAttributeB());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeC())){
					insuredXom.setAttributeC(undwrtInputDto.getInsuredDto().getAttributeC());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeD())){
					insuredXom.setAttributeD(undwrtInputDto.getInsuredDto().getAttributeD());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeE())){
					insuredXom.setAttributeE(undwrtInputDto.getInsuredDto().getAttributeE());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAttributeF())){
					insuredXom.setAttributeF(undwrtInputDto.getInsuredDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getAge())){
					insuredXom.setAge(Integer.parseInt(undwrtInputDto.getInsuredDto().getAge()));
				}else{
					utilXom.setIsNullOfAgeInsured("false");
				}				
			}else{
				sb.append("InsuredDto为空|");
			}
			undwrtInputXOM.setInsuredXom(insuredXom);
			//组织InsuredXom end
			
			//组织VehicleXom begin
			VehicleXom vehicleXom = new VehicleXom();
			if(undwrtInputDto.getVehicleDto()!=null){	
				//String
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehicleBrandCode())){
					vehicleXom.setVehicleBrandCode(undwrtInputDto.getVehicleDto().getVehicleBrandCode());
				}else{
					sb.append("VehicleDto.VehicleBrandCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehicleBrandName())){
					vehicleXom.setVehicleBrandName(undwrtInputDto.getVehicleDto().getVehicleBrandName());
				}else{
					sb.append("VehicleDto.VehicleBrandName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getSeriesName())){
					vehicleXom.setSeriesName(undwrtInputDto.getVehicleDto().getSeriesName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getSeriesCode())){
					vehicleXom.setSeriesCode(undwrtInputDto.getVehicleDto().getSeriesCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getBrandCode())){
					vehicleXom.setBrandCode(undwrtInputDto.getVehicleDto().getBrandCode());
				}else{
					sb.append("VehicleDto.BrandCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getBrandName())){
					vehicleXom.setBrandName(undwrtInputDto.getVehicleDto().getBrandName());
				}else{
					sb.append("VehicleDto.BrandName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getEcdemicMrk())){
					vehicleXom.setEcdemicMrk(undwrtInputDto.getVehicleDto().getEcdemicMrk());
				}else{
					sb.append("VehicleDto.EcdemicMrk为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getEcdemicMrk_Code())){
					vehicleXom.setEcdemicMrk_Code(undwrtInputDto.getVehicleDto().getEcdemicMrk_Code());
				}else{
					sb.append("VehicleDto.EcdemicMrk_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getUsenatureCode())){
					vehicleXom.setUsenatureCode(undwrtInputDto.getVehicleDto().getUsenatureCode());
				}else{
					sb.append("VehicleDto.UsenatureCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getUsenature_Name())){
					vehicleXom.setUsenature_Name(undwrtInputDto.getVehicleDto().getUsenature_Name());
				}else{
					sb.append("VehicleDto.Usenature_Name为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getBusinessClassCode())){
					vehicleXom.setBusinessClassCode(undwrtInputDto.getVehicleDto().getBusinessClassCode());
				}else{
					sb.append("VehicleDto.BusinessClassCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getBusinessClassName())){
					vehicleXom.setBusinessClassName(undwrtInputDto.getVehicleDto().getBusinessClassName());
				}else{
					sb.append("VehicleDto.BusinessClassName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehiclesType())){
					vehicleXom.setVehiclesType(undwrtInputDto.getVehicleDto().getVehiclesType());
				}else{
					sb.append("VehicleDto.VehiclesType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehiclesType_Code())){
					vehicleXom.setVehiclesType_Code(undwrtInputDto.getVehicleDto().getVehiclesType_Code());
				}else{
					sb.append("VehicleDto.VehiclesType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getTransferFlag())){
					vehicleXom.setTransferFlag(undwrtInputDto.getVehicleDto().getTransferFlag());
				}else{
					sb.append("VehicleDto.TransferFlag为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getTransferFlag_Code())){
					vehicleXom.setTransferFlag_Code(undwrtInputDto.getVehicleDto().getTransferFlag_Code());
				}else{
					sb.append("VehicleDto.TransferFlag_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsOneCard())){
					vehicleXom.setIsOneCard(undwrtInputDto.getVehicleDto().getIsOneCard());
				}else{
					sb.append("VehicleDto.IsOneCard为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getHfName())){
					vehicleXom.setHfName(undwrtInputDto.getVehicleDto().getHfName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getHfName_Code())){
					vehicleXom.setHfName_Code(undwrtInputDto.getVehicleDto().getHfName_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getLicenseNo())){
					vehicleXom.setLicenseNo(undwrtInputDto.getVehicleDto().getLicenseNo());
				}else{
					sb.append("VehicleDto.LicenseNo为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getTaxType())){
					vehicleXom.setTaxType(undwrtInputDto.getVehicleDto().getTaxType());
				}else{
					sb.append("VehicleDto.TaxType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsImportCar())){
					vehicleXom.setIsImportCar(undwrtInputDto.getVehicleDto().getIsImportCar());
				}else{
					sb.append("VehicleDto.IsImportCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getFuelType())){
					vehicleXom.setFuelType(undwrtInputDto.getVehicleDto().getFuelType());
				}else{
					sb.append("VehicleDto.FuelType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getFuelType_Code())){
					vehicleXom.setFuelType_Code(undwrtInputDto.getVehicleDto().getFuelType_Code());
				}else{
					sb.append("VehicleDto.FuelType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsRefit())){
					vehicleXom.setIsRefit(undwrtInputDto.getVehicleDto().getIsRefit());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsRefit_Code())){
					vehicleXom.setIsRefit_Code(undwrtInputDto.getVehicleDto().getIsRefit_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getCarCode())){
					vehicleXom.setCarCode(undwrtInputDto.getVehicleDto().getCarCode());
				}else{
					sb.append("VehicleDto.CarCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getEngineNum())){
					vehicleXom.setEngineNum(undwrtInputDto.getVehicleDto().getEngineNum());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getFrmNo())){
					vehicleXom.setFrmNo(undwrtInputDto.getVehicleDto().getFrmNo());
				}else{
					sb.append("VehicleDto.FrmNo为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getRiskLevel())){
					vehicleXom.setRiskLevel(undwrtInputDto.getVehicleDto().getRiskLevel());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsNewCar())){
					vehicleXom.setIsNewCar(undwrtInputDto.getVehicleDto().getIsNewCar());
				}else{
					sb.append("VehicleDto.IsNewCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsNewCar_Code())){
					vehicleXom.setIsNewCar_Code(undwrtInputDto.getVehicleDto().getIsNewCar_Code());
				}else{
					sb.append("VehicleDto.IsNewCar_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsConserveEnergy())){
					vehicleXom.setIsConserveEnergy(undwrtInputDto.getVehicleDto().getIsConserveEnergy());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsInsuredLocally())){
					vehicleXom.setIsInsuredLocally(undwrtInputDto.getVehicleDto().getIsInsuredLocally());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsBlacklist())){
					vehicleXom.setIsBlacklist(undwrtInputDto.getVehicleDto().getIsBlacklist());
				}else{
					sb.append("VehicleDto.IsBlacklist为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsHighRiskCar())){
					vehicleXom.setIsHighRiskCar(undwrtInputDto.getVehicleDto().getIsHighRiskCar());
				}else{
					sb.append("VehicleDto.IsHighRiskCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsEasyStealCar())){
					vehicleXom.setIsEasyStealCar(undwrtInputDto.getVehicleDto().getIsEasyStealCar());
				}else{
					sb.append("VehicleDto.IsEasyStealCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsMicroFacetCar())){
					vehicleXom.setIsMicroFacetCar(undwrtInputDto.getVehicleDto().getIsMicroFacetCar());
				}else{
					sb.append("VehicleDto.IsMicroFacetCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getCarAgeLevel())){
					vehicleXom.setCarAgeLevel(undwrtInputDto.getVehicleDto().getCarAgeLevel());
				}else{
					sb.append("VehicleDto.CarAgeLevel为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getCarAgeLevel_Code())){
					vehicleXom.setCarAgeLevel_Code(undwrtInputDto.getVehicleDto().getCarAgeLevel_Code());
				}else{
					sb.append("VehicleDto.CarAgeLevel_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getIsZGHighRiskCar())){
					vehicleXom.setIsZGHighRiskCar(undwrtInputDto.getVehicleDto().getIsZGHighRiskCar());
				}else{
					sb.append("VehicleDto.IsZGHighRiskCar为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getSignForSpecialCar())){
					vehicleXom.setSignForSpecialCar(undwrtInputDto.getVehicleDto().getSignForSpecialCar());
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getZgComCode())){
					vehicleXom.setZgComCode(undwrtInputDto.getVehicleDto().getZgComCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getZgCarTypeCode())){
					vehicleXom.setZgCarTypeCode(undwrtInputDto.getVehicleDto().getZgCarTypeCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getFgComCode())){
					vehicleXom.setFgComCode(undwrtInputDto.getVehicleDto().getFgComCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getFgCarTypeCode())){
					vehicleXom.setFgCarTypeCode(undwrtInputDto.getVehicleDto().getFgCarTypeCode());
				}
				//车辆种类
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehicleSpeciesCode())){
					vehicleXom.setVehicleSpeciesCode(undwrtInputDto.getVehicleDto().getVehicleSpeciesCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getVehicleSpeciesName())){
					vehicleXom.setVehicleSpeciesName(undwrtInputDto.getVehicleDto().getVehicleSpeciesName());
				}
				
				//Double
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getActualFloatRatioValue())){
					vehicleXom.setActualFloatRatioValue(Double.parseDouble(undwrtInputDto.getVehicleDto().getActualFloatRatioValue()));
				}else{
					sb.append("VehicleDto.ActualFloatRatioValue为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getRunMiles())){
					vehicleXom.setRunMiles(Double.parseDouble(undwrtInputDto.getVehicleDto().getRunMiles()));
				}else{
					utilXom.setIsNullOfRunMiles("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getPurchasePrice())){
					vehicleXom.setPurchasePrice(Double.parseDouble(undwrtInputDto.getVehicleDto().getPurchasePrice()));
				}else{
					sb.append("VehicleDto.PurchasePrice为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getCarAge())){
					vehicleXom.setCarAge(Double.parseDouble(undwrtInputDto.getVehicleDto().getCarAge()));
				}else{
					if(!"DDF".equals(reqRiskCode)){
						sb.append("VehicleDto.CarAge为空|");
					}		
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getActualValue())){
					vehicleXom.setActualValue(Double.parseDouble(undwrtInputDto.getVehicleDto().getActualValue()));
				}else{
					utilXom.setIsNullOfActualValue("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getnDisplacement())){
					vehicleXom.setnDisplacement(Double.parseDouble(undwrtInputDto.getVehicleDto().getnDisplacement()));
				}else{
					utilXom.setIsNullOfNDisplacement("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getSspecialVehicle())){
					vehicleXom.setSspecialVehicle(Double.parseDouble(undwrtInputDto.getVehicleDto().getSspecialVehicle()));
				}else{
					sb.append("VehicleDto.SspecialVehicle为空|");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getHfTaxValue())){
					vehicleXom.setHfTaxValue(Double.parseDouble(undwrtInputDto.getVehicleDto().getHfTaxValue()));
				}else{
					utilXom.setIsNullOfhfTaxValue("false");
				}
				
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getSeatCount())){
					vehicleXom.setSeatCount(Integer.parseInt(undwrtInputDto.getVehicleDto().getSeatCount()));
				}else{
					sb.append("VehicleDto.SeatCount为空|");
				}
				//Date
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getBuyDate())){
					vehicleXom.setBuyDate(formatter.parse(undwrtInputDto.getVehicleDto().getBuyDate()));
				}else{
					if(!"DDF".equals(reqRiskCode)){
						sb.append("VehicleDto.BuyDate为空|");
					}
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getCertificateDate())){
					vehicleXom.setCertificateDate(formatter.parse(undwrtInputDto.getVehicleDto().getCertificateDate()));
				}else{
					if(!"DDF".equals(reqRiskCode)){
						sb.append("VehicleDto.CertificateDate为空|");
					}
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleDto().getEnrollDate())){
					vehicleXom.setEnrollDate(formatter.parse(undwrtInputDto.getVehicleDto().getEnrollDate()));
				}else{
					if(!"DDF".equals(reqRiskCode)){
						sb.append("VehicleDto.EnrollDate为空|");
					}
				}				
			}else{
				sb.append("VehicleDto为空|");
			}
			undwrtInputXOM.setVehicleXom(vehicleXom);
			//组织VehicleXom end
			
			//组织VehicleOwnerXom begin
			VehicleOwnerXom vehicleOwnerXom = new VehicleOwnerXom();
			if(undwrtInputDto.getVehicleOwnerDto()!=null){
				//String
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerName())){
					vehicleOwnerXom.setOwnerName(undwrtInputDto.getVehicleOwnerDto().getOwnerName());
				}else{
					sb.append("VehicleOwnerDto.OwnerName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerType())){
					vehicleOwnerXom.setOwnerType(undwrtInputDto.getVehicleOwnerDto().getOwnerType());
				}else{
					sb.append("VehicleOwnerDto.OwnerType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerType_Code())){
					vehicleOwnerXom.setOwnerType_Code(undwrtInputDto.getVehicleOwnerDto().getOwnerType_Code());
				}else{
					sb.append("VehicleOwnerDto.OwnerType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerIdentifyNumber())){
					vehicleOwnerXom.setOwnerIdentifyNumber(undwrtInputDto.getVehicleOwnerDto().getOwnerIdentifyNumber());
				}else{
					sb.append("VehicleOwnerDto.OwnerIdentifyNumber为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerSex())){
					vehicleOwnerXom.setOwnerSex(undwrtInputDto.getVehicleOwnerDto().getOwnerSex());
				}
				if(PubTools.isNotNull(undwrtInputDto.getVehicleOwnerDto().getOwnerSex_Code())){
					vehicleOwnerXom.setOwnerSex_Code(undwrtInputDto.getVehicleOwnerDto().getOwnerSex_Code());
				}
			}else{
				sb.append("VehicleOwnerDto为空|");
			}
			undwrtInputXOM.setVehicleOwnerXom(vehicleOwnerXom);
			//组织VehicleOwnerXom end
			
			//组织itemKindXomList begin
			List<ItemKindXom> itemKindXomList = new ArrayList<ItemKindXom>();
			if(undwrtInputDto.getItemKindDtoList()!=null){
				int itemKindlength = undwrtInputDto.getItemKindDtoList().size();
				if(itemKindlength==0){
					sb.append("ItemKindDtoList.ItemKindDto为空|");
				}
				for(int i=0;i<itemKindlength;i++ ){
					ItemKindDto itemKindDto = undwrtInputDto.getItemKindDtoList().get(i);
						
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
					if(PubTools.isNotNull(itemKindDto.getLastAccient())){
						itemKindXom.setLastAccient(itemKindDto.getLastAccient());
					}
					if(PubTools.isNotNull(itemKindDto.getIsHomemadeGlass())){
						itemKindXom.setIsHomemadeGlass(itemKindDto.getIsHomemadeGlass());
					}
					if(PubTools.isNotNull(itemKindDto.getFlag())){
						itemKindXom.setFlag(itemKindDto.getFlag());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Flag为空|");
					}
					
					//Double
					if(PubTools.isNotNull(itemKindDto.getAmount())){
						itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
					}
					if(PubTools.isNotNull(itemKindDto.getBenchMarkPremium())){
						itemKindXom.setBenchMarkPremium(Double.parseDouble(itemKindDto.getBenchMarkPremium()));
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.BenchMarkPremium为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getEveryLimitFee())){
						itemKindXom.setEveryLimitFee(Double.parseDouble(itemKindDto.getEveryLimitFee()));
					}
					itemKindXomList.add(itemKindXom);
				}					
			}else{
				sb.append("ItemKindDtoList为空|");
			}
			undwrtInputXOM.setItemKindXomList(itemKindXomList);
			//组织itemKindXomList end
			
			//组织OtherXom begin
			OtherXom otherXom = new OtherXom();
			if(undwrtInputDto.getOtherDto()!=null){
				//String
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLasClaimFlag())){
					otherXom.setLasClaimFlag(undwrtInputDto.getOtherDto().getLasClaimFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLastCarOwner())){
					otherXom.setLastCarOwner(undwrtInputDto.getOtherDto().getLastCarOwner());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLastItemkind())){
					otherXom.setLastItemkind(undwrtInputDto.getOtherDto().getLastItemkind());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeA())){
					otherXom.setAttributeA(undwrtInputDto.getOtherDto().getAttributeA());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeB())){
					otherXom.setAttributeB(undwrtInputDto.getOtherDto().getAttributeB());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeC())){
					otherXom.setAttributeC(undwrtInputDto.getOtherDto().getAttributeC());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeD())){
					otherXom.setAttributeD(undwrtInputDto.getOtherDto().getAttributeD());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeE())){
					otherXom.setAttributeE(undwrtInputDto.getOtherDto().getAttributeE());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAttributeF())){
					otherXom.setAttributeF(undwrtInputDto.getOtherDto().getAttributeF());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getSelfProtectionUp())){
					otherXom.setSelfProtectionUp(undwrtInputDto.getOtherDto().getSelfProtectionUp());
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getThisTaxYear())){
					otherXom.setThisTaxYear(undwrtInputDto.getOtherDto().getThisTaxYear());
				}else{
					sb.append("OtherDto.ThisTaxYear为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getIsValidateCar())){
					otherXom.setIsValidateCar(undwrtInputDto.getOtherDto().getIsValidateCar());
				}else{
					sb.append("OtherDto.IsValidateCar为空|");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getIsFeeDiscount())){
					otherXom.setIsFeeDiscount(undwrtInputDto.getOtherDto().getIsFeeDiscount());
				}
				
				//Double
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLastClaimAmount())){
					otherXom.setLastClaimAmount(Double.parseDouble(undwrtInputDto.getOtherDto().getLastClaimAmount()));
				}else{
					utilXom.setIsNullOfLastClaimAmount("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getClaimadjustValue())){
					otherXom.setClaimadjustValue(Double.parseDouble(undwrtInputDto.getOtherDto().getClaimadjustValue()));
				}else{
					utilXom.setIsNullOfClaimadjustValue("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAtuoBusiness())){
					otherXom.setAtuoBusiness(Double.parseDouble(undwrtInputDto.getOtherDto().getAtuoBusiness()));
				}else{
					utilXom.setIsNullOfAtuoBusiness("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getCountNCDCof())){
					otherXom.setCountNCDCof(Double.parseDouble(undwrtInputDto.getOtherDto().getCountNCDCof()));
				}else{
					utilXom.setIsNullOfCountNCDCof("false");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getSelfProtectionCof())){
					otherXom.setSelfProtectionCof(Double.parseDouble(undwrtInputDto.getOtherDto().getSelfProtectionCof()));
				}else{
					utilXom.setIsNullSelfProtectionCof("false");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getSelfChannelCof())){
					otherXom.setSelfChannelCof(Double.parseDouble(undwrtInputDto.getOtherDto().getSelfChannelCof()));
				}else{
					utilXom.setIsNullSelfChannelCof("false");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getDelayPayment())){
					otherXom.setDelayPayment(Double.parseDouble(undwrtInputDto.getOtherDto().getDelayPayment()));
				}else{
					sb.append("OtherDto.DelayPayment为空|");
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getCarPriceCof())){
					otherXom.setCarPriceCof(Double.parseDouble(undwrtInputDto.getOtherDto().getCarPriceCof()));
				}else{
					utilXom.setIsNullCarPriceCof("false");
				}
				
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLossNumber())){
					otherXom.setLossNumber(Integer.parseInt(undwrtInputDto.getOtherDto().getLossNumber()));
				}else{
					utilXom.setIsNullOfLossNumber("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getCheckCarPhotosCount())){
					otherXom.setCheckCarPhotosCount(Integer.parseInt(undwrtInputDto.getOtherDto().getCheckCarPhotosCount()));
				}else{
					sb.append("OtherDto.CheckCarPhotosCount为空|");
				}
				//工作证照片数量
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getIdCardPhotosCount())){
					otherXom.setIdCardPhotosCount(Integer.parseInt(undwrtInputDto.getOtherDto().getIdCardPhotosCount()));
				}else{
					sb.append("OtherDto.IdCardPhotosCount为空|");
				}
				
				//Date
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getLastEndDate())){
					otherXom.setLastEndDate(formatter.parse(undwrtInputDto.getOtherDto().getLastEndDate()));
				}	
				
			}else{
				sb.append("OtherDto为空|");
			}
			undwrtInputXOM.setOtherXom(otherXom);
			//组织OtherXom end
			
			//组织UnderwriteResultXOM begin
			String strCheckRequ = sb.toString();
			undwrtInputXOM.getUnderwriteResultXOM().setDescription(strCheckRequ);
			undwrtInputXOM.getUnderwriteResultXOM().setUndwrtFlag("");
				//核保级别顺序从数据库获取 begin
				List<UndwrtGradeVo>  undwrtGradeVoList = null;
				UndwrtGradeService undwrtGradeService = new UndwrtGradeServiceImpl();
				undwrtGradeVoList = undwrtGradeService.findByOrderUndwrtGrade();
				String strGradeNames = "";
				StringBuffer sbGrade = new StringBuffer(200);
				for(int i=0;i<undwrtGradeVoList.size();i++){
					UndwrtGradeVo undwrtGradeVo = new UndwrtGradeVo();
					undwrtGradeVo = undwrtGradeVoList.get(i);
					sbGrade.append(undwrtGradeVo.getUndwrtGradeName()+",");
				}
				strGradeNames = sbGrade.toString();
				//核保级别顺序从数据库获取 end
			undwrtInputXOM.getUnderwriteResultXOM().setStrGradeNames(strGradeNames);
			//组织UnderwriteResultXOM end
			
			undwrtInputXOM.setUtilXom(utilXom);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return undwrtInputXOM;
	}
	/**
	 * 出参对象转换
	 * @param approveRuleResponseXom
	 * @return
	 */
	public static UnderwriteResultDto ConvertObject(UnderwriteResultXOM underwriteResultXOM){
		UnderwriteResultDto underwriteResultDto = new UnderwriteResultDto();
		try {
			MyBeanUtil.copyProperties(underwriteResultXOM,underwriteResultDto);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return underwriteResultDto;
	}
}
