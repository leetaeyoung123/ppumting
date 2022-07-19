package com.ppumting.pm80.point.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ppumting.pm80.point.service.PointService;
import com.ppumting.pm80.trainer.service.TrainerService;

@WebServlet("/point/minusPoint")
public class MinusPointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private PointService pointService;
	private TrainerService trainerService;

	public void init(ServletConfig config) throws ServletException {
		pointService = new PointService();
		trainerService = new TrainerService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("minusPoint.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userId = (String)session.getAttribute("userId");
		String x = (String)session.getAttribute("contact");
		System.out.println("tlqkf : " + x);
		String trainerPrice = " ";
//		String trainerPrice = trainerService.트레이너값부르는메소드();
		
		//ID 를 잘못 입력하고 결제버튼 누를 시
		if( pointService.minusPoint(userId, trainerPrice) == false) {
			request.getRequestDispatcher("minusPointResult/error.jsp").forward(request, response);
			return;
		}
		//성공 시 로직
		response.sendRedirect("../User/mypage/home");
		
	}

}
















