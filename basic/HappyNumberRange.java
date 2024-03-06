package basic;

public class HappyNumberRange {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			int num = i;
			int temp = num;
			while (temp != 1 && temp != 4) { // Adding condition for looping
				temp = sumSqDigit(temp);
			}

			if (temp == 1) {
				System.out.print(num + " ");
			}
		}
	}

	public static int sumSqDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * rem;
			n = n / 10;
		}
		return sum;
	}
}
