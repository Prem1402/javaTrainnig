package com.wipro.access;

import com.wipro.day2.AccessModifiers;

public class AccessNew extends AccessModifiers{

	public static void main(String[] args) {
			
		AccessModifiers am = new AccessModifiers();
	//	System.out.println(am.priv);
		System.out.println(am.pub);
	//	System.out.println(am.prot);
	//	System.out.println(am.i);
		
		System.out.println("*****************");
		
		AccessNew an = new AccessNew();
		System.out.println(an.prot);
		System.out.println(an.pub);
		//System.out.println(an.i);
		
	}

}
