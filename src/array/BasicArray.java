package array;

public class BasicArray {

	public static void main(String[] args) {

		String [] i = new String [4];
		
		i [0] = "Software";
		i [1] = "Testing";
		i [2] = "Quality";
		i [3] = "Engineer";
		
		int size = i.length; 			// to get string size
		
		for (String single :i ) {				// one way using advanced for loop
			
			System.out.println(single);
			//System.out.print(single);
			//System.out.print(single + " ");
			System.out.println(size);
		}
		
		for (int a =0; a<size; a++) {			// another way by using basic for loop
			
			System.out.println(i[a]);
		}
	}

}
