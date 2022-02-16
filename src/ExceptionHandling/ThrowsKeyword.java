package ExceptionHandling;

public class ThrowsKeyword {

	// Throws keyword is used to byepass exceptions from 1 method to another method

	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exceptions is handled");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		ThrowsKeyword tk = new ThrowsKeyword();
		tk.m1();
	}

}
