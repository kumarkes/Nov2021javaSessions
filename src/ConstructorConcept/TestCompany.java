package ConstructorConcept;

import java.util.ArrayList;

public class TestCompany {

	public static void main(String[] args) {
		Company c1=new Company("Accenture");
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		System.out.println(c1.catList);
		
		Company c2=new Company("TCS",100);
		System.out.println(c2.name);
		System.out.println(c2.empCount);
		System.out.println(c2.sharePrice);
		
		ArrayList<String> catList = new ArrayList<String>();
		catList.add("Fashion");
		catList.add("Electronics");
		catList.add("Sports");
		Company c3=new Company("Walmart",200,catList,true,200.22);
		System.out.println(c3.name);
		System.out.println(c3.empCount);
		System.out.println(c3.isFunded);
		System.out.println(c3.catList);
		System.out.println(c3.sharePrice);
	}

}
