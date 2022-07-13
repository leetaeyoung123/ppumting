package com.ppumting.pm80.note.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

	public void addNote(Note note) {
		String sendSql = "INSERT INTO Senduser(msg, toMsg, userNumber)"
				+ "VALUES(?, ?, ?)";
		String receiveSql = "INSERT INTO Receiveuser(ring, fromMsg, userNumber, msg)"
				+ "VALUES(?, ?, ?, ?)";
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = datasource.getConnection();
				pstmt = con.prepareStatement(sendSql);
				pstmt.setString(1, note.getMsg());
				pstmt.setString(2, note.getToMsg());
				pstmt.setString(3, note.getUser().getUserId());
				pstmt.executeUpdate();
				System.out.println("addMsgComplete!");
			}finally {
				datasource.close(pstmt, con);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
