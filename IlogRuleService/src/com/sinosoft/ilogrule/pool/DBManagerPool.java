package com.sinosoft.ilogrule.pool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBManagerPool {
		public static Connection getConnection()
		    throws NamingException, SQLException
		  {
		    InitialContext initialContext = new InitialContext();
		    DataSource ds = (DataSource)initialContext.lookup("java:comp/env/jdbc/ilogdatasource");

		    return ds.getConnection();
		  }

		  public void close(Connection con, PreparedStatement pst, ResultSet rs)
		  {
		    try
		    {
		      if (con != null) {
		        con.close();
		      }
		      if (pst != null) {
		        pst.close();
		      }
		      if (rs != null)
		        rs.close();
		    }
		    catch (Exception e)
		    {
		      e.printStackTrace();
		    }
		  }	
}
