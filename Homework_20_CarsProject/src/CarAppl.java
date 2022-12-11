
public class CarAppl {

	public static void main(String[] args) {
		// Task 1
		System.out.println("Task 1.");
		Car toyota = new Car("Toyota", "Black", 2001, 1.1);
		toyota.display();
		System.out.println();

		// Task 2
		System.out.println("Task 2.");
		Car honda = new Car("Honda", "Yellow", 2002, 2.2);
		Car kia = new Car("KIA", "Red", 2003, 3.3);
		Car volvo = new Car("Volvo", "Grey", 2004, 4.4);
		Car dodge = new Car("Dodge", "Blue", 2005, 5.5);

		Car[] cars = { toyota, honda, kia, volvo, dodge };
		printArrayForObjects(cars);
		System.out.println();
		printArrayForObjectsInRange(cars);
		
	}

	// Print array for objects
	public static void printArrayForObjects(Car[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i].display();
		}
	}

	// Motor value in range
	public static void printArrayForObjectsInRange(Car[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].getMotorValue() > 2.0) array[i].display();
		}
	}

}
