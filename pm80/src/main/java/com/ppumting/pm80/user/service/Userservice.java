package com.ppumting.pm80.user.service;

import com.ppumting.pm80.user.dao.Userdao;
import com.ppumting.pm80.user.domain.User;

public class Userservice {
	private Userdao userdao = Userdao.getInstance();
	
	public Userservice() {
		
	}
	
	
	public void addUser(User user) {
		userdao.addUser(user);
	}


	public boolean login(String userId, String pw) {
		return userdao.login(userId, pw);
	}
	
	public void delete(String userId, String name, String ssn) {
		userdao.delete(userId, name, ssn);
	}
}
