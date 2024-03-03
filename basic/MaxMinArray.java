package basic;

import java.util.Scanner;

public class MaxMinArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Create an array of the specified size
		int[] array = new int[size];

		// Prompt the user to enter the elements of the array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Find the maximum and minimum values in the array
		int max = array[0]; // Assume the first element as maximum
		int min = array[0]; // Assume the first element as minimum
		for (int i = 1; i < size; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		// Print the maximum and minimum values
		System.out.println("Maximum value in the array: " + max);
		System.out.println("Minimum value in the array: " + min);

		scanner.close();
	}
}
