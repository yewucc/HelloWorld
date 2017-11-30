package person;

public  class SmokingTeacher extends Teacher implements ISmoking {

	@Override
	public void smoke() {
		System.out.println("SmokingTeacher.smoke()");
	}

}
