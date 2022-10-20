package com.brighttar.hw0815$18;

public class hw0815 {
	/*以下に示した5つの値を格納するために適した型を考え、「初期化」による宣言を行うソースコードを作成してください。
	（代入した値を画面に表示する必要はありません。）
	なお、変数名は自由に考えて構いませんが、Javaのルールに従ってものにしてください。	
	*二つ以上の型を考えられる場合は、そのどちらでも構いません。	
	*/
	//①true
	boolean result = true;
	//②'駆'
	char chinese = '駆';
	//③3.14
	double pi = 3.14;
	//④314159265853979L
	long univers_planet = 314159265853979L;
	//⑤"ミナトの攻撃！敵に15ポイントのダメージを与えた。"
	String voice = "ミナトの攻撃！敵に15ポイントのダメージを与えた。";

	/*次のようなプログラムがあります。
	*public class Main {	
	*	public static void main(String[] args) {
	*		int x = 5;
	*		int y = 10;
	*		String ans = "x+yは" + x + y;
	*		System.out.println(ans);	
	*	}	
	*}	
	*このプログラムを実行すると以下の結果が表示されます。
	*x+yは510
	*「x+yは15」を表示させたいのですが、意図どおりに動きません。正しく動作するように修正してください。
	*/
	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		//或者新定义一个int z = x+y   再将z带入下面的代码进行重新运算。
		String ans = "x+yは" + (x + y);
		System.out.println(ans);

		/*次の文で文法として正しいものを、すべて選んでください。	
		错 ①int x = 3 + 5.0;	
		对 ②double d = 2.0F;
		错 ③int number = "5";
		对 ④String s = 2 + "人目";     →  两个不同数据类型进行文字列的自动转化。
		对 ⑤byte b = 1;
		错 ⑥double d = true;
		对 ⑦short s = (byte)2;
		 */
		//①画面に「ようこう占いの館へ」と表示します。
		System.out.println("ようこう占いの館へ");
		//②画面に「あなたの名前を入力してください」と表示します。
		System.out.println("あなたの名前を入力してください");
		//③キーボードから1行の文字入力を受け付け、String型の変数nameに格納すします。
		String name = new java.util.Scanner(System.in).nextLine();
		//④画面に「あなたの年齢を入力してください」と表示します。
		System.out.println("あなたの年齢を入力してください");
		//⑤キーボードから1行の文字入力を受け付け、String型の変数ageStringに格納すします。
		String ageString = new java.util.Scanner(System.in).nextLine();
		//⑥変数ageStringの内容をint型に変換し、int型の変数ageに代入します。
		int age = Integer.parseInt(ageString);
		//⑦0から3までの乱数を生成し、int型の変数fortuneに代入します。
		int fortune = new java.util.Random().nextInt(4);
		//⑧fortuneの数値をインクリメント演算子で1増やし、1から4の乱数にします。	
		// 或直接执行：fortune++；并不给予赋值定义，而下方的带入 也直接使用原定义fortune ↑。
		int trueFortune = fortune + 1;
		//⑨画面に「占いの結果が出ました！」と表示します。
		System.out.println("占いの結果が出ました！");
		/*⑩画面に「（年齢）歳の（名前）さん、あなたの運気番号は（乱数）です」と表示します。	
		　*その際に年齢には変数ageを、名前には変数nameを、そして乱数には⑧で作った数を表示します。
		*/
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号" + trueFortune + "です");

		//⑪画面に「1: 大吉　2:中吉　3:吉　4: 凶」と表示します。

		//if 语句后面可以跟条件式→  else if…else 语句，这种语句可以检测到多种可能的情况。
		//使用 if，else if，else 语句的时候，需要注意下面几点：
		//if 语句至多有 1 个 else 语句，else 语句在所有的 else if 语句之后。
		//if 语句可以有若干个 else if 语句，它们必须在 else 语句之前。
		//一旦其中一个 else if 语句检测为 true，其他的 else if 以及 else 语句都将跳过执行。
		String yunqi = "" + trueFortune;
		if ("1".equals(yunqi)) {
			System.out.println("大吉");
		} else if ("2".equals(yunqi)) {
			System.out.println("中吉");
		} else if ("3".equals(yunqi)) {
			System.out.println("吉");
		} else if ("4".equals(yunqi)) {
			System.out.println("凶");
		}

		//switch 语句中的变量类型条件值→可以是： byte、short、int 或者String， char。
		//switch 语句可以拥有多个 case 语句。每个 case 后面跟一个要比较的值和冒号。
		//case 语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
		//当变量的值与 case 语句的值相等时，那么 case 语句之后的语句开始执行，直到 break 语句出现才会跳出 switch 语句。
		//当遇到 break 语句时，switch 语句终止。程序跳转到 switch 语句后面的语句执行。
		//case 语句不必须要包含 break 语句。如果没有 break 语句出现，程序会继续执行下一条 case 语句，直到出现 break 语句。
		//switch 语句可以包含一个 default 分支，该分支一般是 switch 语句的最后一个分支（可以在任何位置，但建议在最后一个）。
		//default 在没有 case 语句的值和变量值相等的时候执行。default 分支不需要 break 语句。

		//当相同的值出现可以巧妙的用break来进行code的省略。
		switch (trueFortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("凶");
			break;
		}

		// if 可以进行嵌套。自动默认第一个if是true才能进行到下一个if。
		// 因此下方if嵌套只能随机实现第一步。无法使用if嵌套来实现。
		if (trueFortune == 1) {
			System.out.println("大吉");
			if (trueFortune == 2) {
				System.out.println("中吉");
				if (3 == trueFortune)
					;
				{
					System.out.println("吉");
					if (4 == trueFortune) {
						System.out.println("凶");
					}
				}
			}
		}

	}
}
