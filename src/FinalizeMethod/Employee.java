package FinalizeMethod;

public class Employee {

	String name;

	public static void main(String[] args) {

		Employee e = new Employee();
		e=null;
		Company c = new Company();
		c = null;
		System.gc();
		// e.name = "Tom";
		// System.out.println(e.name);
		System.out.println("Inside emp class");
	}

	@Override
	public void finalize() {
		System.out.println("Inside Finalize method....Employee");
	}

}
