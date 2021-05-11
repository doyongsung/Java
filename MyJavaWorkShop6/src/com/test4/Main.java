package com.test4;


import java.util.Scanner;

public class Main {
	public static int getUserInput() {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		return Integer.parseInt(inputString);
	}
	static int add(int a, int b) {return a + b;}
	static int subreact(int a, int b) {return a - b;}
	static int multiply(int a, int b) {return a * b;}
	
	
	public static void main(String[] args) {
	  int num1, num2, result;
		
		for(;;) {
		System.out.println("##### 메뉴 #####");
		System.out.println(" 1.사칙연산     #");
		System.out.println(" 2.종료        #");
		System.out.println("###############");
		System.out.print("항목을 선택해 주세요.: ");
		int a = getUserInput();
	
	           
		if(a == 1) {
			
		
			System.out.print("첫 번째 숫자를 입력해주세요. : ");
			int a1 = getUserInput();
			System.out.print("두 번째 숫자를 입력해주세요. : ");
			int a2 = getUserInput();
			System.out.println("결과는 :" + Main.add(a1, a2));
			
		}else {
			System.out.println("종료");
			break;
		}

		}
		
		
	
	}

	
}


