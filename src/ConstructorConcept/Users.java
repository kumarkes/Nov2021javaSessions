package ConstructorConcept;

public class Users {

	String name;
	int userId;
	boolean isPrime;
	String city;

	// this keyword is used to call class variable in constructor
	public Users(String name, int userId) {
		this.name = name;
		this.userId = userId;
	}

	public Users(String name) {
		this.name = name;
	}

	public Users(String name, int userId, boolean isPrime, String city) {
		this.name = name;
		this.userId = userId;
		this.isPrime = isPrime;
		this.city = city;
	}

	public static void main(String[] args) {
		Users u1 = new Users("Keshav", 100);
		System.out.println(u1.name);
		System.out.println(u1.userId);
		Users u2 = new Users("Ram");
		System.out.println(u2.name);
		Users u3 = new Users("Mahesh", 300, true, "Chennai");
		System.out.println(u3.name + " " + u3.userId + " " + u3.isPrime + " " + u3.city);

	}

}
