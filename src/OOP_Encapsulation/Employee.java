package OOP_Encapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;

	// Getter and Setter are used for accessing private properties of class
	// Getter and Setter are public layers which is POC for other class object to access this class private variables
	// Getter and Setter should always public

	public String getName() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getInfo() {
		return name + " :" + age + " " + salary;
	}
	
	public void setInfo(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

} 
