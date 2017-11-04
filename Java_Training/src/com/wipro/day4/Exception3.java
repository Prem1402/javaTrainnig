package com.wipro.day4;

public class Exception3 extends ArithmeticException{

	public Exception3(){
	}
	
	public Exception3(String msg){
		super(msg);
		System.out.println("Error");						// Super class of Exception is Arithmetic Exception
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
