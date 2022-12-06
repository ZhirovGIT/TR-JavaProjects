package MyUtils;

public class MyUtils {
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
}
