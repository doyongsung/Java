package com.test;

public class Sample05 {
	
	static<T> void printMsg(T[] names) {
		for(T s : names) {
		   System.out.println(s);
		}
	}
	static <E> void printMsg2(E[] names) {
		for(E s : names) {
			   System.out.println(s);
			}
	}
	static <E> void add(E a, E b) {
		E temp = a;
		E x = b;
		E y = temp;
		System.out.println(x + ", " + y);
	}
	public static void main(String[] args) {
		
		String[] names = {"홍길동", "이순신", "세종대왕"};
		
		printMsg(names);
		Integer[] arr = {10,20,30,40}; //벨류타입이기때문에 형변환 int = Integer
		printMsg(arr);
		Integer a1 = 10;
		Integer b1 = 20;
		add(a1, b1);
		
	
	}
}
