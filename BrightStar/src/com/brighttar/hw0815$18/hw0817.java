package com.brighttar.hw0815$18;

public class hw0817 {

	public static void main(String[] args) {

		//次に示す3つの条件を満たすプログラムを作成してください。
		//①3つの口座残高「121902」「8302」「55100」が格納されているint型配列moneyListを宣言します。
		int moneyList[] = new int[3];
		moneyList[0] = 88;
		moneyList[1] = 20;
		moneyList[2] = 80;
		//②その配列の要素を1つずつfor文で取り出して画面に表示します。
		for (int i = 0; i < moneyList.length; i++) {
			System.out.println(moneyList[i]);
		}
		//③同じ配列の要素を拡張for文で1つずつ取り出して画面に表示します。
		for (int bitCoin : moneyList) {
			System.out.println(bitCoin);
		}

		//次の条件を満たす「数あてクイズ」のプログラムを作成してください。
		//①int型で要素数3の配列numbersを準備します。このとき初期値はそれぞれ「3」「4」「9」とします。
		int numbers[] = { 3, 4, 9 };
		//②画面に「1桁の数字を入力してください」と表示します。
		System.out.println("1桁の数字を入力してください");
		//③次のコードを用いてキーボードから数字の入力を受け付け、変数inputに代入します。
		//　 int input = new java.util.Scanner(System.in).nextInt();
		int input = new java.util.Scanner(System.in).nextInt();
		//④配列をループで回しながら、いずれかの要素と等しいかを調べます。
		//　 もし等しければ「アタリ!」と表示します。
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == input) {
				System.out.println("アタリ!");
			}
		}

		//名前（文字列）、年齢（整数）、身長（浮動小数点）、十二支（1文字）を代入する変数を宣言して値を代入する。
		//変数を利用して自己紹介を表示する。表示するデータの中身や表示の仕方は自由とする。
		introduceYourself();

		//以下の仕様を参考にメソッド「calcTriangleArea」
		double c = calcTriangleArea();
		System.out.println(c + "cm");

		//「calcCircleArea」を作成してください。
		double typeR = typerr();
		System.out.println(typeR);
	}

	public static void introduceYourself() {
		System.out.println("请输入您的网名");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("请输入您的网龄");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("请输入您的身高");
		double hight = new java.util.Scanner(System.in).nextInt();
		System.out.println("请输入您的生肖");
		String years = new java.util.Scanner(System.in).nextLine();
		System.out.println("我叫" + name + "，今年" + age + "岁。身高是" + hight + "米，" + years + "年生人。");
	}

	public static double calcTriangleArea() {
		System.out.println("请在下方输入三角形的底边长度cm");
		double l = new java.util.Scanner(System.in).nextInt();
		System.out.println("请在下方输入三角形的底边上的高度cm");
		double h = new java.util.Scanner(System.in).nextInt();
		double c = l * h / 2;
		return c;
	}

	public static double typerr() {
		System.out.println("请在下方输入⚪的半径长度cm");
		double d = new java.util.Scanner(System.in).nextInt();
		double R = Math.PI * d * d;
		return R;
	}

}
