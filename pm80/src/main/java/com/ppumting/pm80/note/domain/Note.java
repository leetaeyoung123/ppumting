package com.ppumting.pm80.note.domain;

import com.ppumting.pm80.user.domain.User;

public class Note {
	User sendUser = new User();
	String msg;
	long ring = 0;
	
	public User getSendUser() {
		return sendUser;
	}
	public void setSendUser(User sendUser) {
		this.sendUser = sendUser;
	}
	public String getMsg() {
		return msg;
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
