package person;

public class Teacher extends AbstractPerson {

	@Override
	void showinfo() {
		System.out.println("Teacher.showinfo()");
	}

	public void teach() {
		System.out.println("Teacher.teach()");
	}

}
