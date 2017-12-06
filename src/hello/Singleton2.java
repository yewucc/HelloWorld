package hello;

public class Singleton2 {
	/** 单例模式（懒汉式）：以时间换空间 */
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
