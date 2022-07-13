package com.ppumting.pm80.point.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.point.service.PointService;

@WebServlet("/point/minusPoint")
public class MinusPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PointService pointService;

	public void init(ServletConfig config) throws ServletException {
		pointService = new PointService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("addPoint.jsp").forward(request, response);
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		String trainerPrice = request.getParameter("price");
		pointService.minusPoint(userId, passwd, trainerPrice);
}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		
		
	}

}
