package com.wipro.day2;

public class B extends A{

	int j,i=100;
	
	void test2(){
		System.out.println("From Derived Class "+this.i+" From Base Class "+super.i);
		super.i = 800;
		System.out.println("From Base Class "+super.i);
	}
	public static void main(String[] args) {
	
		B b1 = new B();
		b1.test2();
		b1.test1();

		System.out.println(b1.i+" "+b1.j);
		
		b1.i=10;
		b1.j=20;
		System.out.println(b1.i+" "+b1.j);
		
		A a1 = new A();
		System.out.println("Calling base class "+ a1.i);
		
	}

}
