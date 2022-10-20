package com.brighttar.getAndSetMethor;

public class Main {

	//get&set方法的应用
	
	public static void main(String[] args) {
		// 通过有参构造方法生成「dahuang」对象
		// 对象的name属性是大黄 age属性是3
		Dog dahuang = new Dog("大黄", 3);
		Cat xiaomi = new Cat("小咪", 2);
		// 通过无参构造方法生成「jakcy」对象
		Person jacky = new Person();
		// 给jacky对象的name属性赋值Jacky
		jacky.setName("Jacky");
		// 给jacky对象的dog属性赋值dahuang对象
		// 一个叫Jacky的人有一只叫大黄的狗
		jacky.setDog(dahuang);
		// 给jacky对象的dog属性赋值xiaomi对象
		// 一个叫Jacky的人有一只叫小咪的猫
		jacky.setCat(xiaomi);
		// jacky对象去调用playWithDog()方法
		// 在方法中，先实现dahuang对象一个play()方法
		// 然后实现jacky对象和dahuang对象之间一个玩耍
		jacky.playWithDog();

		jacky.playWithCat(xiaomi);

	}

}
