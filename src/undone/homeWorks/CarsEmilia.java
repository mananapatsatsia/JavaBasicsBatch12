package undone.homeWorks;

public class CarsEmilia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 20, 30, 40, 50 };

		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println("The sum of all the elements in the array is "+sum);
		sum=0;
		for(int num:nums) {
			sum+=num;
			System.out.println("The sum of all the elements in the array is "+sum);

		}
	}

}
