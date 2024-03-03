package basic;

public class WordCount {
	public static void main(String[] args) {
		String str = "Hello World! How are you? hai hai hai hai arun how are you";

		// Split the string into words using whitespace as delimiter
		String[] words = str.split("\s");

		// Count the number of words
		int wordCount = words.length;

		System.out.println("Number of words in the string: " + wordCount);
	}
}
