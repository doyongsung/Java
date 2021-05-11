package com.test;

public class Sample15 {

	public static void main(String[] args) {
		 String[][]score = {
				 {"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"}
				, {"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"}
				, {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"}
				, {"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"}
				, {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"}
			    
		 };
          
		 String[] score2 = 
			 {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
		 int corract = 0;
		  
		 for(int i = 0; i < score.length; i++) {
		     corract = 0;
		     for(int j = 0; j < score[i].length; j++) {
		    	 
		    	 if(score[i][j] == score2[j]) {
		    		 corract++;
		    	 }
		     }
		  System.out.println(corract);
		 System.out.println();
		 }
	}
}


