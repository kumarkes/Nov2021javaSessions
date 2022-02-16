package ExceptionHandling;

public class FinallyIntQues {

	public static int getMarks(String Name) {
		System.out.println("Getting marks for: " + Name);
		int marks = 0;
		if (Name.equals("Ram")) {
			try {
				marks = 90;
				// System.exit(1);// It is for terminate/shutdown the JVM
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				e.printStackTrace();
				return -2;
			} finally {
				System.out.println("Student is fail");
				return -3;
			}

		} else if (Name.equals("Nikki")) {
			marks = 95;
		} else if (Name.equals("Sri")) {
			marks = 85;
		} else {
			System.out.println("Student not found");
			return -1;
		}
		return marks;
	}

	public static void main(String[] args) {

		int m = getMarks("Ram");
		System.out.println("Getting marks : " + m);

	}

}
