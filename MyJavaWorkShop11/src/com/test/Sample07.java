package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg = "�ȳ��ϼ���.�ݰ�����.";
		char c = msg.charAt(1);
		System.out.println(c);
		String msg1 = "abcdefgABCD";
		char c2 = msg1.charAt(7);   //charAt(0) ���° ����,�������� �˷���
		System.out.println(c2);
		int n = (int)c2;
		System.out.println(n);
		String msg2 = "  �ݰ�����  ";
		
		
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length()); // ����,���ڰ� ��������� �ִ���.
		System.out.println(msg2.trim()); //trim �������
		System.out.println(msg1.startsWith("ab")); //startsWith ó�������ϴ°��� �´���
		int n2 = 1234;
		String temp2 = String.valueOf(n2); //valueof ���ڸ� ���ڷ� �ٲ���      //int i = Integer.parseInt("100"); //"100��" 100���� ��ȯ
        System.out.println(temp2 + 2);
        String msg3 = "ababc";
        String msg4 = msg3.replace("b", "c");   //replace b �� c�� �ٲ��� 
        System.out.println(msg4);
        String tel = "010-123-1234";
        System.out.println(tel.substring(0,3)); //substring ���°���� ���° ���ڱ��� �������� �˷���   
        System.out.println(tel.substring(4,6));
        System.out.println(tel.substring(3)); // �ϳ����ϸ� ������ġ���� ������
        char c3 = "�氡����".charAt(1);
        System.out.println(c3);
        
        
	
	}

}
