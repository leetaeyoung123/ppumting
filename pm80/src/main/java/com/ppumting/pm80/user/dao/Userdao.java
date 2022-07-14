package com.ppumting.pm80.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public boolean login(String userId, String pw) {
		String sql = "SELECT userId, pw FROM Users WHERE userId = ?";
		boolean loginResult = false;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				User user = new User();
				while(rs.next()) {
					user.setUserId(rs.getString("userId"));
					user.setPw(rs.getString("pw"));
					if(userId.equals(user.getUserId()) && pw.equals(user.getPw())) {
						loginResult = true;
					}else {
						loginResult = false;
					}
				}
			} finally {
				datasource.close(rs, pstmt, con); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return loginResult;	
	}
	
	public void delete(String userId, String name, String ssn) {
		String sql = "DELETE FROM Users WHERE name =? ,ssn = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, ssn);
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
