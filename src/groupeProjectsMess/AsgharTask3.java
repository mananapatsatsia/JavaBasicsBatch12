package groupeProjectsMess;

import java.util.Arrays;

public class AsgharTask3 {

	public static void main(String[] args) {
		 // Create a 2D array of integer type where you will store add and even numbers.
		//create the 2D array
				int [][] array2D= {{2,3,4},{5,6},{12,6,8}};
				//print out the elements of an array with out a loops
				//System.out.println(Arrays.toString(array2D));
				//sum all the elements of the array
				
				for(int x=0;x<array2D.length;x++) {
					
					for(int j=0;j<array2D[x].length;j++) {
						int element=array2D[x][j];
						if(element%2==0) {
							System.out.println(element);
						}
					}
				}
		         
			

	}

}
