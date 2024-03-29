package basic;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = sc.nextInt();

        isPrime(input);

        sc.close();
    }

    public static void isPrime(int num) {
        int count = 0;

        if (num > 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }	
            }
            if (count == 1) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        } else {
            System.out.println("Number is not a prime number");
        }
    }
}
