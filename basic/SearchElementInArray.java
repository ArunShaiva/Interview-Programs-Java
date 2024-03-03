package basic;

import java.util.Scanner;

public class SearchElementInArray { // Linear search
	public static void main(String[] args) {
		
		int nums[] = {5,56,67,89,678,97,6,7,8,6655,44,66,34};
		int target=56;
		
		int result= linearSearch(nums,target);
		
		if(result !=1) {
			System.out.println("Element found at index :"+result);
		}
		else {
			System.out.println("Element not found");
		}

	}
	
	public static int linearSearch(int[] nums,int target ) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target)
				return i;
		}
		return -1;
	}
}
