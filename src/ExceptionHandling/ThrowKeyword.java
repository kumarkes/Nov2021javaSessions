package ExceptionHandling;

public class ThrowKeyword {

	// For creating custom exception we are using throw keyword

	public static void getData() {
		String data = null;
		if (data == null) {
			System.out.println("Data is Null");
			try {
				throw new Exception("Data is not found exceptions");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		getData();
	}

}
