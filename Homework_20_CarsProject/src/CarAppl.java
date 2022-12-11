
public class CarAppl {

	public static void main(String[] args) {
		// Task 1
		System.out.println("Task 1.");
		Car toyota = new Car("Toyota" ,"Black", 2000, 0.8);
		toyota.display();
		
		// Task 2
		System.out.println("Task 2.");
		Car honda = new Car("Honda", "Yellow", 2001, 0.5);
		Car kia = new Car("KIA", "Red", 2002, 0.6);
		Car volvo = new Car("Volvo", "Grey", 2003, 0.9);
		Car dodge = new Car("Dodge", "Blue", 2004, 0.7);
		
		Car[] cars = {toyota, honda, kia, volvo, dodge};
		printArrayForObjects(cars);
	}
	
	public static void printArrayForObjects(Car[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			array[i].display();
		}
	}
	
}
