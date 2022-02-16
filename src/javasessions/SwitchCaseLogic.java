package javasessions;

public class SwitchCaseLogic {

	public static void main(String[] args) {
		String browser = " CH R OME ";

		switch (browser.toLowerCase().replace(" ", "")) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "opera":
			System.out.println("Launch Opera");
			break;

		default:
			System.out.println("Please enter valid browser " + browser);
			break;
		}

	}

}
