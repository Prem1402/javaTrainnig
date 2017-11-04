package com.wipro.day2;

public class Final_Examples {
	
	final int i;
	
	void test(){
		//this.i=30;
	}
	
	public Final_Examples() {
		this.i=20;
	}
	
	public Final_Examples(int i){
		this.i=40;
	}
	
	{
		//this.i=10;
	}
	public static void main(String arg[]){
		
		Final_Examples fl = new Final_Examples();
		//f1(45);
	//	fl.i = 10;
		System.out.println(fl.i);
		
	}

}
