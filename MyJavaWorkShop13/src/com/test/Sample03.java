package com.test;

class Student1<T>{  //tŸ�Կ� t�Ű�����
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
		Student1<String> stu = new Student1<String>("�̼���");
		System.out.println(stu.getS());

	}
}
