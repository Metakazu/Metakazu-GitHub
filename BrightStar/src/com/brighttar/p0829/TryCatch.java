package com.brighttar.p0829;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryCatch {
	public static void main(String[] args) {
		exceptionTest();
		ETest();
	}

	//1向上抛异常处理
	public static void exceptionTest() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//String类型变成Date类型会发生异常
		//创建String型的Date
		Date past = sdf.parse("1992/02/19 19:23:34");
		System.out.println(past);
	}

	//2 Try Catch 异常保险检查
	public static void ETest() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//String类型变成Date类型会发生异常
		//创建String型的Date
		Date past = null;
		try {//通常执行的内容
			past = sdf.parse("1992/02/19 19:23:34");
		} catch (ParseException e) {//异常发生时候执行的内容，自定义，告诉自己异常是什么，或者执行其他方法
			e.printStackTrace();//错误的位置
		}
		System.out.println(past);
	}
}
