package OOP_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String passWord;
	
	public LoginPage(String userName,String passWord)
	{
		this.userName=userName;
		this.passWord=passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
// Business features : public method 
	public void doLogin(String username,String passWord)
	{
		System.out.println("Enter Username as " + userName);
		System.out.println("Enter Password as " + passWord);
		System.out.println("Click on Login Button");
		System.out.println("Login Done");
	}
	
	public void doLogin() {
		System.out.println("Enter Username as " + this.userName);
		System.out.println("Enter Password as " + this.passWord);
		System.out.println("Click on Login Button");
		System.out.println("Login Done");
	
	}
}
