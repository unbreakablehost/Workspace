
public class ForLoopABC {

	public static void main(String[] args) {

		ForLoopABC obj = new ForLoopABC();
		obj.ForLoop();

	}
	
	
//	Assignment A B C
//			   A B
//			   A
	 
	
	
	public void ForLoop() {
		
		for(char a='C'; a >= 'A'; a--) {
			
			for(char b = 'A'; b <= a; b++) {
				
				System.out.print(b + " ");
				
				
			}
			System.out.println();
		}
		
	}

}
