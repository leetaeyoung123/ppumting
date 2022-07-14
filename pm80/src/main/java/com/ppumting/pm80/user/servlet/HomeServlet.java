package com.ppumting.pm80.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ppumting.pm80.user.service.Userservice;

@WebServlet("/User/mypage/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Userservice userService;
	
	public void init() {
		userService = new Userservice();
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userId = (String)session.getAttribute("userId");
		if(userId == null) {
			request.getRequestDispatcher("longin.jsp").forward(request, response);
			return;
		}
	}
}
