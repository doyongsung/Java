package com.test;

import java.util.Scanner;

public class test2 {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);		
	}

	public static void main(String[] args) {
		
		while(true) {
		System.out.printf("Computer Science 성적을 입력하세요.: ");
		float a1 = getUserInput();
		System.out.printf("Java Programming 성적을 입력하세요.: ");
		float a2 = getUserInput();
		System.out.printf("공학수학 성적을 입력하세요.: ");
		float a3 = getUserInput();
		System.out.printf("오페라의 이해 성적을 입력하세요.: ");
		float a4 = getUserInput();
		System.out.printf("배드민턴 성적을 입력하세요.");
		float a5 = getUserInput();
		System.out.println("==============================");
		boolean a1Check = (a1 >= 2.5)? true : false;
		boolean a2Check = (a2 >= 2.5)? true : false;
		boolean a3Check = (a3 >= 2.5)? true : false;
		boolean a4Check = (a4 >= 2.5)? true : false;
		boolean a5Check = (a5 >= 2.5)? true : false;
		boolean allCheck = a1Check && a2Check && a3Check && a4Check && a5Check;
		
		float score = (a1 + a2 + a3 + a4 + a5) / 5;
		System.out.printf("평점은 %s점 입니다.", score);
		System.out.println();
		
	   if(score >= 3.7) {
		   if(allCheck) {
			   System.out.println("다음 학기 장학금 대상자 입니다.");
		   }
	   }

	}

}
}