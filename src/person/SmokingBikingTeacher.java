package person;

public class SmokingBikingTeacher extends Teacher implements ISmoking, IBiking{

	@Override
	public void bike() {
		System.out.println("SmokingBikingTeacher.bike()");
	}

	@Override
	public void smoke() {
		System.out.println("SmokingBikingTeacher.smoke()");
	}


}
