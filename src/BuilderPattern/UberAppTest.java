package BuilderPattern;

public class UberAppTest {

	public static void main(String[] args) {
		UberApp u1 = new UberApp();
		u1.login().journeyFrom("Mahavir Enclave").journeyTo("Rohini").selectCarType("Sedan").doPayment(350).clickBook().startJourney("Mahavir Enclave").reachedDestination("Rohini").endJourney().provideFeedback("Driver was very humble").login();

	}

}
