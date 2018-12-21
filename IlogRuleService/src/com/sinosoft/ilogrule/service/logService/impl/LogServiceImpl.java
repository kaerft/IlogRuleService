package com.sinosoft.ilogrule.service.logService.impl;

import java.sql.Connection;
import java.sql.SQLException;

import com.sinosoft.ilogrule.dao.logDao.LogDao;
import com.sinosoft.ilogrule.pool.DBManagerPool;
import com.sinosoft.ilogrule.service.logService.facade.LogService;
import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sinosoft.ilogrule.vo.logVo.IlogRuleLoggerVo;


public class LogServiceImpl implements LogService{
	 
	private LogDao logDao = new LogDao(); 
	
	public void insertInteract(IlogInteractLoggerVo ilogInteractLoggerVo) throws Exception{
		Connection connection = null;		
	    try {
	    	connection = DBManagerPool.getConnection();
	    	connection.setAutoCommit(false);
		    logDao.insertInteract(ilogInteractLoggerVo,connection);
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
	}
	
	public void insertRule(IlogRuleLoggerVo ilogRuleLoggerVo) throws Exception{
		Connection connection = null;
	    try {
	    	connection = DBManagerPool.getConnection();
		    connection.setAutoCommit(false);	
		    logDao.insertRule(ilogRuleLoggerVo,connection);
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
	}
	
	public void deleteAndInsertInteract(IlogInteractLoggerVo ilogInteractLoggerVo,String saveLogId) throws Exception{
		//先删除后修改
		Connection connection = null;		
	    try {
	    	connection = DBManagerPool.getConnection();
	    	connection.setAutoCommit(false);
	    	logDao.deleteInteract(saveLogId,connection);
		    logDao.insertInteract(ilogInteractLoggerVo,connection);
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
	}

}
