package com.brighttar.p0823;

//1 存在抽象方法的class️ 一定是抽象class
//2	一个抽象class里，不一定存在抽象方法；且既可以存在普通方法，也可以存在抽象方法
//3	抽象class是为了防止利用new来形成新的对象

//创建抽象abstract class（父类） 
//创建子类 Archer Saber
//创建执行文件Main

//当一个抽象class下的【所有】方法都是【抽象】方法时：可以把class前的【abstract class】改成interface接口
//且 下方的方法前 所用来修饰的abstract 与 public省略掉
//interface继承下去的class 必须强制重写
//继承方使用implements链接
public  abstract class Character {
	
	  void attack() {
		
	}

	//让继承此抽象父class的子类 强制重写
//	void attack();//创建一个抽象方法(没有打括号)
//
//	void sleep();
//
//	void run();

}
