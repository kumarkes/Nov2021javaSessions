package AccessModifiers;

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Tom";
		e.city = "Bokaro";
		e.dob = "12th Oct 2021";
		// e.salary // private variable 'salary' is not accessible from main
		// class
		System.out.println(e.name);
		System.out.println(e.city);
		System.out.println(e.dob);

	}

}
