package com.sinosoft.ilogrule.util;

public class PubTools {
	
	/**
	 * 判断字符串非空非Null
	 * @param requ
	 * @return
	 */
	public static boolean isNotNull(String requ){
		boolean flag = false; 
		if(requ!=null&&!"".equals(requ)){
			flag = true;
		}
		return flag;
	}
	public static boolean isNull(String requ){
		boolean flag = false; 
		if(requ==null){
			flag = true;
		}
		return flag;
	}
}
