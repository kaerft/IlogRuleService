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

import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoInputDto;
import com.sinosoft.ilogrule.ilog.dto.cargoDto.CargoResultDto;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoInputXom;
import com.sinosoft.ilogrule.ilog.xom.cargoXom.CargoResultXom;
import com.sinosoft.ilogrule.service.ruleService.cargoService.facade.CargoRuleService;
import com.sinosoft.ilogrule.service.ruleService.cargoService.impl.CargoRuleServiceImpl;
import com.sinosoft.ilogrule.util.objectConvertUtil.CargoConvertUtil;



@Path("/CargoRuleRestfulService")
public class CargoRuleRestfulService {
	
	@Context
	private ServletContext servletContext;
	
	private CargoRuleService service = new CargoRuleServiceImpl();
	/**
	 * ilog车险计算优惠规则接口
	 * @param requ
	 * @return
	 * @throws Exception
	 */
	@POST
    @Path("/cargoRule")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public CargoResultDto cargoRule(CargoInputDto requ) throws Exception{
		//交互开始时间
		String msgStart="";  
	    Date dateStart = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss.SSS");  
	    msgStart+="["+sdf.format(dateStart)+"]";  	          
	    System.out.println("交互开始时间======"+msgStart);
	    
	    CargoResultDto resp = null;
		//获取入参报文
		String requestBody = (String) servletContext.getAttribute("requestBodyInfo");
		//入参对象与规则引擎使用对象转换	
		CargoInputXom cargoInputXom= CargoConvertUtil.ConvertObject(requ);	
		//调用方法
		CargoResultXom cargoResultXom = null;
		//校验入参接口的字段是否为空
		if((cargoInputXom.getCargoResultXOM().getDescription()!=null && !"".equals(cargoInputXom.getCargoResultXOM().getDescription()))
				|| (cargoInputXom.getCargoResultXOM().getErrorMessage()!=null && !"".equals(cargoInputXom.getCargoResultXOM().getErrorMessage()))){
			cargoResultXom = cargoInputXom.getCargoResultXOM();
		}else{
			cargoResultXom = service.cargoRules(cargoInputXom,requestBody);
		}
		//出参对象与规则引擎使用对象转换
		resp = CargoConvertUtil.ConvertObject(cargoResultXom);
		
		//交互结束时间
		String msgEnd="";  
	    Date dateEnd = new Date();  
	    msgEnd+="["+sdf.format(dateEnd)+"]";  	          
	    System.out.println("交互结束时间======"+msgEnd);
	    
		return resp;
	}
	
}
