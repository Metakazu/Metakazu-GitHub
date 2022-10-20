package com.brighttar.getAndSetMethor;

public class Test {
	public static void main(String[] args) {
		Dog dahuang = new Dog("大黄", 3);
		Dog xiaohuang;
		xiaohuang = dahuang;
		xiaohuang.setName("小黄");
		System.out.println(dahuang.getName());
	}
}
