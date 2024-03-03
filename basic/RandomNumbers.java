package basic;

import java.util.Random;

public class RandomNumbers {
	
	public static void main(String[] args) {
		
		Random rand = new Random();   
		int num= rand.nextInt(10);          //We can specify the range generate the number within this range
		System.out.println(num);
		
		
		//Another Method
		System.out.println(Math.random());
		
	}

}
