package com.brighttar.p0815$19;

public class practice0817 {

	public static void main(String[] args) {
		//数组{配列}内的各个数据名必须是同一个类型，否则无法保存。
		//数组的数据起始是以0目录开始的。最后一个数组的角标是数组总数的n-1个。
		//数组的长度为【】里的数字，不会因为数组里是否达到设定的数字而改变。
		int[] scores = new int[6];
		scores[0] = 88;
		scores[1] = 20;
		scores[2] = 80;
		scores[3] = 76;
		scores[4] = 43;
		scores[5] = 90;

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {//.length:是前一个单位的属性
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println(sum);
		System.out.println(avg);

		int[] numbers = new int[5];
		numbers[0] = 5;
		System.out.println(numbers[0]);

		//省略数组赋值方法↓
		//要素类型[]=new 要素类型[]{值1，值2，值3...}   先定义后赋值；亦或定义的同时并赋值。可以在不同行。
		//int s = new int[] {20,30,40,50.....};
		//要素类型[]={值1，值2，值3...}   只能同时赋值定义，必须在一行进行。
		//或int s ={20,30,40,50.....};

		//增强for循环
		//写法：for（要素的类型 变量名：数列变量名 ）{方法}
		int kazu[] = { 99, 20, 17, 78, 03 };
		for (int yajima : kazu) {
			System.out.println(yajima);
		}
		System.out.println("下一题");

		int[][] arrays = { { 9, 8, }, { 3, 2, 1, 10 }, { 2 } };
		for (int q = 0; q < arrays.length; q++) {
			for (int w = 0; w < arrays[q].length; w++) {
				System.out.println(arrays[q][w]);
			}
			System.out.println(arrays[2][0]);//输出的是大括号的第三个元素括号的第四个值。
		}
	}
}
