package hello;

import java.util.Scanner;

public class StudentManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int count = scanner.nextInt();
		Student[] students = new Student[count];
		inputStudents(scanner, students);
		printStudents(students);
		searchbyCondition(scanner, students);
	}

	private static void searchbyCondition(Scanner scanner, Student[] students) {
		while (true) {
			System.out.println("����������ѯѧ����Ϣ");
			System.out.println("������������ѯ��1");
			System.out.println("������������ѯ��2");
			System.out.println("�����Ա�����ѯ��3");
			System.out.println("�˳��������: 0");
			System.out.println("�������ѯ������");
			int num = scanner.nextInt();
			if (num == 0) {
				System.out.println("�˳�����");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("�������ѯ������");
				String namesearch = scanner.next();
				searchByName(students, namesearch);
				break;
			case 2:
				System.out.println("�������ѯ���䣺");
				int agesearch = scanner.nextInt();
				searchByAge(students, agesearch);
				break;
			case 3:
				System.out.println("�������ѯ�Ա�");
				String sexsearch = scanner.next();
				searchBySex(students, sexsearch);
				break;

			default:
				System.out.println("�Ƿ�����");
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
			System.out.println("û�и������ѧ��");
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
			System.out.println("û�и�������ѧ��");
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
			System.out.println("������ѧ��������");
			students[i].setName(scanner.next());
			System.out.println("������ѧ�����䣺");
			students[i].setAge(scanner.nextInt());
			System.out.println("������ѧ���Ա�");
			students[i].setSex(scanner.next());

		}
	}
}
