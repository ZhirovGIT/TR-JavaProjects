
public class ProductAppl {

	public static void main(String[] args) {
		Product pr1 = new Product("Coca-Cola", 7.4, "1.5L.", 123);
		// Opt 1
		String str = pr1.toString();
		System.out.println(str);
		// Opt 2
		System.out.println(pr1);
		
		MilkFood mf1 = new MilkFood("Jogurt", 11.2, "200ml.", 5555, "28.12.22", "Cow");
		System.out.println(mf1);
	}

}
