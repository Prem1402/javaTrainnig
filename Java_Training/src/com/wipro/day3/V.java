package com.wipro.day3;


class U{
	
	void test(){
		System.out.println("From U");
	}
	
	static void test1(){
		System.out.println("From U Static");
	}
}

class V extends U{
	
	void test(){
		
		System.out.println("From V");
	}
	
	static void test1(){
		
		System.out.println("From V Static");
	}
	
	public static void main(String args[]){
		
	/*	V obj = new V();
		obj.test();
		obj.test1();
		*/
		
		U obj1 = new V();
		obj1.test();
		obj1.test1(); // Static method depends on the type of reference variable ***U obj1***
						// Non Static method depends upon the type of Object Variable ***new V()***
	}

}
