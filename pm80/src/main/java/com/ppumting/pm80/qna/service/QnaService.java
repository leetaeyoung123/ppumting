package com.ppumting.pm80.qna.service;

import java.util.ArrayList;

import com.ppumting.pm80.qna.dao.QnaDao;
import com.ppumting.pm80.qna.domain.Qna;
import com.ppumting.pm80.replay.Dao.ReplayDao;
import com.ppumting.pm80.replay.domain.Replay;

public class QnaService {
	private QnaDao qnaDao = QnaDao.getInstance();
	
	private static QnaService instance = new QnaService();
	
	private QnaService() {
		
	}
	
	public static QnaService getInsQnaService() {
		return instance;
	}
	
	// qna 상세 페이지 조회
	public Qna getQnaByNo(int qnaNo) {
		return qnaDao.getQnaByNo(qnaNo);
	}
	
	// qna 작성
	public void addQna(Qna qna) {
		qnaDao.insertQna(qna);
	}
	
	// qna 공개 여부 설정

	
	// qna 작성글 수정

	
	// qna 작성글 삭제

	// replay 생성
	public void addReplay(Replay replay) {
		qnaDao.insertReplay(replay);
	}
	
}
