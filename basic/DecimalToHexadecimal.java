package basic;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		int decimal = 255;
		String hexadecimal = Integer.toHexString(decimal);
		System.out.println(decimal + " in hexadecimal is: " + hexadecimal);
	}
}
