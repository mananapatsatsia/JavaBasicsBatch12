package groupeProjectsMess;

public class AsgharTask4 {

	public static void main(String[] args) {
		int [][] num= {{1,5,8,3,2},
			      {12,3,7,5,13},
			      {15,18}
			      };
	int sumEven=0;
	int sumOdd=0;
	//enhanced for loop
	//for(int[] row:num){
	//  for(int element:row){ and then if(.....
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num[i].length;j++) {
			int element=num[i][j];
			//if(element%2==0
			if(num[i][j]%2==0) {
			sumEven+=element;
		}else {
			sumOdd+=element;
		}
		}
	}
	System.out.println(sumEven);
	System.out.println(sumOdd);
	}
}
