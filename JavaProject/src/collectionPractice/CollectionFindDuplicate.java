package collectionPractice;
import java.util.*;

//Program to remove duplicates from array using Collection
public class CollectionFindDuplicate {
	
	public static void main(String[] args) {
		
		// original array with duplicate elements
		Integer[] arr = { 1, 2, 3, 2, 4, 5, 3 };
		System.out.println("Array with duplicate numbers: " + Arrays.toString(arr));
		
		// converting the array to ArrayList
		List<Integer> list = Arrays.asList(arr);

		// creating a HashSet from the ArrayList
		Set<Integer> set = new HashSet<>(list);

		// converting HashSet back to array
		Integer[] uniqueArray = set.toArray(new Integer[0]);

		// printing the array with unique elements
		System.out.println("Array without duplicate numbers: " + Arrays.toString(uniqueArray));
	}
}
