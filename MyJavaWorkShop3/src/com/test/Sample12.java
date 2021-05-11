package com.test;

public class Sample12 {

	public static void main(String[] args) {
		
	     int[][] score = {
				{ 100, 100, 100}
			,   { 20,  20 , 20 }
			,   { 30,  30 , 30 }
			,   { 40,  40 , 40 }
		};
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
			}
		}
		
		for (int[] tmp : score) {
			for(int i : tmp) {
				sum += i;
			}
		}
		System.out.println("sum="+sum);
//		
		int[][] arr5 = {{1,2},{3,4}};
		//System.out.println(arr5.length);
//		
		for(int i = 0; i <arr5.length; i++) {
		 // arr5[0] = {1,2}
		 // arr5[1] = {3,4}
		   for(int j =0; j < arr5[i].length; j++) {
			   System.out.println(arr5[i][j]);
			   System.out.println(i + "," + j);
		   }
		}
		//arr5[0][0];
//		

	}

}
