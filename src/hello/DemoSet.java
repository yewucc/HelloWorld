package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import animal.Student;

public class DemoSet {
	public static void main(String[] args) {
		Student s1 = new Student("zhangsan", 18, "java1711");
		Student s2 = new Student("lisi", 17, "java1711");
		Student s3 = new Student("wangwu", 18, "java1711");
		Student s4 = new Student("wangliu", 18, "java1711");
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.remove(s3);
		/** set转array */
		Student[] array1 = set.toArray(new Student[0]);
		for (Student student : array1) {
			System.out.println(student);
		}
		System.out.println("----------------");

		/** array转list(不可增删) */
		List<Student> list1 = Arrays.asList(array1);
		// list.add(s3);
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("----------------");
		/** array转list(可以增删) */
		List<Student> list2 = new ArrayList<Student>();
		for (Student student : array1) {
			list2.add(student);
		}
		list2.add(s3);
		for (Student student : list2) {
			System.out.println(student);
		}
		System.out.println("----------------");

		/** list转array */
		Student[] array2 = list1.toArray(new Student[0]);
		for (Student student : array2) {
			System.out.println(student);
		}

		// for (Student student : set) {
		// System.out.println(student);
		// }
		// System.out.println("----------------");
		// Iterator<Student> iterator = set.iterator();
		// while (iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }
	}
}