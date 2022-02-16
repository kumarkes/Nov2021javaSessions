package ExceptionHandling;

public class FinallyBlock {
	
	// Finally : It will always call, doesn't matter exceptions is there or not

	public static void main(String[] args) {
		System.out.println("A");

		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		} finally {
			System.out.println("This is finally block");
		}

	}

}
