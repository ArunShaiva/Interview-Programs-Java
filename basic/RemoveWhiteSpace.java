package basic;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "  Hello\t   How\nare you?  ";

		// Remove whitespace characters without using replaceAll()
		StringBuilder resultBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				resultBuilder.append(ch);
			}
		}
		String result = resultBuilder.toString();

		System.out.println("Original string: \"" + str + "\"");
		System.out.println("String after removing whitespace: \"" + result + "\"");
	}
}

//Using built in function

/*	public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "  Hello\t   How\nare you?  ";

        // Remove whitespace characters using regular expression
        String result = str.replaceAll("\\s", "");

        System.out.println("Original string: \"" + str + "\"");
        System.out.println("String after removing whitespace: \"" + result + "\"");
    }
}   */
