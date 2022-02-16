package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		EcommApp e1 = new EcommApp();
		/*
		 * e1.login(); // Without builder patter we need to call the object reference
		 * again and again. So, for solving this we will use Builder pattern
		 * e1.search("iMac"); e1.addToCart("iMac");
		 */

		// Use Case 1:-
		e1.login().search("iMac").
		                          clickOnProduct("IMac").
		                                                 addToCart("iMac").
		                                                                   doPayment("Card").
		                                                                                     generateOrder()
				                                                                                            .sendOrderViaEmail().
				                                                                                                                 logOut();
//Use Case 2 :-

		int id = e1.login("Keshav", "Test123").search("HP", 1000).logOut().getOrderid();
		System.out.println(id);

		// Second User e2

		EcommApp e2 = new EcommApp();

		// Use Case 1:-
		e2.login().search("Compaq").logOut();

		// Use Case 2:-
		e2.login().logOut();
		
		
	}

}
