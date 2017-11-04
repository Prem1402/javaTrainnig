package com.wipro.day3;

class A1{
	
	void test(){
		System.out.println("Test1");
	}
}

class A2 extends A1{
	
	void test(){
		System.out.println("Test2");
	}
}

class A3 extends A2{
	
	void test(){
		System.out.println("Test3");
	}
}

class Execute extends A3{
	
	void exec(A1 a1){
		a1.test();
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		
		Execute e = new Execute();
		e.exec(new A1());
		e.exec(new A2());
		e.exec(new A3());

	}

}
