package OOP_Abstract;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.doLogin("admin", "admin");
		lp.URL();
		lp.calculatorPrice();
		Page.logo();
		lp.forgotpass();
		lp.loading();
		lp.javascript();

		// top casting with abstract classes

		Page page = new LoginPage();
		page.URL();
		page.title();
		page.calculatorPrice();
		page.doLogin("admin", "admin");
		page.calculatorPrice();
		

		// down casting with abstract classes

		// LoginPage lpn = new Page();// Abstarct class cannot be intitiated

	}

}
