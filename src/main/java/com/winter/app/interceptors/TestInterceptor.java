package com.winter.app.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class TestInterceptor extends HandlerInterceptorAdapter {
	
	//Dispathcer Servlet에서 controller에 진입 전 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//return이 turn면 Controller로 계속 진행 
		//return이 false면 Controller로 진입 불가
		System.out.println("prehandle controller 진입 전");
		return true;
	}
	//controller에서 나갈때	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("posthandle controller 나갈때");
		
	}
	
	//jsp를 랜더링(다만든) 후
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("jsp 랜더링 후");
	}
}
