package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {
		String browser = "omega";
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver =new FirefoxDriver();
		// SafariDriver driver =new SafariDriver();

		WebDriver driver = null;
		//cross browser logic
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("Please pass right browser");
		}

		driver.get("https//www.amazon.com");
		String title = driver.getTitle();
		System.out.println("Page Title Is " + title);
		String url = driver.getURL();
		System.out.println("URL Is " + url);
		driver.findElement();
		driver.findElements();
		driver.sendKeys("naveen@gmail.com");
		driver.sendKeys("test123");
		driver.click();
		driver.close();

	}

}
