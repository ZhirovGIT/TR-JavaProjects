
public class EmployeeAppl {

	public static void main(String[] args) {
		Employee[] employers = { new Employee("TR", 6000, 1, "Dima", 12345, 18),
				new Employee("TR", 10000, 2, "Misha", 12354, 20), new Employee("TR", 15000, 3, "Masha", 12534, 30),
				new Employee("TR", 20000, 4, "Dasha", 15234, 40), new Employee("TR", 30000, 5, "Disha", 51234, 50) };

		printNettoAndWithout(employers);
		System.out.println();
		printBrutto(employers);
		System.out.println();
		print(employers);
		double result = printSalary(employers);
		System.out.println(result);

	}

	public static void printNettoAndWithout(Employee[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].display(true));
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].display());
		}
		System.out.println();
	}

	public static void printBrutto(Employee[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].display(false));
		}
	}

	public static void print(Employee[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].display());
		}
		System.out.println();
	}

	private static double printSalary(Employee[] array) {
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i].salary();
		}
		return sum;
	}

}
