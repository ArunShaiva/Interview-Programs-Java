package basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = sc.nextInt();

		if (isArmstrong(input))
			System.out.println(input + " is Armstrong number");
		else
			System.out.println(input + " is not a ArmStrong Number");
	}

	public static boolean isArmstrong(int num) {

		int temp = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			sum = sum + digit * digit * digit;
		}

		return sum == temp;

	}

}
