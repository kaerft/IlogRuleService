package com.sinosoft.ilogrule.ilog.xom.prpallJfeeXom.util;

import java.io.Serializable;

public class UtilXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public String month;
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}



	/**
	 * 根据保险期间月数，获取最大分期次数
	 * @param tInsrncMonth
	 * @return
	 */
	public  int getPayTimesMax(int tInsrncMonth){
		int payTimesMax = 0;
		if(tInsrncMonth<=12){
			payTimesMax = 3;
		}else{
			int abc= tInsrncMonth/12 ;
			payTimesMax = abc + 2;
		}
		
		return payTimesMax;
	}
	
}
