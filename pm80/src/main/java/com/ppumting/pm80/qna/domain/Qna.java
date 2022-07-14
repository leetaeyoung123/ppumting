package com.ppumting.pm80.qna.domain;

import java.util.Date;
import java.util.List;

import com.ppumting.pm80.replay.domain.Replay;

public class Qna {
	private String qnaNo;
	private String userNumber;
	private String qnaTitle;
	private String qnaContent;
	private Date qnaRegDate;
	private List<Replay> replays;
	
	public Qna() {
		
	}

	public Qna(String qnaNo, String userNumber, String qnaTitle, String qnaContent, Date qnaRegDate) {
		super();
		this.qnaNo = qnaNo;
		this.userNumber = userNumber;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaRegDate = qnaRegDate;
	}

	public String getQnaNo() {
		return qnaNo;
	}

	public void setQnaNo(String qnaNo) {
		this.qnaNo = qnaNo;
	}
	
	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
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
	
	public List<Replay> getReplays() {
		return replays;
	}

	public void setReplays(List<Replay> replays) {
		this.replays = replays;
	}
	
	@Override
	// toString 메소드 만들어서 스트링으로 출력
	public String toString() {
		return "Qna [qnaNo=" + qnaNo + "userNumber=" + userNumber + ", qnaTitle=" + qnaTitle 
				+ ", qnaContent=" + qnaContent + "qnaRegDate=" + qnaRegDate + "]";
	}
	
	
}
