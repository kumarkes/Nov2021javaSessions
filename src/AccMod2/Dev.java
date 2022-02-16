package AccMod2;

import AccessModifiers.Employee;

public class Dev extends Employee {

	public static void main(String[] args) {

		Dev d = new Dev();
		d.name = "tom";
		d.dob = "16th pJune 2021";
		// d.salary;// Private variable 'salary' is not accessible from outside of package
		// d.city;// Private variable 'salary' is not accessible from outside of package
	}

}
