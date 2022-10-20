package com.brighttar.p0815$19;

public class practice0819test {
	public static void main(String[] args) {
		//通过等号前的类class内的构造方法，生成一个具体的具体对象；new，新生成一个对象
		//通过class创建一个新的对象，使其可以使用class里的所有属性和方法。
		//instance/object 实例 /对象

		//无参构造方法
		practice0819 dahuang = new practice0819();
		//有参构造方法
		practice0819 xiaobai = new practice0819("小白", 23);//new后面的内容：构造方法 cons
		dahuang.setName("大黄");
		dahuang.play();
		xiaobai.play();
	}
}
