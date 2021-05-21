package com.test;

public class Sample14 {
	enum Menu{
		pizza,
		spagetti,
		raymeon,
		
	}
	public static void main(String[] args) {
		System.out.println(Menu.pizza);
		
		for(Menu m : Menu.values()) {
			System.out.println(m);
			System.out.println(m.ordinal()); // ordinal 순서알려줌
		}

	}
}
