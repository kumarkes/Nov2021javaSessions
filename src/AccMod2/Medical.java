package AccMod2;

import AccessModifiers.Employee;

public class Medical {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Tom";
		// e.salary(); // Private variable 'salary' is not accessible from
		// outside of package and subclass
		// e.city(); // Private variable 'salary' is not accessible from outside
		// of package and subclass
		// e.dob(); // Private variable 'salary' is not accessible from outside
		// of package and subclass

	}

}
