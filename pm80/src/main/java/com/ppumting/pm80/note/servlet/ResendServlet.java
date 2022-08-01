package com.ppumting.pm80.note.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ppumting.pm80.note.domain.Note;
import com.ppumting.pm80.note.service.NoteService;

@WebServlet("/Note/resendMsg")
public class ResendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private NoteService service = NoteService.getInstance();

	public ResendServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("sendUserId", request.getParameter("sendUserId"));
		
		request.getRequestDispatcher("resendMsg.jsp").forward(request, response);
	}
}
