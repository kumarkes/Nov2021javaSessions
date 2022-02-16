package TimeComplexity;

public class TC {

	public static void main(String[] args) {
		int i = 10;

		System.out.println(i);

		// TC: Big O --> O(1) -- Constant Time

		// 1 to 10;
		for (int j = 0; j <= 10; j++) {
			System.out.println(j);

		}
		// 1+n+n+n => 1+3n => 3n +1 ==> Linear Equation
		// 3n (1 is removed as this is negligible in comparison of 3n)
		// 3n => O(n) (3 is removed as it compares with O index

		for (int p = 0; p <= 10; p++) {
			for (int q = 0; q <= 10; q++) {
				System.out.println(p + "" + q);

			}
			// (1+n+n) : For 1st Loop
			// (1+n+n+n) : For 2nd Loop
			// (1+n+n)(1+n+n+n) => (1+2n) (1+3n) => 1 + 3n+2n+6n^2 => 6n^2 + 5n
			// + 1 => Quadratic Equation
			// 6n^2+5n (1 is removed as this is negligible in comparison of
			// 6n^2)
			// n(6n + 5) => 6n^2 (5 Constant is removed)
			// O(n^2)

			for (int b = 0; b <= 10; b++) {
				for (int q = 0; q <= 10; q++) {
					for (int r = 0; r <= 10; r++) {
						System.out.println(b + " " + q + " " + r);

					}
				}
			}
			//(1+n+n)(1+n+n)(1+n+n+n) => (1+2n)(1+2n)(1+3n) => 12n^3 => O(n^3)

		}
	}
}
