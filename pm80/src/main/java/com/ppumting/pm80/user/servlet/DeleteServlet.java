package com.ppumting.pm80.user.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.point.service.PointService;
import com.ppumting.pm80.user.service.Userservice;

@WebServlet("/User/mypage/delete/deleteUser")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Userservice userService;
	private PointService pointService;
	
	public void init() {
		userService = new Userservice();
		pointService = new PointService();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		RequestDispatcher dispatcher = null;
			dispatcher = request.getRequestDispatcher("deleteUser.jsp");
			dispatcher.forward(request, response);
			
		//pointService.deleteAccount(아이디값);
	}
	
}
