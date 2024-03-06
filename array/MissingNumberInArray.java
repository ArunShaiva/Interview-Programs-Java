package array;

public class MissingNumberInArray {

	public static void main(String[] args) {

		
		//For finding this array should be in a proper sequence if not it doesn't work
		int a[] = { 1, 2, 3, 4, 5, 7, 8, 9 };

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array: " + sum1);

		int sum2 = 0;
		for (int i = 1; i <= a.length + 1; i++) {
			sum2 = sum2 + i;
		}

		System.out.println("Sum of elements in array: " + sum2);

		System.out.println("Missing number is: " + (sum2 - sum1));
	}
}
