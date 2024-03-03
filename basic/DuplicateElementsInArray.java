package basic;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String[] arr = { "java", "c", "c++", "Python", "java", "c", "c++" };

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) { // Compare strings using .equals() method
					System.out.println("Duplicate element found: " + arr[i]);
					flag = true;
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate elements not found");
		}
	}
}
