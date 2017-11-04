package com.wipro.day2;

import java.util.Arrays;

public class ArrayExample {
	
	static void test(int[]x){
		
		for(int i:x)
			System.out.println(i);
	}
	
	static void test2(int y[]){
		y[0]=20;
	}
	public static void main(String args[]){
		
	//	test(new int[]{10,20}); // This is known as Anonymous Array, as we are not giving any variable name
								// and also if the values are only for one time use.
	
		int[]x=new int[2];
		x[0]=90;
		x[1]=10;
		//test2(x[]);
		
		System.out.println(x[0]+" "+x[1]);
		
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
	}

}
