package com.oop.test;

class A{
	public void funcA(){
		System.out.println("funcA");
	}
	public void funcExtra() {
		System.out.println("A");
	}
}

class B extends A{
	public void funcB() {
		System.out.println("funcB");
	}
	public void funcExtra() { //오버라이딩 된 메서드
		System.out.println("B");
	}
}

class C extends A{
	public void funcC() {
		System.out.println("funcC");
	}
}
public class Test { //클래스 명 앞에 public 이라는 접근제한자는 클래스명과 같을때만 가질 수 있음
	// 다형성
	public static void main(String[] args) {
		
		/* 다형성 : 다양한 형태의 성질을 가지는 것
		 *  한 클래스가 다양한 클래스의 성질을 가질 수 있는 것
		 *  (상속관계에서 부모타입의 참조변수가 자식타입의 인스턴스를 담을 수 있는 것)
		 * */
		A a1 = new B(); // A형 참조변수(부모클래스) a1 에다가 B형 인스턴스(자식타입의 인스턴스) 를 만듬 (서로다른 자료형)
		a1.funcA();
		a1.funcExtra(); // B라는 값이 나옴
		
		A a2 = new C(); // 자신을 상속받는 모든 자식형 인스턴스를 부모형 참조변수에 담을 수 있음
		a2.funcA();
		int a = 10;
		long b = a; // 자동형변환 -> 큰 자료형에 작은 자료형을 담는 upcasting -> 다형성도 이런 느낌
		
		// 부모형 참조변수로 자신의 기능을 사용하게 하고 싶다면?
		// 강제 형변환 -> a라는 참조변수(상위클래스)를 B형으로(자식클래스) 다운캐스팅
		((B)a1).funcB();
		((C)a2).funcC();
		
		// 그럼 반대로 자식 클래스형 참조변수에 부모 인스턴스를 담을 수 있을까?	
		// -> 담을 수 없음 부모형 인스턴스 가 더 작아서
//		B b1 = new A();
//		C c1 = new A(); -> 오류 남 		
//		B b2 = (B)(new A()); // -> 강제형변환 해보면 ? 오류 남 
//		b2.funcA();
//		b2.funcB();
		
	}
	
	
}








