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
		String sql = "INSERT INTO Users (userId, pw, name, ssn, phone, addr)"
					+ "VALUES(?, ?, ?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getUserId());
				pstmt.setString(2, user.getPw());
				pstmt.setString(3, user.getName());
				pstmt.setString(4, user.getSsn());
				pstmt.setString(5, user.getPhone());
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
		String sql = "DELETE FROM Users WHERE userId = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public User userSelect(String userId) {
		String sql = "SELECT * FROM Users WHERE userId = ?";
		User user = new User();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					user.setUserId(rs.getString("userId"));
					user.setPw(rs.getString("pw"));
					user.setName(rs.getString("name"));
					user.setAddr(rs.getString("addr"));
					user.setSsn(rs.getString("ssn"));
					user.setPhone(rs.getString("phone"));
					
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	//유저 수정 아이디 검사
	public boolean checkUser(String userId) {
		String sql = "SELECT userId FROM Users WHERE userId = ? ";
		boolean checkResult = false;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					User user = new User();
					System.out.println(rs.getString("userId"));
					user.setUserId(rs.getString("userId"));
					if(userId.equals(user.getUserId())) {
						checkResult = true;
					}
				}
			} finally {
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return checkResult;
	}
	
	// 아이디 중복 검사
	public boolean checkUserId(String userId) {
		String sql = "SELECT userId FROM Users WHERE userId = ? ";
		boolean checkId = false;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				System.out.println(1);
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, userId);
				rs = pstmt.executeQuery();
				System.out.println(2);
				System.out.println(rs.next());
				while(rs.next()) {
					User user = new User();
					System.out.println(3);	// 여기가 안들어옴
					user.setUserId(rs.getString("userId"));
					System.out.println(user.getUserId());
					if(!userId.equals(user.getUserId())) {
						System.out.println(4);
						checkId = true;
					}
					else if(user.getUserId() == null) {
						System.out.println(5);
						System.out.println(userId);
						checkId = false;
					}
				}
			} finally {
				System.out.println(6);
				datasource.close(rs, pstmt, con);
			}
		} catch (Exception e) {
			System.out.println(7);
			e.printStackTrace();
		}
		return checkId;
	}

	public void updateUser(User user) {
		String sql = "UPDATE Users SET pw = ?, name = ?, phone = ?, addr = ? WHERE userId = ?";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, user.getPw());
				pstmt.setString(2, user.getName());
				pstmt.setString(3, user.getPhone());
				pstmt.setString(4, user.getAddr());
				pstmt.setString(5, user.getUserId());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
