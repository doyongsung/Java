package com.test;

import java.util.*;

class Animal {
	void breathing() {
		System.out.println("Animal Breathing");
	}
}
class Dog extends Animal {
	void breathing() {
		System.out.println("Dog Breathing");
	}
}
public class Sample14 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Animal());
		al.add(new Dog());
		
		for(int inx = 0; inx <al.size(); inx++) {
			Object obj = al.get(inx);
			Animal a = (Animal)obj;
			a.breathing();
		}
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			Animal a = (Animal)obj;
			a.breathing();
			
		}
		ArrayList al2 = new ArrayList();
		al2.add(new Dog());   // Object o = new Dog();
		al2.add(new Animal());// Object o2 = new Animal();
		Object o =new Dog();
		Object o2 = new Animal();
		

	}
}
