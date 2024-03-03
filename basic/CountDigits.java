package basic;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int count = countDigits(number);
		System.out.println("Number of digits in " + number + " is: " + count);

		scanner.close();
	}

	// Function to count the number of digits in a number
	public static int countDigits(int number) {
		int count = 0;

		// Keep dividing the number by 10 until it becomes 0
		while (number > 0) {
			number = number / 10;
			count++;
		}

		return count;
	}
}
