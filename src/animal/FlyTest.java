package animal;

public class FlyTest {
	public static void main(String[] args) {
		AbstractBird bird = new Dayan("yunyan", 2, "gray");
		bird.egg();
		bird.showinfo();
		IFly fly = new Dayan("yunyan", 2, "gray");
		fly.fly();
		Dayan dayan=(Dayan) fly;
		dayan.egg();
		dayan.showinfo();
	}
}
