package basic;

public class VowelsAndConsonants {

	public static void main(String[] args) {

		String str = "I Love java prett much ";

		int vCount = 0;
		int cCount = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			} else if (Character.isLetter(ch)) {
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);
		System.out.println("Number of consonants: " + cCount);
	}

}
