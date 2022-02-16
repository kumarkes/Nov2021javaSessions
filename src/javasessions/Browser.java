package javasessions;

public class Browser {
// launch browser
	// input parameter : NAME String : FF/CH/SF/IE
	// return : void

	// Need to do assignment for switch case for both browser and student marks
	// example
	public boolean launchBrowser(String name) {
		System.out.println("Browser name is :" + name);
		boolean flag = false;
		if (name.equals("chrome")) {
			System.out.println("Launch Chrome");
			flag = true;
		} else if (name.equals("Firefox")) {
			System.out.println("Launch Chrome");
			flag = true;
		} else if (name.equals("Safari")) {
			System.out.println("Launch Firefox");
			flag = true;
		} else if (name.equals("IE")) {
			System.out.println("Launch IE");
			flag = true;
		} else {
			System.out.println("Please pass right browser");

		}
		return flag;
	}

	// Same program from Switch Case
	public boolean openBrowser(String brName) {
		System.out.println("Opening the Browser  :" + brName);
		boolean flag = false;
		switch (brName.toLowerCase()) {
		case "chrome":
			System.out.println("Browser is opened : " + brName);
			flag = true;

		case "ie":
			System.out.println("Browser is opened : " + brName);
			flag = true;
		case "safari":
			System.out.println("Browser is opened : " + brName);
			flag = true;
		case "opera":
			System.out.println("Browser is opened : " + brName);
			flag = true;

		default:
			System.out.println("Please Pass correct browser : " + brName);

		}
		return flag;
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean flag = br.launchBrowser("chrome");
		if (flag) {
			System.out.println("chrome browser is launched");
		} else {
			System.out.println("Browser is not launched");
		}
		boolean flag1 = br.openBrowser("ie");
		System.out.print(flag1);

	}

}
