package basic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.nextLine();

		if (isPalindrome(input))
			System.out.println(input + " is Palindrome");
		else
			System.out.println(input + " is not Palindrome");
	}

	public static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}

}
