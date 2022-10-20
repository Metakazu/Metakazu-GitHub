package com.brightstar.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//	RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		//	rd.forward(request, response);
		ModelAndView mav = new ModelAndView("index.jsp");
		//	request.setAttribute("message", "Hello Spring MVC");
		mav.addObject("message", "Hello Spring MVC");
		return mav;
	}
}
