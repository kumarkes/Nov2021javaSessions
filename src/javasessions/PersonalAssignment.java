package javasessions;

public class PersonalAssignment {

	public static void main(String[] args) {
		// for (int i = 0; i < 4; i++) {
		// for (int j = 0; j < 5; j++) {
		// System.out.print("Welcome");
		// System.out.print("*");
		// System.out.print(" ");
		// }
		// System.out.println();

		// }
		int i = 0;
		do {

			System.out.print("Welcome to our Program " + i + " ");

			if (i % 5 == 0) {
				System.out.println(" " + i + " " + "Is Multiple of 5");
			} else {
				System.out.println(" " + i + " " + "Is Not Multiple of 5");
			}
			i++;
		} while (i < 10);

	}
}
