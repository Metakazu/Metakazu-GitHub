package com.brighttar.hw0823;

public class Book extends TangibleAsset {

	String isbn;

	// コンストラクタ	
	public Book(String name, int price, String color, String makerName, String isbn) {
		//调用父类构造方法 ，利用super
		super(name,price,color);
		this.isbn = isbn;
	}
	// メソッド	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
