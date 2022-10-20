package com.brighttar.p0826;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();

		colors.add("red");
		colors.add("blue");
		colors.add("yellow");
//		colors.add("asdasd");
//		colors.add("ysdasds");
		colors.add("yellow");//重复的元素会被忽略  
		//方法1
		for (String color : colors) {
			System.out.println(color);
		}
		System.out.println("----------");

		//方法2
		Iterator<String> it = colors.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("----------");
		//因为没有重复元素。同一个元素会被视为同一个元素，因此上述内容为size3
		System.out.println(colors.size());

		//指定内容的删除，根据内容删除
		colors.remove("red");

		//是否包含某一个元素
		System.out.println(colors.contains("red"));

		//清空
		colors.clear();

		//判断是否为空
		System.out.println(colors.isEmpty());

		
		
		Set<String> colorW = new LinkedHashSet<>();
		
		
		
	}

}
