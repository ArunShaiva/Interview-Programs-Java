package array;

import java.util.Arrays;

public class UpdateElementInArray {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int indexToUpdate = 2;
		int newValue = 10;

		System.out.println("Original Array: " + Arrays.toString(array));

		// Update the value at the specified index
		updateElement(array, indexToUpdate, newValue);

		System.out.println("Array after updating value at index " + indexToUpdate + ": " + Arrays.toString(array));
	}

	public static void updateElement(int[] array, int index, int newValue) {
		if (index < 0 || index >= array.length) {
			throw new IllegalArgumentException("Index is out of bounds.");
		}

		// Update the value at the specified index
		array[index] = newValue;
	}
}
