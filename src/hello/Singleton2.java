package hello;

public class Singleton2 {
	/** ����ģʽ������ʽ������ʱ�任�ռ� */
	private static Singleton2 instance = null;

	private Singleton2() {
	}

	public synchronized static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;

	}
}
