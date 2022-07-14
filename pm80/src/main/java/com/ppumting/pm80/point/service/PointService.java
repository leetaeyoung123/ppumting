package com.ppumting.pm80.point.service;

import com.ppumting.pm80.point.dao.PointDao;

public class PointService {
	private PointDao pointdao = PointDao.getInstance();
	
	public String createAccountNum(String userId) { //랜덤한 계좌 생성
		return pointdao.createAccountNum(userId);
	}
	
	public boolean isValidUser(String userId) {
		return pointdao.isValidUser(userId);
	}
	
	public boolean minusPoint(String userId, String trainerPrice) { //사용자 포인트 차감
		return pointdao.minusPoint(userId, trainerPrice);
	}
	
	// 사용자 아이디를 이용한 본인 계좌 조회
	public String checkAccountNum(String userId) {
		return pointdao.checkAccountNum(userId);
	}
	
	public String addPoint() { //사용자 포인트 충전
		return pointdao.addPoint();
	}
	
	public String checkPoint(String userId) { //포인트 조회
		return pointdao.checkPoint(userId);
	}

	
}
