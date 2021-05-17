package com.test;

import java.util.*;

public class Sample12 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // 내가집어넣는 순서의 구조를 쓸수있는ㄴ   
		//List al2 = new ArrayList(); 상위타입
		al.add(100);
		al.add(200);
		al.add(300);
		
		for(int inx = 0; inx < al.size(); inx++) { //size 객체갯수
			int a = (int)al.get(inx);
			System.out.println(a);
		}
		Iterator itr = al.iterator();    //컬렉션구조에서 대부분갖고있음
		while(itr.hasNext() ) {
			System.out.println(itr.next());
		}
		
		LinkedList ll = new LinkedList();
		ll.add(300);
		ll.add(400);
		ll.add(500);
		
		Iterator itr2 = ll.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
//		al.get(0);
//		al.get(1);
//		al.get(2);
	}
}
