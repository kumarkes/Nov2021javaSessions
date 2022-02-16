package javasessions;

public class CarType {

	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void start() {
		System.out.println("Start Method----");
	}

	public void stop() {
		System.out.println("Stop Method----");
	}

	public static void main(String[] args) {
//Here wheels are common properties for all the object. So, it is a static property.
		// We can create static variable under class not under any method.
		// Static keyboard,object can never stored under object
		// It will not stored under Heap or Stack Memory
		// It will store under CMA(Common Memory Allocation)
		// It is also called as Permanent generation(Till JDK 1.7) and from JDK(1.8) it
		// is called as Meta Space
		// In Permanent Generation, memory was fixed say 200 MB
		// In Meta Space, memory is not fixed means in case in case memory is full then
		// it will borrow some memory from RAM or
		// hard Disk of system

		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 70;
		c1.color = "Black";
		System.out.println(c1.name);
		System.out.println(c1.wheels);// The static field cartype.wheels should be accessed in static way

		// How to access static variable
		// 1. Access Directly
		System.out.println(wheels);// This is not the right way to call. This is working because main method is
									// static
		// and wheels variable is also static
		// 2. Access from Class Name
		System.out.println(CarType.wheels);// This is the right way to access static variable

		// How to access static method

		// 1. Access Directly
		start();
		c1.stop();

		// 2. Access from Class Name
		CarType.start();

		CarType c2 = new CarType();
		c2.name = "Audi";
		c2.price = 60;
		c2.color = "Blue";
		c2.wheels = 4;

		CarType c3 = new CarType();
		c3.name = "Honda";
		c3.price = 80;
		c3.color = "Green";
		c3.wheels = 4;
		
		//Whenever we have common utilize , common function then we can create static variable or static method

	}

}
