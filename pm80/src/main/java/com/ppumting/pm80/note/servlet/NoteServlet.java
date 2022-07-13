package com.ppumting.pm80.note.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.note.domain.Note;
import com.ppumting.pm80.note.service.NoteService;

@WebServlet("/Note/sendMsg.do")
public class NoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private NoteService service = NoteService.getInstance();
	
	public void init() throws ServletException {
		super.init();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String msg = request.getParameter("msg");
		String toMsg = request.getParameter("toMsg");
		String userId = request.getParameter("userId");
		
		RequestDispatcher dispatcher = null;
		
		Note note = new Note();
		note.setMsg(msg);
		note.setToMsg(toMsg);
		note.setUser(userId);
		
		service.sendNote(note);
		System.out.println("성공");
		
		request.setAttribute("note", note);
		dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request, response);
	}

}
