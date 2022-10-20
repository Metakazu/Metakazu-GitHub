package com.brighttar.p0815$19;

public class practice081702 {

	public static void main(String[] args) {//主逻辑main方法
		//当main方法下的程序运行到 自定义的函数方法的时候，会add进函数方法中，进行进一步运算。
		int c = add(3, 5);//实际参数
		System.out.println(c);

		int i = 0;
		plus(i);
		System.out.println(plus(i));

		int[] arr = { 1, 2, 3 };
		plus(arr);
		for (int r = 0; r < arr.length; r++) {
			System.out.println(arr[r]);
		}
		//敲7游戏（1-100）
		for (int q = 0; i <= 100; q++) {
			if (q % 7 == 0 || q % 10 == 7 || q / 10 == 7) {
				System.out.println(q);
			}
		}
	}

	//public static +返回值类型 + 函数(参数list:可以没有参数，也可以很多)
	//函数方法内的命名，可以和main方法中的命名重复。
	//函数方法
	public static int add(int a, int b) { //运行参数。
		//当函数方法运算完成之后，会将结果return返还给main方法中的程序。
		return a + b;
	}

	public static int plus(int x) {
		//如果用++x来执行函数方法，则会返回一个0，因为先赋值，后执行，
		//而x++的运行行径只存在于此函数方法内，则等号右边无赋值可返回。
		return x++;
	}
	//如果用下面的++y来执行函数方法，则会返回一个1，因为先执行，后赋值。
	//先在等号右边进行计算，之后再给左边赋值，且可以返回给main方法中的地址。
	//public static int plus(int y) {
	//	return ++y;
	//}

	//呼び出し元の配列のアドレスが、呼び出し先の引数にコピーされる
	//呼び出し先で配列の実体を書き換えると、呼び出し元にも影響する
	public static void plus(int[] aa) {
		for (int y = 0; y < aa.length; y++) {
			aa[y]++;
		}
	}
}
