
public class Book {
	private String author;
	private int pages;

	public Book() {}

	public Book(String author, int pages) {
		super();
		
		if (author != null && !author.isEmpty())
			this.author = author;
		else
			author = "No author!";

		setPages(pages);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		if (author != null && !author.isEmpty())
			this.author = author;
		else
			author = "No author!";
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if (pages > 0 && pages <= 10_000)
			this.pages = pages;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", pages=" + pages + "]";
	}
	
	

}
