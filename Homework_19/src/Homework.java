import MyUtils.ArrayUtils;

public class Homework {

	public static void main(String[] args) {
		// Initialize array
		int size = 20;
		int min = -50, max = 50;
		int[] array = new int[size];	// add empty array
		
		// Task 1
		System.out.println("Task 1.");
		ArrayUtils.fillArray(array, min, max);
		ArrayUtils.printArray(array);
		
		ArrayUtils.bubbleSort(array);
		ArrayUtils.printArray(array);
		System.out.println();
		
		// Task 2
		System.out.println("Task 2.");
		ArrayUtils.fillArray(array, min, max);
		ArrayUtils.printArray(array);
		ArrayUtils.avg(array);
		
		ArrayUtils.selectSort(array);
		ArrayUtils.printArray(array);
		System.out.println();
		
		// Task 3
		System.out.println("Task 3.");
		ArrayUtils.fillArray(array, min, max);
		ArrayUtils.printArray(array);
		
		ArrayUtils.firstPosLastNegReverse(array);
		ArrayUtils.printArray(array);
		System.out.println();
		
		// Task 4
		System.out.println("Task 4.");
		ArrayUtils.fillArray(array, min, max);
		ArrayUtils.printArray(array);
		
		
	}

}
