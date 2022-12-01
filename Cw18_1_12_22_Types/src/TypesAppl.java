
public class TypesAppl {

	public static void main(String[] args) {
		/*
		 * Integer types: 
		 * byte = 1 byte (-128 - 127) 
		 * short = 2 byte (-32 768 - 32 767)
		 * int = 4 byte (-2 147 483 648 - 2 147 483 647)
		 * long = 8 byte 
		 * =================
		 * Fractional types: 
		 * float = 4 byte (1.4E-45 - 3.40282235E38) 
		 * double = 8 byte
		 * ================= 
		 * char = 2 byte (UTF-16) 
		 * ================= 
		 * boolean (true, false)
		 */

		int a;
		a = 24;
		System.out.println(a);
		int b = 33;
		System.out.println(b);
		// =====
		
		float f = 3.14f;
		System.out.println(f);
		double d = 3.14;
		System.out.println(d);
		// =====
		
		long l = 9_876_543_211L;
		System.out.println(l);
		l = 9_876_543_21;
		System.out.println(l);
		// =====
		
		char ch = 88;
		System.out.println(ch);
		ch = 'X';
		System.out.println(ch);
		System.out.println((int) ch); // cast
		// =====
		
		boolean bool = true;
		System.out.println(bool);
		bool = 10 > 11;
		System.out.println(bool);
		// =====

		gagarin();
		//===
		StringAppl.greeting("DimASS");
	}

	private static void gagarin() {
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("GO!");
	}
}
