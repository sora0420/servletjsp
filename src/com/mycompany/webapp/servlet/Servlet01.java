package com.mycompany.webapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet01 - service() 실행");
		
		//요청 내용을 확인 req
		System.out.println("클라이언트 IP:" +req.getRemoteHost());
	
		
		//응답 내용을 생성 및 전송 resp (분배)
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view01.jsp");
		rd.forward(req, resp); //이동해라
	}
}
