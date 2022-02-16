package javasessions;

import java.util.Arrays;

public class ArrayAssignment {

	public static void main(String[] args) {

		// Question 1: Write a program to print the following pattern using for loop:

		// 00 01 02 03 04 05 06 07 08 09
		// 10 11 12 13 14 15 16 17 18 19
		// 20 21 22 23 24 25 26 27 28 29
		// 30 31 32 33 34 35 36 37 38 39
		System.out.println("===========================Print Array Pattern Loop ====================");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i);
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();

		}
		// Question 2: Write a program to create a static Array, having following
		// cricket data:

		System.out.println("===========================Print static Array Value====================");
		Object obj[] = new Object[7];
		obj[0] = "Keshav";
		obj[1] = 30;
		obj[2] = "Delhi Daredevils";
		obj[3] = "05/01/1991";
		obj[4] = 'M';
		obj[5] = 50.50;
		obj[6] = true;

		System.out.println("===========================Print from for each loop====================");
		for (Object a : obj) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(obj));
		System.out.println("===========================Print from for loop====================");
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
		// System.out.println("===========================Print from while
		// loop====================");
		// int k = obj.length;
		// System.out.println(k);
		// while (k > 0) {

		// System.out.println(obj[k]);
		// k--;
		// System.out.println("Final Value is " + k);
		// }
		// 3: Try to print the following pattern on the console:
		System.out.println("===========================Print n=4,3,2,1,0 Pattern ====================");
		char char1 = 'n';
		for (int i = 4; i >= 0; i--) {
			System.out.println(char1 + "=" + i);

		}
	}
}
