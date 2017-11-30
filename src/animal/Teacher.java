package animal;

public class Teacher extends AbstractPerson {
	private double salary;

	public Teacher(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Teacher() {
		super();
	}

	@Override
	public void showinfo() {
		System.out.println("Teacher [salary=" + salary + ", name=" + name + ", age=" + age + "]");
	}

	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	public void teach() {
		System.out.println(name + "ÔÚÊÚ¿Î");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
