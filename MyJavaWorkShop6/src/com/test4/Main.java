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
		
		while(true){
		System.out.println("##### �޴� #####");
		System.out.println(" 1.��Ģ����     #");
		System.out.println(" 2.����        #");
		System.out.println("###############");
		System.out.print("�׸��� ������ �ּ���.: ");
		int a = getUserInput();
		System.out.println();
		
	
	           
		 switch(a){
		 case 1:
			 System.out.print("ù ��° ���ڸ� �Է����ּ���. : ");
				int a1 = getUserInput();
				System.out.print("�� ��° ���ڸ� �Է����ּ���. : ");
				int a2 = getUserInput();
				System.out.println("����� :" + Main.add(a1, a2));
			  
				 
		 }
		
			
			
		
		//ĸ��ȭ
		 //��Ӽ�
		 //������
		 //��ü����Ư��
		 //Ŭ������Ű��������
		}
		
		
	
	}

	
}


