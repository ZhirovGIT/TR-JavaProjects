
public class EducationBook extends FictionBook {
	private String subject;

	public EducationBook() {
	}

	public EducationBook(String author, int pages, int catNumber, String genre, String subject) {
		super(author, pages, catNumber, genre);

		if (subject != null && !subject.isEmpty())
			this.subject = subject;
		else
			subject = "No subject!";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (subject != null && !subject.isEmpty())
			this.subject = subject;
		else
			subject = "No subject!";
	}

	@Override
	public String toString() {
		return "EducationBook [subject=" + subject + ", getGenre()=" + getGenre() + ", getCatNumber()=" + getCatNumber()
				+ ", getAuthor()=" + getAuthor() + ", getPages()=" + getPages() + "]";
	}

}
