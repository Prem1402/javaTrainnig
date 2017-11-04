package com.wipro.day1;

public class Test3 {
	
	static int i = test();
	
	static{
		System.out.println("sid1 "+i);
	}
	static int test(){
		System.out.println("test");
		return 10;
	}
	
	static int j = test();
	
	public static void main(String[] args) {

		System.out.println(i);
		System.out.println(j);
	}
	
	static{
		System.out.println("sid2");
	}

}
