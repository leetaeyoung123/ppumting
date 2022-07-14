package com.ppumting.pm80.qna.service;

import java.util.ArrayList;
import java.util.List;

import com.ppumting.pm80.qna.dao.QnaDao;
import com.ppumting.pm80.qna.domain.Qna;
import com.ppumting.pm80.replay.Dao.ReplayDao;
import com.ppumting.pm80.replay.domain.Replay;

public class QnaService {
	private QnaDao qnaDao = QnaDao.getInstance();
	
	private static QnaService instance = new QnaService();
	
	private QnaService() {
		
	}
	
	public static QnaService getInstance() {
		return instance;
	}
	
	// qna 작성
	public void addQna(Qna qna) {
		qnaDao.insertQna(qna);
	}
	
	// qnaList 메소드 생성
	public void qnaList(Qna qna) {
		
	}
	
	// qna 상세 페이지 조회
	public List<Qna> getfindNoQna() {
		return qnaDao.findNoQna();
	}

	// replay 생성
	public void addReplay(Replay replay) {
		qnaDao.insertReplay(replay);
	}

}
