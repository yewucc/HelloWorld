package zuoye1;

import java.util.Scanner;

public class HuiWen {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������λ����");
		num[0] = scanner.nextInt();
		System.out.print("������ǧλ����");
		num[1] = scanner.nextInt();
		System.out.print("�������λ����");
		num[2] = scanner.nextInt();
		System.out.print("������ʮλ����");
		num[3] = scanner.nextInt();
		System.out.print("�������λ����");
		num[4] = scanner.nextInt();
		if (num[0] == num[4]) {
			if (num[1] == num[3]) {
				System.out.println("������ǻ���");
			} else {
				System.out.println("��������ǻ���");
			}
		} else {
			System.out.println("��������ǻ���");
		}
	}
}
