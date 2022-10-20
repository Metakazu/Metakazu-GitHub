package com.brightstar.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.brightstar.service.ProductService;
import com.brightstar.service.TimeService;

public class TestAOP {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
		ProductService s = (ProductService) context.getBean("s");
		s.doSomeService();
		TimeService t = (TimeService) context.getBean("t");
		t.stringTest();
		t.stringBuilderTest();
	}
}
