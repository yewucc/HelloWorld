package hello;

public class SexTest {
	public static void main(String[] args) {
		SexEnum sex = SexEnum.FEMALE;
		if (sex == SexEnum.MALE) {
			System.out.println("等于");
		} else {
			System.out.println("不等于");
		}
		if (sex.equals(SexEnum.FEMALE)) {
			System.out.println("ture");
		} else {
			System.out.println("false");
		}

		switch (sex) {
		case FEMALE:
			System.out.println("女性");
			break;
		case MALE:
			System.out.println("男性");
			break;

		default:
			break;
		}
	}
}
