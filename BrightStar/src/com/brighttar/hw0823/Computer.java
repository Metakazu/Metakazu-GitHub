package com.brighttar.hw0823;

public class Computer extends TangibleAsset {

	String makerName;

	// コンストラクタ	
	public Computer(String name, int price, String color, String makerName) {
		//调用父类构造方法 ，利用super
		super(name,price,color);
		this.makerName = makerName;
	}
	// メソッド	
	public String getMakerName() {
		return makerName;
	}
	public void setMakerName(String makerName) {
		this.makerName = makerName;
	}
}