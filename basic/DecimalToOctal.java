package basic;

public class DecimalToOctal {

	public static void main(String[] args) {
		int decimal = 37;
		String octal = Integer.toOctalString(decimal);
		System.out.println(decimal + " in octal is: " + octal);
	}
}
