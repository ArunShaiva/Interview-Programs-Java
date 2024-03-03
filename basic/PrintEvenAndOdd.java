package basic;

import java.util.Scanner;

public class PrintEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		// Create an array of the specified size
		int[] array = new int[size];

		// Prompt the user to enter the elements of the array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		// Print even and odd numbers in the array
		System.out.println("Even numbers in the array:");
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(); // Move to next line for odd numbers

		System.out.println("Odd numbers in the array:");
		for (int i = 0; i < size; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}

		sc.close();
	}
}
