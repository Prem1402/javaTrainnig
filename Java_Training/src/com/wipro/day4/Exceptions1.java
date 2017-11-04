package com.wipro.day4;

public class Exceptions1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Exception Example");
		
		try{
			
			int i=10;
		}
		catch(ArithmeticException ae){
			
			System.out.println("Divide by Zero Error");
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		
		

	}

}
