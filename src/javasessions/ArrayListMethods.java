package javasessions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> emplist = new ArrayList<String>();
		emplist.add("Keshav");
		emplist.add("Kumar");
		emplist.add("Male");
		emplist.add("Software Engineer");
		System.out.println(emplist);
		System.out.println(
				"=====================Printing from String Wrapper Class by For Each Loop====================");
		for (String a : emplist) {
			System.out.println(a);

		}
		Collections.sort(emplist);
		System.out.println(emplist);
		Collections.sort(emplist, Collections.reverseOrder());
		System.out.println(emplist);

		ArrayList<String> stList = new ArrayList<String>();
		stList.add("Sanjay");
		stList.add("Kumar");
		stList.add("Male");
		stList.add("Software Developer");
		System.out.println(stList);

		for (int i = stList.size() - 1; i >= 0; i--) {
			System.out.println(stList.get(i));
		}
		ArrayList<String> trList = new ArrayList<String>();
		trList.add("Rohit");
		trList.add("Ramesh");
		trList.add("Male");
		trList.add("Software Tester");
		System.out.println(trList);
		trList.addAll(stList);
		System.out.println(trList);

		ArrayList<Integer> ar = new ArrayList<Integer>();
		List<Integer> data = Arrays.asList(10, 20, 30);
		System.out.println(data);
		List<String> names = Arrays.asList("A","AA","AAA");
		System.out.println(names);
		
		int d[]=new int[3];//new Keyword
		int dd[]= {10,20,30,40,50,60};//int literal array
		int ddd[]= new int[] {1,2,3,4,5,6}; //new + literals
		System.out.println(ddd[5]);
		System.out.println(ddd.length);
		

	}

}
