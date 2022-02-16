package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage u1 = new LoginPage("Keshav", "test123"); // Create : POST
		System.out.println(u1.getUserName());
		System.out.println(u1.getPassWord());

		LoginPage u2 = new LoginPage("Harshini", "test123"); // Create : POST

		System.out.println(u2.getUserName());// GET
		System.out.println(u2.getPassWord());

		u2.setPassWord("test456");// Update : PUT

		System.out.println(u2.getUserName());
		System.out.println(u2.getPassWord());

		u2.doLogin(u2.getUserName(), u2.getPassWord());
		u2.doLogin();

		Browser br = new Browser();
		br.launchBrowser();

	}

}
