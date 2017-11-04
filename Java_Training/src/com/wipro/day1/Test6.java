package com.wipro.day1;

public class Test6 {
	
	public static void main(String[]args){
	
		int[]x= new int[2];
		x = new int[4];
		
		int[]y = new int[3];
		x[0]=10;
		y[1]=100;
		x[1]=1000;
		
		//y=x;
		x=y;
		
		System.out.println("For X");
		for(int i:x)
			System.out.println(i);
		
		System.out.println("For Y");
		for(int i:y)
			System.out.println(i);
		
	}
}
