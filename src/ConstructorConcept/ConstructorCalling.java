package ConstructorConcept;

// this keyword: 1st purpose : is used to initialize the class variable
// this keyword: 2nd purpose : is used to call the one constructor from another constructor

public class ConstructorCalling {

	String name;
	int age;
	double salary;

	public ConstructorCalling(String name) {
		this.name = name;
	}

	public ConstructorCalling(int age) {
		this.age = age;
	}

	public ConstructorCalling(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public ConstructorCalling(String name, int age, double salary) {
		this("Naveen");
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public ConstructorCalling(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public ConstructorCalling(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {

		ConstructorCalling obj = new ConstructorCalling("Keshav", 20, 100.20);
		System.out.println(obj.name);
	}

}
