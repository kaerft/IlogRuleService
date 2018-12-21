package com.sinosoft.ilogrule.restfulService.client.baseClient;

import java.io.IOException;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.sinosoft.utility.error.UserException;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * 处理头信息类
 * 
 * @author haode
 *
 */
public class DealHeadInfo {
	
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	/**
	 * 输入流转换成String
	 * 
	 * @param in
	 * @return
	 * @throws IOException
	 */
	public static String byteToString(byte[] in) throws IOException {
		StringBuffer out = null;
		out = new StringBuffer();
		out.append(new String(in, "utf-8"));
		return out.toString();
	}

	/**
	 * 设置组织生成发送服务端头部信息
	 * 
	 * @param requestBody
	 * @param limitQueryName
	 * @param uri
	 * @param connectTimeOut
	 * @return
	 * @throws UserException
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */
	public static Builder orgnizeClient(Object requestBody, String SVCNAME,String ORISYS,String MTDNAME, String url, String limitQueryName)
			throws UserException, JsonGenerationException, JsonMappingException, IOException {

		// 将请求体内容转换成String字符串
		String jsonString = mapper.writeValueAsString(requestBody);
		// 获取配置的连接超时时间
		String connectTimeOut = limitQueryName;
		// 创建默认的客户端配置器
		ClientConfig cc = new DefaultClientConfig();
		// 使用jacksonProvider来进行json转换
		cc.getClasses().add(JacksonJsonProvider.class);
		// 建立连接的超时时间
		cc.getProperties().put(ClientConfig.PROPERTY_CONNECT_TIMEOUT, Integer.parseInt(connectTimeOut));
		// client实例十分的消耗系统资源，因此需要重用，此配置是确保每次都是调用用的同一个client实例而不是每次都去创建一个新的client实例
		cc.getProperties().put(ClientConfig.PROPERTY_FOLLOW_REDIRECTS, true);
		cc.getProperties().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		// 根据配置器创建client实例
		Client client = Client.create(cc);
		// 传递数据的超时时间
		client.setReadTimeout(Integer.parseInt(connectTimeOut));
		// 获取配置的服务路径
		WebResource resource = client.resource(url);
		// header方法可用来添加HTTP头
		Builder builder = resource.accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON);
		// 组织请求头信息
		builder = generateHeader(builder, SVCNAME,ORISYS,MTDNAME);
		return builder;
	}

	/**
	 * 拼接发送服务器的请求头信息
	 * 
	 * @param builder
	 * @param headByOracle
	 * @return
	 * @throws UserException
	 */
	private static Builder generateHeader(Builder builder, String SVCNAME,String ORISYS,String MTDNAME) throws UserException {
		
		// 拼接请求头信息
		builder.header("SVCNAME", SVCNAME).header("MTDNAME", MTDNAME).header("ORISYS", ORISYS);		
		return builder;
	}

	
	/**
	 * 解析服务端返回头部
	 * 
	 * @param response
	 * @throws UserException
	 * @throws IOException
	 */
	public static void dealResponseHeader(MultivaluedMap<String, String> headers, Object responseBody)
			throws UserException, IOException {

		String retCode = headers.get("RETCODE").get(0);
		String retInfo = headers.get("RETINFO").get(0);
		retInfo = new String(retInfo.getBytes(), "utf-8");
		// 对返回代码和信息进行处理
		if (!"".equals(retCode) && retCode != null) {
			// 如果返回的代码不为0000，则抛出异常
			if (!"0000".equals(retCode)) {
				throw new UserException(-98, Integer.parseInt(retCode), "DealHeadInfo.dealResponseHeader","调用规则引擎系统失败");
			}
		}
	}

}

