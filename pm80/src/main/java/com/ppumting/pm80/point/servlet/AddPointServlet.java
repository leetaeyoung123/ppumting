package com.ppumting.pm80.point.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ppumting.pm80.point.service.PointService;

@WebServlet("/point/addPoint")
public class AddPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PointService pointService;

	public void init(ServletConfig config) throws ServletException {
		pointService = new PointService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("addPoint.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String jsp_Point = request.getParameter("point");
		long point = Long.parseLong(jsp_Point);
		
		if( pointService.isValidUser(userId) == false ) {
			if( pointService.addPoint(userId, point) == false ) {
				request.getRequestDispatcher("addPointResult/error.jsp").forward(request, response);
				return;
			}
		}
		
		//성공 시 로직
		request.setAttribute("userId", userId);
		request.setAttribute("point", point);
		RequestDispatcher dispatcher = request.getRequestDispatcher("addPointResult/success.jsp");
		dispatcher.forward(request, response);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("userId", userId);
		session.setAttribute("point", point);
		response.sendRedirect("addPointResult/success.jsp");
	}


}
