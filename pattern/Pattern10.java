package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				// Spaces printing
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				// Stars printing
				System.out.print("*");
			}
			System.out.println();
						
		}
	}

}
