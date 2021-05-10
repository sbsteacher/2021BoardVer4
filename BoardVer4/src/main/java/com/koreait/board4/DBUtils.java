package com.koreait.board4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {		
	public static Connection getCon() throws Exception {
		final String DB_NAME = "boardver4";
		final String DRIVER = "com.mysql.cj.jdbc.Driver";
		final String URL = "jdbc:mysql://192.168.2.254:3308/" + DB_NAME;
		final String USER_NAME = "root";
		final String PASSWORD = "koreait2021";
				
		Class.forName(DRIVER);
		Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		
		System.out.println("연결 성공!!");
		return con;
	}
	
	public static void close(Connection con, PreparedStatement ps) {
		close(con, ps, null);
	}
	
	public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
		if(rs != null) {
			try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		if(ps != null) {
			try { ps.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
		if(con != null) {
			try { con.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}	
}




