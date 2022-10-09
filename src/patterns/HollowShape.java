package patterns;

public class HollowShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c;
		
		for(r=1;r<=7;r++) {					// for row
			
			for(c=1;c<=7;c++) {				// for column
				
				if(r>=2 && r<=6 && c>=2 && c<=6) {		// where not to print star but print space
					System.out.print(" ");				// to print space
				}
				else {
				System.out.print("*");					// to print star
			}
			}	
			System.out.println();
		}
		
	}

}
