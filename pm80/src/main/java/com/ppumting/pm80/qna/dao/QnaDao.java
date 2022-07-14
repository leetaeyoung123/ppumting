package com.ppumting.pm80.qna.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ppumting.pm80.qna.domain.Qna;
import com.ppumting.pm80.qna.service.DataSource;
import com.ppumting.pm80.qna.service.NamingService;
//import com.ppumting.pm80.point.data.DataSource;
//import com.ppumting.pm80.point.data.NamingService;
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
	public Qna getQnaByNo(int qnaNo) {
		String sql = "SELECT (qna_no, user_number, qna_title, qna_content, qna_reg_date"
				+ " FROM QNA" 
				+ " WHERE QNA_NO = ?";
		
		String sql2 = "SELECT (replay_no, replay_content, qan_no, user_number)"
				+ " FROM REPLAY" 
				+ " WHERER QNA_NO = ?";
			Qna qna = null;
			try {
				Connection con = null;
				PreparedStatement pstmt = null, pstmt2 = null;
				ResultSet rs = null, rs2 = null;
				try {
					con = datasource.getConnection();
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, qnaNo);
					rs = pstmt.executeQuery();
					
					if(rs.next()) {
						qna = new Qna();
						qna.setQnaNo(rs.getInt("qna_no"));
						qna.setUserNumber(rs.getInt("user_number"));
						qna.setQnaTitle(rs.getString("qna_title"));
						qna.setQnaContent(rs.getString("qna_content"));
						qna.setQnaRegDate(rs.getDate("qna_reg_date"));
						
					// 댓글
					pstmt2 = con.prepareStatement(sql2);
					pstmt2.setInt(1, qnaNo);
					rs2 = pstmt2.executeQuery();
					
					ArrayList<Replay> replays = new ArrayList<Replay>();
					while (rs2.next()) {
						Replay replay = new Replay();
						replay.setReplayNo(rs2.getInt("replay_no"));
						replay.setReplayContent(rs2.getString("replay_content"));
						replay.setQnaNo(rs2.getInt("qna_no"));
						replay.setUserNumber(rs2.getInt("user_number"));
						replays.add(replay);
					}
					qna.setReplays(replays);
					}
				} finally {
					datasource.close(rs, pstmt, con); 
					datasource.close2(rs2, pstmt2, con); 
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return qna;
	}
	
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
