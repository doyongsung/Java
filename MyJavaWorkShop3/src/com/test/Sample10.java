package com.test;

import java.util.Scanner;

public class Sample10 {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);		
	}
	public static void main(String[] args) {
		
		
		while(true) {
		System.out.printf("Computer Science ������ �Է��ϼ��� :");
		float a1 = getUserInput();
		System.out.printf("Java Programming ������ �Է��ϼ��� :");
		float a2 = getUserInput();
		System.out.printf("���м��� ������ �Է��ϼ��� :");
		float a3 = getUserInput();
		System.out.printf("������� ���� ������ �Է��ϼ��� :");
		float a4 = getUserInput();
		System.out.printf("������ ������ �Է��ϼ��� :");
		float a5 = getUserInput();
		System.out.println("==============================");
		boolean a1Check = (a1 >= 2.5)? true : false;
		boolean a2Check = (a1 >= 2.5)? true : false;
		boolean a3Check = (a1 >= 2.5)? true : false;
		boolean a4Check = (a1 >= 2.5)? true : false;
		boolean a5Check = (a1 >= 2.5)? true : false;
		boolean allCheck = a1Check && a2Check && a3Check && a4Check && a5Check;
		
		float Average = (a1 + a2 + a3 + a4 +a5) /5;
		 System.out.printf("����� ������  %s �Դϴ�%n.", + Average);
		 if(Average >= 3.7f) {
			 if(allCheck) {
		         System.out.println("���� �б� ���б� ����� �Դϴ�.");	
			 }
				
			 
		 }
//		 if(Average < 2.5f){
//			 System.out.printf("����� ������  %s �Դϴ�.", + Average);	
//			   System.out.println("�����Դϴ�");
//			    
//		}else if(Average > 3.6f){
//			System.out.printf("����� ������  %s �Դϴ�.", + Average);	
//				System.out.println("���л��Դϴ�");
//			    
//		}else
//		    System.out.printf("����� ������  %s �Դϴ�.", + Average);	
//	
	 	
		
		}

	}
}