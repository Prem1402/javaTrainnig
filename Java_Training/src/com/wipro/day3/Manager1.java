package com.wipro.day3;

public class Manager1 {
	
	static void test1(A a1){
		System.out.println("Test1(A)");
	}
	
	static void test2(C c1){
		System.out.println("Test2(C)");
	}
	
	static D test3(){
		D d1 = new D();
		return d1;
	}
	
	static C test4(){
		return new C();
	}

	public static void main(String[] args) {

	//	test1(new C());
	/*	B c1 = new D();
		c1.test1();
		c1.test2();
		c1.test3();
		c1.test4(); */
		D d1 = new D();
		
		d1 = test3();
		D b1 =  (D) test4();
		
		System.out.println(d1);
		System.out.println(b1);
	}

}
