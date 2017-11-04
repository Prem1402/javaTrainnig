package com.wipro.day2;

public class Test1 {

	Test1(){
		System.out.println(" Default Canstructor");
	}
	
	void Test1(int i){
		System.out.println(" Parameterized Constructor");
	}
	
	{
		System.out.println(" IIB1 ");
	}
	
	{
		System.out.println(" IIB2 ");
	}
	
	public static void main(String args[]){
		
		Test1 t1= new Test1();
		t1.Test1(10);
		Test1 t2= new Test1();
		
	}
}
