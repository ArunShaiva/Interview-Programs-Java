package basic;

public class CountCharactersInString {

	public static void main(String[] args) {

		String str = "hello how are you";

		int wc = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				wc++;
			}
		}
		System.out.println("Total number of characters in the String " + wc);
	}

}
