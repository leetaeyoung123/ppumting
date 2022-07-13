package com.ppumting.pm80.note.domain;

import com.ppumting.pm80.user.domain.User;

public class Note {
	User sendUser = new User();
	User receiveUser = new User();
	String toMsg;
	String fromMsg;
	
	public User getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(User receiveUser) {
		this.receiveUser = receiveUser;
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
