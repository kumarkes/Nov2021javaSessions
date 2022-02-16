package ExceptionHandling;

public class TryCatchBlock {
	String name;

	// Compile Time Exception // checked exceptions E.g; Down Cast exceptions
	// Run Time Exception // Unchecked exceptions

	// Exceptions is parent of all types of exception classes e.g; Arithmetic, IO,
	// ArrayIndexoutofbond, Null PClasscast, Null Pointer
	// Exceptions can handle any type of exceptions
	// Its good practice to separate exception class to handle exception.It is
	// useful for more clear message readability
	// Throwable class is parent of Exception class
	// Object is a super class of Throwable class
	// We must have either catch block or finally block with try block
	// When we don't have idea about type of exceptions then we are using Exceptions e

	public static void main(String[] args) {

		// Thread.sleep(5000);// checked exceptions

		/*
		 * int i=9/0; // nchecked exceptions int k[]= new int [2]; k[4]=20;
		 */

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;

		try {

			obj.name = "Keshav";
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception is coming");
			e.printStackTrace();
		}
		try {
			int k[] = new int[2];
			k[4] = 4;
			int i = 9 / 0;
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		/*
		 * catch(Object e)// Not Allowed {
		 * System.out.println("Some Exceptions are coming"); e.printStackTrace(); }
		 */
		/*
		 * catch(Throwable e) { System.out.println("Some Exceptions are coming");
		 * e.printStackTrace(); }
		 */
		/*
		 * catch(Exception e) { System.out.println("Some Exceptions are coming");
		 * e.printStackTrace(); }
		 */
		catch (ArithmeticException e) {
			System.out.println("AIOB is coming");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IAOB is coming");
			e.printStackTrace();
		}
		/*
		 * catch (NullPointerException e) { System.out.println("NPP is coming");
		 * e.printStackTrace(); }
		 */
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");

	}

}
