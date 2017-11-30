package person;

public class Student extends AbstractPerson {

	@Override
	void showinfo() {
		System.out.println("Student.showinfo()");
	}

	public void study() {
		System.out.println("Student.study()");
	}

}
