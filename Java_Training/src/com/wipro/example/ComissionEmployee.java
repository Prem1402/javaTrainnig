package com.wipro.example;

public class ComissionEmployee {

	/**
	 * @param args
	 */
	
	String firstname;
	String lastname;
	String ssc;
	double comission;
	double grossSales;

	public ComissionEmployee(String firstname, String lastname, String ssc) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.ssc = ssc;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSsc() {
		return ssc;
	}

	public void setSsc(String ssc) {
		this.ssc = ssc;
	}

	public double getComission() {
		return comission;
	}


	public void setComission(double comission) {
		this.comission = comission;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	double earnings (double d1, double d2){
		return d1*d2;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
