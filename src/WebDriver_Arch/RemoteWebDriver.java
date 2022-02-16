package WebDriver_Arch;

public class RemoteWebDriver implements WebDriver{

	@Override
	public void findElement() {
		System.out.println("Find Element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Find Elements");
		
	}

	@Override
	public void get(String URL) {
		System.out.println("Enter URL");
		
	}

	@Override
	public String getTitle() {
		
		return "https://www.abc.com";
	}

	@Override
	public String getURL() {
		
		return "some title";
	}

	@Override
	public void click() {
		System.out.println("Click on elements");
		
	}

	@Override
	public void sendKeys(String value) {
		System.out.println("Enter values " + value);
		
	}

	@Override
	public void close() {
		System.out.println("Close Browser");
		
	}

}
