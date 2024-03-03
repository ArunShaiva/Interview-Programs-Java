package basic;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "Hello! How are you?";

		// Remove special characters without using replaceAll()
		StringBuilder resultBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetterOrDigit(ch) || Character.isWhitespace(ch)) {
				resultBuilder.append(ch);
			}
		}
		String result = resultBuilder.toString();

		System.out.println("Original string: \"" + str + "\"");  //to print as it is
		System.out.println("String after removing special characters: \"" + result + "\"");
	}
}
