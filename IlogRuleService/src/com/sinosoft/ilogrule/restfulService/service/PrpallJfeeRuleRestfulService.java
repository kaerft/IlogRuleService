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

import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeInputDto;
import com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto.PrpallJfeeResultDto;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeInputXom;
import com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.PrpallJfeeResultXom;
import com.sinosoft.ilogrule.service.ruleService.prpallJfeeService.facade.prpallJfeeRuleService;
import com.sinosoft.ilogrule.service.ruleService.prpallJfeeService.impl.prpallJfeeRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.PrpallJfeeConvertUtil;



@Path("/PrpallJfeeRuleRestfulService")
public class PrpallJfeeRuleRestfulService {
	
	@Context
	private ServletContext servletContext;
	
	private prpallJfeeRuleService service = new prpallJfeeRuleServiceImpl();
	/**
	 * ilog车险计算优惠规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/prpallJfeeRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public PrpallJfeeResultDto prpallJfeeRule(PrpallJfeeInputDto requ) throws Exception{
		//交互开始时间
		String msgStart="";  
	    Date dateStart = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
	    msgStart+="["+sdf.format(dateStart)+"]";  	          
	    System.out.println("交互开始时间======"+msgStart);
	    
	    PrpallJfeeResultDto resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		PrpallJfeeInputXom prpallJfeeInputXom= PrpallJfeeConvertUtil.ConvertObject(requ);	
		//调用方法
		PrpallJfeeResultXom prpallJfeeResultXom = null;
		//校验入参接口的字段是否为空
		if(prpallJfeeInputXom.getPrpallJfeeResultXom().getDescription()!=null&&!"".equals(prpallJfeeInputXom.getPrpallJfeeResultXom().getDescription())){
			prpallJfeeResultXom = prpallJfeeInputXom.getPrpallJfeeResultXom();
		}else{
			prpallJfeeResultXom = service.carRules(prpallJfeeInputXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = PrpallJfeeConvertUtil.ConvertObject(prpallJfeeResultXom);

		//交互结束时间
		String msgEnd="";  
	    Date dateEnd = new Date();  
	    msgEnd+="["+sdf.format(dateEnd)+"]";  	          
	    System.out.println("交互结束时间======"+msgEnd);
	    
		return resp;
	}
	
}
