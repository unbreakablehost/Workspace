
public class StarTriangle {

	public static void main(String[] args) {
	
		StarTriangle obj = new StarTriangle();
		obj.starLoop();
	}
	
//	Assignement:
//		
//	     * 
//	    *  * 
//	   *  *  * 
	
	
	public void starLoop() {
		
		for(int i = 1; i <=3; i++) {
			
			for(int j = 3; j >= i; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print(" * ");
			}
			
			System.out.println();
			
		}
	}
}
