
public class FactorialEx {

	public static void main(String[] args) {
		
		//Factorial program using recursive method
		
		FactorialEx obj = new FactorialEx();
		int a =obj.facto(6);
		System.out.println(a);
	}
		
	public int facto(int x) {
		if(x == 1) {
			
			return 1;
		}
		return x * facto(x - 1); //recursive calling		
	}

}


