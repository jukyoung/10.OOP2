package com.oop.shop01;

public class Run02 {
	public static void main(String[] args) {
		
		IceCream ic = new IceCream("001", "바닐라", 5000);
		//System.out.println(ic2.getName());
		
		Bread br = new Bread("001", "바게트", 5000);
		Beverage bv = new Beverage("001", "생강차", 5000);
		//System.out.println(br.getName());
		//System.out.println(bv.getName());
		System.out.println("아이스크림 할인가격 : " + ic.getPromotionPrice());
		System.out.println("빵 할인가격 : " + br.getPromotionPrice());
		System.out.println("음료 할인가격 : " + bv.getPromotionPrice());
	}

}
