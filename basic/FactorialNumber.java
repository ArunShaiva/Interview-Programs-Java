package basic;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int input = sc.nextInt();

		long factorial = calculateFactorial(input);

		System.out.println("Factorial of " + input + " is " + factorial);
	}

	public static long calculateFactorial(int number) {
		long factorial = 1;

		for (int i = 1; i <= number; i++)
			factorial = factorial * i;

		return factorial;
	}

}
