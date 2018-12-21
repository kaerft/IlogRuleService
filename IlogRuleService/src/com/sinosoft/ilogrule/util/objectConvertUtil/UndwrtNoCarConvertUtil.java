package com.sinosoft.ilogrule.util.objectConvertUtil;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.CargoDetailDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.ItemKindDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarResultDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarInputDto;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.ApplicantXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.CargoDetailXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.InsuredXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.ItemKindXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.MainXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.OtherXom;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.util.UtilXom;
import com.sinosoft.ilogrule.service.undwrtGradeService.facade.UndwrtGradeService;
import com.sinosoft.ilogrule.service.undwrtGradeService.impl.UndwrtGradeServiceImpl;
import com.sinosoft.ilogrule.util.MyBeanUtil;
import com.sinosoft.ilogrule.util.PubTools;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeNoCarVo;

public class UndwrtNoCarConvertUtil {
	
	/**
	 * 入参对象转换
	 * @param approveRuleVo
	 * @return
	 */
	public static UndwrtNoCarInputXOM ConvertObject(UndwrtNoCarInputDto undwrtInputDto){
		UndwrtNoCarInputXOM undwrtInputXOM = new UndwrtNoCarInputXOM();
		undwrtInputXOM.setUndwrtNoCarResultXOM(new UndwrtNoCarResultXOM());
		try {
			SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd"); 

			//组织判断接口调用非空校验
			StringBuffer sb = new StringBuffer();
			
			//核保级别顺序从数据库获取 begin
			List<UndwrtGradeNoCarVo>  undwrtGradeVoList = null;
			UndwrtGradeService undwrtGradeService = new UndwrtGradeServiceImpl();
			undwrtGradeVoList = undwrtGradeService.findByOrderUndwrtGradeNoCar();
			String strGradeNames = "";
			StringBuffer sbGrade = new StringBuffer(200);
			for(int i=0;i<undwrtGradeVoList.size();i++){
				UndwrtGradeNoCarVo undwrtGradeVo = new UndwrtGradeNoCarVo();
				undwrtGradeVo = undwrtGradeVoList.get(i);
				sbGrade.append(undwrtGradeVo.getUndwrtGradeName()+",");
			}
			strGradeNames = sbGrade.toString();
			//核保级别顺序从数据库获取 end
			undwrtInputXOM.getUndwrtNoCarResultXOM().setStrGradeNames(strGradeNames);
			
			//自定义属性初始值设置 begin
			UtilXom utilXom = new UtilXom();
			utilXom.setIsNullOfRenewalYears("true");
			utilXom.setIsNullOfBeforePrem("true");
			utilXom.setIsNullOfEntireDiscount("true");
			utilXom.setIsNullOfAfterPrem("true");
			utilXom.setIsNullOfAgeAppli("true");
			utilXom.setIsNullOfAgeInsured("true");
			
			//自定义属性初始值设置 end
			
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
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolicyType())){
					mainXom.setPolicyType(undwrtInputDto.getMainDto().getPolicyType());
				}else{
					//sb.append("MainDto.PolicyType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolicyType_Code())){
					mainXom.setPolicyType_Code(undwrtInputDto.getMainDto().getPolicyType_Code());
				}else{
					//sb.append("MainDto.PolicyType_Code为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalFlag())){
					mainXom.setRenewalFlag(undwrtInputDto.getMainDto().getRenewalFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalFlag_Code())){
					mainXom.setRenewalFlag_Code(undwrtInputDto.getMainDto().getRenewalFlag_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getComCode())){
					mainXom.setComCode(undwrtInputDto.getMainDto().getComCode());
				}else{
					//sb.append("MainDto.ComCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getComName())){
					mainXom.setComName(undwrtInputDto.getMainDto().getComName());
				}else{
					//sb.append("MainDto.ComName为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAgentCode())){
					mainXom.setAgentCode(undwrtInputDto.getMainDto().getAgentCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getAgentName())){
					mainXom.setAgentName(undwrtInputDto.getMainDto().getAgentName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getFxqFlag())){
					mainXom.setFxqFlag(undwrtInputDto.getMainDto().getFxqFlag());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getClassCode())){
					mainXom.setClassCode(undwrtInputDto.getMainDto().getClassCode());
				}else{
					sb.append("MainDto.ClassCode为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRiskCode())){
					mainXom.setRiskCode(undwrtInputDto.getMainDto().getRiskCode());
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
				
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getHandlerName())){
					mainXom.setHandlerName(undwrtInputDto.getMainDto().getHandlerName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getHandler_Code())){
					mainXom.setHandler_Code(undwrtInputDto.getMainDto().getHandler_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getIntoBusiness())){
					mainXom.setIntoBusiness(undwrtInputDto.getMainDto().getIntoBusiness());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getProposalEndorseType())){
					mainXom.setProposalEndorseType(undwrtInputDto.getMainDto().getProposalEndorseType());
				}else{
					sb.append("MainDto.ProposalEndorseType为空|");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEndorseNo())){
					mainXom.setEndorseNo(undwrtInputDto.getMainDto().getEndorseNo());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRiskGrade())){
					mainXom.setRiskGrade(undwrtInputDto.getMainDto().getRiskGrade());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBusinSpecieCode())){
					mainXom.setBusinSpecieCode(undwrtInputDto.getMainDto().getBusinSpecieCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBusinSpecieName())){
					mainXom.setBusinSpecieName(undwrtInputDto.getMainDto().getBusinSpecieName());
				}
				//批改类型
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEndorType())){
					mainXom.setEndorType(undwrtInputDto.getMainDto().getEndorType());
				}
				
				// Date 日期格式 yyyy-mm-dd
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getStartDate())){
					mainXom.setStartDate(formatter.parse(undwrtInputDto.getMainDto().getStartDate()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getEndDate())){
					mainXom.setEndDate(formatter.parse(undwrtInputDto.getMainDto().getEndDate()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getInsureDate())){
					mainXom.setInsureDate(formatter.parse(undwrtInputDto.getMainDto().getInsureDate()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getSignDate())){
					mainXom.setSignDate(formatter.parse(undwrtInputDto.getMainDto().getSignDate()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getOprTm())){
					mainXom.setOprTm(formatter.parse(undwrtInputDto.getMainDto().getOprTm()));
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
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolRetSumAmount())){
					mainXom.setPolRetSumAmount(Double.parseDouble(undwrtInputDto.getMainDto().getPolRetSumAmount()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolSumLimit())){
					mainXom.setPolSumLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolSumLimit()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolPerLimit())){
					mainXom.setPolPerLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolPerLimit()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolPerAcciLimit())){
					mainXom.setPolPerAcciLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolPerAcciLimit()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolRetSumLimit())){
					mainXom.setPolRetSumLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolRetSumLimit()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolRetPerLimit())){
					mainXom.setPolRetPerLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolRetPerLimit()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getPolRetPerAcciLimit())){
					mainXom.setPolRetPerAcciLimit(Double.parseDouble(undwrtInputDto.getMainDto().getPolRetPerAcciLimit()));
				}
				
				//Integer
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().gettInsrncDay())){
					mainXom.settInsrncDay(Integer.parseInt(undwrtInputDto.getMainDto().gettInsrncDay()));
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getRenewalYears())){
					mainXom.setRenewalYears(Integer.parseInt(undwrtInputDto.getMainDto().getRenewalYears()));
				}else{
					utilXom.setIsNullOfRenewalYears("false");
				}
				if(PubTools.isNotNull(undwrtInputDto.getMainDto().getBackDays())){
					mainXom.setBackDays(Integer.parseInt(undwrtInputDto.getMainDto().getBackDays()));
				}else{
					sb.append("MainDto.BackDays为空|");
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
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getCustomerChannel_Code())){
					applicantXom.setCustomerChannel_Code(undwrtInputDto.getApplicantDto().getCustomerChannel_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliCode())){
					applicantXom.setAppliCode(undwrtInputDto.getApplicantDto().getAppliCode());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliName())){
					applicantXom.setAppliName(undwrtInputDto.getApplicantDto().getAppliName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getInsuredNature())){
					applicantXom.setInsuredNature(undwrtInputDto.getApplicantDto().getInsuredNature());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getInsuredNature_Code())){
					applicantXom.setInsuredNature_Code(undwrtInputDto.getApplicantDto().getInsuredNature_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliTrade())){
					applicantXom.setAppliTrade(undwrtInputDto.getApplicantDto().getAppliTrade());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getAppliTrade_Code())){
					applicantXom.setAppliTrade_Code(undwrtInputDto.getApplicantDto().getAppliTrade_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyType())){
					applicantXom.setIdentifyType(undwrtInputDto.getApplicantDto().getIdentifyType());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyType_code())){
					applicantXom.setIdentifyType_code(undwrtInputDto.getApplicantDto().getIdentifyType_code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getApplicantDto().getIdentifyNumber())){
					applicantXom.setIdentifyNumber(undwrtInputDto.getApplicantDto().getIdentifyNumber());
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
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredName())){
					insuredXom.setInsuredName(undwrtInputDto.getInsuredDto().getInsuredName());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredNature())){
					insuredXom.setInsuredNature(undwrtInputDto.getInsuredDto().getInsuredNature());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredNature_Code())){
					insuredXom.setInsuredNature_Code(undwrtInputDto.getInsuredDto().getInsuredNature_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredTrade())){
					insuredXom.setInsuredTrade(undwrtInputDto.getInsuredDto().getInsuredTrade());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getInsuredTrade_Code())){
					insuredXom.setInsuredTrade_Code(undwrtInputDto.getInsuredDto().getInsuredTrade_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyType())){
					insuredXom.setIdentifyType(undwrtInputDto.getInsuredDto().getIdentifyType());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyType_Code())){
					insuredXom.setIdentifyType_Code(undwrtInputDto.getInsuredDto().getIdentifyType_Code());
				}
				if(PubTools.isNotNull(undwrtInputDto.getInsuredDto().getIdentifyNumber())){
					insuredXom.setIdentifyNumber(undwrtInputDto.getInsuredDto().getIdentifyNumber());
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
					
					
					if(PubTools.isNotNull(itemKindDto.getFlag())){
						itemKindXom.setFlag(itemKindDto.getFlag());
					}else{
						sb.append("ItemKindDtoList.ItemKindDto.Flag为空|");
					}
					if(PubTools.isNotNull(itemKindDto.getKindCode())){
						itemKindXom.setKindCode(itemKindDto.getKindCode());
					}
					if(PubTools.isNotNull(itemKindDto.getKindName())){
						itemKindXom.setKindName(itemKindDto.getKindName());
					}
					
					
					//Double
					if(PubTools.isNotNull(itemKindDto.getAmount())){
						itemKindXom.setAmount(Double.parseDouble(itemKindDto.getAmount()));
					}
					if(PubTools.isNotNull(itemKindDto.getBenchMarkPremium())){
						itemKindXom.setBenchMarkPremium(Double.parseDouble(itemKindDto.getBenchMarkPremium()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemPerAcciLimit())){
						itemKindXom.setItemPerAcciLimit(Double.parseDouble(itemKindDto.getItemPerAcciLimit()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemPerLimit())){
						itemKindXom.setItemPerLimit(Double.parseDouble(itemKindDto.getItemPerLimit()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemSumLimit())){
						itemKindXom.setItemSumLimit(Double.parseDouble(itemKindDto.getItemSumLimit()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemRetSumLimit())){
						itemKindXom.setItemRetSumLimit(Double.parseDouble(itemKindDto.getItemRetSumLimit()));
					}
					if(PubTools.isNotNull(itemKindDto.getRetAmount())){
						itemKindXom.setRetAmount(Double.parseDouble(itemKindDto.getRetAmount()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemRetPerLimit())){
						itemKindXom.setItemRetPerLimit(Double.parseDouble(itemKindDto.getItemRetPerLimit()));
					}
					if(PubTools.isNotNull(itemKindDto.getItemRetPerAcciLimit())){
						itemKindXom.setItemRetPerAcciLimit(Double.parseDouble(itemKindDto.getItemRetPerAcciLimit()));
					}
					
					itemKindXomList.add(itemKindXom);
				}					
			}else{
				sb.append("ItemKindDtoList为空|");
			}
			undwrtInputXOM.setItemKindXomList(itemKindXomList);
			//组织itemKindXomList end
			
			//组织OtherXom begin
			String strBusinessOperatio = "";
			OtherXom otherXom = new OtherXom();
			if(undwrtInputDto.getOtherDto()!=null){
				//String
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getIsAgreementPolicy())){
					otherXom.setIsAgreementPolicy(undwrtInputDto.getOtherDto().getIsAgreementPolicy());
				}else{
					sb.append("OtherDto.IsAgreementPolicy为空|");
				}
				
				//协议保单类型默认为""
				otherXom.setAgreePolicyType_Code("");
				otherXom.setAgreePolicyType("");
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAgreePolicyType_Code())){
					otherXom.setAgreePolicyType_Code(undwrtInputDto.getOtherDto().getAgreePolicyType_Code());
				}			
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getAgreePolicyType())){
					otherXom.setAgreePolicyType(undwrtInputDto.getOtherDto().getAgreePolicyType());
				}
				
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getBusinessOperation())){
					otherXom.setBusinessOperation(undwrtInputDto.getOtherDto().getBusinessOperation());
					strBusinessOperatio = undwrtInputDto.getOtherDto().getBusinessOperation();
				}else{
					sb.append("OtherDto.BusinessOperation为空|");
				}
				
				//核保人操作机构
				if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getUndwrtUseComCode())){
					otherXom.setUndwrtUseComCode(undwrtInputDto.getOtherDto().getUndwrtUseComCode());
				}
				
				if("2".equals(strBusinessOperatio)){//审核通过操作
					//核保人
					if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getUndwrtPeopleCode())){
						otherXom.setUndwrtPeopleCode(undwrtInputDto.getOtherDto().getUndwrtPeopleCode());
					}else{
						sb.append("OtherDto.UndwrtPeopleCode为空|");
					}
					if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getUndwrtPeopleName())){
						otherXom.setUndwrtPeopleName(undwrtInputDto.getOtherDto().getUndwrtPeopleName());
					}else{
						sb.append("OtherDto.UndwrtPeopleName为空|");
					}
					//核保级别
					if(PubTools.isNotNull(undwrtInputDto.getOtherDto().getUndwrtGrade())){
						undwrtInputXOM.getUndwrtNoCarResultXOM().setUndwrtLevel(undwrtInputDto.getOtherDto().getUndwrtGrade());
					}else{
						sb.append("OtherDto.UndwrtGrade为空|");
					}
				}
				//Double
				
				//Integer
				
				//Date
					
				
			}else{
				sb.append("OtherDto为空|");
			}
			undwrtInputXOM.setOtherXom(otherXom);
			//组织OtherXom end
			
			//组织cargoDetailXomList begin
			List<CargoDetailXom> cargoDetailXomList = new ArrayList<CargoDetailXom>();
			if(undwrtInputDto.getCargoDetailDtoList()!=null){
				int cargoDetaillength = undwrtInputDto.getCargoDetailDtoList().size();
//				if(cargoDetaillength==0){
//					sb.append("CargoDetailDtoList.CargoDetailDto为空|");
//				}
				for(int i=0;i<cargoDetaillength;i++ ){
					CargoDetailDto cargoDetailDto = undwrtInputDto.getCargoDetailDtoList().get(i);
						
					CargoDetailXom cargoDetailXom =new CargoDetailXom();
					//String
					if(PubTools.isNotNull(cargoDetailDto.getGoodsSpecie())){
						cargoDetailXom.setGoodsSpecie(cargoDetailDto.getGoodsSpecie());
					}
					if(PubTools.isNotNull(cargoDetailDto.getPackingWay())){
						cargoDetailXom.setPackingWay(cargoDetailDto.getPackingWay());
					}
					
					//Double
					if(PubTools.isNotNull(cargoDetailDto.getSingleLimit())){
						cargoDetailXom.setSingleLimit(Double.parseDouble(cargoDetailDto.getSingleLimit()));
					}
					if(PubTools.isNotNull(cargoDetailDto.getRetSingleLimit())){
						cargoDetailXom.setRetSingleLimit(Double.parseDouble(cargoDetailDto.getRetSingleLimit()));
					}
					
					cargoDetailXomList.add(cargoDetailXom);
				}					
			}
			undwrtInputXOM.setCargoDetailXomList(cargoDetailXomList);
			//组织cargoDetailXomList end
			
			String strCheckRequ = sb.toString();
			undwrtInputXOM.getUndwrtNoCarResultXOM().setDescription(strCheckRequ);
			undwrtInputXOM.getUndwrtNoCarResultXOM().setUndwrtFlag("");		
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
	public static UndwrtNoCarResultDto ConvertObject(UndwrtNoCarResultXOM underwriteResultXOM){
		UndwrtNoCarResultDto underwriteResultDto = new UndwrtNoCarResultDto();
		try {
			MyBeanUtil.copyProperties(underwriteResultXOM,underwriteResultDto);
		} catch (Exception e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return underwriteResultDto;
	}
}
