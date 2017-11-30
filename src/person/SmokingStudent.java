package person;

public class SmokingStudent extends Student implements ISmoking {

	@Override
	public void smoke() {
		System.out.println("SmokingStudent.smoke()");
	}

}
