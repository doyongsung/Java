package com.test2;

interface IStudent{//추상메서드와 상수만 가능
	                
	public void study(); //sys.out 입력오류  클래스대신 사용한다는것외에는 작성과동일
}
class Student implements IStudent{ //표준화 구현하지않으면 사용하지못함
	public void study() { //같이 사용해줘야함
		System.out.println("학생이 공부하다.");
	}
	
	
}
public class Samole02 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();
		IStudent stu2 = new Student();
		stu2.study();
		
	}
}
