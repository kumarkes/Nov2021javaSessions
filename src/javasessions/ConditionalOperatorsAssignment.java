package javasessions;

import java.util.Scanner;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		System.out.println("Enter Second Number");
		int b = scan.nextInt();
		System.out.println("Enter Third Number");
		int c = scan.nextInt();
		if (a >= b && a >= c) {
			System.out.println("a is the largest number " + a);
		} else if (b >= a && b >= c) {
			System.out.println("b is the largest number " + b);
		} else if (c >= a & c >= b) {
			System.out.println("c is the largest number " + c);
		} else {
			System.out.println("All numbers are equal");
		}

		System.out.println("Enter First Number Positive/Negative");
		int d = scan.nextInt();
		if (d > 0) {
			System.out.println("Entered number is the positive number :" + d);
		} else if (d < 0) {
			System.out.println("Entered number is the negative number :" + d);
		} else {
			System.out.println("Entered number is equal to Zero :" + d);
		}

	}

}
