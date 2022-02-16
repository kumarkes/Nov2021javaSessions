package javasessions;

public class WrapperClassConcept {

	public static void main(String[] args) {

		// String to Integer
		String x = "100";
		System.out.println(x + 20); // 10020

		int i = Integer.parseInt(x); // Interger.parseInt is converting string
										// to integer
		System.out.println(i + 20);// 120

		/*
		 * String y="100A"; int k=Integer.parseInt(y);
		 * System.out.println(k+30);// NumberFormatException
		 */

		// String to Double

		String total = "120.33";
		double d = Double.parseDouble(total);
		System.out.println(d + 10.33);

		// String to Boolean
		String flag = "true";
		boolean fg = Boolean.parseBoolean(flag);
		if (fg) {
			System.out.println("Run your test");

		}
		
		// Int to String
		
		int bal=500;
		String b=String.valueOf(bal);// String.valueof method is used to convert Integer to String
		System.out.println(b+30);
		
		String mesg = "Your Order id Is 12345";
		//SubString Method
		String orderId=mesg.substring(mesg.indexOf("Is")+3);
		System.out.println(orderId);
		String m1=mesg.substring(1, 11).trim();
		System.out.println(m1);

	}

}
