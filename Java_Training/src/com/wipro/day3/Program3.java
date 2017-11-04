package com.wipro.day3;

public class Program3 {
	
	public static void main(String args[]){
		
	/*	B b1 = new D();
		C c1 = (C) b1;
		System.out.println(c1);
		
		C c2 = new C();
		D d1 = (D) c1;
		System.out.println(d1); */
		
		//A a1 = new D();
		A a1 = new A();
		
		B b1 = (B) a1; // This will throw class cast exception
		
	/*	B b1 = (B)a1;
		C c1 = (C)a1;
		D d1 = (D)a1; */
	}

}
