package com.ppumting.pm80.point.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ppumting.pm80.point.data.DataSource;
import com.ppumting.pm80.point.data.NamingService;
import com.ppumting.pm80.user.domain.User;

public class PointDao {
	private static PointDao pointdao = new PointDao();
	private static User user = new User();

	NamingService namingService = NamingService.getInstance();
	DataSource datasource = (DataSource) namingService.getAttribute("dataSource");

	
	public String createAccountNum(String userId) { //계좌 생성 //진행중
		String sql = "INSERT INTO Point (point, accountNum, userId) VALUES (0, ?, ?)";
		
		String numStr = String.valueOf((int)(Math.random()* 1000000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0, 3));
		sb.append("-");
		sb.append(numStr.substring(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		
		String result = sb.toString();
		
		try {
			Connection con = datasource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			try {
				if( pointdao.isValidUser(userId) ) { //userId가 존재한다면
					System.out.println(1);
					stmt.setString(1, result);
					stmt.setString(2, userId);
					stmt.executeUpdate();
				}else {
					result = null;
				}
			} finally {
				stmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("result : " + result);
		return result;
	}

	public boolean isValidUser(String userId) { // 사용자 ID 존재 여부 확인
		String sql = "SELECT userId FROM Users WHERE userId=?";
		boolean result = false;
		
		try {
			Connection con = datasource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();
			try {
				while(rs.next()) {
					String userid = rs.getString("userId");
					if( userid != null || userid.length() != 0 ) {
						result = true;
					}
				}
			} finally {
				stmt.close();
				con.close();
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String addPoint() { // 사용자 포인트 충전 //진행중
		String sql = "INSERT INTO User(name, ssn, userid, passwd, email, addr)" + "VALUES(?, ?, ?, ?, ?, ?)";

		try {
			Connection con = datasource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, user.getName());
				stmt.setString(2, user.getSsn());
				stmt.setString(3, user.getUserId());
				stmt.setString(4, user.getPw());
				stmt.setString(6, user.getAddr());
				stmt.executeUpdate();
				System.out.println("INSERTED...");
			} finally {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void minusPoint(String userId, String passwd, String trainerPrice) { // 사용자 포인트 차감 //진행중 
		String sql = "SELECT userId,pw FROM Point p INNER JOIN Users u ON p.userId = u.userId";

		try {
			Connection con = datasource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			try {
				while(rs.next()) {
					String userid = rs.getString("userId");
					String pw = rs.getString("pw");
					if ( userid.equals(userId) && pw.equals(passwd)) {
						// 포인트 차감하는 코드 작성란
						System.out.println(trainerPrice + " 포인트 차감");
					}else {
						System.out.println("아이디 또는 비밀번호를 다시 입력해 주세요.");
					}
				}
			} finally {
				stmt.close();
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String checkPoint(String userId) { // 사용자 아이디를 이용한 포인트 조회
		String sql = "SELECT point FROM Point p INNER JOIN Users u ON p.userId = u.userId WHERE u.userId = ?";
		String result = null;
		try {
			Connection con = datasource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, userId);
			ResultSet rs = stmt.executeQuery();
			try {
				while(rs.next()) {
					String userPoint = rs.getString("point");
					result = userPoint;
				}
			} finally {
				stmt.close();
				con.close();
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static PointDao getInstance() { // 싱글톤 받아주기
		return pointdao;
	}

	
}
