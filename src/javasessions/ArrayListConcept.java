package javasessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// Array List is a type of collection
		// Collection means to store value dynamically
		// Dynamic Array
		// vc = Virtual Capacity :- By Default java gives 10 virtual capacity. After
		// filling all 10 index by default virtual capacity
		// will be increased by 10/2 = 5 then 15/2 then 22/2 and keep on
		// pc = Physical Capacity :- obj.size() always gives the count of physical
		// capacity not virtual capacity

		// Object of Arraylist
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println((ar.size()));
		ar.add(100);
		System.out.println((ar.size()));
		ar.add(200);
		System.out.println((ar.size()));
		ar.add("Keshav");
		ar.add('m');
		System.out.println((ar.size()));
		ar.add(300);
		System.out.println(ar.get(4));
		ArrayList<Object> ar1 = new ArrayList<Object>(20);// vc = 20 next time 20/2 = 10 then 30/2 then 45/2....
		ArrayList<Object> ar2 = new ArrayList<Object>(5);// vc = 5 next time 5+5/2= 7 then 7 + 7/2 = 7+3= 10 ....
		ar2.add(100);// 0
		ar2.add(100);// 1
		ar2.add(null);// 2
		ar2.add(null);// 3
		System.out.println(ar2.size());// 4
		System.out.println(ar2.get(1));// 100
		System.out.println(ar2.get(2));// 500
		System.out.println(ar2.get(3));// 1100
		ar2.add(4, 200);// 4
		System.out.println(ar2.get(4));// 200
		ar2.add(5, 500);// 5
		System.out.println(ar2.get(5));// Indexoutofboundexception
		ar2.add(2, 500);// 500
		ar2.add(3, 1100);// 1100
		System.out.println(ar2.get(2));// 500
		System.out.println(ar2.get(3));// 1100

		ArrayList<String> prod = new ArrayList<String>();
		prod.add("A");
		prod.add("B");
		prod.add("C");
		prod.add("D");
		prod.add("E");

		System.out.println(prod.size());
		System.out.println(prod.get(3));
		prod.remove(3);
		System.out.println(prod.size());
		System.out.println(prod.get(3));

		// int ArrayList
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(80);

		ArrayList<Double> marks1 = new ArrayList<Double>();
		marks1.add(45.40);

		ArrayList<String> marks2 = new ArrayList<String>();
		marks2.add("Keshav");
		marks2.add("Keshav");
		marks2.add("Keshav");
		System.out.println(marks2);
		System.out.println(
				"=====================Printing from String Wrapper Class by For Each Loop====================");
		for (String a : marks2) {
			System.out.println(a);

		}

		ArrayList<Object> marks3 = new ArrayList<Object>();
		marks3.add("Keshav");
		marks3.add(123);
		marks3.add('M');
		marks3.add(60.80);
		marks3.add(true);
		System.out.println("Size of marks3 Is :" + marks3.size());

		System.out.println("=====================Printing from Index Based For Loop====================");
		for (int i = 0; i < marks3.size(); i++) {
			System.out.println(marks3.get(i));
		}
		System.out.println("=====================Printing from For Each Loop====================");
		for (Object a : marks3) {
			System.out.println(a);
			if (a.equals('M')) {
				System.out.println("Employee is Male");
			}

		}
		System.out.println(marks3);

	}

}
