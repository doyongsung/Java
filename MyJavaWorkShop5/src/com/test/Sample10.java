package com.test;
class Cat {
	String name;
	void meowing() {
		System.out.println(name);
	}
}
public class Sample10 {
	static void test(int x) {}
	static void test2(Cat c) { // Cat c = cat;
		c.meowing();
	} 
	public static void main(String[] args) {
		int a = 10;
		test(a);
		Cat cat = new Cat();
		cat.name = "�׷�";
		test2(cat);

	}
}






