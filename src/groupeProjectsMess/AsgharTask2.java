package groupeProjectsMess;

import java.util.Arrays;

public class AsgharTask2 {

	public static void main(String[] args) {
		 // Create a 2D array of integer values.Print the sum of all numbers.
		//create the 2D array
				int [][] array2D= {{10,10,10},{20,20,20},{30,30,30}};
				//print out the elements of an array with out a loops
				//System.out.println(Arrays.toString(array2D));
				//sum all the elements of the array
				int sum=0;
				for(int x=0;x<array2D.length;x++) {
					System.out.println(Arrays.toString(array2D[x]));
					for(int j=0;j<array2D[x].length;j++) {
						sum=sum+array2D[x][j];
					}
				}
		          System.out.println("Sum of Array elements is "+sum);
			

        
	}

}
