package com.ppumting.pm80.user.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.point.service.PointService;
import com.ppumting.pm80.user.domain.User;
import com.ppumting.pm80.user.service.Userservice;

@WebServlet("/User/mypage/addUser/addUser")
public class Userservlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	Userservice userService;
	PointService pointService;
	
	public void init() {
		userService = new Userservice();
		pointService = new PointService();
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String phone = request.getParameter("phone");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");

		User user = new User();
		user.setUserId(userId);
		user.setPw(pw);
		user.setName(name);
		user.setSsn(ssn);
		user.setPhone(phone);
		user.setAddr(addr1+ " " + addr2);
		
		// 같은 아이디가 있으면 중복검사
		List<String> errorMsgs = new ArrayList<>();
		if (user.getUserId().equals(userId)) {
			errorMsgs.add("중복된 아이디 입니다");
		}
		
		RequestDispatcher dispatcher = null;
		if(errorMsgs.size() > 0 ) {
			dispatcher = request.getRequestDispatcher("/User/mypage/error.jsp");
			request.setAttribute("errorMsgs", errorMsgs);
			dispatcher.forward(request, response);
			return ;
		}
		
		// 같은 아이디가 없다면 생성
		userService.addUser(user);
		pointService.createAccountNum(userId);
		request.setAttribute("user", user);
		dispatcher = request.getRequestDispatcher("../loginout/login");
		dispatcher.forward(request, response);
	}
}