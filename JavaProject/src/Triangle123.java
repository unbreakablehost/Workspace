
public class Triangle123 {

	public static void main(String[] args) {
		Triangle123 obj = new Triangle123();

		obj.triangleLoop();

	}
	
	
//	Assignment:
//		    1 
//		   2 2 
//		  3 3 3 

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

	}

}
