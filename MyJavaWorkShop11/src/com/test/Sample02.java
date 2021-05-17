package com.test;

class MyCustomeException extends Exception {
	MyCustomeException(String msg) {
		super(msg);
	}
}

public class Sample02 {

	public static void main(String[] args) {
		int a = 10;
		if(a == 10) {
			try {
			throw new MyCustomeException("a == 10¿Ã ∞∞¥Ÿ.");
		}  catch(MyCustomeException ex) {
			System.out.println(ex.getMessage());
		}
		
		}
	}

}
