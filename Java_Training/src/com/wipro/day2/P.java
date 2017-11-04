package com.wipro.day2;

class M{
	
	M(){
		System.out.println("M()");
	}
	
	{
		System.out.println("M-IIB1");
	}
	static{
		System.out.println("M-SIB");
	}
	M(int i){
		System.out.println("M(int)");
	}
}

class N extends M{
	
	N(){
		System.out.println("N()");
	}
	
	{
		System.out.println("N-IIB1");
	}
	static{
		System.out.println("N-SIB");
	}
	N(int i){
		System.out.println("N(int)");
	}
}

class O extends N{
	
	O(){
		System.out.println("O()");
	}
	
	{
		System.out.println("O-IIB1");
	}
	static{
		System.out.println("O-SIB");
	}
	O(int i){
		System.out.println("O(int)");
	}
	
}
class P {

	static{
		System.out.println("P-SIB");
	}
	
	public static void main(String[] args) {
		 //O o1 = new O();
		 System.out.println("***********************");
		 M m1 = new M();
		 System.out.println("***********************");
		 //N n1 = new N(20);
		 System.out.println("***********************");
	}
}
