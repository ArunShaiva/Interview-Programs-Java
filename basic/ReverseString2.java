package basic;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();

		String rev = reverseString(input);
		System.out.println("Reversed String is " + rev);

	}

	public static String reverseString(String str) {
//		char[] chars = str.toCharArray();
		String rev = "";
		int length = str.length() - 1;

		for (int i = length; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;
	}
}
