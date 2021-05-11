package com.test;

import java.util.Scanner;

public class Sample10 {
	public static float getUserInput() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		return Float.parseFloat(inputString);		
	}
	public static void main(String[] args) {
		
		
		while(true) {
		System.out.printf("Computer Science 성적을 입력하세요 :");
		float a1 = getUserInput();
		System.out.printf("Java Programming 성적을 입력하세요 :");
		float a2 = getUserInput();
		System.out.printf("공학수학 성적을 입력하세요 :");
		float a3 = getUserInput();
		System.out.printf("오페라의 이해 성적을 입력하세요 :");
		float a4 = getUserInput();
		System.out.printf("배드민턴 성적을 입력하세요 :");
		float a5 = getUserInput();
		System.out.println("==============================");
		boolean a1Check = (a1 >= 2.5)? true : false;
		boolean a2Check = (a1 >= 2.5)? true : false;
		boolean a3Check = (a1 >= 2.5)? true : false;
		boolean a4Check = (a1 >= 2.5)? true : false;
		boolean a5Check = (a1 >= 2.5)? true : false;
		boolean allCheck = a1Check && a2Check && a3Check && a4Check && a5Check;
		
		float Average = (a1 + a2 + a3 + a4 +a5) /5;
		 System.out.printf("당신의 평점은  %s 입니다%n.", + Average);
		 if(Average >= 3.7f) {
			 if(allCheck) {
		         System.out.println("다음 학기 장학금 대상자 입니다.");	
			 }
				
			 
		 }
//		 if(Average < 2.5f){
//			 System.out.printf("당신의 평점은  %s 입니다.", + Average);	
//			   System.out.println("과락입니다");
//			    
//		}else if(Average > 3.6f){
//			System.out.printf("당신의 평점은  %s 입니다.", + Average);	
//				System.out.println("장학생입니다");
//			    
//		}else
//		    System.out.printf("당신의 평점은  %s 입니다.", + Average);	
//	
	 	
		
		}

	}
}