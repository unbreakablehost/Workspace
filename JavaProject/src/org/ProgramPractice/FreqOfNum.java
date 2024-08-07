package org.ProgramPractice;

public class FreqOfNum {

	public static void main(String[] args) {
		// Find the frequency of each element in the array

		int arr[] = { 101, 100, 100, 1, 2000, 300, 100, 300, 4, 5 };
		
		for (int i = 0; i < arr.length ; i++) {

			int count = 1;
			
			for (int j = i + 1; j < arr.length; j++) {

				
				
				if (arr[i] == arr[j]) {

					count = count + 1;

				}

			}

			System.out.println(arr[i] + " is " + count + " times.");
		}

	}

}
