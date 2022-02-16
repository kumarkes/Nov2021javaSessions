package javasessions;

public class MainMethodOverLoading {

	// main method is static as JVM doesn't create object of this method. User is
	// allowed to create an object not JVM
	// It is public because JVM is accessing it from outside of class
	// It is void because JVM doesn't keep any return from main method

	// Permanent Generation is static in nature
	// Meta space is dynamic in nature

	// JVM will always search for the defined signature of main method which is
	// "public static void main(String[] args)"
	public static void main(String a[]) {
		System.out.println("Main Method----------");
		System.out.println(main(10));
		main(10, 20);

	}

	public static int main(int a) {
		System.out.println("Main Method----------" + a);
		main(20,30);
		return 100;
	}

	public static void main(int a, int b) {
		System.out.println("Main Method----------" + (a + b));

	}

}
