package com.beauce.tutorial.winterbe.java8.defaultmethod;

interface A{
	void doSomething();
	default int sum(int a, int b){
		return a + b;
	}
}

public class DefaultMethodTest {
	public static void main(String[] args) {
		System.out.println("default method test");
		A a = new A(){
			@Override
			public void doSomething() {
				System.out.println("do something");
			}
		};
		System.out.println("Sum: " + a.sum(1, 2));
	}
}
