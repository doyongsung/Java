package com.test;

import java.util.Scanner;

public class test01 {

	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return Integer.parseInt(inputString);
	}
	
	public static void main(String[] args) {
		int b1, b2, b3, b4;
		b1 = 2000;
		b2 = 3000;
		b3 = 1500;
		b4 = 500;
		
	    System.out.println("======== �޴� =======");
	    System.out.println("1. �Ƹ޸�ī�� 2000��");
	    System.out.println("2. ī��� 3000��");
	    System.out.println("3. ���̱� 1500��");
	    System.out.println("4. ũ��ġ�� 500��");
	    System.out.println("======== �ֹ� =======");
	    
	    System.out.print("�Ƹ޸�ī�� �ֹ� ���� :");
	    int a1 = getUserInput();
	    System.out.print("ī��� �ֹ� ���� :");
	    int a2 = getUserInput();
	    System.out.print("���̱� �ֹ� ���� :");
	    int a3 = getUserInput();
	    System.out.print("ũ��ġ�� �ֹ� ���� :");
	    int a4 = getUserInput();
	    System.out.println("======== �ݾ� =======");
	    System.out.println("�Ƹ޸�ī�� :" + (b1 * a1));
	    System.out.println("ī��� :" + (b2 * a2));
	    System.out.println("���̱� :" + (b3 * a3));
	    System.out.println("ũ��ġ�� :" + (b4 * a4));
	    System.out.println("===================");
	    int totalPrice = (b1 * a1) + (b2 * a2) + (b3 * a3) + (b4 * a4);
	    System.out.println("�� �ֹ� �ݾ� :" + totalPrice);
	    
	    float point = 0;
	    if(totalPrice >= 12000 && 30000 <= totalPrice) {
	    	point = totalPrice * 0.01f;
	    }else if(totalPrice >= 30000) {
	    	point =totalPrice * 0.02f;
	    }
	    System.out.println("����Ʈ ����: " + (int)point);
	    }
	    
		

	

}
