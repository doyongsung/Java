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
		
	    System.out.println("======== 메뉴 =======");
	    System.out.println("1. 아메리카노 2000원");
	    System.out.println("2. 카페라떼 3000원");
	    System.out.println("3. 베이글 1500원");
	    System.out.println("4. 크림치즈 500원");
	    System.out.println("======== 주문 =======");
	    
	    System.out.print("아메리카노 주문 수량 :");
	    int a1 = getUserInput();
	    System.out.print("카페라떼 주문 수량 :");
	    int a2 = getUserInput();
	    System.out.print("베이글 주문 수량 :");
	    int a3 = getUserInput();
	    System.out.print("크림치즈 주문 수량 :");
	    int a4 = getUserInput();
	    System.out.println("======== 금액 =======");
	    System.out.println("아메리카노 :" + (b1 * a1));
	    System.out.println("카페라떼 :" + (b2 * a2));
	    System.out.println("베이글 :" + (b3 * a3));
	    System.out.println("크림치즈 :" + (b4 * a4));
	    System.out.println("===================");
	    int totalPrice = (b1 * a1) + (b2 * a2) + (b3 * a3) + (b4 * a4);
	    System.out.println("총 주문 금액 :" + totalPrice);
	    
	    float point = 0;
	    if(totalPrice >= 12000 && 30000 <= totalPrice) {
	    	point = totalPrice * 0.01f;
	    }else if(totalPrice >= 30000) {
	    	point =totalPrice * 0.02f;
	    }
	    System.out.println("포인트 적립: " + (int)point);
	    }
	    
		

	

}
