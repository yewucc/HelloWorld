package hello;

public class Singleton1 {
	/** ����ʽ���Կռ任ʱ�� */
	private static final Singleton1 instance = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return instance;
	}

}
