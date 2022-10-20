package com.brighttar.hw0823;

public abstract class TangibleAsset implements Thing {

	String name;
	int price;
	String color;
	
	//为了使继承此抽象类的子类，不用再次写一次，且能够使用该抽象类遵从的接口里的方法 如下：
	//将接口内的方法拿出来
	double weight;

	public TangibleAsset(String name, int price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public TangibleAsset() {
		super();
	}

	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


}
