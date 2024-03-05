package basic;

public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal = 25;
		String binary = Integer.toBinaryString(decimal);
		System.out.println(decimal + " in binary is: " + binary);
	}
}
