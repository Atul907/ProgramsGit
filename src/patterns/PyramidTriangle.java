package patterns;

public class PyramidTriangle {

	public static void main(String[] args) {

		 int a,b,c,d;
		 
		 for (a=1; a<=5; a++) 		// for row
		 {
			 for (b=4; b>=a; b--) 		// to print space
			 {
				 System.out.print(" ");
			 }
		 for (c=1; a>=c; c++)			// for column
		 {
			 	System.out.print("*");
		 }
			 for (d=2; a>=d; d++ ) 		// 2nd half triangle
			 {
				 System.out.print("*");
			 }
			 	System.out.println();
		 }
		 }
	}

