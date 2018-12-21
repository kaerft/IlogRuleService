package com.sinosoft.ilogrule.restfulService.filter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletInputStream;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.io.IOUtils;




import com.sinosoft.ilogrule.restfulService.baseService.DealHeadServiceInfo;
import com.sinosoft.ilogrule.util.LoggerHelper;
import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sinosoft.utility.error.UserException;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;

@Provider
public class RequestFilter implements ContainerRequestFilter {

	
	@Context
	private ServletContext servletContext;
	
	private ResettableServletInputStream servletStream;
	
	@Override
	public ContainerRequest filter(ContainerRequest request) {
		System.out.println("请求头信息进来-------------");
		byte[] rawData;
		Object errorObj = null;
		//状态
		String status = "";
		// 请求体信息
		String bodyString = "";
		// 存储加密后的body体
		String md5Crypt = "";
		// 获取请求头信息
		MultivaluedMap<String, String> headers = request.getRequestHeaders();
		// 获取请求方式
		String method = request.getMethod();
		Date startTime = new Date();
		//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");		
		//String currentDate = sdf1.format(startTime);//用作报文头日期的传输
		// 存储到日志表中的格式
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String saveDate = sdf2.format(startTime);
		
		//默认是校验的
		boolean isCheck = true;
		if(headers.containsKey("checkType") && "noCheck".equals(headers.get("checkType").get(0))){
			isCheck = false;
		}
		
		// 只有请求方式为post的请求才会进行校验和存储日志
		if ("POST".equals(method)) {
			IlogInteractLoggerVo interfaceloger = new IlogInteractLoggerVo();
			try {
				// 自定义请求流
				servletStream = new ResettableServletInputStream();
				// 获取请求体信息
				InputStream entityInputStream = request.getEntityInputStream();
				// 只有当请求体信息不为空的时候才进行操作
				if (entityInputStream != null) {
					rawData = IOUtils.toByteArray(entityInputStream);
					// 将字节转换成字符串
					bodyString = DealHeadServiceInfo.byteToString(rawData);
					//System.out.println("--------入参报文----------"+bodyString);
					// 新建流
					servletStream.stream = new ByteArrayInputStream(rawData);
					// 将新建的流传入request中
					request.setEntityInputStream(servletStream.stream);
					// 将body进行MD5加密
					md5Crypt = DigestUtils.md5Hex(bodyString.getBytes("UTF-8"));
					// 如果长度大于128，那么就取前128位
					if (md5Crypt.length() > 128) {
						md5Crypt = md5Crypt.substring(0, 128);
					}
				}
				if(isCheck){
					// 请求头信息校验
					//DealHeadServiceInfo.checkHeaderInfo(headers, md5Crypt);
				}
			} 
//			catch (UserException ue) {
//				ue.printStackTrace();
//				errorObj = ue;
//				status = "2";
//				int errorNo = ue.getErrorNo();
//				String errorMessage = ue.getErrorMessage();
//				Response response = Response.ok("").status(Response.Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON)
//						.build();
//				if (errorNo >= 1000) {
//					response.getMetadata().add("RETCODE", "" + errorNo);
//				} else {
//					response.getMetadata().add("RETCODE", "000" + errorNo);
//				}
//				// 错误原因
//				response.getMetadata().add("RETINFO", errorMessage);
//				// 组织返回头信息
//				response.getMetadata().add("ORISYS", request.getHeaderValue("ORISYS"));
//				response.getMetadata().add("SVCCODE", request.getHeaderValue("SVCCODE"));
//				response.getMetadata().add("SVCVER", request.getHeaderValue("SVCVER"));
//				response.getMetadata().add("TRANTIME", currentDate);
//				response.getMetadata().add("TRANNO", request.getHeaderValue("TRANNO"));
//				response.getMetadata().add("SVCNAME", request.getHeaderValue("SVCNAME"));
//				response.getMetadata().add("FROMSYS", "B014");
//				response.getMetadata().add("SIGNATURE", "");
//				// 抛出一个运行时异常
//				throw new WebApplicationException(response);
//			} 
			catch (Exception e) {
				e.printStackTrace();
				errorObj = e;
				status = "2";
				Response response = Response.ok("").status(Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).build();
				response.getMetadata().add("RETCODE", "0001");
				// 错误原因
				response.getMetadata().add("RETINFO", "交易失败");
				// 组织返回头信息
				response.getMetadata().add("ORISYS", request.getHeaderValue("ORISYS"));
				response.getMetadata().add("MTDNAME", request.getHeaderValue("MTDNAME"));
				response.getMetadata().add("SVCNAME", request.getHeaderValue("SVCNAME"));
				response.getMetadata().add("FROMSYS", "ilogRule");
				// 抛出一个运行时异常
				throw new WebApplicationException(response);
			} finally {
				servletContext.setAttribute("requestBodyInfo", bodyString);		
				//日志存储
				if("".equals(status)){
					status = "1";
				}
				interfaceloger.setSystem(request.getHeaderValue("ORISYS"));
				interfaceloger.setServicename(request.getHeaderValue("SVCNAME"));
				interfaceloger.setMethodname(request.getHeaderValue("MTDNAME"));
				interfaceloger.setStatus(status);//状态：1成功，2失败
				interfaceloger.setRequesttime(saveDate);//请求时间：YYYY-MM-DD HH:MI:SS
				interfaceloger.setRequestxml(bodyString);
				interfaceloger.setResponsexml("");
				
				LoggerHelper logHelper = new LoggerHelper();
				logHelper.loggerHelper_new(interfaceloger,errorObj,"");
				servletContext.setAttribute("saveLogId", interfaceloger.getSerialno());
				servletContext.setAttribute("requesttime", interfaceloger.getRequesttime());				
			}
		}
		return request;
	}
	/**
	 * 用于重新初始化请求流，使得servlet能够对body体进行解析
	 * 
	 * @author haode
	 *
	 */
	private class ResettableServletInputStream extends ServletInputStream {

		private InputStream stream;

		@Override
		public int read() throws IOException {
			return stream.read();
		}
	}
}
