package string;

public class ReverseEachWord2 {

	public static void main(String[] args) {

		String s = "Lets try something different ";
		
		String [] var = s.split(" ");
		
		for (int i = var.length-1; i>=0; i--) {
			
		//	System.out.print(" ");
			System.out.print(" " + var[i]);
			
		}
		
		
	}

}
