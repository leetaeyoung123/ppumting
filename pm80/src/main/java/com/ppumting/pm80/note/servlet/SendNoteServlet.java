package com.ppumting.pm80.note.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.note.domain.Note;
import com.ppumting.pm80.note.service.NoteService;

@WebServlet("/Note/sendMsg")
public class SendNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private NoteService service = NoteService.getInstance();
	
	public void init() throws ServletException {
		super.init();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String title = request.getParameter("title");
		String msg = request.getParameter("msg");
		String recevieUserId = request.getParameter("recevieUserId");
		String sendUserId = request.getParameter("sendUserId");
		
		Note note = new Note();
		
		note.setTitle(title);
		note.setMsg(msg);
		note.setRecevieUserId(recevieUserId);
		note.setSendUserId(sendUserId);
		service.sendNote(note);
		System.out.println("성공");
		request.setAttribute("note", note);
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}

}
