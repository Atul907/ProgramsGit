package logicalProgram;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the max limit:");
		int n = ip.nextInt();
		int i;
		
		for (i=1;i<=n;i++ ) {
			if(i%2==0) {
				System.out.print(" "+i);
				ip.close();
			}
		}
	}

}
