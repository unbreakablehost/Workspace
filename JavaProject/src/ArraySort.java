
public class ArraySort {

	public static void main(String[] args) {

		ArraySort obj = new ArraySort();
		obj.arraySorting();

	}

//	WAP that moves all the 0 to the last of the Array and keeps non zero sequence same.
	
	public void arraySorting() {

		int[] actArr = { 2, 0, 0, 4, 5, 0, 9, 0, 10, -15, 0 };
//	Expected result: 2,4,5,9,10,-15,0,0,0,0,0

		int len = actArr.length;

		System.out.println("Actual Array: ");
		for (int i = 0; i < len; i++) {

			System.out.print(actArr[i] + " ");
		}

		int[] exptArray = new int[len];

		for (int a = 0, b = 0; a < len; a++) {

			if (actArr[a] != 0) {

				exptArray[b] = actArr[a];
				b++;

			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Array after sort: ");

		for (int i = 0; i < len; i++) {
			
			System.out.print(exptArray[i] + " ");

		}
		
		
		
//Execution:		
//		a = 0,1,2,3,4,5,6,7,8,9,10
//		b = 0,1,2,3,4,5
		
//		Output = 2 4 5 9 10 -15 0 0 0 0 0
		
		
		

	}
}
