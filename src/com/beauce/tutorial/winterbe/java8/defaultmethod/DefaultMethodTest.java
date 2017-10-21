package com.beauce.tutorial.winterbe.java8.defaultmethod;

interface A{
	void doSomething();
	default int sum(int a, int b){
		return a + b;
	}
}

interface B extends A{
	void doOtherThings();
	default int diff(int a, int b){
		return a - b;
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
		
		B b = new B(){
			@Override
			public void doSomething() {
				System.out.println("do something");
			}
			@Override
			public void doOtherThings() {
				System.out.println("do other thing");
			}
		};
		System.out.println("Sum: " + a.sum(1, 2));
		System.out.println("Diff:" + b.sum(1, 2) + "/" + b.diff(5, 3));
	}
}
