package com.sinosoft.ilogrule.restfulService.baseService;

import java.io.IOException;


import javax.ws.rs.core.MultivaluedMap;

import com.sinosoft.utility.error.UserException;

public class DealHeadServiceInfo {
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
	 * 校验头信息
	 * 
	 * @param systemCode
	 * @param serviceName
	 * @param userCode
	 * @param passWord
	 * @return
	 */
	public static void checkHeaderInfo(MultivaluedMap<String, String> headers, String md5Crypt)
			throws UserException, Exception {
		// 获取传输的加密body
		String signature = headers.get("SIGNATURE").get(0);

		// 加密body不为空才进行校验，否则不进行校验
		if (!"".equals(signature) && signature != null) {
			if (!signature.trim().equals(md5Crypt.trim())) {
				throw new UserException(-98, 0001, "DealHeadServiceInfo.checkHeaderInfo", "证书签名认证失败!");
			}
		}

	}
	
}
