package collectionPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Object> arr = new ArrayList<Object>();
		ArrayList<Object> arr2 = new ArrayList<Object>();
		
		arr.add(10);
		arr.add("Test");
		arr.add('a');
		
		arr2.add(20);
		arr2.add("Test");
		arr2.add('a');
		
		
		
		System.out.println(arr);
		System.out.println(arr2);
					
		arr.addAll(arr2);
		System.out.println(arr);
		
		System.out.println("arr.get(0) : " + arr.get(0));
		System.out.println("arr2.get(0) : " + arr2.get(0));
		
		System.out.println("arr.size() : " + arr.size());
		System.out.println("arr2.size() : " + arr2.size());
		
		arr.remove(0);
		System.out.println(arr); 
		
		arr2.removeAll(arr);
		System.out.println(arr2);
		
	}

}
