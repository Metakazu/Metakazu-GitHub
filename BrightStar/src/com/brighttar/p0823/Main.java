package com.brighttar.p0823;

public class Main {

	public static void main(String[] args) {

		//1⃣️执行hero和matango和PoisonMatango程序
		Hero h = new Hero("Yajima");
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);

	}

}
