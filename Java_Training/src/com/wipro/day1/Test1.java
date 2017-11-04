package com.wipro.day1;


//Two classes files will me generated
public class Test1 {
	
	static int j;
	static int k=j;
	static int i = 10;
	
	static{
		System.out.println("Inside Test1 Static Block");
	}
	
	public static void main(String[]args){
		System.out.println("Inside Test1 Main "+ Test1.i);
		System.out.println("Inside Test1 Main "+ i);
		
	}
}
	
class Test2{
	
	static{
		System.out.println("Inside Test2 Static Block 1");
	}
	
	public static void main(String args[]){
		
		System.out.println("Inside Test2 Main"+ Test1.i);
		//Test1.main(null);
	}
	
	static{
		
		System.out.println("Inside Test2 Static Block 2");
	};
}

