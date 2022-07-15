package com.ppumting.pm80.note.service;


import com.ppumting.pm80.note.dao.NoteDao;
import com.ppumting.pm80.note.domain.Note;

public class NoteService {
	
	private NoteDao noteDao = NoteDao.getInstance();
	
	private static NoteService instance = new NoteService();
	
	public static NoteService getInstance() {
		return instance;
	}
	
	public void sendNote(Note note) {
		noteDao.addNote(note);
	}

	public Note findSendNote(String sendUserId) {
		return noteDao.findTitleSendNote(sendUserId);
		
	}

	public Note findReceiveNote(String sendUserId) {
		return noteDao.findTitleReceiveNote(sendUserId);
	}
	
}
