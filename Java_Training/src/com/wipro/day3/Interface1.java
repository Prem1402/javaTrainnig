package com.wipro.day3;

interface N{
	
	public abstract void test1();
}

class M{
	
}

class Interface1 extends M implements N {
	
	public void test1(){
		
		System.out.println("Method test1() Inherited from Interface N");
	}
	
	public static void main(String args[]){
		
		Interface1 i1 = new Interface1();
		i1.test1();
	}
}