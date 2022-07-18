package com.ppumting.pm80.point.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		HttpSession session = request.getSession(false);
		String userId = (String) session.getAttribute("userId");
		if (userId == null) { //ID값 안받아지면 (연동안되면) 로그인페이지로 보냄
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		if (pointService.checkAccountNum(userId) == null) { //아이디는 있는데 계좌는 null 일 경우
			//계좌생성으로 보내는 로직
		}
		request.setAttribute("accountNum", pointService.checkAccountNum(userId));
		request.getRequestDispatcher("addPoint.jsp").forward(request, response);
		// home.jsp에서의 클릭으로 서블릿을 실행시킨뒤 -> 바로 윗줄 코드로 jsp를 실행시킨다
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String userId = (String) session.getAttribute("userId");
		if (userId == null) { 
			request.getRequestDispatcher("login.jsp").forward(request, response);
			return;
		}
		
		String jsp_Point = request.getParameter("point");
		long point = Long.parseLong(jsp_Point);
		
		// 없는 아이디 입력
		if( pointService.isValidUser(userId) == false ) {
			request.getRequestDispatcher("addPointResult/error.jsp").forward(request, response);
			return;
		}
		//다오 ㄱㄱ
		if( pointService.addPoint(userId, point) == false ) {
			request.getRequestDispatcher("addPointResult/error.jsp").forward(request, response);
			return;
		}
		//성공 시 로직
//		request.setAttribute("userId", userId);
//		request.setAttribute("point", point);
		
		//home 으로 보내면 sendRedirect 또 못쓴다고 지랄
		//home.jsp로 보내면 스타일 다깨짐
		//뒤로갔다가 다시 충전하면 아이디 못받아오는건지 모르겠는데 에러뜸
		RequestDispatcher dispatcher = request.getRequestDispatcher("/User/mypage/home");
		dispatcher.forward(request, response);
		
//		session.setAttribute("userId", userId);
//		session.setAttribute("point", point);
	}


}
