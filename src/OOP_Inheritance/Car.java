package OOP_Inheritance;

public class Car extends Vehicle {
	
	// final:
	// used to provide constant variables(local variables)
	// used to prevent method overriding
	// used to prevent inheritance
	
	String name;
	static int wheels=4;
	
	public static void price()
	{
		System.out.println("Car - Price");
	}
	
	public void start() {
		System.out.println("Car - Start");
	}
	
	public void stop() {
		System.out.println("Car - Stop");
	}
	public void refuel() {
		System.out.println("Car - Refuel");
	}
}
