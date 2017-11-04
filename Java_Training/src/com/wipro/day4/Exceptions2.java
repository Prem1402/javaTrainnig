package com.wipro.day4;

import java.util.Scanner;

public class Exceptions2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//System.out.println(1);
		String s1= in.nextLine();
		
		try{
		//	System.out.println(1);
		//	int i = Integer.parseInt(s1);
		//	int k = i/0;
			//System.out.println(k);
			//return ;		// If return is there then also it will go to finally as Finally priority is more
		}
		//Try statements can also be empty Ex: Try{}
		
		/*catch(NumberFormatException ne){
			System.out.println("Unable to convert to Integer");
		} */
		
		 catch(ArithmeticException ae){
			System.out.println("Divide by Zero");
			int j = 5/0;
		} 
		
		finally{
			System.out.println("Program completed");
		}

	}

}
