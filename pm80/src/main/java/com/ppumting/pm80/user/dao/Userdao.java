package com.ppumting.pm80.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ppumting.pm80.point.data.DataSource;
import com.ppumting.pm80.point.data.NamingService;
import com.ppumting.pm80.user.domain.User;

public class Userdao {
	private static Userdao instance = new Userdao();
	
	NamingService namingService = NamingService.getInstance();
	DataSource datasource = (DataSource) namingService.getAttribute("dataSource");
	
	public static Userdao getInstance() {
		return instance;
	}
	
	public void addUser(User user) {
		System.out.println("addUser start");
		String sql = "INSERT INTO Users (name, ssn, phone, userId, pw ,addr)"
					+ "VALUES(?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getSsn());
				pstmt.setString(3, user.getPhone());
				pstmt.setString(4, user.getUserId());
				pstmt.setString(5, user.getPw());
				pstmt.setString(6, user.getAddr());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
				System.out.println("addUser end");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
