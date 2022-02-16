package OOP_Interface;

public interface USMedical extends Medical {

	// No Method Body//Only method declaration
	// Only Method Prototype
	// Only abstract method/No body
	// Cannot create the object of interface
	// Cannot create static abstract method in interface
	// Cannot have static abstract non static method

	final int min_fee = 10;

	public void physioServices();

	public void cardioServices();

	public void oncologyServices();

	public void emergencyServices();

	@Override
	public void vaccination();

	// After jdk 1.8, 	
	// 1. Interface can have static method with body

	public static void billing() {
		System.out.println("US Medical --Billing");
	}

		// 2. Can have non static default method
		default void optServices()
		{
			System.out.println("US Medical --optServices");	
		}
	}
	

