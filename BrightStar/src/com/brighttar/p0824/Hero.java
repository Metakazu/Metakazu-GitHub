package com.brighttar.p0824;

import lombok.Data;

@Data
public class Hero implements Character {

	String name;
	int hp;
	//课题1⬇
	static int money;

	public Hero(String name) {
		super();
		this.name=name;
	}

	//课题2⬇
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

	@Override
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp + "]";
	}

}
