package com.sinosoft.ilogrule.ilog.xom.undwrtXom.CarRule;

public class UnderwriteResultXOM{

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
	
	/**
	 * 核保级别顺序
	 */
	private String strGradeNames;
	
	public String getUndwrtLevel() {
		return undwrtLevel;
	}
	public void setUndwrtLevel(String undwrtLevel) {

		String gradeNameOld = "";//老级别
		String gradeNameNew = "";//新级别	
		//级别顺序(对象转化时处理)
		//strGradeNames =  "机构,区域,总公司1,总公司2,总公司3";
		
		int JBNameNoOld = -1;
		int JBNameNoNew = -1;
		
		//级别获取
		if(undwrtLevel!=null&&!"".equals(undwrtLevel)){
			gradeNameNew = undwrtLevel;
			JBNameNoNew = strGradeNames.indexOf(gradeNameNew);
		}
		if(this.undwrtLevel!=null&&!"".equals(this.undwrtLevel)){
			gradeNameOld = this.undwrtLevel;
			JBNameNoOld = strGradeNames.indexOf(gradeNameOld);
		}
		
		//级别比较，（新级别老级别都有）两者比较，取级别高的
		if(!"".equals(gradeNameOld)&&!"".equals(gradeNameNew)){
			if("outMaxUndwrtGrade".equals(gradeNameNew)||"outMaxUndwrtGrade".equals(gradeNameOld)){
				this.undwrtLevel = "outMaxUndwrtGrade";//超出最高核保级别权限
			}else{
				if(JBNameNoNew>-1&&JBNameNoOld>-1){
					if(JBNameNoNew>JBNameNoOld){//新的级别比老的大
						this.undwrtLevel = undwrtLevel;
					}
				}else{
					this.undwrtLevel = "noExistInDatabase";//数据库中不存在该级别
				}
			}
		}else if("".equals(gradeNameOld)&&!"".equals(gradeNameNew)){			
			if("outMaxUndwrtGrade".equals(gradeNameNew)){
				this.undwrtLevel = "outMaxUndwrtGrade";//超出最高核保级别权限
			}else{
				if(JBNameNoNew>-1){
					this.undwrtLevel = undwrtLevel;
				}else{
					this.undwrtLevel = "noExistInDatabase";//数据库中不存在该级别		
				}
			}
		}else{
			this.undwrtLevel = undwrtLevel;
		}
		
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
	public String getStrGradeNames() {
		return strGradeNames;
	}
	public void setStrGradeNames(String strGradeNames) {
		this.strGradeNames = strGradeNames;
	}
	
}
