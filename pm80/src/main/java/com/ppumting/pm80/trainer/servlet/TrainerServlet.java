package com.ppumting.pm80.trainer.servlet;

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

import com.ppumting.pm80.trainer.domain.Trainer;
import com.ppumting.pm80.trainer.service.TrainerService;

@WebServlet("/Trainer/add_trainer.do")
public class TrainerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TrainerService trainerService = TrainerService.getInstance();
	
	   public void init(ServletConfig config) throws ServletException {
		      super.init();
		   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String trainerId = request.getParameter("trainerId");
		String name = request.getParameter("name");
		String ssn = request.getParameter("ssn");
		String phone = request.getParameter("phone");
		String passwd = request.getParameter("passwd");
		String addr1 = request.getParameter("addr1");
		String addr2 = request.getParameter("addr2");
		
		List<String> errorMsgs = new ArrayList<>();
		if(trainerId == null || trainerId.length() == 0) {
			errorMsgs.add("id를 입력해주세요,");		
		}else if(name == null || name.length() == 0) {
			errorMsgs.add("이름을 입력해주세요");
		}else if(ssn == null || ssn.length() == 0) {
			errorMsgs.add("주민번호를 입력해	주세요");
		}else if(phone == null || phone.length() == 0) {
			errorMsgs.add("전화번호를 입력해주세요");
		}else if(passwd == null || passwd.length() == 0) {
			errorMsgs.add("비밀번호를 입력해주세요");
		}else if(addr1 == null || addr1.length() == 0 || addr2 == null || addr2.length() == 0) {
			errorMsgs.add("주소를 입력해주세요");
		}
		
		RequestDispatcher dispatcher = null;
		if(errorMsgs.size() > 0) {
			dispatcher = request.getRequestDispatcher("error.jsp");
			request.setAttribute("errorMsgs", errorMsgs);
			dispatcher.forward(request, response);
			return;
		}
		
		Trainer trainer = new Trainer();
		
		trainer.setTrainerId(trainerId);
		trainer.setPasswd(passwd);
		trainer.setName(name);
		trainer.setSsn(ssn);
		trainer.setPhone(phone);
		trainer.setAddr(addr1+ " " + addr2);

		trainerService.addTrainer(trainer);
		request.setAttribute("trainer", trainer);
		
		dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

}
