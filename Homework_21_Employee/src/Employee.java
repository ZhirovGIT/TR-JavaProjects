
public class Employee {
	private String company;
	private double baseSalary; // 6000-50000
	private int position; // 1 - 7
	private String name;
	private int id;
	private int age; // 18 - 80

	public Employee(String company, double baseSalary, int position, String name, int id, int age) {
		if (company != null && !company.isEmpty())
			this.company = company;
		else
			company = "No company name!";

		if (baseSalary >= 6000 && baseSalary < 50_000)
			this.baseSalary = baseSalary;

		setPosition(position);

		if (name != null && !name.isEmpty())
			this.name = name;
		else
			name = "No employee name!";

		this.id = id;

		setAge(age);

	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		if (company != null && !company.isEmpty())
			this.company = company;
		else
			company = "No company name!";
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary >= 6000 && baseSalary < 50_000 && baseSalary > this.baseSalary)
			this.baseSalary = baseSalary;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		if (position >= 1 && position <= 7)
			this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.isEmpty())
			this.name = name;
		else
			name = "No employee name";
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 18 && age < 80)
			this.age = age;
	}

	public double salary() {
		switch (position) {
		case 1:
			return baseSalary * 1.1;
		case 2:
			return baseSalary * 1.15;
		case 3:
			return baseSalary * 1.2;
		case 4:
			return baseSalary * 1.25;
		case 5:
			return baseSalary * 1.3;
		case 6:
			return baseSalary * 1.35;
		case 7:
			return baseSalary * 1.5;
		default:
			return 0.;
		}
	}

	public String display() {
		String text = "Company: " + company + ", Position: " + position + ", Name: " + name + ", ID: " + id + ", Age: "
				+ age;
		return text;
	}

	public String display(boolean tax) {
		return display() + (tax ? 
				", Salary netto: " + salary() * 0.7 : 
					", Salary brutto: " + salary());
	}
}
