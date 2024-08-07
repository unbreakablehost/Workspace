package org.LoopPractice;

public class largestNumber {

	public static void main(String[] args) {

		//Swaraj
		// program to find largest number from the array

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
