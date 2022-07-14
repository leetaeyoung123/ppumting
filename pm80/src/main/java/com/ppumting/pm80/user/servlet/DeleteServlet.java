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
import javax.servlet.http.HttpSession;

import com.ppumting.pm80.user.domain.User;
import com.ppumting.pm80.user.service.Userservice;

@WebServlet("/User/mypage/delete/deleteUser")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Userservice userService;
	
	public void init() {
		userService = new Userservice();
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");

		List<String> errorMsgs = new ArrayList<>();
		if(name == null || name.length() == 0) {
			errorMsgs.add("이름을 입력해주세요");
		}else if(ssn == null || ssn.length() == 0) {
			errorMsgs.add("주민번호를 입력해주세요");
		}else if(userId == null || userId.length() == 0) {
			errorMsgs.add("Id를 입력해주세요");
		}
		

		RequestDispatcher dispatcher = null;

		if(errorMsgs.size() > 0 ) {
			dispatcher = request.getRequestDispatcher("false.jsp");
			request.setAttribute("errorMsgs", errorMsgs);
			dispatcher.forward(request, response);
			return;
		}
		User user = new User();
		user.setUserId(userId);
		user.setName(name);
		user.setSsn(ssn);
		userService.delete(userId, name, ssn);
		request.setAttribute("user", user);
		
		dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);

	}
}
