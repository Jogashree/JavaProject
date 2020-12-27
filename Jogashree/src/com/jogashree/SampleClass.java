package com.jogashree;

public class SampleClass {
	int a=100;
	void method() {
		System.out.println(a);
		System.out.println("Welcome to Java");
	}

	public static void main(String[] args) {
		SampleClass s= new SampleClass();
		s.method();
		System.out.println(s.a);
		

	}

}
