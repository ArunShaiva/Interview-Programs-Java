package basic;

public class SearchElementInArrayBinary {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 8, 9, 15, 23 };
		int target = 92;
		int result = binarySearch(arr, target);
		if (result != -1) {
			System.out.println("Element " + target + " found at index " + result + ".");
		} else {
			System.out.println("Element " + target + " not found in the array.");
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			// Check if target is present at mid
			if (arr[mid] == target) {
				return mid;
			}

			// If target greater, ignore left half
			if (arr[mid] < target) {
				left = mid + 1;
			} else { // If target is smaller, ignore right half
				right = mid - 1;
			}
		}

		// If we reach here, then the element was not present
		return -1;
	}

}
