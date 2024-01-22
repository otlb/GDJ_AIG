package com.winter.app.interceptors;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthenticationInterCeptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object object = session.getAttribute("member");
		if(object != null) {
			return  true;
		}else {
			System.out.println("로그인 한 사람만 가능");
			//redirect
			//response.sendRedirect("../member/login");
			
			//fowrading
			request.setAttribute("msg", "로그인이 필요합니다");
			request.setAttribute("path","../member/login");
			RequestDispatcher v = request.getRequestDispatcher("/WEB-INF/views/commons/result.jsp");
			v.forward(request, response);
			return false;
		}		
		
	}

}
