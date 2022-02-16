package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {
	
	
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH -- radiologyServices");

	}

	@Override
	public void entServices() {
		System.out.println("FH -- entServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

//common method from all 3 interfaces
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}

	// Individual methods for FortisHospital Class
	public void medicalTraining() {
		System.out.println("FH -- medicalTraining");

	}

	// Individual methods for FortisHospital Class
	public void medicalInsurance() {
		System.out.println("FH -- medicalInsurance");

	}

	@Override
	public void medicalFunds() {

		System.out.println("FH -- medicalFunds");
	}

	@Override
	public void covidTest() {

		System.out.println("FH -- covidTest");
	}

	@Override
	public void vaccination() {
		System.out.println("FH -- vaccination");

	}

	@Override
	public void covidReport(String version) {
		System.out.println("FH -- covidReport " + version);

	}

	@Override
	public void medicalFunds(int fee) {
		System.out.println("FH -- medicalFunds " + fee);
		
	}

}
