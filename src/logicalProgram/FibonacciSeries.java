package logicalProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 5;
		int a=0, b=1, c, i=0;
		System.out.println("Fibonacci series : ");
		while(i<=n) {		
			c = a+b;
			a=b;
			b=c;
			i++;
			System.out.print(" "+c);
		}
	}
}
