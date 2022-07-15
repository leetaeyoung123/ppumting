package com.ppumting.pm80.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.ppumting.pm80.qna.domain.Qna;
import com.ppumting.pm80.qna.service.DataSource;
import com.ppumting.pm80.qna.service.NamingService;
import com.ppumting.pm80.replay.domain.Replay;

public class QnaDao {
	private static QnaDao instance = new QnaDao(); 
	
	public static QnaDao getInstance() {
		return instance;
	}
	
	NamingService namingService = NamingService.getInstance();
	DataSource datasource = (DataSource)namingService.getAttribute("dataSource");
	
	
	// 게시판
	
	// 게시물 생성 메소드
	public void insertQna(Qna qna) {
		String sql = "INSERT INTO QNA (qna_title, qna_content)"
					+ "VALUES(?, ?)";
		try {
			Connection con = null; 
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
//				pstmt.setLong(1, qna.getUserNumber());
				pstmt.setString(1, qna.getQnaTitle());
				pstmt.setString(2, qna.getQnaContent());
				pstmt.executeUpdate();
			} finally {
				datasource.close(pstmt,con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//게시글 조회 메소드
	public List<Qna> findNoQna() {
		String sql = "SELECT * FROM Qna";
		List<Qna> qnaList = new ArrayList<>();
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
		try {
			con = datasource.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Qna qna = new Qna();
				qna.setQnaNo(rs.getString("qna_no"));
				qna.setUserNumber(rs.getString("user_number"));
				qna.setQnaTitle(rs.getString("qna_title"));
				qna.setQnaContent(rs.getString("qna_content"));
				qna.setQnaRegDate(rs.getDate("qna_reg_date"));
				qnaList.add(qna);
			}
		} finally {
			datasource.close(rs, pstmt, con);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return qnaList;
	}
	
	// 게시판 수정
//		public void modifyQna(Qna qna) {
//			
//		}
		
	// 게시판 삭제
//		public void deleteQna(String userNumber) {
//			String sql = "DELETE FROM QNA WHERE USER_NUMBER = ?";
//				try {
//					Connection con = null;
//					PreparedStatement pstmt = null;
//					try {
//						con = datasource.getConnection();
//						pstmt = con.prepareStatement(sql);
//						pstmt.setString(1, userNumber);
//					} finally {
//						
//					}
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return 
//		}
	
	// 댓글 생성
	public void insertReplay(Replay replay) {
		String sql = "INSERT INTO REPLAY (replay_content, qna_no, user_number)"
					+ "VALUES(?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, replay.getReplayContent());
				pstmt.setInt(2, replay.getQnaNo());
				pstmt.setInt(3, replay.getUserNumber());
				pstmt.executeUpdate();
			} finally {
				datasource.close(null, pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
