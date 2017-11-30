package animal;

public abstract class AbstractPerson extends AbstractAnimal {
	public void walk() {
		System.out.println(name + "在走路");
	}

	public void speak() {
		System.out.println(name + "在说话");
	}
	
	

}
