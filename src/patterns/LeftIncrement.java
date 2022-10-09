package patterns;

public class LeftIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,c;
		
		for (r=1; r<=7; r++ ) { 		// for row
			for(c=1; c<=r; c++) {		// for column
				System.out.print("* ");	// to print star & space
			}
			System.out.println();
		}
	}

}
