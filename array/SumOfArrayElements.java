package array;

import java.util.Scanner;

public class SumOfArrayElements {
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

		// Calculate the sum of elements in the array
//		int sum = 0;
//		for (int i = 0; i < size; i++) {
//			sum = sum + array[i];
//		}
		
		// Calculate the sum of elements in the array using enhancing for loop
		int sum=0;
		for(int value: array) {
			sum= sum +value;
		}

		// Print the sum of elements in the array
		System.out.println("Sum of elements in the array: " + sum);

		scanner.close();
	}
}
