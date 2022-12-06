
public class Task_01 {
	public static void insertPosition(int[] arr01, int[] arr02, int value)
	{
		int myIndex = 0;
		for(int i = 0; i < arr01.length; i++)
		{
			// 1 3 5 7 9 <- 6
			// 6 > 1 -> 6 > 3 -> 6 > 5 -> 6 < 7 !!! ADD -> 1 3 5 6 7 9
			// 1 3 5 7 9 <- 7
			// 7 > 1 -> 3 > 3 -> 7 > 5 -> 7 == 7 && 7 <= 7 !!! ADD 7 BEFORE 7 -> 1 3 5 7 7 9
			if(value <= arr01[i])
			{
				myIndex = i;
				break;
			} else {
				myIndex = i + 1;// insert into last position
			}
		}
		arr02[myIndex] = value;	// safe index in new array
		// _ _ _ 7 _ _
		
		for(int i = 0; i < arr02.length; i++)
		{
			if(i < myIndex)
			{
				arr02[i] = arr01[i]; // 1 3 5 7 _ _
			}
			else if (i > myIndex) // WRONG!!! else 1 3 5 7 _ _ <- add in 3 index 1 3 5 5 7 9
			{
											// 0 1 2   3 4 - old array (index)
				arr02[i] = arr01[i - 1];	// 1 3 5 7 7 9
											// 0 1 2 3 4 5 - new array (index)
			}
		}
	}
}
