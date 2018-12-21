package com.sinosoft.ilogrule.restfulService.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UnderwriteResultDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.car.UndwrtInputDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarInputDto;
import com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar.UndwrtNoCarResultDto;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule.UndwrtInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarInputXOM;
import com.sinosoft.ilogrule.ilog.xom.undwrtXom.NoCarRule.UndwrtNoCarResultXOM;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.facade.UndwrtCarRuleService;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.facade.UndwrtNoCarRuleService;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.impl.UndwrtCarRuleServiceImpl;
import com.sinosoft.ilogrule.service.ruleService.undwrtService.impl.UndwrtNoCarRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.UndwrtConvertUtil;
import com.sinosoft.ilogrule.util.objectConvertUtil.UndwrtNoCarConvertUtil;



@Path("/UndwrtRuleRestfulService")
public class UndwrtRuleRestfulService {
	
	@Context
	private ServletContext servletContext;
	
	private UndwrtCarRuleService service = new UndwrtCarRuleServiceImpl();
	
	private UndwrtNoCarRuleService noCarService = new UndwrtNoCarRuleServiceImpl();
	
	/**
	 * ilog车险规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/undwrtCarRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public UnderwriteResultDto undwrtCarRule(UndwrtInputDto requ) throws Exception{		
		//交互开始时间
		String msgStart="";  
	    Date dateStart = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
	    msgStart+="["+sdf.format(dateStart)+"]";  	          
	    System.out.println("交互开始时间======"+msgStart);
	    
		UnderwriteResultDto resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		UndwrtInputXOM undwrtInputXOM= UndwrtConvertUtil.ConvertObject(requ);
		//获取交易业务号
		String businessTradeNo = "";
		if(undwrtInputXOM.getMainXom()!=null){
			if("T".equals(undwrtInputXOM.getMainXom().getProposalEndorseType())){
				businessTradeNo = undwrtInputXOM.getMainXom().getProposalNo();
			}else if("E".equals(undwrtInputXOM.getMainXom().getProposalEndorseType())){
				if(undwrtInputXOM.getMainXom().getEndorseNo()!=null){
					businessTradeNo = undwrtInputXOM.getMainXom().getEndorseNo();
				}			
			}
		}
		//调用方法
		UnderwriteResultXOM underwriteResultXOM = null;				
		//校验入参接口的字段是否为空
		if(undwrtInputXOM.getUnderwriteResultXOM().getDescription()!=null&&!"".equals(undwrtInputXOM.getUnderwriteResultXOM().getDescription())){
			underwriteResultXOM = undwrtInputXOM.getUnderwriteResultXOM();
		}else{
			underwriteResultXOM = service.carRules(undwrtInputXOM,requestBody,businessTradeNo);
		}
		//出参对象与规则引擎使用对象转换
		resp = UndwrtConvertUtil.ConvertObject(underwriteResultXOM);
		//交互结束时间
		String msgEnd="";  
	    Date dateEnd = new Date();  
	    msgEnd+="["+sdf.format(dateEnd)+"]";  	          
	    System.out.println("交互结束时间======"+msgEnd);
		
		return resp;
	}
	
	/**
	 * ilog非车险规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/undwrtNoCarRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public UndwrtNoCarResultDto undwrtNoCarRule(UndwrtNoCarInputDto requ) throws Exception{	
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
			    
		UndwrtNoCarResultDto resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		UndwrtNoCarInputXOM undwrtInputXOM= UndwrtNoCarConvertUtil.ConvertObject(requ);
		//获取交易业务号
		String businessTradeNo = "";
		if(undwrtInputXOM.getMainXom()!=null){
			if("T".equals(undwrtInputXOM.getMainXom().getProposalEndorseType())){
				businessTradeNo = undwrtInputXOM.getMainXom().getProposalNo();
			}else if("E".equals(undwrtInputXOM.getMainXom().getProposalEndorseType())){
				if(undwrtInputXOM.getMainXom().getEndorseNo()!=null){
					businessTradeNo = undwrtInputXOM.getMainXom().getEndorseNo();
				}			
			}
		}
		//调用方法
		UndwrtNoCarResultXOM underwriteResultXOM = null;				
		//校验入参接口的字段是否为空
		if(undwrtInputXOM.getUndwrtNoCarResultXOM().getDescription()!=null&&!"".equals(undwrtInputXOM.getUndwrtNoCarResultXOM().getDescription())){
			underwriteResultXOM = undwrtInputXOM.getUndwrtNoCarResultXOM();
		}else{
			underwriteResultXOM = noCarService.carRules(undwrtInputXOM,requestBody,businessTradeNo);
		}
		//出参对象与规则引擎使用对象转换
		resp = UndwrtNoCarConvertUtil.ConvertObject(underwriteResultXOM);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
}
