package OOP_Inheritance;

public class BMW extends Car{

	// Method Overriding :
	// It will happen for Parent-Child Class. When same method is present is Parent
	// and Child class,With;
	// 1. Same Method Name
	// 2. Same Number of Parameters
	// 3. Same types of parameters
	// 4. Same return
	// We cannot override Private Method
	// We cannot override Static Method. If same static method is available in parent and child class then instead of method 
	// override it is called method hiding

	@Override
	public void start() {
		System.out.println("BMW - Start");
	}

	public void autoParking() {
		System.out.println("BMW - AutoParking");
		
		
	}
	//@Override --- Overriding not allowed for static method
	// It is called method hiding
	
	public static void price()
	{
		System.out.println("BMW - Price");
	}
}
