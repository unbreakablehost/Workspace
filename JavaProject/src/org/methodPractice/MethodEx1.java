package org.methodPractice;

public class MethodEx1 {
	
	public static void main(String[] args) {
		
		System.out.println("*** Program starts ***");
		
		MethodEx1.testMethod();
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		MethodEx1.testMethod();

		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		
		MethodEx1.testMethod();

		System.out.println("7");
		System.out.println("8");
		System.out.println("9");		
		
		MethodEx1.testMethod();

		System.out.println("8");
		
		System.out.println("*** Program ends ***");
		
	}

	
	public static void testMethod() {
		
		System.out.println("Hello");
		System.out.println("Good morning");
		System.out.println("How are you?");
	}
	
}
