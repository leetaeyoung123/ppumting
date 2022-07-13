package com.ppumting.pm80.replay.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.ppumting.pm80.point.data.DataSource;
import com.ppumting.pm80.qna.service.NamingService;
import com.ppumting.pm80.replay.domain.Replay;

public class ReplayDao {
	private static ReplayDao instance = new ReplayDao(); 
	
	public static ReplayDao getInstance() {
		return instance;
	}
	
	NamingService namingService = NamingService.getInstance();
	DataSource datasource = (DataSource)namingService.getAttribute("dataSource");
	
	// 댓글
	
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
				datasource.close(pstmt, con);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 전체 게시물 조회
	
}
