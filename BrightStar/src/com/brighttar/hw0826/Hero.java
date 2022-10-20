package com.brighttar.hw0826;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//		次のようなHeroクラスがあります。
public class Hero {
	private String name;

	public Hero(String name) {
		this.name = name;
	}

	@Override
	//需要toString方法的重写
	public String toString() {
		return name;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		//		2人の勇者（張三、李四）をHeroとしてインスタンス化してArrayListに格納し、
		List<Hero> hero = new ArrayList<Hero>();
		hero.add(new Hero("張三"));
		hero.add(new Hero("李四"));
		//		1人ずつ順番に取り出して名前を表示するプログラムを作成してください。
		//方法一 增强for循环
		for (Hero i : hero) {
			System.out.println(i);
		}
		System.out.println("------------");
		//方法二 普通for循环
		for (int i = 0; i < hero.size(); i++) {
			System.out.println(hero.get(i).getName());
		}
		System.out.println("------------");
		//方法三 迭代器
		Iterator<Hero> it = hero.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		System.out.println("------------");
		//	練習　16-2の2人の勇者をインスタンス化し、それぞれの勇者が倒した敵の数（3、7）
		//と勇者をペアでコレクションに格納してください。
		//	次に1つずつ取り出し、次のような画面表示を行ってください。（表示順は不問）。
		//	張三が倒した敵=3
		//	李四が倒した敵=7
		Map<Hero, Integer> kills = new HashMap();
		kills.put(hero.get(0), 3);
		kills.put(hero.get(1), 7);
		
		//Hero h1=new Hero
		//Hero h2=new Hero
		//Map<Hero, Integer> kills = new HashMap();
		//kills.put(h1, 3);
		//kills.put(h2, 7);
		//对map里的key做增强for循环
		//		for(Hero hero:kills.keySet()) {
		//			System.out.println(hero.getName()+""+kills.);
		//		}
		for (Hero key : kills.keySet()) {
			int value = kills.get(key);
			System.out.println(key + "が倒した敵数＝" + value);

		}
	}

}
