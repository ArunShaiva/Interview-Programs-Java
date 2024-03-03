package basic;

import java.util.Scanner;

public class CountEvenAndOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int even = 0;
		int odd = 0;

		while (num > 0) {

			int rem = num % 10;
			if (rem % 2 == 0)
				even++;
			else
				odd++;

			num = num / 10;

		}
		System.out.println("Even numbers are "+even);
		System.out.println("Odd numbers are "+odd);
	}

}





//Another Method using 

//import java.util.Scanner;
//
//public class CountEvenOddDigits {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        int evenCount = countEvenDigits(number);
//        int oddCount = countOddDigits(number);
//
//        System.out.println("Number of even digits: " + evenCount);
//        System.out.println("Number of odd digits: " + oddCount);
//
//        scanner.close();
//    }
//
//    // Function to count the number of even digits in a number
//    public static int countEvenDigits(int number) {
//        int count = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            if (digit % 2 == 0) {
//                count++;
//            }
//            number /= 10;
//        }
//        return count;
//    }
//
//    // Function to count the number of odd digits in a number
//    public static int countOddDigits(int number) {
//        int count = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            if (digit % 2 != 0) {
//                count++;
//            }
//            number /= 10;
//        }
//        return count;
//    }
//}

