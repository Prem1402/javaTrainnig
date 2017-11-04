package com.wipro.day2;

class E {
	
	int i;
	static int j;
	void test1(){
		System.out.println("From class E method Test1");
	}
	
	static void test2(){
		System.out.println("From class E method Test2");
		F.test4();
	}
	static{
		System.out.println("From class E static Block");
	}
}

class F extends E{
	
	static int n;
	int m;
	static{
		System.out.println("From class F static Block");
	}
	
	void test3(){
		
		System.out.println("From class F method test3");
	}
	static void test4(){
		
		System.out.println("From class F static method Test4");
	}
}

public class G {

	static{
		
		System.out.println("From class G static block");
	}
	
	public static void main(String[] args) {
		
	//	E.test2();
		F.test2();
	/*	F.test4();
		E.j=10;
		F.n=20;
		
		E e1 = new E();
		e1.i=30;
		e1.test1();
		
		F f1 = new F();
		f1.i=40;
		f1.m=50;
		f1.test1();
		f1.test3(); */
		
		
	}

}
