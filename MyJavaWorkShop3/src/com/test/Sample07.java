package com.test;

public class Sample07 {

	public static void main(String[] args) {
		// collection, �÷���
		// List...
		// index, ÷��...���� ����Ҽ� ����.
		// List, dictionary.
		// for => foreach
		int a = 10;
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(int j : arr) {
			System.out.println(j);
		}
		
		int k = 0;
		int sum = 0;
		while(k <= 10) { 
	      // System.out.println(k);
			sum += k;
			System.out.println(sum);
	       k++;
	     
		}
		System.out.println(sum);
		
		

	}

}
