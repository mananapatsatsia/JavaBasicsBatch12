package groupeProjectsMess;

public class Task2 {
     //Create a 2D array of integer values. Print the sum of all numbers.
	public static void main(String[] args) {
		int [][] num= {{1,2,3,4,5,6},
				       {1,2,3,4,5,6},
				       {1,2,3,4,5,6},
				       {1,2,3,4,5,6}
		              };
		int sum=0;
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
			sum +=num[i][j];	
			}
		}
		System.out.println(sum);
	}
}
