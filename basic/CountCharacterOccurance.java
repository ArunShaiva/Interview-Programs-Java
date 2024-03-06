package basic;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacterOccurance {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		
		str = str.replaceAll(" ", "").toLowerCase();
		char[] arr = str.toCharArray();
		int count = 0;
		Map<Character, Integer> map = new TreeMap<>();

		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);

		}
		System.out.println(map);

	}
}
     
      //Using built in function
//public class CountCharacterOccurance {
//	public static void main(String[] args) {
//		String str = "AaaRUN J";
//		int[] charCount = new int[128]; // Assuming ASCII characters
//
//		// Iterate through each character of the string
//		char[] charr = str.toCharArray();
//
//		for (char ch : charr) {
//			// Increment count for the character

//			charCount[ch]++;
//		}
//
//		// Print character occurrences
//		for (int i = 0; i < 128; i++) {
//			if (charCount[i] > 0 && (char) i != ' ') { // Exclude space character
////				System.out.println("Character '" + (char) i + "' occurs " + charCount[i] + " times.");
//				System.out.println("Character " + (char) i + " occurs " + charCount[i] + " times");
//			}
//		}
//	}
//}


