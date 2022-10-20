package com.brighttar.getAndSetMethor;

public class Person {
	private String name;
	// HAS-A 关联
	private Dog dog;
	private Cat cat;

	public Person() {
		super();
	}

	public Person(String name, Dog dog) {
		super();
		this.name = name;
		this.dog = dog;
	}

	public Person(String name, Cat cat) {
		super();
		this.name = name;
		this.cat = cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog getDog() {
		return dog;
	}
	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}

	public void playWithDog() {
		dog.play();
		System.out.println(name + "和" + dog.getName() + "玩的很开心！");
	}

	// USE-A 依赖
	public void playWithCat(Cat cat) {
		cat.play();
		System.out.println(name + "和" + cat.getName() + "玩的很开心！");
	}
}
