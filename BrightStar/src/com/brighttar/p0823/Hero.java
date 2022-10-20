package com.brighttar.p0823;

public class Hero {
	//privateで予測不能な書き換えを阻止。
	double hp;
	String name;

	public Hero(String name) {
		this.name = name;
		this.hp = 100;
		System.out.println("勇者：" + this.name + " HP:" + this.hp);
		System.out.println("-------------------");
	}

	//勇者状态
	public void states() {
		System.out.println("勇者：" + this.name + " HP:" + this.hp);
		if (this.hp < 30) {
			System.out.println("勇者：" + this.name + " が瀕死になりました！");
		}
		System.out.println("-------------------");
	}

	//勇者菜单
	public void heroMenu() {
		System.out.println("请选择勇者" + this.name + "的行动");

		System.out.println("---------------------------");

		System.out.println("1⃣️-----技能");

		System.out.println("2⃣️-----背包");

		System.out.println("3⃣️-----逃跑");

		System.out.println("0⃣️-----退出");

		System.out.println("---------------------------");

		System.out.printf("请选择：");
		int choose = new java.util.Scanner(System.in).nextInt();
	}

	//読み込み可能
	public double getHp() {
		return hp;
	}

	//書き込み可能
	public void setHp(double hp) {
		this.hp = hp;
	}

}
