package basic;

public class Pangram {
	public static void main(String[] args) {
		String sentence = "The Quick brown fox jumps over the lazy dog";

		boolean isPangram = isPangram(sentence.toLowerCase());

		if (isPangram) {
			System.out.println("The sentence is a pangram.");
		} else {
			System.out.println("The sentence is not a pangram.");
		}
	}

	public static boolean isPangram(String str) {
		if (str.length() < 26) {
			return false;
		} else {
			for (char ch = 'a'; ch <= 'z'; ch++) {
				if (str.indexOf(ch) < 0) {
					return false;
				}
			}
		}
		return true; // Return true if all 26 letters are found
	}
}
