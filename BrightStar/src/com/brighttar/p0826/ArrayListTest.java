package com.brighttar.p0826;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> scoreList = new ArrayList<Integer>();

		//LIst的最后位 添加
		scoreList.add(88);//0号
		scoreList.add(20);//1号
		scoreList.add(12);//2号
		System.out.println(scoreList.get(0));

		//是否包含某一个元素
		System.out.println(scoreList.contains(20));
		//查找指定的元素在集合中的第几位
		System.out.println(scoreList.indexOf(20));

		//List指定2号位位置 插入一个要素, 此时集合里有四个元素（长度）
		scoreList.add(2, 66);
		System.out.println(scoreList.get(2));

		//List指定位置 替换（上書き）一个要素，将下标为2的位置的元素替换，此时还是四个长度。
		scoreList.set(2, 99);
		System.out.println(scoreList.get(2));
		System.out.println(scoreList.get(3));
		//因为集合里的元素只有四个，长度也为4， 第五位什么也没有，因此会报错。
		//System.out.println(scoreList.get(4));

		//取得最后一个元素   取得get（）
		//替换set（）
		System.out.println(scoreList.get(scoreList.size() - 1));

		//删除指定位置的元素
		scoreList.remove(1);
		//删除指定位置后，后一位的元素会向前移动一位
		System.out.println(scoreList.get(1));
		//删除所有
		scoreList.clear();

		//判断指定位置是否为空,因为前一步清空了元素，所以为true
		System.out.println(scoreList.isEmpty());

		
		//迭代器
		Iterator<Integer> iterator = scoreList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
