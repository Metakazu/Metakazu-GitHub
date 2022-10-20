package com.brighttar.p0824;

public class Test {
	public static void main(String[] args) {
		show(new Cat()); // 以 Cat 对象调用 show 方法

		show(new Dog()); // 以 Dog 对象调用 show 方法

		//数据类型为animal的a如果想要使用数据类型为cat里面才有的方法时
		//需要进行强行转型：为下面的第三行代码
		Animal a = new Cat(); // 向上转型  
		a.eat(); // 调用的是 Cat 的 eat
		Cat c = (Cat) a; // 向下转型  
		c.work(); // 调用的是 Cat 的 work
	}

	public static void show(Animal a) {
		//animal a
		a.eat();
		// 类型判断
		if (a instanceof Cat) { // 猫做的事情 
			Cat c = (Cat) a;
			c.work();
		} else if (a instanceof Dog) { // 狗做的事情 
			Dog c = (Dog) a;
			c.work();
		}
	}

}
