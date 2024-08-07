
public class LoopPractice789 {

	public static void main(String[] args) {
		LoopPractice789 obj = new LoopPractice789();
		obj.LoopPractice();

	}
	
//	Assignment 7		
//	 		   7 8
//			   7 8 9 	   
	
	public void LoopPractice() {
		
		for(int i = 7; i < 10; i++) {
			
			for(int j = 7; j <= i; j++) {
				
				System.out.print(j + " ");				
			}
			
			System.out.println();			
		}
	}
}
