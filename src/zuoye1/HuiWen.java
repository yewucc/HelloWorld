package zuoye1;

import java.util.Scanner;

public class HuiWen {
	public static void main(String[] args) {
		int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入万位数：");
		num[0] = scanner.nextInt();
		System.out.print("请输入千位数：");
		num[1] = scanner.nextInt();
		System.out.print("请输入百位数：");
		num[2] = scanner.nextInt();
		System.out.print("请输入十位数：");
		num[3] = scanner.nextInt();
		System.out.print("请输入个位数：");
		num[4] = scanner.nextInt();
		if (num[0] == num[4]) {
			if (num[1] == num[3]) {
				System.out.println("这个数是回文");
			} else {
				System.out.println("这个数不是回文");
			}
		} else {
			System.out.println("这个数不是回文");
		}
	}
}
