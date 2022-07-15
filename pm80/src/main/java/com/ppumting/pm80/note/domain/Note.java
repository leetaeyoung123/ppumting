package com.ppumting.pm80.note.domain;

import java.sql.Date;
import java.util.ArrayList;

public class Note {
	long	no;
	String recevieUserId;
	String sendUserId;
	String msg;
	String title;
	Date regDate;
	
	public String getTitle() {
		return title;
	}
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getMsg() {
		return msg;
	}
	public String getRecevieUserId() {
		return recevieUserId;
	}
	public void setRecevieUserId(String recevieUserId) {
		this.recevieUserId = recevieUserId;
	}
	public String getSendUserId() {
		return sendUserId;
	}
	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
