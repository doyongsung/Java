package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg = "안녕하세요.반가워요.";
		char c = msg.charAt(1);
		System.out.println(c);
		String msg1 = "abcdefgABCD";
		char c2 = msg1.charAt(7);   //charAt(0) 몇번째 숫자,문자인지 알려줌
		System.out.println(c2);
		int n = (int)c2;
		System.out.println(n);
		String msg2 = "  반가워요  ";
		
		
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length()); // 문자,숫자가 몇번쨰까지 있는지.
		System.out.println(msg2.trim()); //trim 공백삭제
		System.out.println(msg1.startsWith("ab")); //startsWith 처음시작하는곳이 맞는지
		int n2 = 1234;
		String temp2 = String.valueOf(n2); //valueof 숫자를 문자로 바꿔줌      //int i = Integer.parseInt("100"); //"100을" 100으로 변환
        System.out.println(temp2 + 2);
        String msg3 = "ababc";
        String msg4 = msg3.replace("b", "c");   //replace b 를 c로 바꿔줌 
        System.out.println(msg4);
        String tel = "010-123-1234";
        System.out.println(tel.substring(0,3)); //substring 몇번째부터 몇번째 문자까지 나오는지 알려줌   
        System.out.println(tel.substring(4,6));
        System.out.println(tel.substring(3)); // 하나만하면 지정위치부터 끝까지
        char c3 = "방가워요".charAt(1);
        System.out.println(c3);
        
        
	
	}

}
