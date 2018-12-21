package com.sinosoft.ilogrule.ilog.xom.cargoXom;

import java.io.Serializable;

public class CargoResultXom implements Serializable{
	
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
		if(this.description==null||"".equals(this.description)){
			this.description = description;
		}else{
			StringBuffer sb = new StringBuffer();
		    sb.append(this.description+"|");
		    sb.append(description);
		    this.description = sb.toString();
		}
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
