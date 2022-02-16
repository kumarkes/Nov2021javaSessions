package javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {

		// 1. WAP to Print "I am Batman" 5 times
		System.out.println("=================== Assignment 1 =======================");
		for (int i = 0; i <= 4; i++) {
			System.out.println("I am Batman");
		}

		// 2. WAP to Print "I am Batman(1-5)" 9 times
		System.out.println("=================== Assignment 2 =======================");
		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i);
		}

		// 3. WAP to print 10 to 1 using for, while and do-while loop

		System.out.println("=================== Assignment 3- Using For Loop =======================");
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}

		System.out.println("=================== Assignment 3- Using Do While Loop =======================");
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

		System.out.println("=================== Assignment 3- Using While Loop =======================");
		int j = 10;
		while (j >= 1) {
			System.out.println(j);
			j--;

		}

		// 4. Write a program in Java to print "Hello World" ten times using while loop

		System.out.println("=================== Assignment 4- Using While Loop =======================");

		i = 10;
		while (i >= 1) {
			System.out.println("Hello World");
			i--;
		}

		// 5. Write a program in Java to print 1 to 10 using while loop but quit if
		// multiple of 7 is encountered

		System.out.println("=================== Assignment 5 =======================");
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			if (k == 7) {
				System.out.println("Breaking the code as value is multiple of " + k);
				break;
			}
			k++;

		}
	}

}
