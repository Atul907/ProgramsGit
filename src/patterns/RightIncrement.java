package patterns;

public class RightIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c,l; 
		
		for (r=1; r<=5;r++) {
			for(l=4;l>=r;l-- ) {
				System.out.print(" ");
			}
		
		for (c=1; c<=r; c++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
