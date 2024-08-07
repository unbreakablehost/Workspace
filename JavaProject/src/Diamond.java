
public class Diamond {

	public static void main(String[] args) {
		
		
		Diamond obj = new Diamond();
		obj.DiamondLoop();
	}
	
	
//	Assignment:
//		
//	      * 
//	     *  * 
//	    *  *  * 
//	   *  *  *  * 
//	    *  *  * 
//	      *  * 
//	        * 
	
	
	public void DiamondLoop() {
		
		
		for(int i = 1; i <= 4; i++) {
			
			for(int j = 4; j >= i; j--) {
				
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print(" * ");
				
				
			}
			
			System.out.println();
			
			
			
		}
		
		for(int i = 1; i <=3; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("  ");
			}
			
			for(int k = 3; k >= i; k--) {
				
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
			
		}
		
		
	}
	

}
