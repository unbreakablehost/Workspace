class override1{
	
	public int addition(int a, int b) {
		return a+b;
	}
}


public class overloadOverride  extends override1{

	
	public int addition(int a, int b) {
		
		return a+b;
		
	}
	
	public int addition(int a, int b, int c) {
		
		return a+b+c;
		
	}
	
	
	public static void main(String[] args) {

		overloadOverride obj1 = new overloadOverride();
		
		int a = obj1.addition(10,20);
		int b = obj1.addition(10,20,30);
		
		
		System.out.println("Addition is" + a);
		System.out.println("Addition is" + b);
		

		

	}

}
