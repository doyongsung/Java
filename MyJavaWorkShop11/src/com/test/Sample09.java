package com.test;

public class Sample09 {

	public static void main(String[] args) {
		//boxing
		int a = 10;
		Integer i = Integer.valueOf(a); //����Ÿ���� ���۷���Ÿ������ �ٲ��ִ°� �ڽ� �ݴ�� ��ڽ�
		Object o = i;
		System.out.println(i.toString() + ", " + i);
		Integer i2 = new Integer(100);
		System.out.println(i2.toString());
		
		//unboxing
		
		int c = i.intValue();
		System.out.println(c);
	}
}
