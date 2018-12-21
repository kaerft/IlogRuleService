package com.sinosoft.ilogrule.dao.logDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sinosoft.ilogrule.vo.logVo.IlogInteractLoggerVo;
import com.sinosoft.ilogrule.vo.logVo.IlogRuleLoggerVo;


public class LogDao {
	
	/**
	 * restful接口交互日志
	 * @param ilogInteractLoggerVo
	 * @param connection
	 */
	public void insertInteract(IlogInteractLoggerVo ilogInteractLoggerVo,Connection connection)  throws SQLException{
		PreparedStatement pst = null;
		try{  
		  StringBuffer sb = new StringBuffer(200);
	      sb.append("INSERT INTO IlogInteractLogger(");
	      sb.append("serialno,");
	      sb.append("system,");
	      sb.append("servicename,");
	      sb.append("methodname,");	      
	      sb.append("requesttime,");
	      sb.append("responsetime,");
	      sb.append("status,");
	      sb.append("statusdes,");
	      sb.append("requestxml,");
	      sb.append("responsexml,");
	      sb.append("extendstring1,");
	      sb.append("extendstring2,");
	      sb.append("extendstring3");
	      sb.append(") ");
	      sb.append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
	      pst = connection.prepareStatement(sb.toString());
	      int i = 1;
	      pst.setString(i++, ilogInteractLoggerVo.getSerialno());
	      pst.setString(i++, ilogInteractLoggerVo.getSystem());
	      pst.setString(i++, ilogInteractLoggerVo.getServicename());
	      pst.setString(i++, ilogInteractLoggerVo.getMethodname());
	      pst.setString(i++, ilogInteractLoggerVo.getRequesttime());
	      pst.setString(i++, ilogInteractLoggerVo.getResponsetime());
	      pst.setString(i++, ilogInteractLoggerVo.getStatus());
	      pst.setString(i++, ilogInteractLoggerVo.getStatusdes());
	      pst.setString(i++, ilogInteractLoggerVo.getRequestxml());
	      pst.setString(i++, ilogInteractLoggerVo.getResponsexml());
	      pst.setString(i++, ilogInteractLoggerVo.getExtendstring1());
	      pst.setString(i++, ilogInteractLoggerVo.getExtendstring2());
	      pst.setString(i++, ilogInteractLoggerVo.getExtendstring3());
	      pst.executeUpdate();
		}catch(Exception e){
			 e.printStackTrace();
		}finally{
            try {
                if(pst != null){
                	pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   
	}
	
	/**
	 * 规则引擎交互日志
	 * @param ilogInteractLoggerVo
	 * @param connection
	 */
	public void insertRule(IlogRuleLoggerVo ilogRuleLoggerVo,Connection connection)  throws SQLException{
		PreparedStatement pst = null;  
		try{  
		  StringBuffer sb = new StringBuffer(200);
	      sb.append("INSERT INTO IlogRuleLogger(");
	      sb.append("serialno,");
	      sb.append("rulepath,");
	      sb.append("rulename,");
	      sb.append("requesttime,");
	      sb.append("responsetime,");
	      sb.append("status,");
	      sb.append("statusdes,");
	      sb.append("interReqXml,");
	      sb.append("xomReqXml,");
	      sb.append("extendstring1,");
	      sb.append("extendstring2,");
	      sb.append("extendstring3,");
	      sb.append("strSbTrace");
	      sb.append(") ");
	      sb.append("VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
	      pst = connection.prepareStatement(sb.toString());
	      int i = 1;
	      pst.setString(i++, ilogRuleLoggerVo.getSerialno());
	      pst.setString(i++, ilogRuleLoggerVo.getRulepath());
	      pst.setString(i++, ilogRuleLoggerVo.getRulename());
	      pst.setString(i++, ilogRuleLoggerVo.getRequesttime());
	      pst.setString(i++, ilogRuleLoggerVo.getResponsetime());
	      pst.setString(i++, ilogRuleLoggerVo.getStatus());
	      pst.setString(i++, ilogRuleLoggerVo.getStatusdes());
	      pst.setString(i++, ilogRuleLoggerVo.getInterReqXml());
	      pst.setString(i++, ilogRuleLoggerVo.getXomReqXml());
	      pst.setString(i++, ilogRuleLoggerVo.getExtendstring1());
	      pst.setString(i++, ilogRuleLoggerVo.getExtendstring2());
	      pst.setString(i++, ilogRuleLoggerVo.getExtendstring3());
	      pst.setString(i++, ilogRuleLoggerVo.getStrSbTrace());
	      pst.executeUpdate();
	    }catch(Exception e){
			 e.printStackTrace();
		}finally{
           try {
               if(pst != null){
               	pst.close();
               }
           } catch (SQLException e) {
               e.printStackTrace();
           }
       }   
	}
	
	public void deleteInteract(String saveLogId,Connection connection)  throws SQLException{
		PreparedStatement pst = null;
		try{  
		  StringBuffer sb = new StringBuffer(200);
	      sb.append("delete from ilogInteractLogger where serialno = ?");
	      pst = connection.prepareStatement(sb.toString());
	      int i = 1;
	      pst.setString(i++, saveLogId);
	      pst.executeUpdate();
		}catch(Exception e){
			 e.printStackTrace();
		}finally{
            try {
                if(pst != null){
                	pst.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   
	}

}
