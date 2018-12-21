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

import com.sinosoft.ilogrule.ilog.dto.prpallDto.UnderwriteResultDto;
import com.sinosoft.ilogrule.ilog.dto.prpallDto.UndwrtInputDto;
import com.sinosoft.ilogrule.ilog.xom.prpallXom.UnderwriteResultXOM;
import com.sinosoft.ilogrule.ilog.xom.prpallXom.UndwrtInputXOM;
import com.sinosoft.ilogrule.service.ruleService.prpallService.facade.PrpallCarRuleService;
import com.sinosoft.ilogrule.service.ruleService.prpallService.impl.PrpallCarRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.PrpallConvertUtil;



@Path("/PrpallRuleRestfulService")
public class PrpallRuleRestfulService {
	
	@Context
	private ServletContext servletContext;
	
	private PrpallCarRuleService service = new PrpallCarRuleServiceImpl();
	/**
	 * ilog车险规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/prpallCarRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public UnderwriteResultDto prpallCarRule(UndwrtInputDto requ) throws Exception{		
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
		UndwrtInputXOM undwrtInputXOM= PrpallConvertUtil.ConvertObject(requ);	
		//调用方法
		UnderwriteResultXOM underwriteResultXOM = null;				
		//校验入参接口的字段是否为空
		if(undwrtInputXOM.getUnderwriteResultXOM().getDescription()!=null&&!"".equals(undwrtInputXOM.getUnderwriteResultXOM().getDescription())){
			underwriteResultXOM = undwrtInputXOM.getUnderwriteResultXOM();
		}else{
			underwriteResultXOM = service.carRules(undwrtInputXOM,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = PrpallConvertUtil.ConvertObject(underwriteResultXOM);
		//交互结束时间
		String msgEnd="";  
		Date dateEnd = new Date();  
		msgEnd+="["+sdf.format(dateEnd)+"]";  	          
		System.out.println("交互结束时间======"+msgEnd);
		return resp;
	}
	
}
