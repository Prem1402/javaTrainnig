package com.wipro.day4;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Exception {

	static void test1() throws SQLException{
		
	}
	
	static void test2()throws FileNotFoundException{
		
	}
	
	public static void main(String[] args) {
		
		try{
		test1();
		test2();
		}
		
		catch(SQLException jq){
			
			System.out.println("Java SQL Exception");
			
		}
		
		catch(FileNotFoundException fe){
			System.out.println("File Not Found");
		}

	}

}
