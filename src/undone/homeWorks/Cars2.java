package undone.homeWorks;

public class Cars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Toyota", "Honda", "Ford", "Subaru", "Chevrolet", "Tesla" };

		for (String car : cars) {
			System.out.println(car);
		}

		System.out.println("----another way----");
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
