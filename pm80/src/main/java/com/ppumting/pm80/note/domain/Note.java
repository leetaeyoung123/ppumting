package com.ppumting.pm80.note.domain;

import com.ppumting.pm80.user.domain.User;

public class Note {
	User user = new User();
	String toMsg;
	String fromMsg;
	String msg;
	long ring = 0;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getToMsg() {
		return toMsg;
	}
	public void setToMsg(String toMsg) {
		this.toMsg = toMsg;
	}
	public String getFromMsg() {
		return fromMsg;
	}
	public void setFromMsg(String fromMsg) {
		this.fromMsg = fromMsg;
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
