package BuilderPattern;

public class UberApp {

	public UberApp login() {
		System.out.println("Login into UBER App");
		return this;

	}

	public UberApp login(String userName, String passWord) {
		System.out.println("Login into UBER App from : " + userName + ": " + passWord);
		return this;
	}

	public UberApp journeyFrom(String originationPlace) {
		System.out.println("Selecting journey from : " + originationPlace);
		return this;
	}

	public UberApp journeyTo(String destinationPlace) {
		System.out.println("Selecting journey to : " + destinationPlace);
		return this;
	}

	public UberApp selectCarType(String carType) {
		System.out.println("Selecting car type : " + carType);
		return this;
	}

	public UberApp doPayment(String debitCard) {

		System.out.println("Selected payment mode as : " + debitCard);
		return this;
	}

	public UberApp doPayment(String creditCard, int otp) {
		System.out.println("Selected payment mode as : " + creditCard + "And " + otp);
		return this;

	}

	public UberApp doPayment(int Cash) {
		System.out.println("Selected payment mode as : " + Cash);
		return this;

	}

	public UberApp clickBook() {
		System.out.println("Clicking on Book button");
		return this;

	}

	public UberApp startJourney(String originationPlace) {
		System.out.println("Starting the journey from " + originationPlace);
		return this;

	}

	public UberApp reachedDestination(String destinationPlace) {
		System.out.println("Reaching the journey to " + destinationPlace);
		return this;

	}

	public UberApp endJourney() {
		System.out.println("Clicked on Journey Over ");
		return this;

	}

	public UberApp provideFeedback(String feedback) {
		System.out.println("Providing Feedback to driver " + feedback);
		return this;

	}

	public UberApp logout() {
		System.out.println("Logging out from Uber App Application ");
		return this;
	}

}