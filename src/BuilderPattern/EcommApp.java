package BuilderPattern;

public class EcommApp {
	
	private int orderId;

	public EcommApp login() {
		System.out.println("Login to App");
		return this;

	}
	
	public EcommApp login(String un, String pass) {
		System.out.println("Login to App : " + un + ":" + pass);
		return this;
	}

	public EcommApp search(String productName) {
		System.out.println("Searching the product : " + productName);
		return this;
	}

	public EcommApp search(String productName, int price) {

		System.out.println("Searching the product : " + productName + ":" + price);
		return this;
	}

	public EcommApp clickOnProduct(String productName) {
		System.out.println("Click on the Product : " + productName);
		return this;
	}

	public EcommApp addToCart(String productName) {
		System.out.println("Adding product to the card : " + productName);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv) {
		System.out.println("Doing the payment : " + cc + ":" + cvv);
		return this;
	}

	public EcommApp doPayment(String cc) {
		System.out.println("Doing the payment : " + cc);
		return this;
	}

	public EcommApp doPayment(String cc, int cvv, int otp) {
		System.out.println("Doing the payment : " + cc + ":" + cvv + ":" + otp);
		return this;
	}

	public EcommApp generateOrder() {
		System.out.println("Generating the Order : " + 12345);
		this.orderId=12345;
		return this;
	}
	
	//Use of Encapsulation OOP(Using in use case 2 for e1)
	public int getOrderid() {
		return this.orderId;
	}

	public EcommApp sendOrderViaEmail() {
		System.out.println("Sending Order via Email and order Id Is : " + 12345);
		return this;
	}
	public EcommApp logOut() {
		System.out.println("Logging out from the application");
		return this;
	}
}
