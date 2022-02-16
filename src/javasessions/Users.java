package javasessions;

public class Users {

	// Methods: Class data member
	// It should be independent
	// Method should be parallel to each other
	// Method can not create inside a method
	// Can not create a duplicate method- we can overload it

	// Different Method Types:-

	// 1. No Input,No Return
	// Void means cannot return any value

	public void test() {
		System.out.println("Test Method");
	}

	// 2. No Input, Some Return
// return type : int
	public int getNumber() {
		System.out.println("Get Number Method");
		return 100;
	}

// return type : String
	public String getTrainerName() {
		System.out.println("Get Trainer Name Method");
		String name = "Keshav";
		return name;
	}

// return type : boolean
	public boolean isForgotPwdLinkExist() {
		System.out.println("Get the forgot password");
		return true;
	}

	// 3. Some Input Some Return

	
	//Main method will never return anything 
	//JVM will not use the return value ever
	//JVM is calling main function so its public
	// We cannot create object of Main method so this is static in nature
	
	public int add(int a, int b)// int a and int b are function/method parameters
	{
		System.out.println("Add Method");
		int c = a + b;
		return c;
	}

	public static void main(String[] args) {

		Users obj = new Users();
		obj.test();

		int num = obj.getNumber();
		System.out.println(num);
		obj.getTrainerName();
		boolean flag = obj.isForgotPwdLinkExist();
		if (flag) {
			System.out.println("Test is Pass");
		} else {
			System.out.println("Test is Fail");
		}
		int sum = obj.add(10, 20);// 10,20 are called argument, because these are actual values passing to method
									// parameters
		System.out.println(sum);
		sum = obj.add(30, 40);
		System.out.println(sum);

	}

}
