package com.ppumting.pm80.user.service;

import com.ppumting.pm80.user.dao.Userdao;
import com.ppumting.pm80.user.domain.User;

public class Userservice {
	private static Userservice instance = new Userservice();
	private Userdao userdao = Userdao.getInstance();
	
	public Userservice() {
		
	}
	
	public static Userservice getInstance() {
		return instance;
	}
	
	public void addUser(User user) {
		userdao.addUser(user);
	}
}
