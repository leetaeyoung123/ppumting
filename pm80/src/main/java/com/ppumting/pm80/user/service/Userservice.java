package com.ppumting.pm80.user.service;

import com.ppumting.pm80.user.dao.Userdao;
import com.ppumting.pm80.user.domain.User;

public class Userservice {
	private Userservice instance = new Userservice();
	private Userdao userdao = Userdao.getInstance();
	
	private Userservice() {
		
	}
	
	public Userservice getInstance() {
		return instance;
	}
	
	public void addUser(User user) {
		userdao.addUser(user);
	}
}
