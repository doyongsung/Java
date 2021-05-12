package com.test;
public class Sample02 {
	public static void main(String[] args) {
		// value type 값타입
		// JVM stack 메모리 공간에 할당되고 초기화됌.
		int a = 1;
		int b = a;
		System.out.println(a);
		System.out.println(b);
		Employee e = new Employee();
	    e.name = "이순신";
	    e.age = 30;
	    System.out.printf("%s %s", e.name, e.age);
	    Employee e2 = e;
	    e2.name ="세종대왕";
	    System.out.println();
	    System.out.printf("%s %s", e2.name, e2.age);
	    Employee e3 = e;
	    e3.name ="도용성";
	    e3.age = 20;
	    
	    System.out.printf("%s %s", e3.name, e3.age);
	    
	    
		// reference type 참조타입
		// JVAM stack 메모리 공간에 e변수 할당되고
		// head메모리 공간에 Employee구조 생성되고
		// 내부 변수 name, age가 할당됌.
		// e변수는 heap 메모리 공간의 Employee를 참조함.
		 
		
		

	}

}
class Employee {
	public String name;
	public int age;
}
