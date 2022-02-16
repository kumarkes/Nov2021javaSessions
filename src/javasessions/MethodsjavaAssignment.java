package javasessions;

public class MethodsjavaAssignment {

	// WAF:
	// Name: Sum
	// Input : 2 Numbers
	// Return Addition

	public int sum(int a, int b) {
		System.out.println("Printing sum of 2 numbers");
		int c = a + b;
		return c;
	}

	public int mul(int a, int b) {
		System.out.println("Printing multiplication of 2 numbers");
		int c = a * b;
		return c;
	}

	public static void main(String[] args) {

		MethodsjavaAssignment mja = new MethodsjavaAssignment();
		int sumnum = mja.sum(10, 20);
		System.out.println("Sum of 2 Numbers are : " + (sumnum + 5));

		long mulnum = mja.mul(10, 20);
		System.out.println("Mul of 2 Numbers are : " + mulnum);
	}

}
