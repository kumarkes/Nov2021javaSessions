package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		int a = 10;// Primitive Data Type
		int b = 10;
		System.out.println(a == b);
		if (a == b) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		boolean flag = true;
		if (flag) {
			System.out.println("Hi");
		} else// Dead Code means the code will never execute because of condition taken
		{
			System.out.println("Hello");
		}

		double d1 = 12.33;
		double d2 = 12.33;
		if (d1 == d2) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		String s1 = "Hello";
		String s2 = "HELLO";

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		
		String browser="Firefox";
		if(browser.equals("Chrome"))
		{
			System.out.println("Launch Chrome");
		}
		if(browser.equals("IE"))
		{
			System.out.println("Launch IE");
		}
		if(browser.equals("Firefox"))
		{
			System.out.println("Launch Firefox");
		}
		if(browser.equals("Opera"))
		{
			System.out.println("Launch Opera");
		}
		else
		{
			System.out.println("Please launch correct browser");
	}
	
		
		
	}

}
