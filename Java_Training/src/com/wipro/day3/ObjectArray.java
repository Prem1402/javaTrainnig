package com.wipro.day3;

import java.util.Arrays;

public class ObjectArray implements Comparable{

	int i=10;
	ObjectArray(int i){
	//	System.out.println(i);
		this.i=i;
	}
	
 	public String toString(){
		 //System.out.println("Object Arrays to toString()");
		return "i: "+i;
	} 
	
	public int compareTo(Object obj){
		
		ObjectArray ob = (ObjectArray) obj;
		return i-ob.i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectArray[]x = new ObjectArray[6];
	//	System.out.println(x[0]);
	//	System.out.println(x[1]);
		
		x[0] = new ObjectArray(90);
		x[1] = new ObjectArray(9);
		x[2] = new ObjectArray(19);
		x[3] = new ObjectArray(23);
		x[4] = new ObjectArray(95);
		x[5] = new ObjectArray(21);
		
		//System.out.println(x);
		//System.out.println(Arrays.toString(x));
		
		 /*System.out.println(x[0].i);
		System.out.println(x[1].i);
		
		System.out.println("***"+x[1]); */
		
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));

	}

}