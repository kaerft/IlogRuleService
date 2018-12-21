package com.sinosoft.ilogrule.ilog.xom.prpcarXom.util;

import java.io.Serializable;

public class UtilXom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String teamCarList;
	private String isNewCar; //新车标识

	public String getTeamCarList() {
		return teamCarList;
	}

	public void setTeamCarList(String teamCarList) {
		this.teamCarList = teamCarList;
	}

	public String getIsNewCar() {
		return isNewCar;
	}

	public void setIsNewCar(String isNewCar) {
		this.isNewCar = isNewCar;
	}
	
	
}
