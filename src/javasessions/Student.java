package javasessions;

public class Student {

	// WAF
	// name: Get Student Name
	// input parameter : name(String)
	// return marks(int)

	public int getStudentMarks(String studentName) {
		System.out.println("Getting Student marks of :" + studentName);
		int marks = -1;
		if (studentName.equals("Sameer")) {
			marks = 90;
		} else if (studentName.equals("Harshini")) {
			marks = 95;
		} else if (studentName.equals("Ram")) {
			marks = 100;
		} else if (studentName.equals("Naveen")) {
			marks = 10;
		} else {
			System.out.println("Please enter correct student name");

		}
		return marks;
	}

	// Same program from Switch Case
	public int getStudentNumber(String studetName) {
		int marks = -1;
		switch (studetName.toLowerCase()) {

		case "sameer":
			System.out.println("Marks of " + studetName + " is ");
			return marks=80;
		case "harshini":
			System.out.println("Marks of " + studetName + " is ");
			return marks=70;

		case "ram":
			System.out.println("Marks of " + studetName + " is ");
			return marks=60;

		case "naveen":
			System.out.println("Marks of " + studetName + " is ");
			return marks=50;

		default:
			System.out.println("Marks of " + studetName + " is not present ");

		}
		return marks;
	}

	public static void main(String[] args) {

		Student st = new Student();
		int marks = st.getStudentMarks("Naveen");
		System.out.println(marks);
		marks = st.getStudentMarks("Sri");
		System.out.println(marks);
		if (marks == -1) {
			System.out.println("The student data is not correct");
		} else {
			System.out.println("The student data is correct");
		}
		int studentMarks = st.getStudentNumber("naveen");
		System.out.println(studentMarks);
	}

}
