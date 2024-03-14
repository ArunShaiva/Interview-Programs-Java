package pattern;

public class Pattern20 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (64+ j));
			}
			System.out.println();
		}
	}

}

//output
//A
//AB
//ABC
//ABCD
//ABCDE
