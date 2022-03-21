package com.oop.shop01;

public class Shop { // ���̽�ũ�� ���� ������ ���α׷�
	// �����̸� name, openTime, closeTime, iceCream
	private String name;
	private String openTime;
	private String closeTime;	
	private Product[] product; // product(�θ�Ŭ����) �� �迭�� IceCream, Bread, Beverage�� ���°� ����
	private int index = 0;

	
	public Shop() {}
	public Shop(String name, String openTime, String closeTime, Product[] product) {
		super();
		this.name = name; // this ����� ->(�Ű������� ����) �Ȱ��� ������ �Ȱ��� ���� ��ڴ� -> �ǹ̰� ����
		this.openTime = openTime; // this �� ������ �����ִ� (private �� ����)����ʵ带 �ǹ���  
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
		this.product = product; // ���⼭�� this ���� �ȵ�
	}
	public void addProduct(Product product) {
		this.product[index++] = product;
	}
	public String printProduct() {
		String rs = "";
		for(int i = 0; i < this.product.length; i++) {
			if(this.product[i] != null) { // ���⼭�� this ������ ��� ����
				rs += this.product[i].getProduct_no() 
						+ " : " + this.product[i].getName()
						+ " : " + this.product[i].getPrice()
				        + "\n";
			}
		}
		return rs;
	}	
	
}
