package com.test;
class Car {
	String Color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!");
	}	
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

public class CastingTest1 {
    public static void main(String[] args) {
    	Car car = null;
    	FireEngine fe = new FireEngine();
    	FireEngine fe2 = null;
    	
    	fe.water();
    	car = fe;
    	//car.water(); 컴파일 에러
    	fe2 =(FireEngine)car;
    	fe2.water();
    
		

	}

}
