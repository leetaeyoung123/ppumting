package com.ppumting.pm80.note.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ppumting.pm80.note.domain.Note;
import com.ppumting.pm80.point.data.DataSource;
import com.ppumting.pm80.point.data.NamingService;

public class NoteDao {
	
	private static NoteDao instance = new NoteDao();
	
	public static NoteDao getInstance() {
		return instance;
	}
	
	NamingService namingService = NamingService.getInstance();
	DataSource datasource = (DataSource)namingService.getAttribute("dataSource");
	
	
	//쪽지 보내기 기능
	public void addNote(Note note) {
		String sql = "INSERT INTO Notes(sent_id, recv_id, title, msg)"
				+ "VALUES(?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, note.getSendUserId());
				pstmt.setString(2, note.getRecevieUserId());
				pstmt.setString(3, note.getTitle());
				pstmt.setString(4, note.getMsg());
				pstmt.executeUpdate();
				System.out.println("addMsgComplete!");
			}finally {
				datasource.close(pstmt, con);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//보낸 쪽지 조회 기능
	public Note findTitleSendNote(String sendUserId) {
		String sql = "SELECT no,title,msg,recv_id,sent_id,sentDate From Notes WHERE sent_id = ?";
		Note title = new Note();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, sendUserId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					title.setNo(rs.getLong("no"));
					title.setTitle(rs.getString("title"));
					title.setMsg(rs.getString("msg"));
					title.setRecevieUserId(rs.getString("recv_id"));
					title.setSendUserId(rs.getString("sent_id"));
					title.setRegDate(rs.getDate("sentDate"));
				}
				System.out.println("보낸 쪽지 Title을 모두 불러왔습니다.");
			}finally {
				datasource.close(rs, pstmt, con);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return title;
	}
	
	//받은 쪽지 조회 기능
	public Note findTitleReceiveNote(String sendUserId) {
		String sql = "SELECT no,title,msg,recv_id,sent_id,sentDate From Notes WHERE recv_id = ?";
		Note title = new Note();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, sendUserId);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					title.setNo(rs.getLong("no"));
					title.setTitle(rs.getString("title"));
					title.setMsg(rs.getString("msg"));
					title.setRecevieUserId(rs.getString("recv_id"));
					title.setSendUserId(rs.getString("sent_id"));
					title.setRegDate(rs.getDate("sentDate"));
				}
				System.out.println("받은 쪽지 Title을 모두 불러왔습니다.");
			}finally {
				datasource.close(rs, pstmt, con);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return title;
	}
}
