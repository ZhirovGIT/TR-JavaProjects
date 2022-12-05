public class ArraysTest {

	public static void main(String[] args) {
		// Add array
		int[] ar = {1, 5, 8, 9, 2, 4, 0, 8};
		ArrayMethods.printArray(ar);
		
		// Test. ar2 - is link on ar
		int[] ar2 = ar;	// link on {1,5,8, ...}
		ArrayMethods.printArray(ar2);
		
		// Add empty ar - is clone, and add link on ar2
		int[] clone = ArrayMethods.cloneArray(ar2);
		ArrayMethods.printArray(clone);
		clone[0] = 100500;
		System.out.println();
		
		// Test clone
		ArrayMethods.printArray(ar);
		ArrayMethods.printArray(ar2);
		ArrayMethods.printArray(clone);
		System.out.println();
		
		// default
		int size = 30;
		
		int[] test1 = new int[size];	// default = 0 (into all index)
		System.out.println(test1[5]);
		
		double[] test2 = new double[size];	// default 0.0
		System.out.println(test2[5]);
		
		boolean[] test3 = new boolean[size];	// default false
		System.out.println(test3[23]);
		
		String[] test4 = new String[size];	// default null	
		System.out.println(test4);
		
		// Fill Array
		int min = -10;
		int max = 10;
		ArrayMethods.fillArray(test1, min, max);
		ArrayMethods.printArray(test1);
		
		// Sum Array
		System.out.println("Sum all elements = " + ArrayMethods.sumArray(test1));
	
		// Reverse array	
		ArrayMethods.printArrayReverse(test4);
		
		String[] test5 = {"Orange", "Banana", "Mama", "mula", "rama"};
		ArrayMethods.printArrayReverse(test5);
	}

}
