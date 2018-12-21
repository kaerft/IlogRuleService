package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.ilog.dto.prpcarDto.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.PrpCarInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.MainDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.NCDCoefficientDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.PrpCarResultDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.RateDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.SelfCoefficientDto;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.ApplicantXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.InsuredXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.ItemKindXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.MainXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.OtherXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarResultXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.RateXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.VehicleOwnerXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.VehicleXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.util.UtilXom;
import com.sinosoft.ilogrule.util.PubTools;

public class PrpcarConvertUtil {
	
	/**
	 * 入参对象转换
	 * @param approveRuleVo
	 * @return
	 */
	public static PrpCarInputXom ConvertObject(PrpCarInputDto prpcarInputDto){
		PrpCarInputXom prpcarInputXom = new PrpCarInputXom();
		try {
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 
			//组织判断接口调用非空校验
			StringBuffer sb = new StringBuffer();

			UtilXom utilXom = new UtilXom();
			utilXom.setTeamCarList("");
			
			prpcarInputXom.setUtilXom(utilXom);
			
			
			//组织MainXom begin
			MainXom mainXom = new MainXom();
			if(prpcarInputDto.getMainDto()!=null){							
				//String
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getProposalNo())){
					mainXom.setProposalNo(prpcarInputDto.getMainDto().getProposalNo());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getModeCode())){
					mainXom.setModeCode(prpcarInputDto.getMainDto().getModeCode());
				}else{
					sb.append("MainDto.ModeCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getPolicyType())){
					mainXom.setPolicyType(prpcarInputDto.getMainDto().getPolicyType());
				}else{
					sb.append("MainDto.PolicyType为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getPolicyType_Code())){
					mainXom.setPolicyType_Code(prpcarInputDto.getMainDto().getPolicyType_Code());
				}else{
					sb.append("MainDto.PolicyType_Code为空|");
				}
				
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getRenewalFlag())){
					mainXom.setRenewalFlag(prpcarInputDto.getMainDto().getRenewalFlag());
				}else{
					sb.append("MainDto.RenewalFlag为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getRenewalFlag_Code())){
					mainXom.setRenewalFlag_Code(prpcarInputDto.getMainDto().getRenewalFlag_Code());
				}else{
					sb.append("MainDto.RenewalFlag_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getComCode())){
					mainXom.setComCode(prpcarInputDto.getMainDto().getComCode());
				}else{
					sb.append("MainDto.ComCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getComName())){
					mainXom.setComName(prpcarInputDto.getMainDto().getComName());
				}else{
					sb.append("MainDto.ComName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAgentCode())){
					mainXom.setAgentCode(prpcarInputDto.getMainDto().getAgentCode());
				}else{
					mainXom.setAgentCode("");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAgentName())){
					mainXom.setAgentName(prpcarInputDto.getMainDto().getAgentName());
				}else{
					mainXom.setAgentName("");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getFxqFlag())){
					mainXom.setFxqFlag(prpcarInputDto.getMainDto().getFxqFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getProdFlag())){
					mainXom.setProdFlag(prpcarInputDto.getMainDto().getProdFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getClassCode())){
					mainXom.setClassCode(prpcarInputDto.getMainDto().getClassCode());
				}else{
					sb.append("MainDto.ClassCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getRiskCode())){
					mainXom.setRiskCode(prpcarInputDto.getMainDto().getRiskCode());
				}else{
					sb.append("MainDto.RiskCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getArgueDel())){
					mainXom.setArgueDel(prpcarInputDto.getMainDto().getArgueDel());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getArgueDel_Code())){
					mainXom.setArgueDel_Code(prpcarInputDto.getMainDto().getArgueDel_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getInformContent())){
					mainXom.setInformContent(prpcarInputDto.getMainDto().getInformContent());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getIsTimelyEffective())){
					mainXom.setIsTimelyEffective(prpcarInputDto.getMainDto().getIsTimelyEffective());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getEngageContext())){
					mainXom.setEngageContext(prpcarInputDto.getMainDto().getEngageContext());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeA())){
					mainXom.setAttributeA(prpcarInputDto.getMainDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeB())){
					mainXom.setAttributeB(prpcarInputDto.getMainDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeC())){
					mainXom.setAttributeC(prpcarInputDto.getMainDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeD())){
					mainXom.setAttributeD(prpcarInputDto.getMainDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeE())){
					mainXom.setAttributeE(prpcarInputDto.getMainDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAttributeF())){
					mainXom.setAttributeF(prpcarInputDto.getMainDto().getAttributeF());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getBusinessType1())){
					mainXom.setBusinessType1(prpcarInputDto.getMainDto().getBusinessType1());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getPolicySort())){
					mainXom.setPolicySort(prpcarInputDto.getMainDto().getPolicySort());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getBusinessNature())){
					mainXom.setBusinessNature(prpcarInputDto.getMainDto().getBusinessNature());
				}else{
					sb.append("MainDto.BusinessNature为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getBusinessNature_Code())){
					mainXom.setBusinessNature_Code(prpcarInputDto.getMainDto().getBusinessNature_Code());
				}else{
					sb.append("MainDto.BusinessNature_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getCurrency())){
					mainXom.setCurrency(prpcarInputDto.getMainDto().getCurrency());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getPayTimes())){
					mainXom.setPayTimes(prpcarInputDto.getMainDto().getPayTimes());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getCoinsFlag())){
					mainXom.setCoinsFlag(prpcarInputDto.getMainDto().getCoinsFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getReinsFlag())){
					mainXom.setReinsFlag(prpcarInputDto.getMainDto().getReinsFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getCoinsUranceFlag())){
					mainXom.setCoinsUranceFlag(prpcarInputDto.getMainDto().getCoinsUranceFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getCoinsLinkFlag())){
					mainXom.setCoinsLinkFlag(prpcarInputDto.getMainDto().getCoinsLinkFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getStopTimes())){
					mainXom.setStopTimes(prpcarInputDto.getMainDto().getStopTimes());
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getqCellCore())){
					mainXom.setqCellCore(prpcarInputDto.getMainDto().getqCellCore());
				}else{
					sb.append("MainDto.qCellCore为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getIsCorrelation())){
					mainXom.setIsCorrelation(prpcarInputDto.getMainDto().getIsCorrelation());
				}else{
					sb.append("MainDto.IsCorrelation为空|");
				}
				
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getHandler_Code())){
					mainXom.setHandler_Code(prpcarInputDto.getMainDto().getHandler_Code());
				}else{
					sb.append("MainDto.Handler_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getHandlerName())){
					mainXom.setHandlerName(prpcarInputDto.getMainDto().getHandlerName());
				}else{
					sb.append("MainDto.HandlerName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAgreementNo())){
					mainXom.setAgreementNo(prpcarInputDto.getMainDto().getAgreementNo());
				}
				
				
				// Date 日期格式 yyyy-mm-dd
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getStartDate())){
					mainXom.setStartDate(formatter.parse(prpcarInputDto.getMainDto().getStartDate()));
				}else{
					sb.append("MainDto.StartDate为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getEndDate())){
					mainXom.setEndDate(formatter.parse(prpcarInputDto.getMainDto().getEndDate()));
				}else{
					sb.append("MainDto.EndDate为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getInsureDate())){
					mainXom.setInsureDate(formatter.parse(prpcarInputDto.getMainDto().getInsureDate()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getSignDate())){
					mainXom.setSignDate(formatter.parse(prpcarInputDto.getMainDto().getSignDate()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getOprTm())){
					mainXom.setOprTm(formatter.parse(prpcarInputDto.getMainDto().getOprTm()));
				}
				
				//Double 
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getBeforePrem())){
					mainXom.setBeforePrem(Double.parseDouble(prpcarInputDto.getMainDto().getBeforePrem()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getEntireDiscount())){
					mainXom.setEntireDiscount(Double.parseDouble(prpcarInputDto.getMainDto().getEntireDiscount()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getAfterPrem())){
					mainXom.setAfterPrem(Double.parseDouble(prpcarInputDto.getMainDto().getAfterPrem()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getSumAmount())){
					mainXom.setSumAmount(Double.parseDouble(prpcarInputDto.getMainDto().getSumAmount()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getSumQuantity())){
					mainXom.setSumQuantity(Double.parseDouble(prpcarInputDto.getMainDto().getSumQuantity()));
				}else{
					sb.append("MainDto.SumQuantity为空|");
				}
				
				//Integer
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().gettInsrncDay())){
					mainXom.settInsrncDay(Integer.parseInt(prpcarInputDto.getMainDto().gettInsrncDay()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getMainDto().getRenewalYears())){
					mainXom.setRenewalYears(Integer.parseInt(prpcarInputDto.getMainDto().getRenewalYears()));
				}else{
					sb.append("MainDto.RenewalYears为空|");
				}
							
			}
			prpcarInputXom.setMainXom(mainXom);	
			//组织MainXom end
			
			//组织ApplicantXom begin
			ApplicantXom applicantXom = new ApplicantXom();
			if(prpcarInputDto.getApplicantDto()!=null){
				//String
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getCustomerChannel())){
					applicantXom.setCustomerChannel(prpcarInputDto.getApplicantDto().getCustomerChannel());
				}else{
					sb.append("ApplicantDto.CustomerChannel为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getCustomerChannel_Code())){
					applicantXom.setCustomerChannel_Code(prpcarInputDto.getApplicantDto().getCustomerChannel_Code());
				}else{
					sb.append("ApplicantDto.CustomerChannel_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAppliCode())){
					applicantXom.setAppliCode(prpcarInputDto.getApplicantDto().getAppliCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAppliName())){
					applicantXom.setAppliName(prpcarInputDto.getApplicantDto().getAppliName());
				}else{
					sb.append("ApplicantDto.AppliName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getInsuredNature())){
					applicantXom.setInsuredNature(prpcarInputDto.getApplicantDto().getInsuredNature());
				}else{
					sb.append("ApplicantDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getInsuredNature_Code())){
					applicantXom.setInsuredNature_Code(prpcarInputDto.getApplicantDto().getInsuredNature_Code());
				}else{
					sb.append("ApplicantDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAppliTrade())){
					applicantXom.setAppliTrade(prpcarInputDto.getApplicantDto().getAppliTrade());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAppliTrade_Code())){
					applicantXom.setAppliTrade_Code(prpcarInputDto.getApplicantDto().getAppliTrade_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getIdentifyType())){
					applicantXom.setIdentifyType(prpcarInputDto.getApplicantDto().getIdentifyType());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getIdentifyType_code())){
					applicantXom.setIdentifyType_code(prpcarInputDto.getApplicantDto().getIdentifyType_code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getIdentifyNumber())){
					applicantXom.setIdentifyNumber(prpcarInputDto.getApplicantDto().getIdentifyNumber());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAppliAddress())){
					applicantXom.setAppliAddress(prpcarInputDto.getApplicantDto().getAppliAddress());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getOccupationName())){
					applicantXom.setOccupationName(prpcarInputDto.getApplicantDto().getOccupationName());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getMarriage())){
					applicantXom.setMarriage(prpcarInputDto.getApplicantDto().getMarriage());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getCreditLevel())){
					applicantXom.setCreditLevel(prpcarInputDto.getApplicantDto().getCreditLevel());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getInsuredIdentity())){
					applicantXom.setInsuredIdentity(prpcarInputDto.getApplicantDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getEducationCode())){
					applicantXom.setEducationCode(prpcarInputDto.getApplicantDto().getEducationCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getSex())){
					applicantXom.setSex(prpcarInputDto.getApplicantDto().getSex());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getSex_Code())){
					applicantXom.setSex_Code(prpcarInputDto.getApplicantDto().getSex_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getVipFlag())){
					applicantXom.setVipFlag(prpcarInputDto.getApplicantDto().getVipFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getLinkerName())){
					applicantXom.setLinkerName(prpcarInputDto.getApplicantDto().getLinkerName());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getLinkerAddress())){
					applicantXom.setLinkerAddress(prpcarInputDto.getApplicantDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getLinkerPostCode())){
					applicantXom.setLinkerPostCode(prpcarInputDto.getApplicantDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getLinkerPhoneNumber())){
					applicantXom.setLinkerPhoneNumber(prpcarInputDto.getApplicantDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getLinkerMobile())){
					applicantXom.setLinkerMobile(prpcarInputDto.getApplicantDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getIsBlacklist())){
					applicantXom.setIsBlacklist(prpcarInputDto.getApplicantDto().getIsBlacklist());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeA())){
					applicantXom.setAttributeA(prpcarInputDto.getApplicantDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeB())){
					applicantXom.setAttributeB(prpcarInputDto.getApplicantDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeC())){
					applicantXom.setAttributeC(prpcarInputDto.getApplicantDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeD())){
					applicantXom.setAttributeD(prpcarInputDto.getApplicantDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeE())){
					applicantXom.setAttributeE(prpcarInputDto.getApplicantDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAttributeF())){
					applicantXom.setAttributeF(prpcarInputDto.getApplicantDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(prpcarInputDto.getApplicantDto().getAge())){
					applicantXom.setAge(Integer.parseInt(prpcarInputDto.getApplicantDto().getAge()));
				}				
			}
			prpcarInputXom.setApplicantXom(applicantXom);
			//组织ApplicantXom end
			
			//组织InsuredXom begin
			InsuredXom insuredXom = new InsuredXom();
			if(prpcarInputDto.getInsuredDto()!=null){
				//String
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredCode())){
					insuredXom.setInsuredCode(prpcarInputDto.getInsuredDto().getInsuredCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredName())){
					insuredXom.setInsuredName(prpcarInputDto.getInsuredDto().getInsuredName());
				}else{
					sb.append("InsuredDto.InsuredName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredNature())){
					insuredXom.setInsuredNature(prpcarInputDto.getInsuredDto().getInsuredNature());
				}else{
					sb.append("InsuredDto.InsuredNature为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredNature_Code())){
					insuredXom.setInsuredNature_Code(prpcarInputDto.getInsuredDto().getInsuredNature_Code());
				}else{
					sb.append("InsuredDto.InsuredNature_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredTrade())){
					insuredXom.setInsuredTrade(prpcarInputDto.getInsuredDto().getInsuredTrade());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredTrade_Code())){
					insuredXom.setInsuredTrade_Code(prpcarInputDto.getInsuredDto().getInsuredTrade_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getIdentifyType())){
					insuredXom.setIdentifyType(prpcarInputDto.getInsuredDto().getIdentifyType());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getIdentifyType_Code())){
					insuredXom.setIdentifyType_Code(prpcarInputDto.getInsuredDto().getIdentifyType_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getIdentifyNumber())){
					insuredXom.setIdentifyNumber(prpcarInputDto.getInsuredDto().getIdentifyNumber());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredAddress())){
					insuredXom.setInsuredAddress(prpcarInputDto.getInsuredDto().getInsuredAddress());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getOccupationName())){
					insuredXom.setOccupationName(prpcarInputDto.getInsuredDto().getOccupationName());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getMarriage())){
					insuredXom.setMarriage(prpcarInputDto.getInsuredDto().getMarriage());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getCreditLevel())){
					insuredXom.setCreditLevel(prpcarInputDto.getInsuredDto().getCreditLevel());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getInsuredIdentity())){
					insuredXom.setInsuredIdentity(prpcarInputDto.getInsuredDto().getInsuredIdentity());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getEducationCode())){
					insuredXom.setEducationCode(prpcarInputDto.getInsuredDto().getEducationCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getSex())){
					insuredXom.setSex(prpcarInputDto.getInsuredDto().getSex());
				}else{
					if(prpcarInputDto.getVehicleDto()!=null && prpcarInputDto.getVehicleDto().getUsenatureName()!=null
						&& "家庭自用车".equals(prpcarInputDto.getVehicleDto().getUsenatureName())){
						sb.append("InsuredDto.Sex为空|");
					}
					if(PubTools.isNull(prpcarInputDto.getInsuredDto().getSex())){
						insuredXom.setSex("");
					}
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getSex_Code())){
					insuredXom.setSex_Code(prpcarInputDto.getInsuredDto().getSex_Code());
				}else{
					if(prpcarInputDto.getVehicleDto()!=null && prpcarInputDto.getVehicleDto().getUsenatureName()!=null
						&& "家庭自用车".equals(prpcarInputDto.getVehicleDto().getUsenatureName())){
						sb.append("InsuredDto.Sex_Code为空|");
					}
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getVipFlag())){
					insuredXom.setVipFlag(prpcarInputDto.getInsuredDto().getVipFlag());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getLinkerName())){
					insuredXom.setLinkerName(prpcarInputDto.getInsuredDto().getLinkerName());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getLinkerAddress())){
					insuredXom.setLinkerAddress(prpcarInputDto.getInsuredDto().getLinkerAddress());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getLinkerPostCode())){
					insuredXom.setLinkerPostCode(prpcarInputDto.getInsuredDto().getLinkerPostCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getLinkerPhoneNumber())){
					insuredXom.setLinkerPhoneNumber(prpcarInputDto.getInsuredDto().getLinkerPhoneNumber());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getLinkerMobile())){
					insuredXom.setLinkerMobile(prpcarInputDto.getInsuredDto().getLinkerMobile());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getIsBlacklist())){
					insuredXom.setIsBlacklist(prpcarInputDto.getInsuredDto().getIsBlacklist());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeA())){
					insuredXom.setAttributeA(prpcarInputDto.getInsuredDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeB())){
					insuredXom.setAttributeB(prpcarInputDto.getInsuredDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeC())){
					insuredXom.setAttributeC(prpcarInputDto.getInsuredDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeD())){
					insuredXom.setAttributeD(prpcarInputDto.getInsuredDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeE())){
					insuredXom.setAttributeE(prpcarInputDto.getInsuredDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAttributeF())){
					insuredXom.setAttributeF(prpcarInputDto.getInsuredDto().getAttributeF());
				}
				
				//Integer
				if(PubTools.isNotNull(prpcarInputDto.getInsuredDto().getAge())){
					insuredXom.setAge(Integer.parseInt(prpcarInputDto.getInsuredDto().getAge()));
				}else{
					if(prpcarInputDto.getVehicleDto()!=null && prpcarInputDto.getVehicleDto().getUsenatureName()!=null
						&& "家庭自用车".equals(prpcarInputDto.getVehicleDto().getUsenatureName())){
						sb.append("InsuredDto.Age为空|");
					}
				}				
			}
			prpcarInputXom.setInsuredXom(insuredXom);
			//组织InsuredXom end
			
			//组织VehicleXom begin
			VehicleXom vehicleXom = new VehicleXom();
			if(prpcarInputDto.getVehicleDto()!=null){	
				//String
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehicleBrandCode())){
					vehicleXom.setVehicleBrandCode(prpcarInputDto.getVehicleDto().getVehicleBrandCode());
				}else{
					sb.append("VehicleDto.VehicleBrandCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehicleBrandName())){
					vehicleXom.setVehicleBrandName(prpcarInputDto.getVehicleDto().getVehicleBrandName());
				}else{
					sb.append("VehicleDto.VehicleBrandName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSeriesName())){
					vehicleXom.setSeriesName(prpcarInputDto.getVehicleDto().getSeriesName());
				}else{
					sb.append("VehicleDto.SeriesName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSeriesCode())){
					vehicleXom.setSeriesCode(prpcarInputDto.getVehicleDto().getSeriesCode());
				}else{
					sb.append("VehicleDto.SeriesCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getBrandCode())){
					vehicleXom.setBrandCode(prpcarInputDto.getVehicleDto().getBrandCode());
				}else{
					sb.append("VehicleDto.BrandCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getBrandName())){
					vehicleXom.setBrandName(prpcarInputDto.getVehicleDto().getBrandName());
				}else{
					sb.append("VehicleDto.BrandName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getEcdemicMrk())){
					vehicleXom.setEcdemicMrk(prpcarInputDto.getVehicleDto().getEcdemicMrk());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getEcdemicMrk_Code())){
					vehicleXom.setEcdemicMrk_Code(prpcarInputDto.getVehicleDto().getEcdemicMrk_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getUsenatureCode())){
					vehicleXom.setUsenatureCode(prpcarInputDto.getVehicleDto().getUsenatureCode());
				}else{
					sb.append("VehicleDto.UsenatureCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getUsenatureName())){
					vehicleXom.setUsenatureName(prpcarInputDto.getVehicleDto().getUsenatureName());
				}else{
					sb.append("VehicleDto.UsenatureName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getBusinessClassCode())){
					vehicleXom.setBusinessClassCode(prpcarInputDto.getVehicleDto().getBusinessClassCode());
				}else{
					sb.append("VehicleDto.BusinessClassCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getBusinessClassName())){
					vehicleXom.setBusinessClassName(prpcarInputDto.getVehicleDto().getBusinessClassName());
				}else{
					sb.append("VehicleDto.BusinessClassName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehiclesType())){
					vehicleXom.setVehiclesType(prpcarInputDto.getVehicleDto().getVehiclesType());
				}else{
					sb.append("VehicleDto.VehiclesType为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehiclesType_Code())){
					vehicleXom.setVehiclesType_Code(prpcarInputDto.getVehicleDto().getVehiclesType_Code());
				}else{
					sb.append("VehicleDto.VehiclesType_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getTransferFlag())){
					vehicleXom.setTransferFlag(prpcarInputDto.getVehicleDto().getTransferFlag());
				}else{
					sb.append("VehicleDto.TransferFlag为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getTransferFlag_Code())){
					vehicleXom.setTransferFlag_Code(prpcarInputDto.getVehicleDto().getTransferFlag_Code());
				}else{
					sb.append("VehicleDto.TransferFlag_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsOneCard())){
					vehicleXom.setIsOneCard(prpcarInputDto.getVehicleDto().getIsOneCard());
				}else{
					sb.append("VehicleDto.IsOneCard为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getHfName())){
					vehicleXom.setHfName(prpcarInputDto.getVehicleDto().getHfName());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getHfName_Code())){
					vehicleXom.setHfName_Code(prpcarInputDto.getVehicleDto().getHfName_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getLicenseNo())){
					vehicleXom.setLicenseNo(prpcarInputDto.getVehicleDto().getLicenseNo());
				}else{
					vehicleXom.setLicenseNo("");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getTaxType())){
					vehicleXom.setTaxType(prpcarInputDto.getVehicleDto().getTaxType());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsImportCar())){
					vehicleXom.setIsImportCar(prpcarInputDto.getVehicleDto().getIsImportCar());
				}else{
					sb.append("VehicleDto.IsImportCar为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getFuelType())){
					vehicleXom.setFuelType(prpcarInputDto.getVehicleDto().getFuelType());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getFuelType_Code())){
					vehicleXom.setFuelType_Code(prpcarInputDto.getVehicleDto().getFuelType_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsRefit())){
					vehicleXom.setIsRefit(prpcarInputDto.getVehicleDto().getIsRefit());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsRefit_Code())){
					vehicleXom.setIsRefit_Code(prpcarInputDto.getVehicleDto().getIsRefit_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarCode())){
					vehicleXom.setCarCode(prpcarInputDto.getVehicleDto().getCarCode());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getEngineNum())){
					vehicleXom.setEngineNum(prpcarInputDto.getVehicleDto().getEngineNum());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getFrmNo())){
					vehicleXom.setFrmNo(prpcarInputDto.getVehicleDto().getFrmNo());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getRiskLevel())){
					vehicleXom.setRiskLevel(prpcarInputDto.getVehicleDto().getRiskLevel());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsNewCar())){
					vehicleXom.setIsNewCar(prpcarInputDto.getVehicleDto().getIsNewCar());
				}else{
					sb.append("VehicleDto.IsNewCar为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsNewCar_Code())){
					vehicleXom.setIsNewCar_Code(prpcarInputDto.getVehicleDto().getIsNewCar_Code());
				}else{
					sb.append("VehicleDto.IsNewCar_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsConserveEnergy())){
					vehicleXom.setIsConserveEnergy(prpcarInputDto.getVehicleDto().getIsConserveEnergy());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsInsuredLocally())){
					vehicleXom.setIsInsuredLocally(prpcarInputDto.getVehicleDto().getIsInsuredLocally());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsBlacklist())){
					vehicleXom.setIsBlacklist(prpcarInputDto.getVehicleDto().getIsBlacklist());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsHighRiskCar())){
					vehicleXom.setIsHighRiskCar(prpcarInputDto.getVehicleDto().getIsHighRiskCar());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsEasyStealCar())){
					vehicleXom.setIsEasyStealCar(prpcarInputDto.getVehicleDto().getIsEasyStealCar());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getIsMicroFacetCar())){
					vehicleXom.setIsMicroFacetCar(prpcarInputDto.getVehicleDto().getIsMicroFacetCar());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSpecialType_Code())){
					vehicleXom.setSpecialType_Code(prpcarInputDto.getVehicleDto().getSpecialType_Code());
				}else{
					sb.append("VehicleDto.SpecialType_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSpecialType())){
					vehicleXom.setSpecialType(prpcarInputDto.getVehicleDto().getSpecialType());
				}else{
					sb.append("VehicleDto.SpecialType为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarAgeLevel_Code())){
					vehicleXom.setCarAgeLevel_Code(prpcarInputDto.getVehicleDto().getCarAgeLevel_Code());
				}else{
					sb.append("VehicleDto.CarAgeLevel_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getLoanFlag())){
					vehicleXom.setLoanFlag(prpcarInputDto.getVehicleDto().getLoanFlag());
				}else{
					sb.append("VehicleDto.LoanFlag为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarKindCode())){
					vehicleXom.setCarKindCode(prpcarInputDto.getVehicleDto().getCarKindCode());
				}else{
					sb.append("VehicleDto.CarKindCode为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarKindName())){
					vehicleXom.setCarKindName(prpcarInputDto.getVehicleDto().getCarKindName());
				}else{
					sb.append("VehicleDto.CarKindName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehiclesClass_Code())){
					vehicleXom.setVehiclesClass_Code(prpcarInputDto.getVehicleDto().getVehiclesClass_Code());
				}else{
					sb.append("VehicleDto.VehiclesClass_Code为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getVehiclesClass())){
					vehicleXom.setVehiclesClass(prpcarInputDto.getVehicleDto().getVehiclesClass());
				}else{
					sb.append("VehicleDto.VehiclesClass为空|");
				}
				
				
				
				
				//Double
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getRunMiles())){
					vehicleXom.setRunMiles(Double.parseDouble(prpcarInputDto.getVehicleDto().getRunMiles()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getPurchasePrice())){
					vehicleXom.setPurchasePrice(Double.parseDouble(prpcarInputDto.getVehicleDto().getPurchasePrice()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarAge())){
					vehicleXom.setCarAge(Double.parseDouble(prpcarInputDto.getVehicleDto().getCarAge()));
				}else{
					sb.append("VehicleDto.CarAge为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSpecialValue())){
					vehicleXom.setSpecialValue(Double.parseDouble(prpcarInputDto.getVehicleDto().getSpecialValue()));
				}else{
					sb.append("VehicleDto.SpecialValue为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getActualValue())){
					vehicleXom.setActualValue(Double.parseDouble(prpcarInputDto.getVehicleDto().getActualValue()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getActualFloatRatioValue())){
					vehicleXom.setActualFloatRatioValue(Double.parseDouble(prpcarInputDto.getVehicleDto().getActualFloatRatioValue()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getnDisplacement())){
					vehicleXom.setnDisplacement(Double.parseDouble(prpcarInputDto.getVehicleDto().getnDisplacement()));
				}else{
					sb.append("VehicleDto.nDisplacement为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCarAgeLevel())){
					vehicleXom.setCarAgeLevel(Double.parseDouble(prpcarInputDto.getVehicleDto().getCarAgeLevel()));
				}else{
					sb.append("VehicleDto.CarAgeLevel为空|");
				}
				
				//Integer
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getSeatCount())){
					vehicleXom.setSeatCount(Integer.parseInt(prpcarInputDto.getVehicleDto().getSeatCount()));
				}
				//Date
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getBuyDate())){
					vehicleXom.setBuyDate(formatter.parse(prpcarInputDto.getVehicleDto().getBuyDate()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getCertificateDate())){
					vehicleXom.setCertificateDate(formatter.parse(prpcarInputDto.getVehicleDto().getCertificateDate()));
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleDto().getEnrollDate())){
					vehicleXom.setEnrollDate(formatter.parse(prpcarInputDto.getVehicleDto().getEnrollDate()));
				}else{
					sb.append("VehicleDto.EnrollDate为空|");
				}				
			}
			prpcarInputXom.setVehicleXom(vehicleXom);
			//组织VehicleXom end
			
			//组织VehicleOwnerXom begin
			VehicleOwnerXom vehicleOwnerXom = new VehicleOwnerXom();
			if(prpcarInputDto.getVehicleOwnerDto()!=null){
				//String
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerName())){
					vehicleOwnerXom.setOwnerName(prpcarInputDto.getVehicleOwnerDto().getOwnerName());
				}else{
					sb.append("VehicleOwnerDto.OwnerName为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerType())){
					vehicleOwnerXom.setOwnerType(prpcarInputDto.getVehicleOwnerDto().getOwnerType());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerType_Code())){
					vehicleOwnerXom.setOwnerType_Code(prpcarInputDto.getVehicleOwnerDto().getOwnerType_Code());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerIdentifyNumber())){
					vehicleOwnerXom.setOwnerIdentifyNumber(prpcarInputDto.getVehicleOwnerDto().getOwnerIdentifyNumber());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerSex())){
					vehicleOwnerXom.setOwnerSex(prpcarInputDto.getVehicleOwnerDto().getOwnerSex());
				}
				if(PubTools.isNotNull(prpcarInputDto.getVehicleOwnerDto().getOwnerSex_Code())){
					vehicleOwnerXom.setOwnerSex_Code(prpcarInputDto.getVehicleOwnerDto().getOwnerSex_Code());
				}
			}
			prpcarInputXom.setVehicleOwnerXom(vehicleOwnerXom);
			//组织VehicleOwnerXom end
			
			//组织itemKindXomList begin
			List<ItemKindXom> itemKindXomList = new ArrayList<ItemKindXom>();
			if(prpcarInputDto.getItemKindDtoList()!=null){
				int itemKindlength = prpcarInputDto.getItemKindDtoList().size();				
				for(int i=0;i<itemKindlength;i++ ){
					ItemKindDto itemKindDto = prpcarInputDto.getItemKindDtoList().get(i);
						
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
					}
					
					//Double
					if(PubTools.isNotNull(itemKindDto.getAmount())){
						itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Amount为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getBenchMarkPremium())){
						itemKindXom.setBenchMarkPremium(Double.parseDouble(itemKindDto.getBenchMarkPremium()));
					}
					if(PubTools.isNotNull(itemKindDto.getPremium())){
						itemKindXom.setPremium(Double.parseDouble(itemKindDto.getPremium()));
					}
					if(PubTools.isNotNull(itemKindDto.getEveryLimitFee())){
						itemKindXom.setEveryLimitFee(Double.parseDouble(itemKindDto.getEveryLimitFee()));
					}
					itemKindXomList.add(itemKindXom);
				}					
			}
			prpcarInputXom.setItemKindXomList(itemKindXomList);
			//组织itemKindXomList end
			
			//组织OtherXom begin
			OtherXom otherXom = new OtherXom();
			if(prpcarInputDto.getOtherDto()!=null){
				//String
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeA())){
					otherXom.setAttributeA(prpcarInputDto.getOtherDto().getAttributeA());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeB())){
					otherXom.setAttributeB(prpcarInputDto.getOtherDto().getAttributeB());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeC())){
					otherXom.setAttributeC(prpcarInputDto.getOtherDto().getAttributeC());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeD())){
					otherXom.setAttributeD(prpcarInputDto.getOtherDto().getAttributeD());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeE())){
					otherXom.setAttributeE(prpcarInputDto.getOtherDto().getAttributeE());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAttributeF())){
					otherXom.setAttributeF(prpcarInputDto.getOtherDto().getAttributeF());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getIsInsureExcept())){
					otherXom.setIsInsureExcept(prpcarInputDto.getOtherDto().getIsInsureExcept());
				}else{
					sb.append("OtherDto.IsInsureExcept为空|");
				}

				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getTrafficNCD2())){
					otherXom.setTrafficNCD2(prpcarInputDto.getOtherDto().getTrafficNCD2());
				}else{
					sb.append("OtherDto.TrafficNCD2为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getUpBusinessNCD())){
					otherXom.setUpBusinessNCD(prpcarInputDto.getOtherDto().getUpBusinessNCD());
				}else{
					sb.append("OtherDto.UpBusinessNCD为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getBusinessNCD2())){
					otherXom.setBusinessNCD2(prpcarInputDto.getOtherDto().getBusinessNCD2());
				}else{
					sb.append("OtherDto.BusinessNCD2为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getUploadTransferFlag())){
					otherXom.setUploadTransferFlag(prpcarInputDto.getOtherDto().getUploadTransferFlag());
				}else{
					otherXom.setUploadTransferFlag("");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getNonfloatingCauseNCD())){
					otherXom.setNonfloatingCauseNCD(prpcarInputDto.getOtherDto().getNonfloatingCauseNCD());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getAutoBusiness())){
					otherXom.setAutoBusiness(prpcarInputDto.getOtherDto().getAutoBusiness());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getLastCarOwner())){
					otherXom.setLastCarOwner(prpcarInputDto.getOtherDto().getLastCarOwner());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getLastItemkind())){
					otherXom.setLastItemkind(prpcarInputDto.getOtherDto().getLastItemkind());
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getTrafficFloatingCause())){
					otherXom.setTrafficFloatingCause(prpcarInputDto.getOtherDto().getTrafficFloatingCause());
				}else{
					if(prpcarInputDto.getMainDto()!=null && ("DDA".equals(prpcarInputDto.getMainDto().getRiskCode())
						|| "是".equals(prpcarInputDto.getMainDto().getIsCorrelation()))){
						sb.append("OtherDto.TrafficFloatingCause为空|");
					}
				}
				
				
				//Double
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getClaimAdjustValue())){
					otherXom.setClaimAdjustValue(Double.parseDouble(prpcarInputDto.getOtherDto().getClaimAdjustValue()));
				}else{
					sb.append("OtherDto.ClaimAdjustValue为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getIllegalTrafficValue())){
					otherXom.setIllegalTrafficValue(Double.parseDouble(prpcarInputDto.getOtherDto().getIllegalTrafficValue()));
				}else{
					sb.append("OtherDto.IllegalTrafficValue为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getTrafficNCDPremium())){
					otherXom.setTrafficNCDPremium(Double.parseDouble(prpcarInputDto.getOtherDto().getTrafficNCDPremium()));
				}else{
					sb.append("OtherDto.TrafficNCDPremium为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getBusinessNCDPremium())){
					otherXom.setBusinessNCDPremium(Double.parseDouble(prpcarInputDto.getOtherDto().getBusinessNCDPremium()));
				}else{
					sb.append("OtherDto.BusinessNCDPremium为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getLastLossNumber())){
					otherXom.setLastLossNumber(Double.parseDouble(prpcarInputDto.getOtherDto().getLastLossNumber()));
				}else{
					sb.append("OtherDto.LastLossNumber为空|");
				}
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getTrafficNCD1Value())){
					otherXom.setTrafficNCD1Value(Double.parseDouble(prpcarInputDto.getOtherDto().getTrafficNCD1Value()));
				}else{
					if(prpcarInputDto.getMainDto()!=null && ("DDA".equals(prpcarInputDto.getMainDto().getRiskCode())
						|| "是".equals(prpcarInputDto.getMainDto().getIsCorrelation()))){
						sb.append("OtherDto.TrafficNCD1为空|");
					}
				}
				
				// Date 日期格式 yyyy-mm-dd
				if(PubTools.isNotNull(prpcarInputDto.getOtherDto().getLastEndDate())){
					otherXom.setLastEndDate(formatter.parse(prpcarInputDto.getOtherDto().getLastEndDate()));
				}else{
					otherXom.setLastEndDate(null);
				}
				
			}
			

			prpcarInputXom.setOtherXom(otherXom);
			//组织OtherXom end

			PrpCarResultXom prpCarResultXom =new PrpCarResultXom();
			prpCarResultXom.setFeeRate(0.0);
			prpCarResultXom.setTrafficDisRate(0.0);
			prpCarResultXom.setBusinessDisRate(0.0);

			prpcarInputXom.setPrpCarResultXOM(prpCarResultXom);
			prpcarInputXom.getPrpCarResultXOM().setErrorMessage(sb.toString());
			
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return prpcarInputXom;
	}
	/**
	 * 出参对象转换
	 * @param 
	 * @return
	 */
	public static PrpCarResultDto ConvertObject(PrpCarResultXom prpcarResultXom){
		PrpCarResultDto prpcarResultDto = new PrpCarResultDto();
		try {
			
			MainDto mainDto = new MainDto();
			NCDCoefficientDto ncdCoefficientDto = new NCDCoefficientDto();
			SelfCoefficientDto selfCoefficientDto = new SelfCoefficientDto();
			List<RateDto> rateDtoList = new ArrayList<RateDto>();
			if(prpcarResultXom!=null){
				if(prpcarResultXom.getCountNCDCof()!=null && !"".equals(prpcarResultXom.getTrafficDisRate())){
					mainDto.setCountNCDCof(""+prpcarResultXom.getCountNCDCof());
				}else{
					mainDto.setCountNCDCof("");
				}
				if(prpcarResultXom.getActuaryCof()!=null && !"".equals(prpcarResultXom.getActuaryCof())){
					mainDto.setActuaryCof(""+prpcarResultXom.getActuaryCof());
				}else{
					mainDto.setActuaryCof("");
				}
				if(prpcarResultXom.getTargetCof()!=null && !"".equals(prpcarResultXom.getTargetCof())){
					mainDto.setTargetCof(""+Rounding(prpcarResultXom.getTargetCof(),4));
				}else{
					mainDto.setTargetCof("");
				}
				if(prpcarResultXom.getCountCof()!=null && !"".equals(prpcarResultXom.getCountCof())){
					mainDto.setCountCof(""+prpcarResultXom.getCountCof());
				}else{
					mainDto.setCountCof("");
				}
				if(prpcarResultXom.getSelfChannelCof()!=null && !"".equals(prpcarResultXom.getSelfChannelCof())){
					mainDto.setSelfChannelCof(""+prpcarResultXom.getSelfChannelCof());
				}else{
					mainDto.setSelfChannelCof("");
				}
				if(prpcarResultXom.getSelfProtectionCof()!=null && !"".equals(prpcarResultXom.getSelfProtectionCof())){
					mainDto.setSelfProtectionCof(""+prpcarResultXom.getSelfProtectionCof());
				}else{
					mainDto.setSelfProtectionCof("");
				}
				if(prpcarResultXom.getProtectionCof()!=null && !"".equals(prpcarResultXom.getProtectionCof())){
					mainDto.setProtectionCof(""+prpcarResultXom.getProtectionCof());
				}else{
					mainDto.setProtectionCof("");
				}
				if(prpcarResultXom.getProgrammeType()!=null && !"".equals(prpcarResultXom.getProgrammeType())){
					mainDto.setProgrammeType(""+prpcarResultXom.getProgrammeType());
				}else{
					mainDto.setProgrammeType("");
				}
				if(prpcarResultXom.getDescription()!=null && !"".equals(prpcarResultXom.getDescription())){
					mainDto.setDescription(""+prpcarResultXom.getDescription());
				}else{
					mainDto.setDescription("");
				}
				if(prpcarResultXom.getErrorMessage()!=null && !"".equals(prpcarResultXom.getErrorMessage())){
					mainDto.setErrorMessage(""+prpcarResultXom.getErrorMessage());
				}else{
					mainDto.setErrorMessage("");
				}
				if(prpcarResultXom.getCarInspectionFlag()!=null && !"".equals(prpcarResultXom.getCarInspectionFlag())){
					mainDto.setCarInspectionFlag(""+prpcarResultXom.getCarInspectionFlag());
				}else{
					mainDto.setCarInspectionFlag("");
				}
				if(prpcarResultXom.getOperation()!=null && !"".equals(prpcarResultXom.getOperation())){
					mainDto.setOperation(""+prpcarResultXom.getOperation());
				}else{
					mainDto.setOperation("");
				}
				if(prpcarResultXom.getAutoBusiness()!=null && !"".equals(prpcarResultXom.getAutoBusiness())){
					mainDto.setAutoBusiness(""+prpcarResultXom.getAutoBusiness());
				}else{
					mainDto.setAutoBusiness("");
				}
				if(prpcarResultXom.getIsFeeDiscount()!=null && !"".equals(prpcarResultXom.getIsFeeDiscount())){
					mainDto.setIsFeeDiscount(""+prpcarResultXom.getIsFeeDiscount());
				}else{
					mainDto.setIsFeeDiscount("");
				}
				if(prpcarResultXom.getDistributionRatio()!=null && !"".equals(prpcarResultXom.getDistributionRatio())){
					mainDto.setDistributionRatio(""+prpcarResultXom.getDistributionRatio());
				}else{
					mainDto.setDistributionRatio("");
				}
				if(prpcarResultXom.getCarPriceCof()!=null && !"".equals(prpcarResultXom.getCarPriceCof())){
					mainDto.setCarPriceCof(""+prpcarResultXom.getCarPriceCof());
				}else{
					mainDto.setCarPriceCof("");
				}
				if(prpcarResultXom.getTrafficDisRate()!=null && !"".equals(prpcarResultXom.getTrafficDisRate())){
					mainDto.setTrafficDisRate(""+prpcarResultXom.getTrafficDisRate());
				}else{
					mainDto.setTrafficDisRate("0");
				}
				if(prpcarResultXom.getBusinessDisRate()!=null && !"".equals(prpcarResultXom.getBusinessDisRate())){
					mainDto.setBusinessDisRate(""+prpcarResultXom.getBusinessDisRate());
				}else{
					mainDto.setBusinessDisRate("0");
				}
				
				
				
				
				
				
				if(prpcarResultXom.getCarGroupCof()!=null && !"".equals(prpcarResultXom.getCarGroupCof())){
					ncdCoefficientDto.setCarGroupCof(""+prpcarResultXom.getCarGroupCof());
				}else{
					ncdCoefficientDto.setCarGroupCof("");
				}
				if(prpcarResultXom.getAgeSexCof()!=null && !"".equals(prpcarResultXom.getAgeSexCof())){
					ncdCoefficientDto.setAgeSexCof(""+prpcarResultXom.getAgeSexCof());
				}else{
					ncdCoefficientDto.setAgeSexCof("");
				}
				if(prpcarResultXom.getTrafficNCD1Cof()!=null && !"".equals(prpcarResultXom.getTrafficNCD1Cof())){
					ncdCoefficientDto.setTrafficNCD1Cof(""+prpcarResultXom.getTrafficNCD1Cof());
				}else{
					ncdCoefficientDto.setTrafficNCD1Cof("");
				}
				if(prpcarResultXom.getTrafficNCD2Cof()!=null && !"".equals(prpcarResultXom.getTrafficNCD2Cof())){
					ncdCoefficientDto.setTrafficNCD2Cof(""+prpcarResultXom.getTrafficNCD2Cof());
				}else{
					ncdCoefficientDto.setTrafficNCD2Cof("");
				}
				if(prpcarResultXom.getBusinessNCD1Cof()!=null && !"".equals(prpcarResultXom.getBusinessNCD1Cof())){
					ncdCoefficientDto.setBusinessNCD1Cof(""+prpcarResultXom.getBusinessNCD1Cof());
				}else{
					ncdCoefficientDto.setBusinessNCD1Cof("");
				}
				if(prpcarResultXom.getBusinessNCD2Cof()!=null && !"".equals(prpcarResultXom.getBusinessNCD2Cof())){
					ncdCoefficientDto.setBusinessNCD2Cof(""+prpcarResultXom.getBusinessNCD2Cof());
				}else{
					ncdCoefficientDto.setBusinessNCD2Cof("");
				}
				if(prpcarResultXom.getUpBusinessNCDCof()!=null && !"".equals(prpcarResultXom.getUpBusinessNCDCof())){
					ncdCoefficientDto.setUpBusinessNCDCof(""+prpcarResultXom.getUpBusinessNCDCof());
				}else{
					ncdCoefficientDto.setUpBusinessNCDCof("");
				}
				if(prpcarResultXom.getCarAgeLevelCof()!=null && !"".equals(prpcarResultXom.getCarAgeLevelCof())){
					ncdCoefficientDto.setCarAgeLevelCof(""+prpcarResultXom.getCarAgeLevelCof());
				}else{
					ncdCoefficientDto.setCarAgeLevelCof("");
				}
				if(prpcarResultXom.getInsSituationCof()!=null && !"".equals(prpcarResultXom.getInsSituationCof())){
					ncdCoefficientDto.setInsSituationCof(""+prpcarResultXom.getInsSituationCof());
				}else{
					ncdCoefficientDto.setInsSituationCof("");
				}
				if(prpcarResultXom.getIsInsureExceptCof()!=null && !"".equals(prpcarResultXom.getIsInsureExceptCof())){
					ncdCoefficientDto.setIsInsureExceptCof(""+prpcarResultXom.getIsInsureExceptCof());
				}else{
					ncdCoefficientDto.setIsInsureExceptCof("");
				}
				if(prpcarResultXom.getqCellCoreCof()!=null && !"".equals(prpcarResultXom.getqCellCoreCof())){
					ncdCoefficientDto.setqCellCoreCof(""+prpcarResultXom.getqCellCoreCof());
				}else{
					ncdCoefficientDto.setqCellCoreCof("");
				}
				if(prpcarResultXom.getVehiclesDisCof()!=null && !"".equals(prpcarResultXom.getVehiclesDisCof())){
					ncdCoefficientDto.setVehiclesDisCof(""+prpcarResultXom.getVehiclesDisCof());
				}else{
					ncdCoefficientDto.setVehiclesDisCof("");
				}
				if(prpcarResultXom.getRegionalBenchmarksCof()!=null && !"".equals(prpcarResultXom.getRegionalBenchmarksCof())){
					ncdCoefficientDto.setRegionalBenchmarksCof(""+Rounding(prpcarResultXom.getRegionalBenchmarksCof(),4));
				}else{
					ncdCoefficientDto.setRegionalBenchmarksCof("");
				}
				
				
				System.out.println("====insureHabits投保习惯======"+prpcarResultXom.getInsureHabits()+"======");
				System.out.println("====AddRiskSituation附加险投保情况======"+prpcarResultXom.getAddRiskSituation());
				System.out.println("====trafficNCD1交强1年NCD情况======"+prpcarResultXom.getTrafficNCD1());
				System.out.println("====trafficNCD1Cof交强1年NCD情况======"+prpcarResultXom.getTrafficNCD1Cof());
				System.out.println("====ActuarialPricSwitch精算定价开关======"+prpcarResultXom.getActuarialPricSwitch());
				System.out.println("====UndwrtLockFlag核保锁定======"+prpcarResultXom.getUndwrtLockFlag());
				System.out.println("====CarPriceCof承保定价系数======"+prpcarResultXom.getCarPriceCof());
				System.out.println("====PriceCof规则定价系数======"+prpcarResultXom.getPriceCof());
				
				

				System.out.println("====SelfProtectionCof自主核保系数======"+prpcarResultXom.getSelfProtectionCof());
				System.out.println("====SelfChannelCof自主渠道系数======"+prpcarResultXom.getSelfChannelCof());
				
				
				System.out.println("====CountNCDCof精算定价系数======"+prpcarResultXom.getActuaryCof());
				System.out.println("====ProtectionCof核保定价系数======"+prpcarResultXom.getProtectionCof());
				if(prpcarResultXom.getSelfProtectionUp()!=null && !"".equals(prpcarResultXom.getSelfProtectionUp())){
					selfCoefficientDto.setSelfProtectionUp(""+prpcarResultXom.getSelfProtectionUp());
				}else{
					selfCoefficientDto.setSelfProtectionUp("");
				}
				if(prpcarResultXom.getSelfProtectionDown()!=null && !"".equals(prpcarResultXom.getSelfProtectionDown())){
					selfCoefficientDto.setSelfProtectionDown(""+prpcarResultXom.getSelfProtectionDown());
				}else{
					selfCoefficientDto.setSelfProtectionDown("");
				}
				if(prpcarResultXom.getSelfChannelUp()!=null && !"".equals(prpcarResultXom.getSelfChannelUp())){
					selfCoefficientDto.setSelfChannelUp(""+prpcarResultXom.getSelfChannelUp());
				}else{
					selfCoefficientDto.setSelfChannelUp("");
				}
				if(prpcarResultXom.getSelfChannelDown()!=null && !"".equals(prpcarResultXom.getSelfChannelDown())){
					selfCoefficientDto.setSelfChannelDown(""+prpcarResultXom.getSelfChannelDown());
				}else{
					selfCoefficientDto.setSelfChannelDown("");
				}
				if(prpcarResultXom.getLoyaltyCof()!=null && !"".equals(prpcarResultXom.getLoyaltyCof())){
					selfCoefficientDto.setLoyaltyCof(""+prpcarResultXom.getLoyaltyCof());
				}else{
					selfCoefficientDto.setLoyaltyCof("");
				}
				if(prpcarResultXom.getThreeLimitCof()!=null && !"".equals(prpcarResultXom.getThreeLimitCof())){
					selfCoefficientDto.setThreeLimitCof(""+prpcarResultXom.getThreeLimitCof());
				}else{
					selfCoefficientDto.setThreeLimitCof("");
				}
				if(prpcarResultXom.getFullRiskInsuranceCof()!=null && !"".equals(prpcarResultXom.getFullRiskInsuranceCof())){
					selfCoefficientDto.setFullRiskInsuranceCof(""+prpcarResultXom.getFullRiskInsuranceCof());
				}else{
					selfCoefficientDto.setFullRiskInsuranceCof("");
				}
				if(prpcarResultXom.getLossNumberCof()!=null && !"".equals(prpcarResultXom.getLossNumberCof())){
					selfCoefficientDto.setLossNumberCof(""+prpcarResultXom.getLossNumberCof());
				}else{
					selfCoefficientDto.setLossNumberCof("");
				}
				if(prpcarResultXom.getSspecialVehicleCof()!=null && !"".equals(prpcarResultXom.getSspecialVehicleCof())){
					selfCoefficientDto.setSspecialVehicleCof(""+prpcarResultXom.getSspecialVehicleCof());
				}else{
					selfCoefficientDto.setSspecialVehicleCof("");
				}
				if(prpcarResultXom.getNewInsuredCarCof()!=null && !"".equals(prpcarResultXom.getNewInsuredCarCof())){
					selfCoefficientDto.setNewInsuredCarCof(""+prpcarResultXom.getNewInsuredCarCof());
				}else{
					selfCoefficientDto.setNewInsuredCarCof("");
				}
				if(prpcarResultXom.getCarAgeCof()!=null && !"".equals(prpcarResultXom.getCarAgeCof())){
					selfCoefficientDto.setCarAgeCof(""+prpcarResultXom.getCarAgeCof());
				}else{
					selfCoefficientDto.setCarAgeCof("");
				}
				if(prpcarResultXom.getCustomerChannelCof()!=null && !"".equals(prpcarResultXom.getCustomerChannelCof())){
					selfCoefficientDto.setCustomerChannelCof(""+prpcarResultXom.getCustomerChannelCof());
				}else{
					selfCoefficientDto.setCustomerChannelCof("");
				}
				if(prpcarResultXom.getSumQuantityCof()!=null && !"".equals(prpcarResultXom.getSumQuantityCof())){
					selfCoefficientDto.setSumQuantityCof(""+prpcarResultXom.getSumQuantityCof());
				}else{
					selfCoefficientDto.setSumQuantityCof("");
				}
				if(prpcarResultXom.getInsuredAgeCof()!=null && !"".equals(prpcarResultXom.getInsuredAgeCof())){
					selfCoefficientDto.setInsuredAgeCof(""+prpcarResultXom.getInsuredAgeCof());
				}else{
					selfCoefficientDto.setInsuredAgeCof("");
				}
				if(prpcarResultXom.getInsuredSexCof()!=null && !"".equals(prpcarResultXom.getInsuredSexCof())){
					selfCoefficientDto.setInsuredSexCof(""+prpcarResultXom.getInsuredSexCof());
				}else{
					selfCoefficientDto.setInsuredSexCof("");
				}
				
				
				
				if(prpcarResultXom.getRateList()!=null){
					for(int index=0;index<prpcarResultXom.getRateList().size();index++){
						RateDto rateDto = new RateDto();
						RateXom rateXom = prpcarResultXom.getRateList().get(index);
						
						if(rateXom.getRiskCode()!=null && !"".equals(rateXom.getRiskCode())){
							rateDto.setRiskCode(""+rateXom.getRiskCode());
						}else{
							rateDto.setRiskCode("");
						}
						if(rateXom.getClassCode()!=null && !"".equals(rateXom.getClassCode())){
							rateDto.setClassCode(""+rateXom.getClassCode());
						}else{
							rateDto.setClassCode("");
						}
						if(rateXom.getFeeRate()!=null && !"".equals(rateXom.getFeeRate())){
							rateDto.setFeeRate(""+rateXom.getFeeRate());
						}else{
							rateDto.setFeeRate("");
						}
						if(rateXom.getFeeTypeCode()!=null && !"".equals(rateXom.getFeeTypeCode())){
							rateDto.setFeeTypeCode(""+rateXom.getFeeTypeCode());
						}else{
							rateDto.setFeeTypeCode("");
						}
						if(rateXom.getFeeTypeName()!=null && !"".equals(rateXom.getFeeTypeName())){
							rateDto.setFeeTypeName(""+rateXom.getFeeTypeName());
						}else{
							rateDto.setFeeTypeName("");
						}
						rateDtoList.add(rateDto);
					}
				}

			}
			prpcarResultDto.setMainDto(mainDto);
			prpcarResultDto.setNcdCoefficientDto(ncdCoefficientDto);
			prpcarResultDto.setSelfCoefficientDto(selfCoefficientDto);
			prpcarResultDto.setRateDtoList(rateDtoList);
			//MyBeanUtil.copyProperties(prpcarResultXom,prpcarResultDto);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return prpcarResultDto;
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
