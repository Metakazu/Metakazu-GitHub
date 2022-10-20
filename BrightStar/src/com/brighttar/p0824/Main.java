package com.brighttar.p0824;

//导入的是一个包.class
//也可以导入一个静态属性
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {

		//课件1
		Hero h1 = new Hero("asdasdasdas");
		h1.hp = 100;
		h1.money = 100;
		Hero h2 = new Hero("yayaya");
		h2.hp = 988;
		// h2.money=90;
		System.out.println(h1.hp);
		System.out.println(Hero.money);
		out.println(h2.hp);
		out.println("-------");

		//课件2
		Thief t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();

		h1.stay();
		h2.stay();
		t1.stay();
		w1.stay();
		w2.stay();
		out.println("-------");

		//课件3
		Character[] c = new Character[5];
		c[0] = new Hero("yajima");
		c[1] = new Hero("sadasd");
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		//将ch与c联系到一起
		//增强for循环
		//for(要素的类型  变数名：数列变数名){
		//      方法
		//}
		for (Character ch : c) {
			System.out.println(ch);
			ch.stay();
		}
		
		for(int i=0;i<c.length;i++) {
			c[i].stay();
		}
	}

}
