package com.brightstar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.brightstar.model.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("addProduct");
		return mav;
	}
	
	@RequestMapping("showProduct")
	public ModelAndView show(Product product) {
		ModelAndView mav = new ModelAndView("showProduct");
		return mav;
	}
}
