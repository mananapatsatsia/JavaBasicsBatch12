package groupeProjectsMess;

public class Task4 {

	public static void main(String[] args) {
		int [][] num= {{1,5,8,3,2},
			      {12,3,7,5,13},
			      {15,18}
			      };
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]%2==0) {
					  even+=num[i][j];
					}
			 }
			}
		System.out.println("The sum of the even numbers in array is "+even);//
		System.out.println("=====================================");
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]%2==1) {
					 odd+=num[i][j];
					}
				}
		}
		System.out.println("The sum of the odd numbers in array is "+odd);
	}
}
