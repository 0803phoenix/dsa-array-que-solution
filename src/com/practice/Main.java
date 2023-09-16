package com.practice;

public class Main {
	public static void main(String[] args) {
		Practice1 newPractice = new Practice1();
		Practice newPractice1 = new Practice();
		newPractice.setQueNumber(2);
		newPractice.setAnsNumber(2);
		
		System.out.println(newPractice.getAnsNumber());
		System.out.println(newPractice.getQueNumber());
		System.out.println(newPractice.add(2, 3));
		System.out.println(newPractice1.add(2, 5));
		newPractice.method();
		PracticeInterface.staticMethod();
		
	}
}
