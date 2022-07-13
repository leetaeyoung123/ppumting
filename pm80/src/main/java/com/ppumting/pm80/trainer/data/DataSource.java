package com.ppumting.pm80.trainer.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSource {
	private String Driver;
	private String Url;
	private String TrainerName;
	private String Password;

	public DataSource(String Driver, String Url, String TrainerName, String Password) {
		super();
		this.Driver = Driver;
		this.Url = Url;
		this.TrainerName = TrainerName;
		this.Password = Password;
		
		try {
			Class.forName(Driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException("JdbcDriverNotAvailableException");
		}
	}
	
	
	public Connection getConnection() {
		try {
			return DriverManager.getConnection(Url, TrainerName, Password);
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
