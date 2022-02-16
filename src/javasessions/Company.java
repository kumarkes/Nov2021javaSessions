package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
	// WAF :
	// Name : getCompany
	// Input : companyName in String
	// Return : companyName,HeadQuarter,No Of Employees,Share Price,MD Of Company

	public Object[] getCompany(String companyName) {
		System.out.println("Details of company  " + companyName + " is :");

		Object info[] = new Object[5];
		if (companyName.equals("Accenture")) {
			info[0] = "Accenture";
			info[1] = "Pune";
			info[2] = 10000;
			info[3] = 1000000.90;
			info[4] = "Tom";
		} else if (companyName.equals("IBM")) {
			info[0] = "IBM";
			info[1] = "Chennai";
			info[2] = 20000;
			info[3] = 2000000.90;
			info[4] = "Sam";
		} else {
			System.out.println("Company Info not found");
		}

		return info;
	}

	// WAF :
	// Name : getProductList
	// Input : Company Name
	// Return : Product List
	public ArrayList<String> getProductList(String companyName) {
		System.out.println("Getting product list of :" + companyName);
		ArrayList<String> prodList = new ArrayList<String>();
		switch (companyName.toLowerCase()) {
		case "ibm":
			prodList.add("MacBook");
			prodList.add("Samsung");
			prodList.add("IPad");

			break;
		case "nokia":
			prodList.add("Laptop");
			prodList.add("Mobile");
			prodList.add("Device");

			break;
		case "oppo":
			prodList.add("Mobile");
			prodList.add("TV");
			prodList.add("Speaker");

			break;

		default:
			System.out.println("This company is not found " + companyName);
			break;
		}
		return prodList;

	}

	public static void main(String[] args) {
		Company com = new Company();
		Object comp[] = com.getCompany("NAN");
		System.out.println(Arrays.toString(comp));
		ArrayList<String> companyList = com.getProductList("NOKIA");
		System.out.println(companyList);
		System.out.println(companyList.size());

		// Printing indexed based for loop
		System.out.println("===================Printing indexed based for loop=================");
		for (int i = 0; i <= companyList.size() - 1; i++) {
			System.out.println("Printing the product list : " + companyList.get(i));
		}
		// Printing indexed based for each loop
		System.out.println("===================Printing indexed based for each loop=================");
		for (String strList : companyList) {
			System.out.println("Printing the product list : " + strList);

		}

	}

}
