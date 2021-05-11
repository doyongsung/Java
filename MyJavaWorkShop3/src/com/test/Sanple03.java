package com.test;

public class Sanple03 {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for(int j = 1; j < 10; j++) {
			System.out.println(j);
			System.out.println();
			for(int k = 1; k <= 9; k++) {
				System.out.println(j + "*" + k + "=" + (k * j));
			}
			
			System.out.println();
		}
		

	}

}
