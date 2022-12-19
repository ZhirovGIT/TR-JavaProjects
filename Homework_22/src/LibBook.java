
public class LibBook extends Book {
	private int catNumber;

	public LibBook() {}

	public LibBook(String author, int pages, int catNumber) {
		super(author, pages);

		setCatNumber(catNumber);
	}

	public int getCatNumber() {
		return catNumber;
	}

	public void setCatNumber(int catNumber) {
		if (catNumber > 0 && catNumber < 1_000_000)
			this.catNumber = catNumber;
	}

	@Override
	public String toString() {
		return "LibBook [catNumber=" + catNumber + ", getAuthor()=" + getAuthor() + ", getPages()=" + getPages() + "]";
	}
	
	

}
