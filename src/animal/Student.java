package animal;

public class Student extends AbstractPerson {
	private String classname;

	public Student(String name, int age, String classname) {
		super();
		this.name = name;
		this.age = age;
		this.classname = classname;
	}

	public Student() {
		super();
	}

	@Override
	public void showinfo() {
		System.out.println("Student [classname=" + classname + ", name=" + name + ", age=" + age + "]");
	}

	public void study() {
		System.out.println(name + "ÔÚÑ§Ï°");
	}

	@Override
	public String toString() {
		return "Student [classname=" + classname + ", name=" + name + ", age=" + age + "]";
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}
