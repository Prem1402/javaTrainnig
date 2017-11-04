package com.wipro.day4;

public class ClassForName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try{
			Class.forName("com.wipro.day4.Program1");
		}
		catch(ClassNotFoundException cf){
			System.out.println("Class Not Found");
		}

	}

}
