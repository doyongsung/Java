package com.test;

public class Sample09 {

	public static void main(String[] args) {
		//boxing
		int a = 10;
		Integer i = Integer.valueOf(a); //벨류타입을 레퍼런스타입으로 바꿔주는게 박싱 반대는 언박싱
		Object o = i;
		System.out.println(i.toString() + ", " + i);
		Integer i2 = new Integer(100);
		System.out.println(i2.toString());
		
		//unboxing
		
		int c = i.intValue();
		System.out.println(c);
	}
}
