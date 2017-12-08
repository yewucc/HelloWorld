package hello;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

public class RefletDemo {
	@Test
	public void classTest() throws ClassNotFoundException {
		Class clazz1 = Person.class;
		Class clazz2 = Class.forName("hello.Person");// 路径：包名+类名
		Person person = new Person();
		Class clazz3 = person.getClass();
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz1 == clazz3);
	}

	@Test
	public void constructorTest() throws Exception {
		Class clazz = Person.class;
		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		// Constructor constructor1 = clazz.getConstructor(String.class);
		// System.out.println(constructor1);
		System.out.println("---------");
		Constructor constructor2 = clazz.getConstructor(Integer.class);
		System.out.println(constructor2);
		System.out.println(constructor2.getModifiers());
		System.out.println(constructor2.getName());
		System.out.println(constructor2.getParameterTypes());
		System.out.println("---------");
		Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		System.out.println("---------");
		Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class);
		System.out.println(declaredConstructor);
		System.out.println(declaredConstructor.getModifiers());
		System.out.println(declaredConstructor.getName());
		System.out.println(declaredConstructor.getParameterTypes());
	}

	@Test
	public void test1() throws Exception {
		Class clazz = Class.forName("hello.Person");
		Constructor constructor = clazz.getDeclaredConstructor();
		Person person = (Person) constructor.newInstance();
		// Method method = clazz.getMethod("setName", String.class,
		// Integer.class);
		Method method = clazz.getMethod("setName", new Class[] { String.class, Integer.class });
		Method declaredMethod = clazz.getDeclaredMethod("setAge", Integer.class);
		// method.invoke(person, "zhangsan", 20);
		method.invoke(person, new Object[] { "zhangsan", 20 });
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(person, 18);
		System.out.println(person);
	}
}
