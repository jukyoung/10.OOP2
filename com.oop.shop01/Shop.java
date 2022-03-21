package com.oop.shop01;

public class Shop { // 아이스크림 가게 재고관리 프로그램
	// 가게이름 name, openTime, closeTime, iceCream
	private String name;
	private String openTime;
	private String closeTime;	
	private Product[] product; // product(부모클래스) 형 배열이 IceCream, Bread, Beverage가 담기는거 가능
	private int index = 0;

	
	public Shop() {}
	public Shop(String name, String openTime, String closeTime, Product[] product) {
		super();
		this.name = name; // this 지우면 ->(매개변수를 뜻함) 똑같은 공간에 똑같은 값을 담겠다 -> 의미가 없다
		this.openTime = openTime; // this 가 붙으면 위에있는 (private 가 붙은)멤버필드를 의미함  
		this.closeTime = closeTime;
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	public Product[] getProduct() {
		return this.getProduct();
	}
	public void setProduct(Product[] product) {
		this.product = product; // 여기서도 this 빼면 안됨
	}
	public void addProduct(Product product) {
		this.product[index++] = product;
	}
	public String printProduct() {
		String rs = "";
		for(int i = 0; i < this.product.length; i++) {
			if(this.product[i] != null) { // 여기서는 this 지워도 상관 없음
				rs += this.product[i].getProduct_no() 
						+ " : " + this.product[i].getName()
						+ " : " + this.product[i].getPrice()
				        + "\n";
			}
		}
		return rs;
	}	
	
}
