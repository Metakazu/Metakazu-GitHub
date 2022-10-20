package com.brighttar.p0826;

import java.util.ArrayList;

public class ScoreList {
	public static void main(String[] args) {
		//创建集合（构造器）
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		//=等号前后的范型一定是相同的，因此后面的范型可以省略
		//ArrayList<Integer> scoreList = new ArrayList<>();
		//ArrayList是继承于ArrayCollection又遵从于List，因此也可以省略为
		//List<Integer> scoreList = new ArrayList<>();

		//往集合里添加元素，不需要写下标，会自动找到空位，往里面添加
		scoreList.add(88);
		scoreList.add(20);
		scoreList.add(12);
		scoreList.add(96);
		scoreList.add(56);
		scoreList.add(48);

		int sum = 0;
		//普通for循环
		for (int i = 0; i < scoreList.size(); i++) {
			//总和
			sum += scoreList.get(i);
		}
		System.out.println(sum);
		//平均分
		int avg = sum / scoreList.size();
		System.out.println(avg);
		System.out.println("--------------");

		//增强for循环
		int sum1 = 0;
		for (int score : scoreList) {
			sum1 += score;
		}
		System.out.println(sum1);
		int avg1 = sum1 / scoreList.size();
		System.out.println(avg1);

	}
}
