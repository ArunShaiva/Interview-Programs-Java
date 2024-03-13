package pattern;

public class Pattern_9 {

	public static void main(String[] args) {

		int n = 5;

		
		//1st part
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd part
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			int spaces = 2 * (n - i);
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
