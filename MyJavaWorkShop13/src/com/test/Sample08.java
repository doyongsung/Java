package com.test;

import java.util.*;

public class Sample08 {
	//바운드 연결이된것 컴파일 체결
	static void test(ArrayList<?> al) { // <?> 무슨타입인지 다선언
		for(Object o : al) {
			System.out.println(o);
		}
	}
//	static void test2(? a) { 에러
//		
//	}

	public static void main(String[] args) {
	//	ArrayList<?> al = new ArrayList<Integer>();  //     <?>    integer , String. int 맘대로집어넣을수있음 
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
	}

}
