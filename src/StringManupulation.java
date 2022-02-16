
public class StringManupulation {

	// String is an internal combination of character array

	// WHy String is Mutable :- When we are assigning any String value to 2
	// different reference variable then it is still available in the constant pull
	// memory. but in case of integer the calue is deleted from the memory.So,
	// String are immutable

	public static void main(String[] args) {

		String str = "Hello this is my java code";
		System.out.println(str.length());
		System.out.println(str.charAt(25));
		// System.out.println(str.charAt(26)); // String index out of exception
		// System.out.println(str.charAt(-1)); // String index out of range
		System.out.println(str.charAt(str.length() - 1));
		System.out.println(str.indexOf('H'));
		System.out.println(str.indexOf('i')); // 8//1st occurence of i
		System.out.println(str.indexOf('i', str.indexOf('i') + 1)); // 2nd occurence of i
		System.out.println(str.indexOf("Hello"));

		String msg = "Hello Keshav";
		if (msg.indexOf("Keshav") > 0) {
			System.out.println("Hello is available");
		} else {
			System.out.println("Hello is not available");
		}

		System.out.println(msg.toLowerCase());
		System.out.println(msg.toUpperCase());

		// Why String is Mutable

		// String literals
		String s1 = "Hello World"; // 1 object will create in the String constant pool in heap memory
		String s2 = "Hello World"; // 1 object will create in the String constant pool in heap memory
		System.out.println(s1 == s2); // True // Both are coming from Constant pool area

		// String class
		String s3 = new String("Hello Java"); // 2 objects will create, 1 in string constant pool and 1 in normal heap

		String s4 = new String("Hello Java"); // 1 object will create , As "Hello Java" is already available in constant
												// pool.And in constant pool duplicate enteries are not allowed

		String s5 = "Hello Java"; // 0 object will create as "Hello Java" is already available in constant pool

		System.out.println(s3 == s5);// False // These 2 are different objects, s3 is from constant pool and s5 is
										// from heap memory

		System.out.println(s3.equals(s5)); // True // They are comparing values not the reference

		String s6 = "Hello World"; // 0 object will create as "Hello Java" is already available in constant pool

		String s7 = "Hello Python"; // 1 object is created

		s7 = "Hello JS";

		System.out.println(s7);

		s4 = null;
		// System.out.println(s4.equals(s5)); // Null pointer exception as s4 breaks the
		// connection. Null is trying to compare with s5
		System.out.println(s5.equals(s4)); // False

		// Equals
		String t1 = "Hello world"; // Small w // 2 objects will create in constant pool
		String t2 = "Hello World"; // Caps W
		System.out.println(t1.equals(t2)); // False
		System.out.println(t1.equalsIgnoreCase(t2)); // True

		// Contains
		System.out.println(t1.contains("Hello"));

		// Trim
		String test = "      hello   testing     ";
		System.out.println(test.trim()); // Trim will remove corner spaces(left and right side spaces)

		// Replace
		String tt = "      hello   testing     ";
		System.out.println(tt.replace(" ", "")); // replace will remove all spaces

		String dob = "01/01/1990";
		System.out.println(dob.replace("/", "-"));

		// Split

		String lang = "JAVA_PYTHON_JS_RUBY";
		String lg[] = lang.split("_");
		System.out.println(lg.length);
		System.out.println(lg[0]);

		String pop = "xXtestingxxXseleniumXxXQTPXXxXCypress";
		String p[] = pop.split("xX");
		System.out.println("--------------------------------");
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		// System.out.println(p[5]);//IOB Exception
		System.out.println("--------------------------------");

		String empData = "Devesh;Kumar;Pune;India;SDET2;IBM";
		// String value[]=empData.split(";");
		// System.out.println(value[0]);
		System.out.println(empData.split(";")[0]);
		String emp[] = empData.split(";");
		for (String e : emp) {
			System.out.println(e);
		}
	}

}
