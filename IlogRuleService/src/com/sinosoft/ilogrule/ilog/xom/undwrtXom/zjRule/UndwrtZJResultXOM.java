package com.sinosoft.ilogrule.ilog.xom.undwrtXom.zjRule;

public class UndwrtZJResultXOM{

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

	
}
