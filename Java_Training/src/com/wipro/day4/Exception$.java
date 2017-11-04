package com.wipro.day4;

import java.util.Scanner;

public class Exception$ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(1);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(age<=0)
			throw new Exception3("Age should be greated than Zero");
	}

}
