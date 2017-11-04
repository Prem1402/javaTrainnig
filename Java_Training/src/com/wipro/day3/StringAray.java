package com.wipro.day3;

import java.util.Arrays;

public class StringAray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,56,865,76,12,56,78,123,56};
		
		//Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		int i = Arrays.binarySearch(arr,120);
		System.out.println(i);

	}

}
