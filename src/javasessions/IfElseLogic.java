package javasessions;

public class IfElseLogic {

	public static void main(String[] args) {
		String browser = "chrome";
		if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println("Launch Chrome");
		} else if (browser.equals("IE")) {
			System.out.println("Launch IE");
		} else if (browser.equals("Firefox")) {
			System.out.println("Launch Firefox");
		} else if (browser.equals("Opera")) {
			System.out.println("Launch Opera");
		} else {
			System.out.println("Please launch valid browser :"  +browser);
		}

	}

}
