package com.brightstar.service;

public class TimeService {
	public void stringTest() {
		String str = new String();
		for (int i = 0; i < 100000; i++) {
			str += "a";
		}
	}

	public void stringBuilderTest() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("a");
		}
	}
}