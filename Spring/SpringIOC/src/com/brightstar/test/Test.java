package com.brightstar.test;

import com.brightstar.pojo.Category;
import com.brightstar.pojo.Product;

public class Test {

	public static void main(String[] args) {
		Category c = new Category();
		c.setName("category 1");
		//		System.out.println(c.getName());
		Product p = new Product();
		p.setName("product 1");
		p.setCategory(c);
		System.out.println(p.getName() + "/" + p.getCategory().getName());
		
		
		
		
		
		Category d=new Category();
		d.setId(1);
		d.setName("category  wow wo ");
		System.out.println(d);
	}

}
