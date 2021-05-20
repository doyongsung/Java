package com.test;

import java.util.*;

public class Sample04 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		for(Integer i : al) {
			System.out.println(i);
		}
		
		
		List<Integer> al2 = new ArrayList<Integer>();
		List<Integer> al3 = new LinkedList<Integer>();
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1, "이순신");
		mp.put(2, "세종대왕");
		mp.put(3, "홍길동");
		for(Integer k : mp.keySet()) {//키가중복되지않은 리스트
			//.out.println(k);
			System.out.println(k + ", " + mp.get(k));
		}
		
		
		
		Set<Integer> set = mp.keySet(); //인티저타입
		Set<Map.Entry<Integer, String>> set2 = mp.entrySet(); // 전체의대한목록을 리턴
		Iterator ltr = set2.iterator();
		while(ltr.hasNext()) {
			Map.Entry<Integer, String> e = (Map.Entry<Integer, String>)ltr.next();
			System.out.println(e.getKey()+ ", " + e.getValue());
		}
		}
}
