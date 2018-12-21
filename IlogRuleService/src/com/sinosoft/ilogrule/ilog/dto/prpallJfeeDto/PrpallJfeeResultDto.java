package com.sinosoft.ilogrule.ilog.dto.prpallJfeeDto;

import java.io.Serializable;
import java.math.BigDecimal;

public class PrpallJfeeResultDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String jfeeFlag; //	见费出单标志
	
	private String description; //	描述信息	
	
	private String path; //	规则库名称	
	
	private String ruleName; //	规则名称	
	
	private String status;  //是否校验

	
	public String getJfeeFlag() {
		return jfeeFlag;
	}

	public void setJfeeFlag(String jfeeFlag) {
		this.jfeeFlag = jfeeFlag;
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

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
