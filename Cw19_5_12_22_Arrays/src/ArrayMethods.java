
public class ArrayMethods {
	public static int[] cloneArray(int[] ar) {
		if(ar == null) return null;
		
		int [] res = new int[ar.length];	// create empty array
		for(int i = 0; i < ar.length; i++)
		{
			res[i] = ar[i];
		}
		
		return res;
	}

	public static void printArray(int[] ar) {
		if(ar == null) return;
		
		for(int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		
	}

	public static void fillArray(int ar[], int min, int max)
	{
		if(ar == null || min > max) return;
		
		for(int i = 0; i < ar.length; i++)
		{
			ar[i] = (int) (Math.random()*((max - min) + 1)) + min;
		}
		System.out.println();
	}

	public static int sumArray(int[] ar)
	{
		if(ar == null) {
			System.out.println("Array is null");
			return 0;
		}
		
		int sum = 0;
		for(int i = 0; i < ar.length; i++)
		{
			sum += ar[i];
		}
		
		return sum;
	}
	
	public static void printArrayReverse(String[] strs)
	{
		if(strs == null) return;
		for(int i = strs.length - 1; i >= 0; i--)
		{
			System.out.print(strs[i] + " ");
		}
		System.out.println();
	}
}
