package com.brighttar.p082502;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringTest {
	public static void main(String[] args) throws ParseException {
		String str = "Hello World!";

		//文字列的调查
		//内容是否相同
		System.out.println(str.equals("HELLE WORLD!"));
		//不区分大小写，内容是否相同
		System.out.println(str.equalsIgnoreCase("HELLE WORLD!"));
		//内容的长度，空格也算字符
		System.out.println(str.length());
		//空文字的调查
		System.out.println("".isEmpty());
		System.out.println("".length() == 0);

		//文字列的检索
		//是否包含关键字
		System.out.println(str.contains("s"));
		//是否为关键字开始
		System.out.println(str.startsWith("H"));
		//是否为关键字结束
		System.out.println(str.endsWith("d!"));
		//从前向后检索，判断第一个出现的关键字的从前向后数的位置
		System.out.println(str.indexOf("o"));
		//从后向前检索，判断第一个出现的关键字从前向后的数的位置
		System.out.println(str.lastIndexOf("o"));

		//指定位置的一个文字的拿出
		System.out.println(str.charAt(4));
		//从指定位置开始，将后续文字的拿出
		System.out.println(str.substring(3));
		//从指定位置开始，到指定位置的文字的拿出
		System.out.println(str.substring(3, 6));
		//全小写
		System.out.println(str.toLowerCase());
		//全大写
		System.out.println(str.toUpperCase());
		//去除首尾空格
		System.out.println(str.trim());
		System.out.println("--------------------");

		//文字列的连接
		long start = System.currentTimeMillis();
		System.out.println(start);
		String str1 = "a";
		for (int i = 0; i < 100000; i++) {
			str1 += "b";
		}
		long end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("处理时间为" + (end - start));

		System.out.println("--------------------");

		long start1 = System.currentTimeMillis();
		System.out.println(start1);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		long end1 = System.currentTimeMillis();
		System.out.println(end1);
		System.out.println("处理时间为" + (end1 - start1));

		System.out.println("--------------------");
		char[] data1 = str.toCharArray();
		System.out.println(data1);

		String banana = "b,an?an!a";
		String[] strs = banana.split("[,!?]");
		for (String a : strs) {
			System.out.println(a);
		}
		
		//月份和小时 必须为大写
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	//Date型变String
		Date uu=new Date();
		String nowStr =sdf.format(uu);
		System.out.println(nowStr);
		
		//创建String型的Date
		Date past =sdf.parse("1992/02/19 19:23:34");
		System.out.println(past);
		
	
	
	
	}
}
