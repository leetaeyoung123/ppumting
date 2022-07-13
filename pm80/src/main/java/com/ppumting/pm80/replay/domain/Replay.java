package com.ppumting.pm80.replay.domain;

public class Replay {
	private int replayNo;
	private String replayContent;
	private int qnaNo;
	private int userNumber;
	
	public Replay() {
		
	}
	
	public Replay(int replayNo, String replayContent, int qanNo, int userNumber) {
		this.replayNo = replayNo;
		this.replayContent = replayContent;
		this.qnaNo = qnaNo;
		this.userNumber = userNumber;
	}

	public int getReplayNo() {
		return replayNo;
	}

	public void setReplayNo(int replayNo) {
		this.replayNo = replayNo;
	}

	public String getReplayContent() {
		return replayContent;
	}

	public void setReplayContent(String replayContent) {
		this.replayContent = replayContent;
	}

	public int getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(int qnaNo) {
		this.qnaNo = qnaNo;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	@Override
//	toString 메소드 만들어서 스트링으로 출력
	public String toString() {
		return "Replay [replayNo=" + replayNo + "replayContent=" + replayContent 
				+ "qnaNo" + qnaNo + "userNumber" + userNumber + "]";
	}
}
