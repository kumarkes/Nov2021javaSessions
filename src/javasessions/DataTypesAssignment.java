package javasessions;

import java.lang.reflect.Array;

public class DataTypesAssignment {

	public static void main(String[] args) {
		// 1. Write a Java program to print 'Hello' on screen and then print your name
		// on a separate line.
		// Expected Output :
		// Hello
		// Naveen K

		System.out.println("=================== Assignment 1 =======================");

		System.out.println("Hello");
		System.out.println("Keshav");

		// 2. Write a Java program to print the sum of two numbers.
		// Test Data: 74 + 36 Expected Output :110

		System.out.println("=================== Assignment 2 =======================");
		byte a = 74;
		byte b = 36;
		System.out.println("Addition of a+b is : " + (a + b));

		// 3. Write a Java program to divide two numbers and print on the screen.
		// Test Data : 50/3 Expected Output : 16
		System.out.println("=================== Assignment 3 =======================");
		byte c = 50;
		byte d = 3;
		System.out.println("Division of c/d is : " + (c / d));
		// 4. Write a Java program to print the result of the following operations.
		// Change your test data accordingly.
		// Test Data:a. -5 + 8 * 6 b. (55+9) % 9 c. 20 + -3*5 / 8 d. 5 + 15 / 3 * 2 - 8
		// % 3
		System.out.println("=================== Assignment 4 - Test Data:a. -5 + 8 * 6 =======================");
		byte e = 5;
		byte f = 8;
		byte g = 6;
		byte h = 55;
		byte i = 9;
		byte j = 20;
		byte k = 3;
		byte l = 2;
		byte m = 15;

		System.out.println("Result of -5+8*6 is : " + (-e + f * g));
		System.out.println("=================== Assignment 4 - Test Data:b. (55+9) % 9 =======================");
		System.out.println("Result of (55+9)%9 is : " + ((h + i) % i));
		System.out.println("=================== Assignment 4 - Test Data:c. 20 + -3*5 / 8 =======================");
		System.out.println("Result of 20 + -3*5/8 is : " + (j + (-k * (e / f))));
		System.out.println(
				"=================== Assignment 4 - Test Data:d. 5 + 15 / 3 * 2 - 8%3 =======================");
		System.out.println("Result of 5 + 15 / 3 * 2 - 8 % 3 is : " + (e + (m / k) * l - (f % k)));

		// 5. Write a Java program to compute the specified expressions and print the
		// output. Go to the editor
		// Test Data://((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) //Expected Output
		// 2.138888888888889

		float n = 25.5f;
		float o = 3.5f;
		float p = 40.5f;
		float q = 4.5f;

		System.out.println(
				"=================== Assignment 5 - //Test Data://((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) =======================");
		System.out.println("Result of ((n*o-o*o)/(p-q)) is : " + (n * o - o * o) / (p - q));

		// 6. Try to concat "Hello Selenium" with a character 't'.

		String string = "Hello Selenium";
		char newchar = 't';
		System.out.println(
				"=================== Assignment 6 - Try to concat \"Hello Selenium\" with a character 't'. =======================");

		System.out.println("Concatination of Hello Selenium is :" + string + newchar);

		// 7. Create three int variables having values like : 100, 200, 3400. Add them
		// and concatenate and generate this output String :
		// "Your Total amount is. 3700".
		String string1 = "Your Total amount is.";
		short r = 100;
		short s = 200;
		short t = 3400;
		System.out.println(
				"=================== Assignment 7 - Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : \r\n"
						+ "		//\"Your Total amount is. 3700\". =======================");

		System.out.println("Print :" + string1 + (r + s + t));

		// 8. What should be the output for : byte b3 = 065;

		byte b3 = 065;

		System.out.println(
				"=================== Assignment 8 - The output for : byte b3 = 065 is; =======================");

		System.out.println("The output for : byte b3 = 065 is :" + b3);

	}

}
