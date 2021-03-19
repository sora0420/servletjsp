package com.mycompany.webapp.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.dto.Board;

public class Servlet04 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet03 - service() 실행");
		//요청 내용을 확인 req
		System.out.println("클라이언트 IP:" +request.getRemoteHost());
	
		//데이터 생성 및 JSP 전달
		List<Board> list = new ArrayList<>();
		for(int i=0; i<=10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목"+i);
			board.setBcontent("내용"+i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list);
		
		//응답 내용을 생성 및 전송 resp (분배)
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/view04.jsp");
		rd.forward(request, response); //이동해라
	}
}
