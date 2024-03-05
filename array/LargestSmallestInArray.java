package array;

public class LargestSmallestInArray {
	public static void main(String[] args) {
		int[] array = { 5, 3, 9, 1, 7, 2, 8, 4, 6 };

		int largest = findLargestElement(array);
		int smallest = findSmallestElement(array);

		System.out.println("Array: " + java.util.Arrays.toString(array));
		System.out.println("Largest Element: " + largest);
		System.out.println("Smallest Element: " + smallest);
	}

	public static int findLargestElement(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty.");
		}

		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int findSmallestElement(int[] array) {
		if (array.length == 0) {
			throw new IllegalArgumentException("Array is empty.");
		}

		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
}
