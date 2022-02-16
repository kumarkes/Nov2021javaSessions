package javasessions;

// We can call a non-static method from another non-static method without creating class object
// We can call a static method from another static method without creating class object
// We can call a static method from another non-static method without creating class object
// We cannot call a non-static method from another static method directly. We need to create object of class and later 
// call non-static method from static method
// Static variables and Methods are part of common memory area so it can be called from anywhere without creating object
// Non static method are part of Heap and stack so required object creation to acces that

public class Page {
	public void m1() {
		System.out.println("M1");
		m2();
	}

	public void m2() {
		System.out.println("M2");
		m3();
	}

	public void m3() {
		System.out.println("M3");
		Page.t2();
	}

	public static void t1() {
		System.out.println("T1");
		t2();
		Page p2 = new Page();
		p2.m2();
	}

	public static void t2() {
		System.out.println("T2");
		t3();
	}

	public static void t3() {
		System.out.println("T3");
	}

	public static void main(String[] args) {

		Page p1 = new Page();
		p1.m1();
		Page.t1();

	}

}
