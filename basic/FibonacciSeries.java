package basic;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.println("Invalid input. Please enter a positive number.");
			return;
		} else if (num == 1) {
			System.out.println("Fibonacci series:");
			System.out.println(0);
			return;
		}

		int n1 = 0, n2 = 1;
		System.out.println("Fibonacci series:");
		System.out.print(n1 + " " + n2);

		for (int i = 2; i < num; i++) {
			int sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}
}
