package string;

public class ReverseEachString {

	public static void main(String[] args) {

		
		String a = " Reverse Each String";
		
		String [] var = a.split(" ");
		
		for (String single :var ) {
			
				System.out.print(" ");
			
			for (int i = single.length()-1 ; i>= 0; i--) {
				
				char b = single.charAt(i);
				
				System.out.print(b);
			}
		}
		
	}

}
