
public class StringPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		 Assignment 1: Make first letter of each word capital

		System.out.println("Assignment 1: Make first letter of each word capital.");
		String str = "theRe iS gaRDen aND iT iS bEauTiful";

		str = str.toLowerCase();

		String[] ar = str.split(" ");

		for (int i = 0; i < ar.length; i++) {

			System.out.print("Output: " + (ar[i].substring(0, 1)).toUpperCase() + ar[i].substring(1, ar[i].length()) + " ");
		}

		System.out.println("\n");
		
		
		
		

//		Assignment 2: Print String = "Pune" in reverse.

		System.out.println("Assignment 2: Print String = \"Pune\" in reverse.");
		String str1 = "Pune";
		System.out.println("Output: ");
		for (int i = str1.length() - 1; i >= 0; i--) {

			System.out.print(str1.charAt(i));

		}

		System.out.println("\n");

		
		
		
		
		
//		Skipping Assignment no. 3,4,6 as topic for those programs yet to cover.
//		Assignment 5: 
//			a) Count vowels from the String (i.e. a,e,i,o,u)

		System.out.println("Assignment: Count vowels from the String");
		String str3 = "There Is Garden And It Is Beautiful";

		int counta = 0, counte = 0, counti = 0, counto = 0, countu = 0;

		for (int i = 0; i <= str3.length() - 1; i++) {

			if (str3.charAt(i) == 'a' || str3.charAt(i) == 'A') {

				counta = counta + 1;
			}
			
			if (str3.charAt(i) == 'e' || str3.charAt(i) == 'E') {

				counte = counte + 1;
			}			

			if (str3.charAt(i) == 'i' || str3.charAt(i) == 'I') {

				counti = counti + 1;
			}

			if (str3.charAt(i) == 'o' || str3.charAt(i) == 'O') {

				counto = counto + 1;
			}

			if (str3.charAt(i) == 'u' || str3.charAt(i) == 'U') {

				countu = countu + 1;
			}

		}

		System.out.println("Output: \n" + "a is " + counta + " times.\n" + "e is " + counte + " times.\n" + "i is " + counti + " times.\n"
				+ "o is " + counto + " times.\n" + "u is " + countu + " times.\n");
		
		
		
		
		
		
		
//		Assignment 5: 
//			b) Find count of each letter from  the String. 
//				i) By using ignoreCase() method
				
//		String str4 = "There Is Garden And It Is Beautiful";
//		String str5 = str4.toLowerCase().replaceAll(" ", "");
//		System.out.println(str5);
//		int i, count = 0;
//		char j = 'a';				
//		
//		for(i = 0; i <= str5.length()-1; i++) {
//		
//			for(j = 'a'; j < 'z'; j++) {
//				
//				if(j == str5.charAt(i)) {
//					
//					count = count + 1;
//				}		
//				
//				System.out.println("Count for " + j + " is " + count );
//			}
//			
//		}
		
		
//		Assignment 5: 
//		b) Find count of each letter from  the String. 
//			ii) For Capital and Small case.

		
//		Assignment 7: 
//		Remove all the spaces from the String (pre, post & inner spaces. Regex = \\s)
	
		System.out.println("Assignment 7: \nRemove all the spaces from the String pre, post & inner spaces");
		String str6 = "There is a garden and it is beautiful";
		String str7 = str6.trim().replaceAll(" ", "");
		System.out.println("Output\n" + str7);

//		Assignment 8: 
//		Remove all the special character from the String 
	
		System.out.println("\n\nAssignment 8: \nRemove all the special character from the String");
		String str8 = "T^&^*&here i^&*s a ga(*)(^%$rden a%$$%^&$^&nd i%^%&^t i%^$&%s beauti&&^^ful";
		System.out.println("Input String = " + str8);
		String str9 = str8.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println("Output = " + str9);

//		Assignment 9: 
//		Remove all the numbers from the String 
	
		System.out.println("\n\nAssignment 9: \nRemove all the numbers from the String");
		String str10 = "T12312h321e3r2e i12312s a3213 g123123arden a23132nd i123132t i12312s b123123eaut12312if12313ul";
		System.out.println("Input String = " + str10);
		String str11 = str10.replaceAll("\\d", "");
		System.out.println("Output = " + str11);

		
		

	}
}