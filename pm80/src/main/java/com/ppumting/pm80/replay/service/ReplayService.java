package com.ppumting.pm80.replay.service;

import com.ppumting.pm80.replay.domain.Replay;

public class ReplayService {
	
	
	// replay 생성
	public void addReplay(Replay replay) {
		replayDao.insertReplay(replay);
	}
}
