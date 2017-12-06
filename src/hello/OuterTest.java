package hello;

import hello.Outer.Inner;

public class OuterTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		// Outer.test();
		Inner inner = outer.new Inner();
		inner.show();

	}
}
