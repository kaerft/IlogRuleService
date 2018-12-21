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

import com.sinosoft.ilogrule.ilog.dto.prpcarDto.PrpCarInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpcarDto.result.PrpCarResultDto;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpcarXom.PrpCarResultXom;
import com.sinosoft.ilogrule.service.ruleService.prpcarService.facade.PrpcarRuleService;
import com.sinosoft.ilogrule.service.ruleService.prpcarService.impl.PrpcarRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.PrpcarConvertUtil;



@Path("/PrpcarRuleRestfulService")
public class PrpcarRuleRestfulService {
	
	@Context
	private ServletContext servletContext;
	
	private PrpcarRuleService service = new PrpcarRuleServiceImpl();
	/**
	 * ilog车险计算优惠规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/prpcarRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public PrpCarResultDto prpCarRule(PrpCarInputDto requ) throws Exception{
		//交互开始时间
		String msgStart="";  
	    Date dateStart = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
	    msgStart+="["+sdf.format(dateStart)+"]";  	          
	    System.out.println("交互开始时间======"+msgStart);
	    
		PrpCarResultDto resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		PrpCarInputXom prpCarInputXom= PrpcarConvertUtil.ConvertObject(requ);	
		//调用方法
		PrpCarResultXom prpCarResultXom = null;
		//校验入参接口的字段是否为空
		if((prpCarInputXom.getPrpCarResultXOM().getDescription()!=null && !"".equals(prpCarInputXom.getPrpCarResultXOM().getDescription()))
				|| (prpCarInputXom.getPrpCarResultXOM().getErrorMessage()!=null && !"".equals(prpCarInputXom.getPrpCarResultXOM().getErrorMessage()))){
			prpCarResultXom = prpCarInputXom.getPrpCarResultXOM();
		}else{
			prpCarResultXom = service.carRules(prpCarInputXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = PrpcarConvertUtil.ConvertObject(prpCarResultXom);
		
		//交互结束时间
		String msgEnd="";  
	    Date dateEnd = new Date();  
	    msgEnd+="["+sdf.format(dateEnd)+"]";  	          
	    System.out.println("交互结束时间======"+msgEnd);
	    
		return resp;
	}
	
}
