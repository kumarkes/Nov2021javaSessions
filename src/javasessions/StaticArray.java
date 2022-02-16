package javasessions;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {

		int a[] = new int[6];
		// lowest index = 0
		// highest index => length -1= 5
		// length = 6
		// array used to store multiple similar types of data/values
		// Size is fixed/static;
		//Default Values;
		//int = 0;
		//double=0.0;
		//char=space;
		//boolean=false;
		//string=null;
		//object=null;
		

		// 1. int Array;

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);

		System.out.println("=======For Loop Index Based==========");
		int len = a.length;
		for (int i = 0; i <= len - 1; i++) {
			System.out.println(a[i]);

		}

		System.out.println("=======For Each Loop==========");

		for (int j : a) {
			{
				System.out.println(j);

			}

		}
		System.out.println(a);// Hashcode Number/address
		System.out.println(Arrays.toString(a));

		// 2. Double Array
		System.out.println("================Double Array index based array===================");
		double d[] = new double[2];
		d[0] = 10.32;
		d[1] = 20.34;
		len = d.length;

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("================Double Array for each based array===================");
		for (double g : d) {
			System.out.println(g);

		}
		System.out.println(Arrays.toString(d));

		// 3.Char Array

		char c[] = new char[4];
		c[0] = 'a';
		c[1] = 'A';
		c[2] = '1';
		c[3] = '2';
		System.out.println("================Char Array for index based array===================");
		for (char f = 0; f < c.length; f++) {
			System.out.println(c[f]);
		}
		System.out.println("================Char Array for each based array===================");
		for (char e : c) {
			System.out.println(e);

		}
		System.out.println(Arrays.toString(c));

		// 4. String Array

		String string[] = new String[4];
		string[0] = "Keshav";
		string[1] = "Kumar";
		string[2] = "Singh";
		string[3] = "Rathore";

		System.out.println("================String Array for index based array===================");
		for (int i = 0; i < string.length; i++) {
			System.out.println(string[i]);

		}
		System.out.println(Arrays.toString(string));

		System.out.println("================String Array for each based array===================");

		for (String str : string) {
			System.out.println(str);

		}
		System.out.println(Arrays.toString(string));

		// 5. Object Array

		Object st[] = new Object[5];

		st[0] = "Keshav";
		st[1] = 30;
		st[2] = 'm';
		st[3] = 1000.34;
		st[4] = true;

		System.out.println("================Object Array for each based array===================");

		for (Object e : st) {
			System.out.println(e);

		}
		System.out.println(Arrays.toString(st));
		System.out.println("================Object Array for index based array===================");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i]);

		}
		System.out.println(Arrays.toString(st));
	}

}
