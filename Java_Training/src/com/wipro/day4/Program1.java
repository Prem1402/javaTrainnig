package com.wipro.day4;

public class Program1 {
	
	static{
		System.out.println("Hello");
	}

	public String toString(){
		
		System.out.println("toString Method of Class");  //Oversiring toString Method
		return super.toString();
	}
	public static void main(String[] args) {
		
	/*	String s1 = "str";
		String s2 = "str";
		Object o1 = s1;
		Object o2 = s2;
		System.out.println(new Program1());
		System.out.println(s1);
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(o1.equals(o2));
		System.out.println(s1.hashCode()); // It depends on the contents not on the Objects
		System.out.println(s2.hashCode());
	
		String s3 = null;
		
		String s4 = "abc";
		s3 = null+"null";
		int i =5;
		//System.out.println(s3.length());
		//System.out.println(10+s4);
		String s5 = s1 + i;
		System.out.println(s5); */
		
	/*	String s1 = null;
		String s2 = s1+null;
		String s3 = null+s1;
		String s4 = "abc"+null;
		String s5 = s1+"xyz";
		String s6 = null+s1; // If s1 is null it will be treated as a String
		String s7 = s1+200;
		String s8 = 400+s1;
		//String s9 = null;
		//String s10 = null;
		
		
		
		System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s6+"\n"+s7+"\n"+s8); */
		
	/*	String s1 = "abcacCbc";
		String s2 = "012312456";
		String s3 = "abc abc abc abc";
		int i = s3.indexOf(" ");
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("ac"));
		System.out.println(s2.indexOf('3'));
		System.out.println(s1.lastIndexOf('b'));
		System.out.println(s3.lastIndexOf("abc",20)); 
		String spl[] = s3.split(" ");
		for(String s:spl)
			System.out.println(s); */
		
	/*	String str1 = "abc";
		String str2 = new String("abc");  // This will create a new Object instead of Pointing at old object
		//String str2 = "abc";
		
		System.out.println(str1+"\n"+str2);
		System.out.println(str1==str2);
		Program1 p1 = new Program1();
		System.out.println(p1.hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // Hashcode always depends on the content of the String whether we are creating a new object or pointing at the same object
		System.out.println(str1.equals(str2)); */
		
	/*	String str1 = "java";
		String str2 = "ja".concat("va"); // Concat will always create a new object equivalent to creating a new object where as "Ja"+"va" will not create a new object
		System.out.println(str1==str2); */
		
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("abc");		// Only one object will get created
		sb.append("abc");
		System.out.println(sb);
		
		String str1 = new String("xyz");
		str1.concat("abc");
		str1.concat("abc"); 			// 4 new objects will be created
		str1.concat("abc");
		System.out.println(str1);
		
		System.out.println(sb.length()+"\n"+sb.capacity());
			}

}
