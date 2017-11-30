package animal;

public class AnimalTest {
	public static void main(String[] args) {
		AbstractAnimal an = new Student("zhangsan", 18, "java1711");
		an.showinfo();
		System.out.println("----------");
		AbstractPerson pe = new Teacher("lisi", 35, 3000);
		pe.speak();
		pe.walk();
		pe.showinfo();
		Teacher tea = (Teacher) pe;
		tea.teach();

	}
}
