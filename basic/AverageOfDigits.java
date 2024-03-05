package basic;

public class AverageOfDigits {
	public static void main(String[] args) {
		int number = 12345; // Change this number to calculate average of digits for a different number

		double average = calculateAverageOfDigits(number);

		System.out.println("Average of digits of " + number + " is: " + average);
	}

	public static double calculateAverageOfDigits(int number) {
		int sum = 0;
		int count = 0;

		// Extract digits and add them to the sum while counting them
		while (number > 0) {
			int digit = number % 10; // Extract the last digit
			sum += digit; // Add the digit to the sum
			count++; // Increment the count of digits
			number /= 10; // Move to the next digit
		}

		// Calculate the average of digits
		double average = (double) sum / count;

		return average;
	}
}
