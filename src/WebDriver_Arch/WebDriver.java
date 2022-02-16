package WebDriver_Arch;

public interface WebDriver extends searchContext{
	@Override
	public void findElement();
	@Override
	public void findElements();
	
	public void get(String URL);
	
	public String getTitle();
	public String getURL();
	public void click();
	public void sendKeys(String value);
	public void close();
	


}
