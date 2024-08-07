package org.LoopPractice;

public class SecondLargestNumber {

	public static void main(String[] args) {

		// 
		// program to find second largest number from the array
		// find count of similar element from the String and Array 

		int num[] = {1001, 300, 90, 1, 101, 200, 1000};
		int max = num[0];

		for (int i = 0; i < num.length - 1; i++) {

			if (max < num[i + 1]) {

				max = num[i + 1];
			}
		}
		
		System.out.println(max);
	}
}
