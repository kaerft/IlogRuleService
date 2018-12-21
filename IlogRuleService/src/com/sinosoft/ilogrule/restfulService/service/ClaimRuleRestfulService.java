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
import com.sinosoft.ilogrule.service.ruleService.claimService.facade.ClaimAllRuleService;
import com.sinosoft.ilogrule.service.ruleService.claimService.impl.ClaimAllRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.ClaimConvertUtil;

@Path("/ClaimRuleRestfulService")
public class ClaimRuleRestfulService {

	@Context
	private ServletContext servletContext;
	
	private ClaimAllRuleService service = new ClaimAllRuleServiceImpl();
	
	/**
	 * 立案
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/claimRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ClaimRuleVo claimRule(ClaimRuleVo requ) throws Exception{		
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
		
		ClaimRuleVo resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		ClaimRuleXom claimRuleXom= ClaimConvertUtil.ConvertObjectClaimRule(requ);	
		//调用方法
		ClaimRuleXom claimRuleResponseXom = null;				
		//校验入参接口的字段是否为空
		if(claimRuleXom.getMessage()!=null&&!"".equals(claimRuleXom.getMessage())){
			claimRuleResponseXom = claimRuleXom;
		}else{
			claimRuleResponseXom = service.claimRule(claimRuleXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectClaimRuleResponse(claimRuleResponseXom);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
	/**
	 * 简易案件
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/simpleRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public SimpleRuleVo simpleRule(SimpleRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
		
		SimpleRuleVo resp = null;		
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		SimpleRuleXom simpleRuleXom= ClaimConvertUtil.ConvertObjectSimpleRule(requ);	
		//调用方法
		SimpleRuleXom simpleRuleResponseXom = null;				
		//校验入参接口的字段是否为空
		if(simpleRuleXom.getMessage()!=null&&!"".equals(simpleRuleXom.getMessage())){
			simpleRuleResponseXom = simpleRuleXom;
		}else{
			simpleRuleResponseXom = service.simpleRule(simpleRuleXom,requestBody);
		}		
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectSimpleRule(simpleRuleResponseXom);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
	/**
	 * 工作流
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/bpmRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public BpmRuleVo bpmRule(BpmRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
		
		BpmRuleVo resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		BpmRuleXom bpmRuleXom= ClaimConvertUtil.ConvertObjectBpmRule(requ);	
		//调用方法
		BpmRuleXom bpmRuleResponseXom = null;				
		//校验入参接口的字段是否为空
		if(bpmRuleXom.getNextNodeName()!=null&&!"".equals(bpmRuleXom.getNextNodeName())){
			bpmRuleResponseXom = bpmRuleXom;
		}else{
			bpmRuleResponseXom = service.bpmRule(bpmRuleXom,requestBody);
		}	
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectBpmRule(bpmRuleResponseXom);		
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
	/**
	 * 自动核赔
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/autoUndwrtRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public AutoUndwrtRuleVo autoUndwrtRule(AutoUndwrtRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
		
		AutoUndwrtRuleVo resp = null;		
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		AutoUndwrtRuleXom autoUndwrtRuleXom= ClaimConvertUtil.ConvertObjectAutoUndwrt(requ);	
		//调用方法
		AutoUndwrtRuleXom autoUndwrtRuleResponseXom = null;				
		//校验入参接口的字段是否为空
		if(autoUndwrtRuleXom.getMessage()!=null&&!"".equals(autoUndwrtRuleXom.getMessage())){
			autoUndwrtRuleResponseXom = autoUndwrtRuleXom;
		}else{
			autoUndwrtRuleResponseXom = service.autoUndwrtRule(autoUndwrtRuleXom,requestBody);
		}	
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectAutoUndwrtRule(autoUndwrtRuleResponseXom);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
	/**
	 * 高级审核
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/approveRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public ApproveRuleVo approveRule(ApproveRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
		
		ApproveRuleVo resp = null;	
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		ApproveRuleXom approveRuleXom= ClaimConvertUtil.ConvertObjectApprove(requ);	
		//调用方法
		ApproveRuleXom approveRuleResponseXom = null;				
		//校验入参接口的字段是否为空
		if(approveRuleXom.getMessage()!=null&&!"".equals(approveRuleXom.getMessage())){
			approveRuleResponseXom = approveRuleXom;
		}else{
			approveRuleResponseXom = service.approveRule(approveRuleXom,requestBody);
		}	
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectApprove(approveRuleResponseXom);		
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}

	/**
	 * 报案
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/registRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public RegistRuleVo registRule(RegistRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
				
		RegistRuleVo resp = null;	
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		RegistRuleXom registRuleXom= ClaimConvertUtil.ConvertObjectRegist(requ);
		//调用方法
		RegistRuleXom registRuleResponseXom = null;
		//校验入参接口的字段是否为空
		if(registRuleXom.getMessage()!=null&&!"".equals(registRuleXom.getMessage())){
			registRuleResponseXom = registRuleXom;
		}else{
			registRuleResponseXom = service.registRule(registRuleXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectRegist(registRuleResponseXom);		
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}

	/**
	 * 核赔
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/undwrtFactorRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public UndwrtFactorRuleVo undwrtFactorRule(UndwrtFactorRuleVo requ)throws Exception{
		//交互开始时间
		String msgStart="";  
		Date dateStart = new Date();  
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
		msgStart+="["+sdf.format(dateStart)+"]";  	          
		System.out.println("交互开始时间======"+msgStart);
				
		UndwrtFactorRuleVo resp = new UndwrtFactorRuleVo();	
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		UndwrtFactorRuleXom undwrtFactorRuleXom= ClaimConvertUtil.ConvertObjectUndwrtFactor(requ);	
		//调用方法
		UndwrtFactorRuleXom undwrtFactorRuleResponseXom = null;
		//校验入参接口的字段是否为空
		if(undwrtFactorRuleXom.getMessage()!=null&&!"".equals(undwrtFactorRuleXom.getMessage())){
			undwrtFactorRuleResponseXom = undwrtFactorRuleXom;
		}else{
			undwrtFactorRuleResponseXom = service.undwrtFactorRule(undwrtFactorRuleXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = ClaimConvertUtil.ConvertObjectUndwrtFactor(undwrtFactorRuleResponseXom);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
}
