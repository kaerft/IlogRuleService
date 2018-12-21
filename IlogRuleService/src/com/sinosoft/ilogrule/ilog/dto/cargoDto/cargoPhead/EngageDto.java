package com.sinosoft.ilogrule.ilog.dto.cargoDto.cargoPhead;

import java.io.Serializable;

public class EngageDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String clauseCode;	//	特约代码
	private String clauses;	//	特约内容
	
	
	public String getClauseCode() {
		return clauseCode;
	}
	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}
	public String getClauses() {
		return clauses;
	}
	public void setClauses(String clauses) {
		this.clauses = clauses;
	}

	
	

	
}
