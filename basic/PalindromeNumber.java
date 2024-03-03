package basic;

import java.util.Scanner;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (isPalindrome(number))
			System.out.println(number + " is a palindrome number.");
		else
			System.out.println(number + " is not a palindrome number.");

	}

	// Function to check if a number is palindrome
	public static boolean isPalindrome(int number) {
		int reversedNumber = 0;
		int originalNumber = number;

		// Reversing the number
		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number / 10;
		}

		// Checking if reversed number equals the original number
		return originalNumber == reversedNumber;
	}
}
