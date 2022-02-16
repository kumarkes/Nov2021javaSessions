package javasessions;

public class ECommerce {

	// Method Overloading:
	// When we have different methods:
	// 1. Within same class
	// 2. Name is same
	// 3. With different parameters
	// 4. With different order/sequence of parameters

	// Poly(Many) + Morphism(Face) --> Compile Time --> Static Method
	// Practical Example : For ECommerce like in payment page we are creating same
	// method many times and giving different payment method in different parameters
	// Method overloading is used to Readability, its not for memory management

	public void test() {// 0 Parameter
		System.out.println("Printing Test Method");
	}

	public void test(int i) {// 1 parameter
		System.out.println("Printing Test Method" + i);
	}

	public void test(int i, String j) {// 1 parameter
		System.out.println("Printing Test Method" + (i + j));
	}

	public void test(String j, int i) {// 1 parameter
		System.out.println("Printing Test Method" + (j + 1));
	}

	public void test(String j) {// 1 parameter
		System.out.println("Printing Test Method" + j);
	}

	public void test(long i) {// 1 parameter
		System.out.println("Printing Test Method" + i);
	}

	public static void main(String[] args) {
		ECommerce ecom = new ECommerce();
		ecom.test();
	}

}
