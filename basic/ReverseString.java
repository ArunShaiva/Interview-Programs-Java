package basic;

import java.util.Scanner;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String reversedString = reverse(input);
		System.out.println("Reversed string: " + reversedString);

		scanner.close();
	}

	// Function to reverse a string without using built-in functions
	public static String reverse(String str) {
		char[] chars = str.toCharArray();
		int start = 0;
		int end = chars.length - 1;

		while (start < end) {
			// Swap characters at start and end indices
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			// Move start and end pointers towards the center
			start++;
			end--;
		}

		// Convert char array back to string
		return new String(chars);
	}
}
