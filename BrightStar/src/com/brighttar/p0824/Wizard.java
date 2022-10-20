package com.brighttar.p0824;

public class Wizard implements Character {
	String name;
	int hp;

	public Wizard() {
		super();
	}

	@Override
	public void stay() {
		this.hp += 10;
		System.out.println(this.hp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public Wizard(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}

}
