package com.ppumting.pm80.trainer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ppumting.pm80.trainer.service.TrainerService;

@WebServlet("/Trainer/update/trainerSelect")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TrainerService trainerService;

	public void init() {
		trainerService = new TrainerService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		String trainerId = (String)session.getAttribute("userId");

		if (trainerService.checkTrainer(trainerId)) {
			request.setAttribute("trainer", trainerService.trainerSelect(trainerId));
			request.getRequestDispatcher("updatetrainer.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}