package com.wipro.day2;

abstract class abs1{
	
	abstract void test1();
	
	abstract void test2();
}
abstract class abs2 extends abs1{

	void test1(){
		
		System.out.println("Inside Abstract_Class Test1");
	}
}

class Abstract_Class extends abs2{
	
	void test2(){		
		System.out.println("Inside Abstract Class2 Test2");
	}
	
	public static void main(String argds[]){
		
		Abstract_Class ab1 = new Abstract_Class();
		ab1.test1();
		ab1.test2();
	}
	
}