package com.ppumting.pm80.user.service;

import com.ppumting.pm80.user.domain.User;

public class Userservice {
	private Userservice instance = new Userservice();
	
	private Userservice() {
		
	}
	
	public Userservice getInstance() {
		return instance;
	}
	
	public void addUser(User user) {
		
	}
}
