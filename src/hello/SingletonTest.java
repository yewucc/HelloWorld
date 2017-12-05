package hello;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton1 single1 = Singleton1.getInstance();
		Singleton1 single2 = Singleton1.getInstance();
		System.out.println(single1 == single2);

		Singleton2 singleton1 = Singleton2.getInstance();
		Singleton2 singleton2 = Singleton2.getInstance();
		System.out.println(singleton1 == singleton2);

	}
}
