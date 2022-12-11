
public class PersonAppl {

	public static void main(String[] args) {
		// 1
//		Person vasya = new Person();
//		vasya.name = "Vasya";
//		vasya.age = 40;
//		vasya.id = 12345;
//		System.out.println("name: " + vasya.name);
//		System.out.println("age: " + vasya.age);
//		System.out.println("id: " + vasya.id);

		// 2
		Person vasya = new Person("Vasya", 40, 12345);
		vasya.display();
		// ================
		
		// 1
//		Person masha = new Person();
//		masha.name = "Masha";
//		masha.age = 30;
//		masha.id = 54321;
		
		// 2
		Person masha = new Person("Masha", 30, 54321);
		masha.display();
		// ===============
//		masha.age = 300;	// wrong
		masha.setAge(31);	// change age
		masha.display();
		System.out.println(masha.getId());
		// ================
		Person izya = new Person(null, -33, -33333);	// not exception in Person constructor
		izya.display();

		Person[] persons = { vasya, masha, izya };
		int sum = 0;
		for (int i = 0; i < persons.length; i++) {
			sum += persons[i].getAge();
		}
		System.out.println("Avg age = " + (sum * 1.0 / persons.length));
	}
}