package com.ppumting.pm80.note.dao;

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
		
	}
}
