package logicalProgram;

public class PrimeNumbers {
	
	public static void main (String []args) {
		
		int n= 20;	
		int i,t=0;
		if (n==0 || n==1) {
			System.out.println("Number is neither prime nor composite");
		}
		else {
			for( i=2; i<=n;i++) {
				if(n%i==0) {
					t++;
				}
			}
				if (t==1) {
					System.out.println(" Is Prime Number");
				}
				else {
					System.out.println("Is not Prime Number");
				}
		}		
	}
}
