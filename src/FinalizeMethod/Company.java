package FinalizeMethod;

public class Company {

	String cname;
	public static void main(String[] args) {
		

	}
	
	@Override
	public void finalize() {
		System.out.println("Inside Finalize method....Company");
	}
	
	// Practical Use Case:
	// DB Connection:
	// Make the DB Connection : DB Connected
	// Hit SQL Query : Exception
	// Get the result from DB : Exception
	// finally{Close the DB Connection
	//}
	
	//Finalize():
	// Launch a browser
	// Fill the form in login page
	// driver = null
	// Finalize(){
	   // Clean up activity
	   // Reinitialize the driver
	   // driver.quit()
	   // Shut down the system
	

}
