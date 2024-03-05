package basic;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		while (temp > 9) {
			temp = sumSqDigit(temp);
		}
		if (temp == 1) {
			System.out.println(num + " is a happy number");
		} else {
			System.out.println(num + " is not a happy number");
		}

	}

	public static int sumSqDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * rem;
			n = n / 10;
		}
		return sum;
	}

}
