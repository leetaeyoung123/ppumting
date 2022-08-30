package com.ppumting.pm80.trainer.servlet;

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

import com.ppumting.pm80.trainer.domain.Trainer;
import com.ppumting.pm80.trainer.service.TrainerService;


@WebServlet("/Trainer/delete/deleteTrainer")
public class DeleteTrainerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  TrainerService trainerService;
	
	public void init() {
		trainerService = new TrainerService();
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		
		String trainerId = request.getParameter("trainerId");
		String passwd = request.getParameter("passwd");
		
		List<String> errorMsgs = new ArrayList<>();
		if(trainerId == null || trainerId.length() == 0) {
			errorMsgs.add("ID를 입력해주세요");
		}else if(passwd == null || passwd.length() == 0) {
			errorMsgs.add("PW를 입력해주세요");
		}
		
		Trainer trainer = new Trainer();
		trainer.setTrainerId(trainerId);
		trainer.setSsn(passwd);
		trainerService.delete(trainerId, passwd);
		request.setAttribute("trainer", trainer);
		
		session.setAttribute("trainerId", trainerId);
		response.sendRedirect("../loginout/login");
		
//		RequestDispatcher dispatcher = null;
//		if(errorMsgs.size() > 0 ) {
//			dispatcher = request.getRequestDispatcher("deletefailure.jsp");
//			request.setAttribute("errorMsgs", errorMsgs);
//			dispatcher.forward(request, response);
//			return;
//		}
		
//		dispatcher = request.getRequestDispatcher("deletesuccess.jsp");
//		dispatcher.forward(request, response);

	}
}
