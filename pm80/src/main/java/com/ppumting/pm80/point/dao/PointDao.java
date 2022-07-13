package com.ppumting.pm80.point.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PointDao {
	private static PointDao pointdao = new PointDao();

	public String createAccountNum() { // 계좌 생성
		String sql = "INSERT INTO Point(point, accountNum) VALUES(?, ?)";

		return null;
	}

	public String addPoint() { // 사용자 포인트 충전
		String sql = "INSERT INTO User(name, ssn, userid, passwd, email, addr)" + "VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			Connection con = DataSource.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, user.getUserName());
				stmt.setString(2, user.getSsn());
				stmt.setString(3, user.getUserId());
				stmt.setString(4, user.getPasswd());
				stmt.setString(5, user.getEmail());
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

	public String minusPoint() { // 사용자 포인트 차감
		return null;
	}

	public String checkPoint() { // 포인트 조회
		return null;
	}

	public static PointDao getInstance() { // 싱글톤 받아주기
		return pointdao;
	}
}
