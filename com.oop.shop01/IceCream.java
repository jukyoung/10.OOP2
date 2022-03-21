package com.oop.shop01;

//extends 상속받고 싶은 클래스명
public class IceCream extends Product {
	
	public IceCream() {
		super(); // -> 명시해 주지 않으면 자동으로 실행이 됨
		// super -> 상속해주는 부모클래스 참조하는 변수 / this -> 자기자신을 의미함
		// 부모클래스의 기본생성자 호출하는 작업
		// iceCream형 생성자를 호출하면 부모 클래스의 인스턴스 또한 생성됨
		
	}
	
	public IceCream(String product_no, String name, int price) {
		// private 접근제한자 때문에 멤버필드에 접근이 불가
//		this.product_no = product_no; 
//		this.name = name;
//		this.price = price;
		
		// getter/setter 를 통해 값 세팅
//		this.setProduct_no(product_no);
//		this.setName(name);
//		this.setPrice(price);
		
		// 부모의 매개변수 있는 생성자 활용
		super(product_no, name, price); //-> 코드의 첫번째로 와야함..?
	}
	
	/* 메서드의 오버라이딩
	 * 부모 클래스가 가지고 있는 메서드를 재정의 하는 작업
	 * 상속관계에서 오버라이딩을 할 수 있음
	 * -> 다른 클래스 안에서 이뤄짐.
	 * -> 똑같은 이름의 메서드, 똑같은 반환타입, 똑같은 매개변수
	 * -> 부모 클래스가 가지고 있는 같은 이름의 메서드를 무효화 시킴
	 *  
	 * 오버로딩 -> 하나의 클래스 안에서 이뤄짐
	 * -> 똑같은 이름의 메서드를 매개변수 자료형이나 개수를 달리해주는 작업
	 * -> 리턴타입은 동일 -> 영향x
	 * */ 
	public double getPromotionPrice() {
		return this.getPrice() * 0.01;
	} // 추상메서드를 해놨을때 없으면 오류남
	
	
	
}


