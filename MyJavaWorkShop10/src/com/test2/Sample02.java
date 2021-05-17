package com.test2;

import java.io.IOException;

public class Sample02 {
	void method1() throws IOException{//throws Exception{ //throw(s) Exception ex)에러를 다음으로 넘김  오류가연속으로 나올때
//		try {
//		int a = 10/0;
		throw new IOException(); //throw  
//		}catch(Exception ex) {
			
//		}
//	}
//	void method2() throws IOException {
//		method1();
//	}
//	void method3() {
//		method2();
//	}
//
//	public static void main(String[] args) {
//		Sample02 obj = new Sample02();
//		try {
//		obj.method3();
//		}catch(Exception ex) {
//		System.out.println("Exit");
//		}
}
}