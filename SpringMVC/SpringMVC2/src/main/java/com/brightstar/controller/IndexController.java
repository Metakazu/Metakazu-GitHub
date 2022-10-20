package com.brightstar.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// 注解方式 表示该类是一个控制器
@Controller
//public class IndexController implements Controller {
public class IndexController {
	// 注解方式Annotation 表示路径/index会映射到该方法上
	@RequestMapping("/index")
	public ModelAndView index() throws Exception {
		// 视图定位ViewResolver
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello Spring MVC");
		return mav;
	}

	// 重定向Redirect
	@RequestMapping("/jump")
	public ModelAndView jump() {
		ModelAndView mav = new ModelAndView("redirect:http://www.baidu.com");
		return mav;
	}

	// 会话Session
	@RequestMapping("/check")
	public ModelAndView check(HttpSession session) {
		Integer i = (Integer) session.getAttribute("count");
		if (i == null) {
			i = 0;
		}
		i++;
		session.setAttribute("count", i);
		ModelAndView mav = new ModelAndView("check");
		return mav;
	}
}
