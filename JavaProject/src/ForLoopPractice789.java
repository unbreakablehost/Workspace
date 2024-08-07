
public class ForLoopPractice789 {

	public static void main(String[] args) {

		ForLoopPractice789 obj = new ForLoopPractice789();
		obj.FoorLoop();

	}

//	Assignment: 7
//				7 8
//				7 8 9

	public void FoorLoop() {

		for (int i = 7; i <= 9; i++) {

			for (int j = 7; j <= i; j++) {

				System.out.print(j + " ");

			}

			System.out.println();

		}

	}

}

//condition 		output
// i=7, j=7			7
// i=8, j=7			7 8
// 
