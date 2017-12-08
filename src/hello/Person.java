package hello;

import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private Integer age;

	public Person() {
		super();
	}

	private Person(String name) {
		super();
		this.name = name;
	}

	public Person(Integer age) {
		super();
		this.age = age;
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	private void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Preson [name=" + name + ", age=" + age + "]";
	}

}
