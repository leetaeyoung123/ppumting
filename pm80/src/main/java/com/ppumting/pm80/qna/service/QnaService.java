package com.ppumting.pm80.qna.service;

import com.ppumting.pm80.qna.dao.QnaDao;
import com.ppumting.pm80.qna.domain.Qna;

public class QnaService {
	
	@SuppressWarnings("unused")
	private QnaDao qnaDao = QnaDao.getInstance();
	
	private static QnaService instance = new QnaService();
	
	private QnaService() {
		
	}
	
	public static QnaService getInsQnaService() {
		return instance;
	}
	
	public void addQna(Qna qna) {
		qnaDao.insertQna(qna);
	}
}
