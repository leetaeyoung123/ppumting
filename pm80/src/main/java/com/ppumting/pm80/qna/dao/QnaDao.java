package com.ppumting.pm80.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ppumting.pm80.point.dao.DataSource;
import com.ppumting.pm80.qna.domain.Qna;

public class QnaDao {
	private static QnaDao instance = new QnaDao();
	
	public static QnaDao getInstance() {
		return instance;
	}
	
	public void insertQna(Qna qna) {
		String sql = "INSERT INTO QNA (user_number, qna_title, qna_content, qna_visible)"
					+ "VALUES(?, ?, ?, ?)";
		try {
			Connection con = null; 
			PreparedStatement pstmt = null;
			try {
				con =DataSource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setLong(1, qna.getUserNumber());
				pstmt.setString(2, qna.getQnaTitle());
				pstmt.setString(3, qna.getQnaContent());
				pstmt.setInt(4, qna.getQnaVisible());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt,con);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
