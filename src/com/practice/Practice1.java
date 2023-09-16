package com.practice;

public class Practice1 extends Practice implements PracticeInterface {
	private int c =3;
	@Override
	public int add(int a, int b) {
		return a+b+c;
	}

}

interface PracticeInterface {
	default void method() {
		System.out.println("Default methods");
	}
	
	static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}