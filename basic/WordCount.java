package basic;

public class WordCount {
	public static void main(String[] args) {
		String str = "Hello World! How are you? hai hai hai hai arun how are you";

		// Count the number of words
		int wordCount = countWords(str);

		System.out.println("Number of words in the string: " + wordCount);
	}

	// Function to count the number of words in a string
	public static int countWords(String str) {
		int wordCount = 0;
		boolean isWord = false;

		// Loop through each character in the string
		for (int i = 0; i < str.length(); i++) {
			// Check if the character is a letter
			if (Character.isLetter(str.charAt(i))) {
				// If the character is a letter and isWord is false, it means we encounter a new
				// word
				if (!isWord) {
					wordCount++;
					isWord = true;
				}
			} else {
				// If the character is not a letter, set isWord to false
				isWord = false;
			}
		}
		return wordCount;
	}
}
