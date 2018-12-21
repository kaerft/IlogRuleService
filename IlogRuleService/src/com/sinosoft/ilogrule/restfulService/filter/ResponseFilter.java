package com.sinosoft.ilogrule.restfulService.filter;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

import org.apache.commons.codec.digest.DigestUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinosoft.ilogrule.util.LoggerHelper;
import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;

@Provider
public class ResponseFilter implements ContainerResponseFilter {
	
	@Context
	private ServletContext servletContext;
	
	public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
		System.out.println("组织返回头信息-------------");
		// 获取请求方式
		String method = request.getMethod();
		
		// 只有请求方式为post的请求才会进行校验和存储
		if ("POST".equals(method)) {
		
			// 如果响应头中没有信息，则添加如下信息
			if (response.getHttpHeaders().get("RETCODE") == null) {
				IlogInteractLoggerVo interfaceloger = new IlogInteractLoggerVo();
				Object errorObj = null;
				ObjectMapper mapper = new ObjectMapper();

				String status = "";
				// 请求体信息
				String requsetBodyInfo = "";
				// 返回体信息
				String responseBodyInfo = "";
				// 加密responsebody
				String md5CryptResp = "";
				//保单号
				String policyNo = "";
				try {
					// 获取请求体信息
					requsetBodyInfo = (String) servletContext.getAttribute("requestBodyInfo");
					// 响应体如果为空则不进行json处理
					if (response.getEntity() != null) {
						responseBodyInfo = mapper.writeValueAsString(response.getEntity());
					}
					//System.out.println("--------返回报文----------"+responseBodyInfo);
					// 将responsebody进行MD5加密
					md5CryptResp = DigestUtils.md5Hex(responseBodyInfo.getBytes("UTF-8"));
					// 如果长度大于128，那么就取前128位
					if (md5CryptResp.length() > 128) {
						md5CryptResp = md5CryptResp.substring(0, 128);
					}
					// 组织返回头信息
					response.getHttpHeaders().add("RETCODE", "0000");
					response.getHttpHeaders().add("RETINFO", "交易成功");
					//--------相应信息处理 end-----------
				}catch (Exception e) {
					e.printStackTrace();
					errorObj = e;
					status = "2";
					response.getHttpHeaders().add("RETCODE", "0001");
					// 错误原因
					response.getHttpHeaders().add("RETINFO", "交易失败");
				} finally {				
					response.getHttpHeaders().add("ORISYS", request.getHeaderValue("ORISYS"));
					response.getHttpHeaders().add("SVCNAME", request.getHeaderValue("SVCNAME"));
					response.getHttpHeaders().add("MTDNAME", request.getHeaderValue("MTDNAME"));
					response.getHttpHeaders().add("FROMSYS", "ilogRule");
								
					if("".equals(status)){
						status = "1";
					}
					interfaceloger.setSystem(request.getHeaderValue("ORISYS"));
					interfaceloger.setServicename(request.getHeaderValue("SVCNAME"));
					interfaceloger.setMethodname(request.getHeaderValue("MTDNAME"));
					interfaceloger.setRequesttime((String) servletContext.getAttribute("requesttime"));//请求时间：YYYY-MM-DD HH:MI:SS
					interfaceloger.setStatus(status);//状态：1成功，2失败
					interfaceloger.setRequestxml(requsetBodyInfo);
					interfaceloger.setResponsexml(responseBodyInfo);
					
					String saveLogId = (String)servletContext.getAttribute("saveLogId");
					LoggerHelper logHelper = new LoggerHelper();
					logHelper.loggerHelper_new(interfaceloger,errorObj,saveLogId);

				}
			}
		}
		return response;
	}
	
}

