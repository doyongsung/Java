package com.test;

class Student1<T>{  //t타입에 t매개변수
	T s;    
	Student1(T s){
		this.s = s;
	}
	public T getS() {
		return this.s;
	}
}
public class Sample03 {

	public static void main(String[] args) {
		Student1<String> stu = new Student1<String>("이순신");
		System.out.println(stu.getS());

	}
}
