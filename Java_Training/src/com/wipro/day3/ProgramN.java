package com.wipro.day3;

/*abstract class O{
	abstract protected void test();
}

class P extends O{
	
	void test(){  // Cannot compile, we can't reduce the visibility we can strengthen it. As it is defined as proteced
		
		System.out.println("Abc");
	}
} */

interface Q{
	
	void test();
}

class R implements Q{
	
	void test(){ // Cannot compile, we can't reduce the visibility we can strengthen it. As it is defined as proteced
		
		
	}
}