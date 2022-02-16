package ConstructorConcept;

import java.util.ArrayList;

//We will not use Main Method here. We will call this class from different class

public class Company {

	String name;
	int empCount;
	ArrayList<String> catList;
	boolean isFunded;
	double sharePrice;
	
	public void getCompInfo()
	{
		System.out.println("Getting Company Info");
	}
	
	public String getCompPlans()
	{
		System.out.println("Getting Company Plans");
		return "2022 Plans";
	}

	public Company(String name) {
		this.name = name;
	}

	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}

	public Company(String name, int empCount, ArrayList<String> catList) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
	}

	public Company(String name, int empCount, ArrayList<String> catList, boolean isFunded, double sharePrice) {
		this.name = name;
		this.empCount = empCount;
		this.catList = catList;
		this.isFunded = isFunded;
		this.sharePrice = sharePrice;
	}
}
