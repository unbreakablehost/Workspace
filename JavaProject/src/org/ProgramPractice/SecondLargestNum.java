package org.ProgramPractice;

public class SecondLargestNum {

	public static void main(String[] args) {

		// Find the second smallest number in an array
		int arr[] = { 101, 100, 1, 2000, 300, 300, 4, 5 };
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

				if (arr[i] == 1) {
					break;

				}

			}
		}

		System.out.println(arr[1]);

	}

}
