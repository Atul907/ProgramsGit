package string;

public class ReverseEachString2 {

	public static void main(String[] args) {

		String x = "Just Keep Trying";
		
		String [] var = x.split(" ");
		
		for (String element:var) {
			
			System.out.print(" ");
			
			for (int i = element.length()-1; i>=0; i--) {
				
		//	char b = element.charAt(i);
			System.out.print(element.charAt(i));
				
			}
		}
		
		
	}

}
