package animal;

public class Dayan extends AbstractBird implements IFly {
	private String color;

	public Dayan(String name, int age, String color) {
		super();
		this.color = color;
		this.name = name;
		this.age = age;

	}

	public Dayan() {
		super();
	}

	@Override
	public void egg() {
		System.out.println("Dayan.egg()");
	}

	@Override
	public void showinfo() {
		System.out.println("Dayan [color=" + color + ", name=" + name + ", age=" + age + "]");
	}

	@Override
	public String toString() {
		return "Dayan [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public void fly() {
		System.out.println(name + "ÔÚ·É");
	}

}
