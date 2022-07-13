package com.ppumting.pm80.qna.domain;

import java.util.Date;
import java.util.List;

import com.ppumting.pm80.replay.domain.Replay;

public class Qna {
	private int qnaNo;
	private int userNumber;
	private String qnaTitle;
	private String qnaContent;
	private Date qnaRegDate;
	private int qnaVisible;
	private List<Replay> replays;
	
	public Qna() {
		
	}

	public Qna(int qnaNo, int userNumber, String qanTitle, String qanContent, Date qnaRegDate, int qnaVisible) {
		super();
		this.qnaNo = qnaNo;
		this.userNumber = userNumber;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaRegDate = qnaRegDate;
		this.qnaVisible = qnaVisible;
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

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public Date getQnaRegDate() {
		return qnaRegDate;
	}

	public void setQnaRegDate(Date qnaRegDate) {
		this.qnaRegDate = qnaRegDate;
	}

	public int getQnaVisible() {
		return qnaVisible;
	}

	public void setQnaVisible(int qnaVisible) {
		this.qnaVisible = qnaVisible;
	}

	public List<Replay> getReplays() {
		return replays;
	}

	public void setReplays(List<Replay> replays) {
		this.replays = replays;
	}
	
	@Override
	// toString 메소드 만들어서 스트링으로 출력
	public String toString() {
		return "Qna [qnaNo=" + qnaNo + ", userNumber=" + userNumber + ", qnaTitle=" + qnaTitle 
				+ ", qnaContent=" + qnaContent + "qnaRegDate=" + qnaRegDate + "qnaVisible=" + qnaVisible + "]";
	}
	
	
}
