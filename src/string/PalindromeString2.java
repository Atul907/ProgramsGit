package string;

public class PalindromeString2 {

	public static void main(String[] args) {

		String x = "Level";
		String y = " ";
		String z = x;		
		
		for (int i = x.length()-1; i>=0; i--) {
			
			y = y + x.charAt(i);	
		}
		
		System.out.println(y);		
		
		if (z.equals(x)) {
			
			System.out.println(y + ": is Palindrome Word");
		}
		
		else {
			
			System.out.println(y + "is not Palindrome Word");
		}		
	}
}
