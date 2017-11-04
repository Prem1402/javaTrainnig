package com.wipro.day3;

interface E{
	
	void test1(int i, int j);
}
public class F implements E{
	
	public void test(int i, double j){
		System.out.println("From Test 1");
	}
	
	public void test1(int i, int j){}

}
