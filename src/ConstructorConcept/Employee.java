package ConstructorConcept;

public class Employee {

	String name;
	int age;
	String empId;
	String dept;

	// Constructor:-
	// Name will be same as class name
	// It will not have any return type/no void/no return keyboard
	// It looks like a function but not a function
	// Constructor overloading is possible
	// Default Constructor depends on use case....N number of use cases for methods/functions

	// Constructor vs Method/Function
	// Constructor name will remain same but function name will be anything
	// Constructor will never have any return but function may or may not return a value
	// Constructor will be called when we create object of the class but method will be called with object reference
	// Constructor will help to create the object of the class, we can restrict unnecessary object creation
	// Constructor doesn't have the business logic however methods have the business logic

	public Employee()// 0 Parameter constructor
	{
		System.out.println("Entering Default Constructor");
	}

	public Employee(int a)// 1 Parameter constructor
	{
		System.out.println("Entering 1 parameter Constructor");
	}

	public Employee(int a, String p)// 2 Parameter constructor
	{
		System.out.println("Entering 2 parameter Constructor");
	}

	public static void main(String[] args) {
//Constructor will call as soon as object is created not object reference
		Employee e1 = new Employee(10, "Keshav");
		Employee e2 = new Employee(10);
		Employee e3 = new Employee();
	}

}
