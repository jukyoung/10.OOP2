package com.oop.shop01;

//extends ��ӹް� ���� Ŭ������
public class IceCream extends Product {
	
	public IceCream() {
		super(); // -> ����� ���� ������ �ڵ����� ������ ��
		// super -> ������ִ� �θ�Ŭ���� �����ϴ� ���� / this -> �ڱ��ڽ��� �ǹ���
		// �θ�Ŭ������ �⺻������ ȣ���ϴ� �۾�
		// iceCream�� �����ڸ� ȣ���ϸ� �θ� Ŭ������ �ν��Ͻ� ���� ������
		
	}
	
	public IceCream(String product_no, String name, int price) {
		// private ���������� ������ ����ʵ忡 ������ �Ұ�
//		this.product_no = product_no; 
//		this.name = name;
//		this.price = price;
		
		// getter/setter �� ���� �� ����
//		this.setProduct_no(product_no);
//		this.setName(name);
//		this.setPrice(price);
		
		// �θ��� �Ű����� �ִ� ������ Ȱ��
		super(product_no, name, price); //-> �ڵ��� ù��°�� �;���..?
	}
	
	/* �޼����� �������̵�
	 * �θ� Ŭ������ ������ �ִ� �޼��带 ������ �ϴ� �۾�
	 * ��Ӱ��迡�� �������̵��� �� �� ����
	 * -> �ٸ� Ŭ���� �ȿ��� �̷���.
	 * -> �Ȱ��� �̸��� �޼���, �Ȱ��� ��ȯŸ��, �Ȱ��� �Ű�����
	 * -> �θ� Ŭ������ ������ �ִ� ���� �̸��� �޼��带 ��ȿȭ ��Ŵ
	 *  
	 * �����ε� -> �ϳ��� Ŭ���� �ȿ��� �̷���
	 * -> �Ȱ��� �̸��� �޼��带 �Ű����� �ڷ����̳� ������ �޸����ִ� �۾�
	 * -> ����Ÿ���� ���� -> ����x
	 * */ 
	public double getPromotionPrice() {
		return this.getPrice() * 0.01;
	} // �߻�޼��带 �س����� ������ ������
	
	
	
}


