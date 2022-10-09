package logicalProgram;

public class Table {

	public static void main(String[] args) {
		// print the table of number input by user
			int n= 3; 
			int sum ;
			 for (int i=1; i<=10; i++) {		// i= 1,2,3,4,5,6...	
				  
				 sum= i*n;						// i*n-- n*1,n*2,n*3...
				 System.out.println(sum);
			 }
		}
}
