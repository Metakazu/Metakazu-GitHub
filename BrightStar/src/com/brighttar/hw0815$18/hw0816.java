package com.brighttar.hw0815$18;

public class hw0816 {
	public static void main(String[] args) {

		//次の内容に沿ったJavaプログラムを作成してください。
		//①int 型の変数isHungryを定義し、0か1を代入する（どちらを代入しても構わない）。
		//また、String型の変数foodを定義し、適当な食べものの名前を代入する。
		System.out.println("请输入数字0或1");
		int isHungry = new java.util.Scanner(System.in).nextInt();
		System.out.println("请输入食物名字");
		String food = new java.util.Scanner(System.in).nextLine();
		//②画面に「こんにちは」と表示する。		
		System.out.println("こんにちは");
		//③もし変数isHungryが０であれば「お腹がいっぱいです」、そうでなければ「はらぺこです」と表示する。
		String str;
		if (isHungry == 1) {
			str = "お腹がいっぱいです";
			System.out.println(str);
		} else {
			str = "はらぺこです";
			//如果用三项条件演算子
			//三目运算符
			//String isHungry;;
			//isHungry == 1?"お腹がいっぱいです": "はらぺこです";

			System.out.println(str);
			//④もし変数isHungryが空腹を示すならば、変数foodを利用して「○○ををいただきます」と表示する（○○には食べものの名前が入る）。
			System.out.println(food + "ををいただきます");
			System.out.println("ごちそうさまでした");
		}

		//switch文を用いて次の条件を満たすプログラムを作成してください。
		//①画面に「［メニュー］1：検索 2：登録 3：削除 4：変更>」と表示する。表示後は改行しないこと。
		System.out.println("［メニュー］1：検索 2：登録 3：削除 4：変更>");
		//②数字を入力し、変数selectedに代入する。
		System.out.println("メニューの数字を入力してください。");
		int selected = new java.util.Scanner(System.in).nextInt();
		//③もし変数selectedが1なら「検索します」、2なら「登録します」、3なら「削除します」、4なら「変更します」と表示する。
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		//④selectedが1から4のいずれでもない場合は何もしない。
		default://可以省略default
		}

		//次の条件に従ってプログラムを記述してください。
		//①画面に「【数あてゲーム】」と表示する。
		System.out.println("【数あてゲーム】");
		//②0から9までの整数の中からランダムな数を1つ生成して変数ansに代入する。
		int ans = new java.util.Random().nextInt(10);
		//③for文を用いた「5回繰り返すループ」を作る。その際に以下の④～⑦は、ループの中に記述する。
		for (int i = 0; i < 5; i++) {
			//④画面に「0～9の数字を入力してください」と表示する。
			System.out.println("0～9の数字を入力してください");
			//⑤数字を入力し、変数numに代入する。
			int num = new java.util.Scanner(System.in).nextInt();
			//⑥もし変数numが変数ansと等しかったら「アタリ！」と画面に表示して繰り返しを終了する。
			if (ans == num) {
				System.out.println("アタリ！");
				break;//这里可以直接跳出此for循环
			}
			//⑦もし変数numが変数ansと等しくない場合は「違います」と表示する。
			else {
				System.out.println("違います");
			}
			//⑧繰り返しのブロックの外側で、「ゲームを終了します」と画面に表示する。
		}
		System.out.println("ゲームを終了します");

	}
}
