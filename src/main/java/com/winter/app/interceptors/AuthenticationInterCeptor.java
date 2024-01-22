package com.winter.app.interceptors;

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
			return false;
		}		
		
	}

}
