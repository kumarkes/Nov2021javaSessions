package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;

		}
		boolean flag = true;
		int num = 0;
		while (flag) {
			System.out.println("Welcome to Taj Hotel");
			num++;
			if (num == 5) {
				break;
			}
		}

		System.out.println("==========================");
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);

		}
		int l = 1;
		for (; l <= 10;) {
			System.out.println(l);
			l++;

		}
		// infinite loop
		// for (; ; ) {
		// System.out.println("Hello World");

		// }
		// ASCII Character for a-z
		for (char d = 'a'; d <= 'z'; d++) {
			System.out.println(d + ":" + (int) d);

		}
		// ASCII Character for A-Z
		for (char e = 'A'; e <= 'Z'; e++) {
			System.out.println(e + ":" + (int) e);

		}

		// ASCII Character for 0-9
		for (char f = '0'; f <= '9'; f++) {
			System.out.println(f + ":" + (int) f);

		}
		// Even and Odd Number
		for (int g = 1; g <= 10; g++) {
			if (g % 2 == 0) {
				System.out.println(g + " : " + "Number is Even");
			} else {
				System.out.println(g + " : " + "Number is Odd");
			}

		}
		System.out.println("========== To Print Do While Loop =======================");
		int t = 1;
		do {
			System.out.println(t);
			t++;
		} while (t < 10);

		System.out.println(" =============== To Print * Methods ==================");
		for (int j = 0; j <= 5; j++) {
			for (int k = 0; k <= j; k++) {
				System.out.println(k);
			}
			System.out.println();
		}
	}

}
