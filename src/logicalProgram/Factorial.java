package logicalProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("enter your number :");
		
		int num= s.nextInt();
		int i,fact=1;
		
		for (i=1; i<=num;i++) {
			fact=fact*i;
			
			s.close();
		}
		System.out.println("factorials are " +num+":"+fact);
		
	}
	
}
