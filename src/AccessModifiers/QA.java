package AccessModifiers;

public class QA extends Employee{

	public static void main(String[] args) {
		QA qa = new QA();
		System.out.println(qa.city);
		System.out.println(qa.dob);
		System.out.println(qa.name);
		//System.out.println(qa.salary); // private variable 'salary' is not accessible from main class

	}

}
