package com.ppumting.pm80.point.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
	private static String Driver;
	private static String Url;
	private static String UserName;
	private static String Password;

	public DataSource(String Driver, String Url, String UserName, String Password) {
		super();
		this.Driver = Driver;
		this.Url = Url;
		this.UserName = UserName;
		this.Password = Password;
		
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JdbcDriverNotAvailableException");
		}
	}
	
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(Url, UserName, Password);
		} catch (SQLException e) {
			throw new RuntimeException("ConnectionNotAvailableException");
		}
		
	}
	
	
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if( rs != null && !rs.isClosed() ) {
			rs.close();
		}
		if( pstmt != null && !pstmt.isClosed() ) {
			pstmt.close();
		}
		if( con != null && !con.isClosed() ) {
			con.close();
		}
	}
	
	
	public void close(PreparedStatement pstmt, Connection con) throws SQLException {
		close(null, pstmt, con);
	}
}
