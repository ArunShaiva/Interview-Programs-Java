package basic;

public class CheckArraysEqual {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 1, 2, 3, 4 };

		boolean status = true;

		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
					break; // Once we find a mismatch, we can exit the loop
				}
			}
		} else {
			status = false;
		}

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
		
	}
}

// Using built in function

//public class CheckArraysEqual {
//
//	public static void main(String[] args) {
//
//		int[] a1 = { 1, 2, 3, 4 };
//		int[] a2 = { 1, 2, 3, 4 };
//
//		boolean status = Arrays.equals(a1, a2);
//
//		if (status)
//			System.out.println("Arrays are equal");
//		else
//			System.out.println("Arrays are not equal");
//
//	}
//}
