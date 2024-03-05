package basic;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {        
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check perfect or not");
		int number = sc.nextInt();

		if (isPerfectNumber(number)) {
			System.out.println(number + " is a perfect number.");
		} else {
			System.out.println(number + " is not a perfect number.");
		}
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 0;

		// Find the divisors of the number and sum them up
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		// Check if the sum of divisors equals the number
		return sum == number;
	}
}

//A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. 

