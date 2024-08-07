package collectionPractice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Program to remove element from array using Collection
public class CollectionRemoveElement {
	public static void main(String[] args) {

		// Array 
		Integer[] array = { 1, 2, 3, 4, 5 };

		// converting array to list
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		System.out.println("Enter element to remove from array: " + list);

		// taking input and saving in elementToRemove Integer class object
		Scanner scn = new Scanner(System.in);
		Integer elementToRemove = scn.nextInt();

		// removing the element given by user from list
		list.remove(elementToRemove);

		// closing the connection
		scn.close();
		
		// converting list back to the array
		array = list.toArray(new Integer[0]);

		// printing the updated array
		System.out.println("Updated array: " + Arrays.toString(array));
	}
}
