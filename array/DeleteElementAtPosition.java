package array;

import java.util.Arrays;

public class DeleteElementAtPosition {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int positionToDelete = 2;

		System.out.println("Original Array: " + Arrays.toString(array));

		// Delete the element at the specified position
		array = deleteElementAtPosition(array, positionToDelete);

		System.out.println(
				"Array after deleting element at position " + positionToDelete + ": " + Arrays.toString(array));
	}

	public static int[] deleteElementAtPosition(int[] array, int position) {
		if (position < 0 || position >= array.length) {
			throw new IllegalArgumentException("Position is out of bounds.");
		}

		// Create a new array with reduced length to accommodate the deleted element
		int[] newArray = new int[array.length - 1];

		// Copy elements from the original array to the new array until the specified
		// position
		for (int i = 0; i < position; i++) {
			newArray[i] = array[i];
		}

		// Skip the element at the specified position while copying elements from the
		// original array to the new array
		for (int i = position; i < newArray.length; i++) {
			newArray[i] = array[i + 1];
		}

		return newArray;
	}
}
