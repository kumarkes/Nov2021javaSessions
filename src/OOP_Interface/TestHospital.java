package OOP_Interface;

public class TestHospital {
	

	public static void main(String[] args) {
		final int min_fee=10;
		FortisHospital fs = new FortisHospital();

		fs.cardioServices();
		fs.dentalServices();
		fs.emergencyServices();
		fs.entServices();
		fs.medicalInsurance();
		fs.medicalTraining();
		fs.oncologyServices();
		fs.pediaServices();
		fs.physioServices();
		fs.radiologyServices();
		System.out.println(fs.min_fee);
		USMedical.billing();
		

		// USMedical um = new USMedical(); // We cannot create object for Interface

		// top casting:
		// child class object can be referred by parent interface reference variable
		USMedical us = new FortisHospital();
		us.physioServices();
		us.cardioServices();
		us.oncologyServices();
		us.emergencyServices();
		us.medicalFunds();
		us.covidTest();
		us.vaccination();
		us.covidTest();
		us.covidReport("OMicron");
		us.medicalFunds(100);

		// down casting:
		// parent interface object can be referred by child class reference variable
		// FortisHospital fs=new USMedical();//Cast Exceptions

	}

}
