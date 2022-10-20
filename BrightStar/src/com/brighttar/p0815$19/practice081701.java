package com.brighttar.p0815$19;

public class practice081701 {
	public static void main(String[] args) {
		System.out.println("请刷脸");
		int mima = 99;
		String face = new java.util.Scanner(System.in).nextLine();
		if ("face".equals(face)) {
			System.out.println("刷脸成功，正在下载");
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println("请输入2位数密码");
				int password = new java.util.Scanner(System.in).nextInt();
				if (mima == password) {
					System.out.println("密码正确，正在下载");
					break;
				} else {
					System.out.println("密码错误，您还有" + (2 - i) + "次机会");
					if (i == 2) {
						System.out.println("账户锁定");
					}
				}
			}
		}
	}
}
