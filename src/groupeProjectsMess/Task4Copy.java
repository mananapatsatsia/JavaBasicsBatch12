package groupeProjectsMess;

public class Task4Copy {

	public static void main(String[] args) {
		int[][] numbers = { { 1, 2, 3, 4, 5, 6, 7 }, { 10, 11, 12, 13, 14 }, { 14, 15, 16, 17, 18 } };
		int sumEven = 0;
		int sumOdd=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0) {
					sumEven = sumEven + numbers[i][j];
				}else {
					sumOdd=sumOdd+numbers[i][j];
				}
			}
		}
		System.out.println("the sum of Even Numbers are " + sumEven);
		System.out.println("the sum of Odd Numbers are" + sumOdd);
	}


	

}
