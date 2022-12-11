
public class Person {
	private String name;
	private int age;
	private int id;

	public Person(String name1, int age1, int id1) {
		if (name1 != null)
			name = name1;
		else
			name = "No name";
		if (age1 > 0 && age1 < 120)
			age = age1;
		if (id1 > 99_999 && id1 < 1_000_000)
			id = id1;
		else
			id = -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name1) {
		if (name1 != null) {
			name = name1;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age1) {
		if (age1 > age && age1 <= 120)
			age = age1;
	}

	public int getId() {
		return id;
	}

	public void display() {
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("id: " + id);
	}
}
