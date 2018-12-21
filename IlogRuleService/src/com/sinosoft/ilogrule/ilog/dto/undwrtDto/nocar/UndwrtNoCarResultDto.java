package com.sinosoft.ilogrule.ilog.dto.undwrtDto.nocar;

import java.io.Serializable;

public class UndwrtNoCarResultDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	/**
	 * 核保级别
	 */
	private String undwrtLevel;
	/**
	 * 核保通过标志
	 */
	private String undwrtFlag;
	/**
	 * 核保提示描述
	 */
	private String description;
	/**
	 * 规则库名称
	 */
	private String path;
	/**
	 * 规则名称
	 */
	private String ruleName;
	
	public String getUndwrtLevel() {
		return undwrtLevel;
	}
	public void setUndwrtLevel(String undwrtLevel) {
		this.undwrtLevel = undwrtLevel;
	}
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
	
}
