package com.oop.shop01;

public class Run02 {
	public static void main(String[] args) {
		
		IceCream ic = new IceCream("001", "�ٴҶ�", 5000);
		//System.out.println(ic2.getName());
		
		Bread br = new Bread("001", "�ٰ�Ʈ", 5000);
		Beverage bv = new Beverage("001", "������", 5000);
		//System.out.println(br.getName());
		//System.out.println(bv.getName());
		System.out.println("���̽�ũ�� ���ΰ��� : " + ic.getPromotionPrice());
		System.out.println("�� ���ΰ��� : " + br.getPromotionPrice());
		System.out.println("���� ���ΰ��� : " + bv.getPromotionPrice());
	}

}
