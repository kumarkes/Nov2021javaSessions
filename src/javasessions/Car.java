package javasessions;

public class Car {

	// Class Prop: Class Variables/Global variables
	String name;
	int price;
	String color;
	String model;

	public static void main(String[] args) {

		String name = "Keshav";// Local variable

		System.out.println(name);
		
		//to access class variable/properties, we need to create object of class
		
		Car c = new Car();
		c.name="BMW";
		c.price=10000;
		c.color="Red";
		c.model="M5";
		System.out.println(c.name + " " + c.price + " " + c.color + " " + c.model);
		Car c1=new Car();
		c1.name ="Audi";
		c1.price=20000;
		c1.color="Blue";
		c1.model="A5";
		System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + c1.model);
		

	}

}
