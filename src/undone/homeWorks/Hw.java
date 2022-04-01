package undone.homeWorks;

public class Hw {

	public static void main(String[] args) {
		String[] car = {"Toyota", "Honda", "Nissan", "Tesla", "Kia", "Ford"};
		int size = car.length;
		System.out.println(size);

		for (int i = 0; i < car.length; i++) {
			System.out.println(" " + car[i]);
		}
		System.out.println(" ***************2ND METHOD***************");

		String[] cars = new String[6];
		cars[0] = "Toyota";
		cars[1] = "Honda";
		cars[2] = "Nisan";
		cars[3] = "Tesla";
		cars[4] = "Kia";
		cars[5] = "Ford";
		System.out.println(cars[0] + " " + cars[1] + " " + cars[2] + " "
				+ cars[3] + " " + cars[4] + " " + cars[5]);
		System.out.println(
				"------------------3RD METHOD--------------------------");

		String[] Vehicals = {"Toyota", "Honda", "Nissan", "Tesla", "Kia",
				"Ford"};
		for (String Vehical : Vehicals) {
			System.out.print(" " + Vehical);

		}

	}

}
