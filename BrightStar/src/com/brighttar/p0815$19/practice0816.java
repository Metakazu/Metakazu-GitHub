package com.brighttar.p0815$19;

public class practice0816 {

	public static void main(String[] args) {
		String str1 = "aaa";//右边是一个常量值，并储存到一个地址。
		String str2 = "aaa";//右边是一个常量值，并储存到一个地址。上面两个相同的常量值所储存的地址是一样的。
		String str3 = new String("aaa");//这里是一个新的地址；且不能被其他程序所引用。
		System.out.println(str1 == str2);//比较后为 地址正确。
		System.out.println(str1 == str3);//比较后为 地址错误。
		System.out.println(str1.equals(str3));//用.equals来进行对象文字列内容的比较，不需要==的输入。比较后是内容正确。

		System.out.println("明天的天气是什么？");
		//如果明天天晴，就洗衣服后散步
		//如果明天下雨，就在家看DVD
		String weather = new java.util.Scanner(System.in).nextLine();
		//.equals是一个比较对象文字列的方法。一般把已知量放在.equals的前面，不容易程序报错。
		if ("晴".equals(weather)) {
			//如果对比后内容相同，则输出下面的内容。
			System.out.println("洗衣后散步");
		} else if ("雨".equals(weather)) {
			//如果对比后内容相同，则输出下面的内容。
			System.out.println("在家看DVD");
		}
		char A = 'a';
		char C = 'c';
		//这里比较的是A与C的ASCII表中的代码数字的大小。
		//结果是false。
		System.out.println(A > C);

		//1.在日满十年
		//(year>10)
		//2.高度人才70分，在日满3年。
		//(score>=70&&year>=3)
		//3.高度人才80分，在日满1年。
		//(score>=80&&year>=1)

		//在日年数
		System.out.println("在日年数");
		int year = new java.util.Scanner(System.in).nextInt();
		//高度人才分数
		System.out.println("高度人才分数");
		int score = new java.util.Scanner(System.in).nextInt();
		//进行判断
		if ((year > 10) || (score >= 70 && year >= 3) || (score >= 80 && year >= 1)) {
			System.out.println("拿到永驻");
		}

		int temp = new java.util.Random().nextInt(30);
		System.out.println(temp);
		if (temp <= 10) {
			System.out.println("已达到适合温度");
		} else {
			while (temp > 10)
				temp--;
			System.out.println(temp);
			System.out.println("正在降温");
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i * j);
				//缩进， 上一步的输出内容进行缩进。
				System.out.print("\t");
			}
			//当一遍循环结束后换行。
			System.out.println("");
		}

	}

}
