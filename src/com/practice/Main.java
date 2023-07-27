package com.practice;

public class Main {
	public static void main(String[] args) {
		String s = "ab";
		String goal = "ba";
		buddyStrings(s, goal);
	}
	public static boolean buddyStrings(String s, String goal) {
		char [] sArray = s.toCharArray();
	     char [] goalArray = goal.toCharArray();

	     for(int i=0; i<sArray.length; i++){
	         for(int j=0 ; j<goalArray.length; j++){
	             if(sArray[i] == goalArray[j]){
	                 char temp = goalArray[j];
	                 goalArray[j+1] = goalArray[j];
	                 goalArray[j] = temp;
	             }
	         }
	     }  
		
		return false;
	}
}
