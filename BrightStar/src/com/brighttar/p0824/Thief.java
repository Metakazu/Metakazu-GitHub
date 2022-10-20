package com.brighttar.p0824;

public class Thief implements Character {
	String name;
	int hp;

	@Override
	public void stay() {
		this.hp += 10;
		System.out.println(this.hp);
	}

	public Thief() {
		super();
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

}
