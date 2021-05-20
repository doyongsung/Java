package com.test;

import java.util.*;

public class Sample02 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("이순신");
		al.add("강감찬");
		al.add(12.5);
		al.add(false);
		al.set(0, "세종대왕"); // 몇번째에 위치시키는지
		Object obj = al.get(0);
//		System.out.println(obj.getClass().getName());   //객체의 대한 타입을 알수있음. 인티져
		Object obj2 = al.get(1);
//		System.out.println(obj2.getClass().getName()); //String
		al.size(); //크기
		for(int inx = 0; inx < al.size(); inx++) {
			Object o = (al.get(inx));
			System.out.println(o.toString());
		}
		HashSet h = new HashSet();  //중복삭제
		h.add("홍길동");
		h.add("이순신");
		h.add("홍길동");
		
		Iterator ltr = h.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
	}

}
