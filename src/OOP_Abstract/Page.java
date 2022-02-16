package OOP_Abstract;

public abstract class Page extends WebPage implements W3C{

	// 0 to 100% abstraction
	// 0 means No Abstract Methods
	// 100 mean only Abstract Method
	// Partial abstraction
	// Can not create the object of abstract class
	// We can create constructor of Abstract class and it will be called when you
	// create the object of child class
	// We cannot have multiple inheritance concept for abstract classes
	// When we need to create own business logic apart from already defined methods(inheritance) then we are using abstract class concept
	// in Selenium webdriver. We can override the method as well and update the business logic in child class

	public Page() {
		System.out.println("Default Constructor");
	}

	public Page(int i) {
		System.out.println("1st Parameter Constructor");
	}
	
	public abstract void title();

	public abstract void URL();

	public void doLogin(String un, String pas) {
		System.out.println("Page--Login");
	}

	public static void logo() {
		System.out.println("Page--logo");
	}

	public final void calculatorPrice() {
		System.out.println("Page--calculatorPrice");
	}
	
	@Override
	public void loading()
	{
		System.out.println("Page----Loading");
	}
	@Override
	public final void javascript() {
		System.out.println("Page--javascript");
		
	}

}
