import MyUtils.MyUtils;

public class Web_19Appl {

	public static void main(String[] args) {
		
		int a = 0;
		int[] array = {1, 3, 5, 7, 9};				// create & initialize array
		int[] array01 = new int[array.length + 1];	// create new object (link) <- 0 0 0 0 0
		
		Task_01.insertPosition(array, array01, a);
		MyUtils.printArray(array01);
	}

}
