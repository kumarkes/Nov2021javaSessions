package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		System.out.println("Child class constructor");
	}
	public LoginPage(int i)
	{
		System.out.println("1st parameter Child class constructor" + i);
	}

	@Override
	public void title() {

		System.out.println("LoginPage--title");
	}

	@Override
	public void URL() {

		System.out.println("LoginPage--URL");
	}

	@Override
	public void doLogin(String un, String pas) {
		System.out.println("LoginPage--Login " + un + pas);
	}

	// Individual Method
	public void forgotpass() {
		System.out.println("Login Page--Forgot Password");
	}
	
	@Override
	public void loading()
	{
		System.out.println("LoginPage----Loading");
	}
	

}
