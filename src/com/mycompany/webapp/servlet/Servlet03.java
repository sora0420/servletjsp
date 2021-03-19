package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet03 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet03 - service() 실행");
		//요청 내용을 확인 req
		System.out.println("클라이언트 IP:" +req.getRemoteHost());
	
		//데이터 생성 및 JSP 전달
		Board board = new Board();
		board.setBno(1);
		board.setBtitle("제목1");
		board.setBcontent("내용1");
		board.setBwriter("spring");
		req.setAttribute("board", board);
		
		//응답 내용을 생성 및 전송 resp (분배)
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view03.jsp");
		rd.forward(req, resp); //이동해라
	}
}
