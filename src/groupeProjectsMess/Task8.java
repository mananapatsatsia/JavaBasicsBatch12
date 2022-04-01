package groupeProjectsMess;

public class Task8 {

	public static void main(String[] args) {
		int[] num= {3,15,38,9000,3788};
		int max=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
			max=num[i];
			System.out.println(max);
		}
		
		

	}
	System.out.println("+++++++++++++++++++++++++++");
	int[]number ={13,15,45,10,32,75,50,100};
	
	int min=number[0];
	
	for (int n=0;n<number.length;n++) {
		if(number[n]<min) {
			min=number[n];
		}
	}System.out.println(min);
		
    int max1=number[0];
	
	for (int n=0;n<number.length;n++) {
		if(number[n]>max) {
			max=number[n];
		}
	}

	System.out.println(max1);
	
	}
	
}
