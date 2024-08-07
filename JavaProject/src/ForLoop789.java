
public class ForLoop789 {

	public static void main(String[] args) {

		ForLoop789 obj = new ForLoop789();
		obj.ForLoop();

	}
	
//	Assignment 7 8 9
//				 8 9
//				   9

	public void ForLoop() {

		for (int i = 7; i <= 9; i++) {

			for (int k = 7; k <= i; k++) {

				System.out.print("  ");

			}

			for (int j = i; j <= 9; j++) {

				System.out.print(" " + j);

			}

			System.out.println();

		}

	}

}

//	condition		output
//	i=7, j=7		7
