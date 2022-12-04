
public class MyClass {

	public static void main(String[] args) {
		int number = 12345;
		System.out.println("Number = " + number);

		// Task 1
		int resultFirstTask = digitCount(number);
		System.out.println("Quantity of digits: " + resultFirstTask);

		// Task 2
		int resultSecondTask = evenDigitsCount(number);
		System.out.println("Quantity even digits: " + resultSecondTask + "\n");

		// Task 3
		number = 5;
		int resultThirdTask = factorial(number);
		System.out.println("Factorial number of " + number + " is: " + resultThirdTask);
		
		// Task 4
		number = 2;
		int power = 4;
		int resultFourthTask = xPower(number, power);
		System.out.println("Number " + number + " to the power " + power + " = " + resultFourthTask);

	}

	// Task 4
	public static int xPower(int number, int power) {
		int result = 1;

		if (power == 0) return 1;

		do
		{
			result *= number;
			power--;
		} while (power != 0);
		
		return result;
	}

	// Task 3
	public static int factorial(int number) {
		int result = 1;

		if (number <= 0) {
			System.out.println("Wrong input!");
			return -1;
		} else if (number == 0)
			return 1;

		do {
			result *= number;	// The product of each decrement number
			number--;			// Decrement
		} while (number != 0);

		return result;
	}

	// Task 2
	public static int evenDigitsCount(int number) {
		int count = 0;

		if (number > 0) {
			while (number != 0) {
				int buf = number % 10; // save number
				if (buf % 2 == 0)
					count++; // check
				number /= 10; // delete last digit
			}
		} else {
			System.out.println("Wrong input!");
			return -1;
		}

		return count;
	}

	// Task 1
	public static int digitCount(int number) {
		int count = 0;

		if (number > 0) {
			while (number != 0) {
				number /= 10;
				count++;
			}
		} else {
			System.out.println("Wrong input!");
			return -1;
		}
		return count;
	}

}
