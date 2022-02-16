package javasessions;

import java.util.ArrayList;

public class ArrayListAssignment {

	// WAF:
	// Name : arrayListColorPrinting
	// Input Data: Color(String)
	// Print the collection

	public void arrayListColorPrinting() {
		System.out.println("Entering into the color printing methods ");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Green");
		arrayList.add("White");
		arrayList.add("Black");
		arrayList.add("Blue");
		arrayList.add("Yellow");
		arrayList.add("Red");
		System.out.println(arrayList);
		int num = arrayList.size();
		System.out.println(arrayList.size());
		for (int i = 0; i <= num - 1; i++) {
			System.out.println(arrayList.get(i));
		}
	}

	public static void main(String[] args) {
		ArrayListAssignment ala = new ArrayListAssignment();
		ala.arrayListColorPrinting();

	}

}
