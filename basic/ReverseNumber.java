package basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int reversedNumber = reverse(number);
		System.out.println("Reversed number: " + reversedNumber);

	}

	// Function to reverse a number
	public static int reverse(int number) {
		int reversedNumber = 0;

		while (number > 0) {
			int digit = number % 10;
			reversedNumber = reversedNumber * 10 + digit;
			number = number / 10;
		}

		return reversedNumber;
	}
}







//StringBuffer sb = new StringBuffer(String.valueOf(input));
//StringBuffer rev = sb.reverse();
//System.out.println("Reversed number: " + rev);

//Another method to reverse




//StringBuilder sb= new StringBuilder();
//sb.append(input);
//StringBuilder rev = sb.reverse();
//System.out.println("Reversed number is "+rev);
