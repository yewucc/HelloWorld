package hello;

public class Outer {
	public void show() {
		System.out.println("Outer.show()");
	}

	public static void test() {
		System.out.println("Outer.test()");
	}

	public class Inner {
		public void show() {
			System.out.println("Outer.Inner.show()");
		}

		// public static void test() {
		// System.out.println("Outer.Inner.test()");
		// }
	}
}
