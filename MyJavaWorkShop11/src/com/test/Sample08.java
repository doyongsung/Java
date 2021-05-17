package com.test;

public class Sample08 {

	public static void main(String[] args) {
		String msg1 = "이순신";
		String msg2 = "강감찬";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new StringBuffer("이순신");
		System.out.println(sb.capacity()); // 사이즈
		sb.append("강감찬"); // 뒤에서 계속 추가시켜줌
		sb.insert(3, "세종대왕"); // 인덱스번호 중간에 끼어들기가능
		sb.replace(1, 3, "안녕"); // 인덱스번호 안에있는 문자를 바꿔줌
		sb.delete(1, 3); //인덱스번호안에 문자 삭제
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
		
	}
}
