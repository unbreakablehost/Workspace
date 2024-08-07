
public class ForLoopPattern987 {

	public static void main(String[] args) {

		ForLoopPattern987 obj = new ForLoopPattern987();
		obj.LoopPractice();

	}

//	Assignment: 9 8 7
//				9 8
//				9
	
	
	public void LoopPractice() {

		for (int i = 7; i <= 9; i++) {

			for (int j = 9; j >= i; j--) {

				System.out.print(j + " ");

			}

			System.out.println();

		}

	}

}
