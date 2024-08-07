
public class Triangle3 {

	public static void main(String[] args) {

		Triangle3 obj = new Triangle3();
		obj.triangleLoop();

	}
	
//	Assignment:   
//		
//	     3 
//	    3  3 
//	   3  3  3

	public void triangleLoop() {

		for (int i = 1; i <= 3; i++) {

			for (int k = 3; k >= i; k--) {

				System.out.print(" ");

			}

			for (int j = 1; j <= i; j++) {

				System.out.print(" 3 ");
			}

			System.out.println();

		}
	}
}
