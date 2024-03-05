package basic;

public class BinaryToDecimal {

	public static void main(String[] args) {
		String binaryString = "1010";
		int decimal = Integer.parseInt(binaryString, 2);
		System.out.println(binaryString + " in decimal is: " + decimal);
	}
}
