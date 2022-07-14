package com.ppumting.pm80.note.domain;

public class Note {
	String recevieUserId;
	String sendUserId;
	String msg;
	String title;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	long ring = 0;

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
	public long getRing() {
		return ring;
	}
	public void setRing(long ring) {
		this.ring = ring;
	}
}
