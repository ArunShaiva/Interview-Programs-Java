package basic;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int input = sc.nextInt();

		int count = sumOfDigits(input);
		System.out.println("Sum of digits in " + input + " is " + count);
	}

	public static int sumOfDigits(int num) {
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}

		return sum;
	}

}
