
public class Book {
	private int amountPages;
	private String title;
	private String author;
	private int yearOfIssue;
	private String genre;
	private boolean cover;
	private String identifier;

	public Book(int amountPages01, String title01, String author01, int yearOfIssue01, String genre01, boolean cover01,
			String identifier01) {
		if (amountPages01 > 0 && amountPages01 < 100_000)
			amountPages = amountPages01;

		if (title01 != null)
			title = title01;
		else
			title = "No name";
		
		if (author01 != null)
			author = author01;
		else
			author = "Anonymous";
		
		if (yearOfIssue01 > 1700 && yearOfIssue01 <= 2022)
			yearOfIssue = yearOfIssue01;
		
		if (genre01 != null)
			genre = genre01;
		else
			genre = "No genre";
		
		cover = cover01;	// boolean
		
		// My-00000
		char[] id = identifier01.toCharArray();
		if (id.length == 8 && id[0] == 'M' && id[1] == 'y' &&
				id[2] == '-')
		{
			for(int i = 3; i < id.length; i++)
			{
				if (id[i] >= '0')
			}
		}
	}

}
