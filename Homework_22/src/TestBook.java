
public class TestBook {

	public static void main(String[] args) {
		Book[] books = {
		new FictionBook("Dmitrii", 700, 2, "Romantic"),
		new FictionBook("Also Dmitrii", 1234, 999999, "Fantasy"),
		new FictionBook("Mitya", 1500, 345, "Dram"),
		new EducationBook("Also Mitya", 5000, 345, "Shuter", "Cat"),
		new EducationBook("TR", 6000, 979, "Science", "Me"),
		new EducationBook("Also TR", 9876, 8656, "Games", "They")
		};
		
		print(books);
	}
	
	public static void print(Book[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
		System.out.println();
	}
	
	

}
