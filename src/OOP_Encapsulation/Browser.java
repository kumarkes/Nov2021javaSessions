package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Trying to launch browser");
		checkOSCompatible();
		checkBrowserVersion();
		enoughRAM();
		isBrowserUpgraded();
		System.out.println("Browser is launched");
	}

	private void checkOSCompatible() {
		System.out.println("Check OS Compatible");
	}

	private void checkBrowserVersion() {
		System.out.println("Checking Browser version");
	}

	private void enoughRAM() {
		System.out.println("Enough RAM");
	}

	private void isBrowserUpgraded() {
		System.out.println("Is Browser Upgraded");
	}

	public static void main(String[] args) {

	}

}
