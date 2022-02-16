package AccessModifiers;

public class Employee {

	public String name;
	private int salary;
	String city; // By Default "Default" access modifier will be assigned
	protected String dob;

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "Tom";
		e.salary = 10000;
		e.city = "New Delhi";
		e.dob = "10th Oct 1990";

		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.city);
		System.out.println(e.dob);

	}

}
