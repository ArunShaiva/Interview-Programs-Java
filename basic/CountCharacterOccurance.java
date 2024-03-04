package basic;

public class CountCharacterOccurance {
	public static void main(String[] args) {
		String str = "AaaRUN J";
		int[] charCount = new int[128]; // Assuming ASCII characters

		// Iterate through each character of the string
		char[] charr = str.toCharArray();

		for (char ch : charr) {
			// Increment count for the character
			charCount[ch]++;
		}

		// Print character occurrences
		for (int i = 0; i < 128; i++) {
			if (charCount[i] > 0 && (char) i != ' ') { // Exclude space character
//				System.out.println("Character '" + (char) i + "' occurs " + charCount[i] + " times.");
				System.out.println("Character " +(char) i+ " occurs "+charCount[i]+" times" );
			}
		}
	}
}
