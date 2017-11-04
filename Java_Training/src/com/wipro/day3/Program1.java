package com.wipro.day3;

public class Program1 {
	
	 //Widening Examples (Type Casting)

	static void test(double d){
		System.out.println(d);
	}
	
	static void test(int i){
		System.out.println(i);
	}
	
	static double test(){
		int i=10;
		return i;
	}
	public static void main(String[] args) {
		
		  int i=10;
		  //double d = i;
		  //System.out.println(d);
		  test(i);
		  
		 
	}
}