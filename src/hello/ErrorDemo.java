package hello;

public class ErrorDemo {
	public static void main(String[] args) {
		fun();
		System.out.println("ErrorDemo.main()");
	}

	private static void fun() {
		fun();
		System.out.println("ErrorDemo.fun()");
	}
}
