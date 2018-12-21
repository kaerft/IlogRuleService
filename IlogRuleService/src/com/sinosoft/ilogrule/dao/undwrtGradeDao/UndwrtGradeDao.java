package com.sinosoft.ilogrule.dao.undwrtGradeDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeNoCarVo;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeVo;

public class UndwrtGradeDao {
	
	/**
	 * 获取车险核保级别从小到大的排序的集合
	 */
	public List<UndwrtGradeVo> findByOrderUndwrtGrade(Connection connection)
			throws Exception {
		Statement stmt = null;
		ResultSet resultSet = null;
		List<UndwrtGradeVo> undwrtGradeVoList = null;
		try{
			undwrtGradeVoList = new ArrayList<UndwrtGradeVo>();
			UndwrtGradeVo undwrtGradeVo = null;
			String strSQL = " select * from  undwrtGrade order by undwrtGradeOderNo";
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery(strSQL);
			while (resultSet.next()) {
				undwrtGradeVo = new UndwrtGradeVo();
				undwrtGradeVo.setUndwrtGradeOderNo(resultSet.getString("undwrtGradeOderNo"));
				undwrtGradeVo.setUndwrtGradeCode(resultSet.getString("undwrtGradeCode"));
				undwrtGradeVo.setUndwrtGradeName(resultSet.getString("undwrtGradeName"));
				undwrtGradeVoList.add(undwrtGradeVo);
			}
		}catch (Exception e) {
		      e.printStackTrace();
	    }finally {
	    		//关闭数据库相应的资源
	    	 	try {
	                if(resultSet != null){
	                    resultSet.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	            try {
	                if(stmt != null){
	                	stmt.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	    }
		return undwrtGradeVoList;
	}
	
	/**
	 * 获取非车核保级别从小到大的排序的集合
	 */
	public List<UndwrtGradeNoCarVo> findByOrderUndwrtGradeNoCar(Connection connection)
			throws Exception {
		Statement stmt = null;
		ResultSet resultSet = null;
		List<UndwrtGradeNoCarVo> undwrtGradeVoList = null;
		try{
			undwrtGradeVoList = new ArrayList<UndwrtGradeNoCarVo>();
			UndwrtGradeNoCarVo undwrtGradeVo = null;
			String strSQL = " select * from  undwrtGradeNoCar order by undwrtGradeOderNo";
			stmt = connection.createStatement();
			resultSet = stmt.executeQuery(strSQL);
			while (resultSet.next()) {
				undwrtGradeVo = new UndwrtGradeNoCarVo();
				undwrtGradeVo.setUndwrtGradeOderNo(resultSet.getString("undwrtGradeOderNo"));
				undwrtGradeVo.setUndwrtGradeCode(resultSet.getString("undwrtGradeCode"));
				undwrtGradeVo.setUndwrtGradeName(resultSet.getString("undwrtGradeName"));
				undwrtGradeVoList.add(undwrtGradeVo);
			}
		}catch (Exception e) {
		      e.printStackTrace();
	    }finally {
	    		//关闭数据库相应的资源
	    	 	try {
	                if(resultSet != null){
	                    resultSet.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	            try {
	                if(stmt != null){
	                	stmt.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	    }
		return undwrtGradeVoList;
	}
}
