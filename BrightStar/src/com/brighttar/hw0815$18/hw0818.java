package com.brighttar.hw0815$18;

public class hw0818 {
	public static void main(String[] args) {
		email("AA", "SS", "DD");

		email("ss", "asd");

		 
	}

	public static void email(String title, String address, String test) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + test);
	}

	public static void email(String address, String test) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:无题");
		System.out.println("本文:" + test);
	}

}
