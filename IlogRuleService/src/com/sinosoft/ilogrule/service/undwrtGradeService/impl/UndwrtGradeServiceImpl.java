package com.sinosoft.ilogrule.service.undwrtGradeService.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.sinosoft.ilogrule.dao.undwrtGradeDao.UndwrtGradeDao;
import com.sinosoft.ilogrule.pool.DBManagerPool;
import com.sinosoft.ilogrule.service.undwrtGradeService.facade.UndwrtGradeService;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeNoCarVo;
import com.sinosoft.ilogrule.vo.undwrtGradeVo.UndwrtGradeVo;

public class UndwrtGradeServiceImpl implements UndwrtGradeService{
	
	private  UndwrtGradeDao undwrtGradeDao = new UndwrtGradeDao();
	
	public List<UndwrtGradeVo> findByOrderUndwrtGrade() throws Exception{
		Connection connection = null;  
		List<UndwrtGradeVo> undwrtGradeVoList = null;
		try {
		      connection = DBManagerPool.getConnection();
		      connection.setAutoCommit(false);   		      	
		      undwrtGradeVoList = undwrtGradeDao.findByOrderUndwrtGrade(connection);
		      connection.commit();
	    }catch (Exception e) {
		      e.printStackTrace();
		      connection.rollback();
	    }finally {
	    		//关闭数据库相应的资源
	            try {
	                if(connection != null){
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	    }
		return undwrtGradeVoList;
	}
	
	public List<UndwrtGradeNoCarVo> findByOrderUndwrtGradeNoCar() throws Exception{
		Connection connection = null;  
		List<UndwrtGradeNoCarVo> undwrtGradeVoList = null;
		try {
		      connection = DBManagerPool.getConnection();
		      connection.setAutoCommit(false);   		      	
		      undwrtGradeVoList = undwrtGradeDao.findByOrderUndwrtGradeNoCar(connection);
		      connection.commit();
	    }catch (Exception e) {
		      e.printStackTrace();
		      connection.rollback();
	    }finally {
	    		//关闭数据库相应的资源
	            try {
	                if(connection != null){
	                    connection.close();
	                }
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	    }
		return undwrtGradeVoList;
	}
}
