package hello;

public class SexTest {
	public static void main(String[] args) {
		SexEnum sex = SexEnum.FEMALE;
		if (sex == SexEnum.MALE) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}
		if (sex.equals(SexEnum.FEMALE)) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}

		switch (sex) {
		case FEMALE:
			System.out.println("Ů��");
			break;
		case MALE:
			System.out.println("����");
			break;

		default:
			break;
		}
	}
}
