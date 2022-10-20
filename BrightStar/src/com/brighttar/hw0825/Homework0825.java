package com.brighttar.hw0825;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Homework0825 {

	//	以下の各条件とマッチする正規表現パターンを記述してください。
	public static void main(String[] args) throws Exception {
		String password = "U1234wqd";
		//	①すべての文字列
		System.out.println(password.matches(".*"));
		System.out.println("--------------------");

		//	②最初の1文字はA、2文字目は数字、3文字目は数字か無し
		String id = new java.util.Scanner(System.in).nextLine();
		boolean result = userID(id);
		System.out.println(result);
		System.out.println("--------------------");

		//	③最初の1文字はU、2～4文字目は英大文字
		String id2 = new java.util.Scanner(System.in).nextLine();
		;
		boolean result2 = userID2(id2);
		System.out.println(result2);
		System.out.println("--------------------");

		//		mainメソッドのみを持つクラスMainを定義し、以下の手順を参考にして
		//		①現在の日時をDate型で取得します。
		Date now = new Date();
		//		②取得した日時情報をCalendarにセットします。
		Calendar time = Calendar.getInstance();
		time.setTime(now);

		//		③Calendarから「日」の数値を取得します。
		int day = time.get(Calendar.DAY_OF_MONTH);
		//		④取得した値に100を足した値をCalendarの「日」にセットします。
		time.set(Calendar.DAY_OF_MONTH, day + 100);
		//		⑤Calendarの日時情報をDate型に変換します。
		Date now2 = time.getTime();
		System.out.println(now2);
		System.out.println("--------------------");
		//		⑥SimpleDateFormatを用いて、指定された形式でDateインスタンスの内容を表示します。
		//		「現在の100日後の日付」を「西歴2020年09月24日」という形式で表示する
		SimpleDateFormat f = new SimpleDateFormat("西歴yyyy年MM月dd日");

		String s = f.format(now2);
		System.out.println(s);

	}

	public static boolean userID(String id) {
		return id.matches("[A][0-9][A-Za-z]");
	}

	public static boolean userID2(String id) {
		return id.matches("[U][A-Z]{3}");
	}
}
