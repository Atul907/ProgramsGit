package patterns;

public class LeftDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c;
		
		for (r=1; r<=7; r++) {
			for (c=6; c>=r; c--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
