package com.brighttar.p0815$19;

//三目运算符：
//条件式？条件式为true返回的值：条件式为false返回的值
public class practice0818 {
	//<万年历>
	//概要：
	//输入年份与月份，打印该月的日历。

	//分析需求
	//1.按照一定的格式输出
	//				1.1判断该月1日是周几

	public static void main(String[] args) {
		monthList();
	}

	public static void monthList() {

		System.out.println("输入一个年份");
		int year = new java.util.Scanner(System.in).nextInt();
		System.out.println("输入一个月份");
		int month = new java.util.Scanner(System.in).nextInt();
		int day = getDayOfMonth(year, month);

		System.out.println("月\t火\t水\t木\t金\t土\t日");
		//space:月历上前面的空格，也是通过余数来判断。
		int space = dayOfYear(year, month);
		for (int i = 0; i < space; i++) {

			System.out.print(" " + "\t");
		}
		for (int i = 1; i <= getDayOfMonth(year, month); i++) {
			System.out.print(i + "\t");
			//				1.3每七天进行换行
			//				1.3.1如何表达7的倍数→%7==0
			if ((i + space) % 7 == 0) {
				System.out.println();
			}
		}
	}

	//	1.2判断该月有多少天,返回值：天数
	//	参数：月		
	public static int getDayOfMonth(int year, int month) {
		int day = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
			//首先判断是否是闰年
			if (isleapYear(year)) {
				day = 29;
			} else {
				day = 28;
			}
			break;
		default:
			day = 30;
		}
		return day;
	}

	//处理内容：判断年份是都是闰年
	//参数：年
	//返回值：判断结果（是闰年返回true）
	public static boolean isleapYear(int year) {
		boolean result = false;//boolean类型的初始值是false。
		//能被4和400整除的，且不能被100整除的是闰年
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	//
	public static int dayOfYear(int year, int month) {
		int whatDay = 0;

		int count = 0;
		for (int i = 1900; i < year; i++) {
			count += isleapYear(i) ? 366 : 365;
		}
		//处理内容：根据输入的年月，判断该月1日是周几
		//参数：年，月
		//返回值：date
		for (int i = 1; i < month; i++) {
			count += getDayOfMonth(year, i);
		}
		whatDay = count % 7;

		return whatDay;
	}

}
