package producerconsumer;

public class Cake {
	private String name;

	public Cake() {

	}

	public Cake(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cake [name=" + name + "]";
	}

}
