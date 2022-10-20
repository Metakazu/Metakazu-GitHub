package com.brighttar.p0815$19;

//class 类
public class practice0819 {
	//属性 field
	private String name;
	private int age;
	/*⬇ getter & setter 方法 
	 * 快捷键：通过打开Source菜单 option+command+S 后选取
	 * 在Java中，getter和setter是两种常规方法，用于检索和更新变量的值。 
	 * 因此， Setter 是一种更新变量值的方法。 
	 * Getter 是一种读取变量值的方法。 Getter 和 setter 在Java 中也称为访问器和更改器。*/

	/*toString方法 
	Object类具有一个toString()方法，你创建的每个类都会继承该方法。
	它返回对象的一个String表示，并且对于调试非常有帮助。
	然而对于默认的toString()方法往往不能满足需求，需要覆盖这个方法。
	toString（）方法将对象转换为字符串。*/
	
	
	//无参构造方法,class内系统自动生成的一个方法（手动调出）；
	public practice0819() {//option command S
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//满参数构造 Generate Constructors using Fields ⬇*
	//有参构造方法；根据用户的要求生成的一个方法（手动调出）
	public practice0819(String name, int age) {//option command S
		super();
		this.name = name;
		this.age = age;
	}

	//由于上面的name age 被属性私有化private后不可视，用get set封装后，可以被其他class使用。
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//方法 method
	public void play() {//没有写static静态 
		System.out.println(this.name + "play");
	}

	//HAS-A 从属
	//USE-A 使用
	//IS-A    继承

}

//面向过程
//性能更好

//面向对象
//更利于 维护，更利于拓展，利于重复利用