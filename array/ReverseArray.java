package array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Original Array: " + Arrays.toString(array));

		reverseArray(array);

		System.out.println("Reversed Array: " + Arrays.toString(array));
	}

	public static void reverseArray(int[] array) {
		int start = 0;
		int end = array.length - 1;

		while (start < end) {
			// Swap elements at start and end indices
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			// Move start index forward and end index backward
			start++;
			end--;
		}
	}
}
