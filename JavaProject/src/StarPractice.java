
public class StarPractice {

	public static void main(String[] args) {
		StarPractice obj = new StarPractice();
		obj.ForLoop();
		obj.LoopPractice();
		obj.LoopPractice1();
		obj.ForLoop1();
		obj.ForLoop2();
		obj.triangleLoop();
		obj.triangleLoop1();
		obj.starLoop();
		obj.LoopReverse();
		obj.DiamondLoop();

	}

// 1

//			   Assignment C B A
//			 				B A
//							  A

	public void ForLoop() {

		int l = 1;

		for (char i = 'C'; i >= 'A'; i--) {

			for (int k = 1; k <= l; k++) {

				System.out.print("  ");

			}

			l++;

			for (char j = i; j >= 'A'; j--) {

				// System.out.print("");
				System.out.print(j + " ");

			}

			System.out.println("");
		}
	
		System.out.println("");
	}
	

// 2

//		Assignment: 9 8 7
//					9 8
//					9

	public void LoopPractice() {

		for (int i = 7; i <= 9; i++) {

			for (int j = 9; j >= i; j--) {

				System.out.print(j + " ");

			}

			System.out.println();

		}
		System.out.println("");
	}

// 3

//		Assignment 7		
//		 		   7 8
//				   7 8 9 	   

	public void LoopPractice1() {

		for (int i = 7; i < 10; i++) {

			for (int j = 7; j <= i; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
		System.out.println("");
	}

// 4

//		Assignment 7 8 9
//		 			 8 9
//		               9

	public void ForLoop1() {

		for (int i = 7; i <= 9; i++) {

			for (int k = 7; k <= i; k++) {

				System.out.print("  ");

			}

			for (int j = i; j <= 9; j++) {

				System.out.print(" " + j);

			}

			System.out.println();

		}
		System.out.println("");
	}

// 5

//		Assignment A B C
//				   A B
//				   A

	public void ForLoop2() {

		for (char a = 'C'; a >= 'A'; a--) {

			for (char b = 'A'; b <= a; b++) {

				System.out.print(b + " ");

			}
			System.out.println();
		}
		System.out.println("");

	}

// 6

//		Assignment:
//			    1 
//			   2 2 
//			  3 3 3 

	public void triangleLoop() {

		for (int i = 1; i <= 3; i++) {

			for (int k = 3; k >= i; k--) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(i + " ");

			}

			System.out.println();

		}
		System.out.println("");

	}

// 7

//		Assignment:   
//			
//		     3 
//		    3  3 
//		   3  3  3

	public void triangleLoop1() {

		for (int i = 1; i <= 3; i++) {

			for (int k = 3; k >= i; k--) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(" 3 ");
			}

			System.out.println();

		}
		System.out.println("");
	}

// 8

//		Assignment:
//			
//		     * 
//		    *  * 
//		   *  *  * 

	public void starLoop() {

		for (int i = 1; i <= 3; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" * ");
			}

			System.out.println();

		}
		System.out.println("");
	}

// 9

//		Assignment:
//			
//			  *  *  * 
//			   *  * 
//			    * 

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
		System.out.println("");

	}

// 10

//		Assignment:
//			
//		      * 
//		     *  * 
//		    *  *  * 
//		   *  *  *  * 
//		    *  *  * 
//		      *  * 
//		        * 

	public void DiamondLoop() {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" * ");

			}

			System.out.println();

		}

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("  ");
			}

			for (int k = 3; k >= i; k--) {

				System.out.print(" * ");

			}

			System.out.println();

		}

	}

}
