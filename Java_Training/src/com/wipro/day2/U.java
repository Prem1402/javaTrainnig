package com.wipro.day2;

class R{
	
	R(){
		System.out.println("Concst R");
	}
	static{
		System.out.println("Static Block for Class R");
	}
}

class S extends R{
	
	S(){
		//this();
		System.out.println("Concst S");
	}
	
	S(int i){
		this();
		System.out.println("");
	}
	
	
}

class T extends R{
	
	static{
		System.out.println("Static block from Class T");
	}
}

/*
class T extends R{
	
	T(){
		// If nothing is here then here then by default there will be super() and 
		// it will call its base class constructor automatically
		System.out.println("Class T Constructor");
	}
	
	{
		System.out.println("IIB from Class T");
	}
} */

class U{
	
	static{
		System.out.println("Static block from class U");
	}
	
	public static void main(String[] args) {
	
		//S t1 = new S();
	}

}
