package basic;

public class SwapNumbers { // Swapping the variable using third variable

	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before swaping " + a + " " + b);

//		int temp = a;
//		a = b;                                //Logic 1
//		b = temp;

//		a = a + b;
//		b = a - b;                            //Logic 2
//		a = a - b;

//		a = a * b;
//		b = a / b;
//		a = a / b;

		// Swapping using bitwise operator

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After Swapping " + a + " " + b);

	}

}
