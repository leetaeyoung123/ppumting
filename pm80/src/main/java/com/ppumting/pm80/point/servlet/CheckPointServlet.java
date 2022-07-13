package com.ppumting.pm80.point.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.point.service.PointService;

@WebServlet("/point/checkPoint")
public class CheckPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PointService pointService;

	public void init(ServletConfig config) throws ServletException {
		pointService = new PointService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("checkPoint.jsp").forward(request, response);
		String userId = request.getParameter("userId");
		System.out.println("조회하려고 받아온 아이디 : " + userId);
		
		pointService.checkPoint(userId);
		System.out.println("성공");
	}


}
