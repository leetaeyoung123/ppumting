package com.ppumting.pm80.note.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Note/notemsg")
public class SelectNoteMsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectNoteMsgServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		System.out.println(request.getAttribute("<a>"));
	}

}