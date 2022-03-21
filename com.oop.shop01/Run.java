package com.oop.shop01;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		// ���̽�ũ�� ��� ���� ���α׷�
		Scanner sc = new Scanner(System.in);
		/*
		 * ���Կ� �޴��� �߰��ɶ����� ������� ������
		 * 1. �޴��� �߰��ɶ����� ������, getter setter, ����ʵ� -> �Ȱ��� �ڵ� �ݺ� -> �ڵ� �ߺ��� ����
		 * -> ����� ���� ���� �ذ�
		 * 2. index, add, print �޼��尡 ���������� ���� -> �ڵ� ���յ� ����
		 * -> �������� ���� ���� �ذ�
		 * 3. �����(�迭) ������ ����, �߰�, ����, ���� ����
		 * 
		 * */
		
		Shop baskin = new Shop("����Ų���31", "9:00", "21:00", new Product[10] );
		
		while(true) {
			System.out.println("\n***** baskin ��� ���� ���α׷� *****");
			// 1.���̽�ũ�� ��� 2. ���̽�ũ�� ��� Ȯ�� 3. ���� ���� Ȯ�� 0. ���α׷� ����
			System.out.println("1. ��ǰ ���");
			System.out.println("2. ��ǰ ��� Ȯ��");
			System.out.println("3. ���� ���� Ȯ��");
			System.out.println("0. ���α׷� ����");
			System.out.print(">> ");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu == 1) {
				System.out.println("����� ��ǰ�� �����ϼ���.");
				System.out.println("1.���̽�ũ��");
				System.out.println("2. ��");
				System.out.println("3. ����");
				System.out.print(">> ");
				int pd = Integer.parseInt(sc.nextLine());
				
				System.out.print("ǰ�� �Է� >> ");
				String product_no = sc.nextLine();
				
				System.out.print("�̸� �Է� >> ");
				String name = sc.nextLine();
				
				System.out.print("���� �Է� >> ");
				int price = Integer.parseInt(sc.nextLine());
				
				if(pd == 1) {
					baskin.addProduct(new IceCream(product_no, name, price));
				}else if(pd == 2) {
					baskin.addProduct(new Bread(product_no, name, price));
				}else if(pd == 3) {
					baskin.addProduct(new Beverage(product_no, name, price));
				}		
			}else if(menu == 2) {
				System.out.println(baskin.printProduct());
			}else if(menu == 3) {
				System.out.println(baskin.getName() + " : " 
			            + baskin.getOpenTime() + " : "
						+ baskin.getCloseTime() + " \n " 
						+ baskin.printProduct());
			}else if(menu == 0) {
				break;
			}
		}
		
		
	}

}