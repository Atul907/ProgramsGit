package string;

public class ReverseEachWord {

	public static void main(String[] args) {
	
		
		String a = "Program for Reverse String";
		
		String [] b = a.split(" ");
		
			for (int i=b.length-1; i>=0; i-- ) {
				
				System.out.print(" ");
				
				System.out.print(b[i]);
				
			}

	}

}
