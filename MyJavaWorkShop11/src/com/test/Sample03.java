package com.test;
class Person {
	long id;
	Person(long id){
		this.id = id;
	}                        
	//오버라이딩      //id값을비교
	public boolean equals(Object obj) {
		      //null =true
		if((obj != null) && obj instanceof Person) {
			Person p = (Person)obj;
			return this.id == p.id;
		}
		return false;
	}
}
public class Sample03 {

	public static void main(String[] args) {
		Person p = new Person(10);
		Person p2 = new Person(20);
		boolean check = p.equals(p2);
		System.out.println(check);
	

	}

}
