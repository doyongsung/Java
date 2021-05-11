package com.test4;

class A {
	void aMethod() {
		System.out.println("aMethod in A");
	}
}

class B extends A {
	void aMethod() {
		System.out.println("aMethod in B");
	}
}

class C extends B {}
public class Sample09 {
	public static void main(String[] args) {
//		B b = new B();
//		b.aMethod();
//		A b2 = new B();
//		b2.aMethod();
		A a = new C();
		a.aMethod();

	}

}
//class Database{
//	void open() {
//		System.out.println("Database open");
//	}
//}
//class Oracle extends Database {
//	void select_oracle() {
//		System.out.println("Oracle select");
//	}
//}
//class MySql extends Database {
//	void select_mysql() {
//		System.out.println("MySql select");
//	}
//}