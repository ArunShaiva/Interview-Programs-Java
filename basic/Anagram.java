package basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "keep";
		String str2 = "peek";

		if (isAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are Anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagrams");

		}

	}

	public static boolean isAnagrams(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {
				return true;
			} else {
				return false;
			}
		}
	}

}
