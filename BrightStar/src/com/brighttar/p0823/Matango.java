package com.brighttar.p0823;

public class Matango {

	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack(Hero h) {
		System.out.println("通常のお化けキノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		//TODO CHECK!! IMPORTANT!!
		h.setHp(h.getHp() - 10);
		h.states();
	}

}
