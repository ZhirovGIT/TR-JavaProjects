
public class LibrarryAppl {

	public static void main(String[] args) {
//		Book book1 = new Book();
//		book1.setAmountPages(100);
//		book1.setTitle("Tel-Ran");
//		book1.setAuthor("Sweetlana");
//		book1.setYearOfIssue(2022);
//		book1.setGenre("Sience");
//		book1.setCover(true);
//		book1.setIdentifier("My-12345");
//		
//		book1.display();
		
		Book book2 = new Book(1000, "Title", "Dima", 2021, "Fantasy", true, "My-12354");
		book2.display();
		
		Book book3 = new Book(2000, "Title01", "Dima01", 2021, "Fantasy01", true, "My-54321");
		book3.display();
		
		System.out.println(book3.getAuthor());
		book3.setAuthor("Katya");
		System.out.println(book3.getAuthor());
		
		book3.setIdentifier("My_12355");	// WRONG
		System.out.println(book3.getIdentifier());
		
		
	}

}
