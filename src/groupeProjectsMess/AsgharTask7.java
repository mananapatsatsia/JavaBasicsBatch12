package groupeProjectsMess;

public class AsgharTask7 {

	public static void main(String[] args) {
		/*fibonacciWrite a program to print the first 100 numbers
		 * Fibonacci sequence: 0,1,1,2,3,5,8,13,21,34
		 * 0+1=1, 1+1=2,2+1=3,3+2=5,5+3=8, 8+5=13 ect ect
		 */
		
		int howMany=10;
		int previous=0;
		int current=1;
		int next=0;
		
		System.out.println("Previous number: "+previous);
		System.out.println("Current number: "+current);
		
		for(int i=0; i<howMany-2; i++) {
			next=previous+current;
			System.out.println("Previous number: "+previous);
			System.out.println("Current number: "+current);
			System.out.println(previous+"+"+current+"="+next);
			//System.out.println("Next number: "+next+" ");
			previous=current;
			current=next;
		}
	}
}

	


