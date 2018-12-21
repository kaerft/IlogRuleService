package com.sinosoft.ilogrule.ilog.dto.cargoDto;

import java.io.Serializable;

public class CargoResultDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String undwrtFlag; //	核保通过标志
	private String description; //	核保提示描述
	private String path; //	规则库名称
	private String ruleName; //	规则名称
	private String errorMessage; //	异常信息
	
	
	
	public String getUndwrtFlag() {
		return undwrtFlag;
	}
	public void setUndwrtFlag(String undwrtFlag) {
		this.undwrtFlag = undwrtFlag;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
