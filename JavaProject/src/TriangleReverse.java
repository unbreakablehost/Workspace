
public class TriangleReverse {

	public static void main(String[] args) {

		TriangleReverse obj = new TriangleReverse();
		obj.LoopReverse();
	}
	
//	Assignemnt:
//		
//		  *  *  * 
//		   *  * 
//		    * 

	public void LoopReverse() {

		for (int i = 1; i <= 3; i++) {

			for (int k = 1; k <= i; k++) {

				System.out.print(" ");

			}

			for (int j = 3; j >= i; j--) {

				System.out.print(" * ");

			}

			System.out.println();

		}

	}

}
