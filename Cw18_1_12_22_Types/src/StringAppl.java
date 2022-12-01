
public class StringAppl {

	public static void main(String[] args) {
		/*
		 * Link type (UPPER REGISTER):
		 * String - massive character
		 */
		
		String str = "Hello";
		System.out.println(str);
		str = str + "!";		// concatenation
		System.out.println(str);
		
		str = 1 + 2 + "number" + 3 + 4;
		System.out.println(str);
		str = 1 + 2 + "number" + (3 + 4);
		System.out.println(str);
		
		int a = 10;
		double b = 2.3;
		System.out.println("var a = " + a + ", b = " + b);
		System.out.printf("var a = %d, b = %.1f\n", a, b);
		
		String name = "Dmitrii";
		greeting(name);
	}

	public static void greeting(String name) {
		System.out.println("Dear " + name + "! Welcome to Israel!");
		
	}

}
