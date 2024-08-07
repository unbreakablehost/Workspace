
public class FoorLoopPattern {

	public static void main(String[] args) {

		FoorLoopPattern obj = new FoorLoopPattern();
		obj.ForLoop();

	}

	public void ForLoop() {

//		   Assignment C B A
//		 				B A
//						  A

		int l = 1;

		for (char i = 'C'; i >= 'A'; i--) {

			for (int k = 1; k <= l; k++) {

				System.out.print("  ");

			}

			l++;

			for (char j = i; j >= 'A'; j--) {

				//System.out.print("");
				System.out.print(j + " ");

			}

			System.out.println("");

		}

	}

}
