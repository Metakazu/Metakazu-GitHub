package com.brighttar.p082502;

import java.util.Calendar;
import java.util.Date;

public class time {
	public static void main(String[] args) {

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

		//
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		System.out.println("--------------------");

		Date past = new Date(1661417988093L);
		System.out.println(past);
		System.out.println("calendar--------------------");

		//通过6个int值生成Date对象
		Calendar c = Calendar.getInstance();
		c.set(2020, 2, 19, 19, 20, 9);
		c.set(Calendar.MONTH, 1);
		Date past1 = c.getTime();
		System.out.println(past1);
		System.out.println("Date--------------------");

		Date now1 = new Date();
		c.setTime(now1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int secound = c.get(Calendar.SECOND);
		System.out.println(month);

	}

}
