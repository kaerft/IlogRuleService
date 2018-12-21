package com.sinosoft.ilogrule.ilog.dto.undwrtDto.zj;

import java.io.Serializable;

public class ZJDetailDto implements Serializable{

	private static final long serialVersionUID = 1L;
	/***
	 * 核保级别
	 */
	private String undwrtGrade;
	
	public String getUndwrtGrade() {
		return undwrtGrade;
	}
	public void setUndwrtGrade(String undwrtGrade) {
		this.undwrtGrade = undwrtGrade;
	}
	
	
}
