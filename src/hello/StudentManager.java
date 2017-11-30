package hello;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生数量：");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		inputStudents(scanner, students);
		printStudents(students);
		searchbyCondition(scanner, students);
	}

	private static void searchbyCondition(Scanner scanner, Student[] students) {
		while (true) {
			System.out.println("根据条件查询学生信息");
			System.out.println("根据姓名来查询：1");
			System.out.println("根据年龄来查询：2");
			System.out.println("根据性别来查询：3");
			System.out.println("退出这个程序: 0");
			System.out.println("请输入查询条件：");
			int num = scanner.nextInt();
			if (num == 0) {
				System.out.println("退出程序");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("请输入查询姓名：");
				String namesearch = scanner.next();
				searchByName(students, namesearch);
				break;
			case 2:
				System.out.println("请输入查询年龄：");
				int agesearch = scanner.nextInt();
				searchByAge(students, agesearch);
				break;
			case 3:
				System.out.println("请输入查询性别：");
				String sexsearch = scanner.next();
				searchBySex(students, sexsearch);
				break;

			default:
				System.out.println("非法输入");
				break;
			}
		}
	}

	private static void searchBySex(Student[] students, String sexsearch) {
		for (int i = 0; i < students.length; i++) {
			if (sexsearch.equals(students[i].getSex())) {
				System.out.println(students[i]);
			}
		}
	}

	private static void searchByAge(Student[] students, int agesearch) {
		int flag2 = 0;
		for (int i = 0; i < students.length; i++) {
			if (agesearch == students[i].getAge()) {
				System.out.println(students[i]);
				flag2 = 1;
			}
		}
		if (flag2 == 0) {
			System.out.println("没有该年龄的学生");
		}
	}

	private static void searchByName(Student[] students, String namesearch) {
		int flag1 = 0;
		for (int i = 0; i < students.length; i++) {
			if (namesearch.equals(students[i].getName())) {
				System.out.println(students[i]);
				flag1 = 1;
			}
		}
		if (flag1 == 0) {
			System.out.println("没有该姓名的学生");
		}
	}

	private static void printStudents(Student[] students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}

	private static void inputStudents(Scanner scanner, Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			System.out.println("请输入学生姓名：");
			students[i].setName(scanner.next());
			System.out.println("请输入学生年龄：");
			students[i].setAge(scanner.nextInt());
			System.out.println("请输入学生性别：");
			students[i].setSex(scanner.next());

		}
	}
}
