package com.test.workshop3.doctor;

public class Surgeon extends Doctor{

	public Surgeon(String name) {
		super(name, "외과");
	}
	void performSurgery() {
		System.out.println("수술을 집도하다.");
	}
    
    
}