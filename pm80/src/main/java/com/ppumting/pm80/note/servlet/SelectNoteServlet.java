package com.ppumting.pm80.note.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.note.service.NoteService;

@WebServlet("/Note/selectTitleMsg")
public class SelectNoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private NoteService service = NoteService.getInstance();
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String sendUserId = request.getParameter("sendUid");
		
		ArrayList<String> sendTitles = new ArrayList<>();
		ArrayList<String> receiveTitles = new ArrayList<>();
		
		sendTitles.addAll(service.findSendNote(sendUserId));
		receiveTitles.addAll(service.findReceiveNote(sendUserId));
		
		request.setAttribute("userId", sendUserId);
		request.setAttribute("sendTitles", sendTitles);
		request.setAttribute("receiveTitles", receiveTitles);
		request.getRequestDispatcher("selectTitleMsg.jsp").forward(request, response);
		
	}

}
