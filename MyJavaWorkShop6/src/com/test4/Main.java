package com.test4;

// scanner�� ����ϱ� ���� inport�� �����ݴϴ�.
import java.util.Scanner;

class Operation{
	//���� �׸��� Ŭ���� �ȿ� �Լ��� +,-,*,/ �� ����� �־����ϴ�.
	int add(int a, int b) { return a +b;}

    int sub (int a, int b) {return a - b;}
    int mul (int a, int b) {return a * b;}
    int iMul (int a, int b) {return a /b;}
    
    void showMenu() {
    	//���� �׸��� �޴��� ���̰� ȣ���ϴ� �Լ��Դϴ�.
        System.out.println("###### �޴� ######");
	       System.out.println("# 1. ��Ģ����     #");
	       System.out.println("# 2.  ����       #");
	       System.out.println("#################");
    }
}    

public class Main {	
	//��ĵ�� ���� ���� ����ϱ����� �Լ��� ����մϴ�.
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return Integer.parseInt(input);
	}
	public static char getUserInputChar() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return s.charAt(0);
	}
	

	public static void main(String[] args) {
		//class�� ����Ͽ� ��ü�� ������ݴϴ�.
	 Operation operation = new Operation();
	 //������� ������ ������ ����� �ݴϴ�.
	 int result = 0;
	 //���ѷ����� ������ ���� while(true)�� ����մϴ�.
	 while (true) {
		 //�޴��� �ҷ��־� ȭ���� ����մϴ�.
	 operation.showMenu();
	 //button�̶�� ������ ����� ������ �Ұ��� ���Ḧ �Ұ��� ���ϴ� �Լ��� �����մϴ�.
	 System.out.println("�׸��� �������ּ���: ");
	 int button = inputInt();
	//���� button�� 2�� ��µȴٸ� ���ᰡ�Ǹ鼭 �������ְ� break �����ݴϴ�.
	 if(button == 2) {
		 System.out.println("����");
		 break;
	 }
	// �����ڴ� ==�� �������� char �������� button2�̶�� ������ ����� �޽��ϴ�.
	 System.out.println("�����ڸ� �����Ͻÿ�(+,-,*,/): ");
	 char button2 = getUserInputChar();
	 // �ΰ��� ���ڸ� �Է¹ޱ����� num1�� num2�� ������ְ� �Է¹޽��ϴ�.
	 System.out.println("ù ��° ���ڸ� �Է����ּ���. : ");
	 int num1 = inputInt();
	 System.out.println("�� ��° ���ڸ� �Է����ּ���. : ");
	 int num2 = inputInt();
	 // �Ʊ� ������ ������ option�� ���Ͽ� break�� ���� if������ ���մϴ�.
	 if (button2 == '+') {
		 result = operation.add(num1, num2);
	}else if(button2 == '-') {
		 result = operation.sub(num1, num2);
	}else if (button2 == '*') {
		result = operation.mul(num1, num2);
	}else if (button2 == '/') {
		result = operation.iMul(num1, num2);
	}
	 //������� �����մϴ�.
	 System.out.println("����� "+ num1 +" "+ button2 +" " + num2 + "=" + result);
	 
	 
	 
	
	 }
		
	   
	  
	    
	      
	       
		 }
		
			
			
		
		//ĸ��ȭ
		 //��Ӽ�
		 //������
		 //��ü����Ư��
		 //Ŭ������Ű��������
	
		
		
	
	

	
}


