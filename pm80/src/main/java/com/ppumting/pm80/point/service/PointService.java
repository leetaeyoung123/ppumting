package com.ppumting.pm80.point.service;

import com.ppumting.pm80.point.dao.PointDao;

public class PointService {
	private PointDao pointdao = PointDao.getInstance();
	
	public String createAccountNum() { //계좌 생성
		return pointdao.createAccountNum();
	}

	public String addPoint() { //사용자 포인트 충전
		return pointdao.addPoint();
	}
	
	public void minusPoint(String userId, String passwd, String trainerPrice) { //사용자 포인트 차감
		pointdao.minusPoint(userId, passwd, trainerPrice);
	}
	
	public void checkPoint(String userId) { //포인트 조회
		pointdao.checkPoint(userId);
	}

	
}
