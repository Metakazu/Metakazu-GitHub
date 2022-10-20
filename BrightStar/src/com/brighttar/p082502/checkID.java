package com.brighttar.p082502;

public class checkID {
	public static void main(String[] args) {
		String a = "asdasd";
		System.out.println(a.matches(".*"));

		String id = new java.util.Scanner(System.in).nextLine();

		boolean result = userID(id);
		System.out.println(result);
	}

	public static boolean userID(String name) {

		if (name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);
		if (!(first >= 'A') && (first <= 'Z')) {
			return false;
		}

		char[] chs = name.toCharArray();
		for (char ch : chs) {
			if ((ch < 0 && ch > 9) || (ch < 'A' && ch > 'Z')) {
				return false;
			}
		}
		return true;
	}

	public static boolean recheck(String name) {
		//第一个字[]满足A-Z
		//第二个字[]满足A-Z 0-9
		//{}:指定次数的循环
		return name.matches("[A-Z][A-Z0-9] {7}");
	}
}
