
public class FictionBook extends LibBook {
	private String genre;

	public FictionBook() {
	}

	public FictionBook(String author, int pages, int catNumber, String genre) {
		super(author, pages, catNumber);

		if (genre != null && !genre.isEmpty())
			this.genre = genre;
		else
			genre = "No genre!";
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		if (genre != null && !genre.isEmpty())
			this.genre = genre;
		else
			genre = "No genre!";
	}

	@Override
	public String toString() {
		return "FictionBook [genre=" + genre + ", getCatNumber()=" + getCatNumber() + ", getAuthor()=" + getAuthor()
				+ ", getPages()=" + getPages() + "]";
	}

}
