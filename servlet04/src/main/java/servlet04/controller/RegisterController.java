package servlet04.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register.do")
public class RegisterController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		
		System.out.println("아이디: " + userid + ", 비밀번호: " + passwd);
		
		String[] hobby = request.getParameterValues("hobby");
		
		for(String h : hobby) {
			System.out.println("선택한 취미는 "+ h + "입니다.");
		}
		
	}

}
