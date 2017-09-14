package com.maven.app.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SqlserverConnUtil {
	public static Connection getConnection() {
		StringBuffer connStr = new StringBuffer();
		connStr.append(GlobalUtil.getJDBCValue("jdbc.url"));
		connStr.append(";user=");
		connStr.append(GlobalUtil.getJDBCValue("jdbc.user"));
		connStr.append(";password=");
		connStr.append(GlobalUtil.getJDBCValue("jdbc.password"));
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connStr.toString());
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	
	public static void closeConnect(ResultSet rs, Statement st, Connection conn) {
		
		try {
			
			if (rs!=null) {
				
				rs.close();
			}
			if (st!=null) {
				
				st.close();
			}
			if (conn!=null) {
				
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
