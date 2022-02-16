package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();// Overridden method
		b.stop();// Inherited method
		b.refuel();// Inherited method
		b.autoParking();// Individual
		BMW.price();
		Car.price();
		b.engine();// Inherited
		b.name="520d";
		System.out.println(b.name);
		System.out.println(Car.wheels);
		System.out.println(BMW.wheels);

		Audi au = new Audi();
		au.theftSafety();
		au.engine();
		au.start();
		au.stop();
		Car.price();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		// Top Casting :
		// Child class object can be referred by parent class reference variable

		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		// c1.autoParking // From Top Casting , we cannot access individual method of
		// BMW Class

		// Child class object can be referred by grand parent class reference variable

		Vehicle v1 = new BMW();
		v1.engine();

		// Down Casting
		// Parent class object can't be referred by child class reference variable

		// BMW b1= (BMW) new Car(); // ClassCastException : This is not allowed in Java
		// BMW b2=(BMW) new Vehicle(); // Class CastException
	}

}
