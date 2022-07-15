package com.ppumting.pm80.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.user.service.Userservice;

@WebServlet("/User/mypage/userUpdate/userSelect")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Userservice userService;
	
	public void init() {
		userService = new Userservice();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		RequestDispatcher dispatcher = null;
		if(userService.checkUser(userId)) {
			request.setAttribute("user", userService.userSelect(userId));
			dispatcher = request.getRequestDispatcher("userUpdate.jsp");
			dispatcher.forward(request, response);
		}
		else {
			String nullid = ("올바른 id를 입력해주세요,");
			dispatcher = request.getRequestDispatcher("error.jsp");
			request.setAttribute("nullid", nullid);
			dispatcher.forward(request, response);
			return;
		}	
	}
}