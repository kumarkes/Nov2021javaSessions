package OOP_Encapsulation;

public class CustTest {

	// Constructor helps to create first time and later setter helps to update the
	// property of the created object
	public static void main(String[] args) {
		Customer c1 = new Customer("Keshav", 25, "Delhi"); // Create POST
		System.out.println(c1.getName()); // GET
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());

		c1.setName("Ram");// Update : PUT/PATCH
		System.out.println(c1.getName());
		System.out.println(c1.getAge());
		System.out.println(c1.getCity());

	}

}
