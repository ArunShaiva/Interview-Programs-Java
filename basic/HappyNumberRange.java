package basic;

public class HappyNumberRange {
	public static void main(String[] args) {
		System.out.println("Happy numbers within the range of 1 to 100:");
		for (int i = 1; i <= 100; i++) {
			if (isHappy(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isHappy(int num) {
		int slow = num, fast = num;
		do {
			slow = sumOfSquaresOfDigits(slow); // Move slow pointer one step
			fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast)); // Move fast pointer two steps
		} while (slow != fast); // If there is a cycle, they will meet eventually
		return slow == 1;
	}

	public static int sumOfSquaresOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}
}
