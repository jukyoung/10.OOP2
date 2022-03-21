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
	public void funcExtra() { //�������̵� �� �޼���
		System.out.println("B");
	}
}

class C extends A{
	public void funcC() {
		System.out.println("funcC");
	}
}
public class Test { //Ŭ���� �� �տ� public �̶�� ���������ڴ� Ŭ������� �������� ���� �� ����
	// ������
	public static void main(String[] args) {
		
		/* ������ : �پ��� ������ ������ ������ ��
		 *  �� Ŭ������ �پ��� Ŭ������ ������ ���� �� �ִ� ��
		 *  (��Ӱ��迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ν��Ͻ��� ���� �� �ִ� ��)
		 * */
		A a1 = new B(); // A�� ��������(�θ�Ŭ����) a1 ���ٰ� B�� �ν��Ͻ�(�ڽ�Ÿ���� �ν��Ͻ�) �� ���� (���δٸ� �ڷ���)
		a1.funcA();
		a1.funcExtra(); // B��� ���� ����
		
		A a2 = new C(); // �ڽ��� ��ӹ޴� ��� �ڽ��� �ν��Ͻ��� �θ��� ���������� ���� �� ����
		a2.funcA();
		int a = 10;
		long b = a; // �ڵ�����ȯ -> ū �ڷ����� ���� �ڷ����� ��� upcasting -> �������� �̷� ����
		
		// �θ��� ���������� �ڽ��� ����� ����ϰ� �ϰ� �ʹٸ�?
		// ���� ����ȯ -> a��� ��������(����Ŭ����)�� B������(�ڽ�Ŭ����) �ٿ�ĳ����
		((B)a1).funcB();
		((C)a2).funcC();
		
		// �׷� �ݴ�� �ڽ� Ŭ������ ���������� �θ� �ν��Ͻ��� ���� �� ������?	
		// -> ���� �� ���� �θ��� �ν��Ͻ� �� �� �۾Ƽ�
//		B b1 = new A();
//		C c1 = new A(); -> ���� �� 		
//		B b2 = (B)(new A()); // -> ��������ȯ �غ��� ? ���� �� 
//		b2.funcA();
//		b2.funcB();
		
	}
	
	
}








